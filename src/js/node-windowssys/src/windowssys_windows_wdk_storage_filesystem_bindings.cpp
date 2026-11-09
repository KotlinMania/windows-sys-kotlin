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

static Napi::Value windowssys_windows_wdk_storage_filesystem_ApplyControlToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyControlToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, pinput) : -1;
#else
    (void)phcontext;
    (void)pinput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcAsyncCopyRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool wait = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int64_t ioissuerthread = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    void* asyncreadcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcAsyncCopyRead")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, wait, buffer, iostatus, ioissuerthread, asyncreadcontext) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    (void)ioissuerthread;
    (void)asyncreadcontext;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcCanIWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t bytestowrite = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool wait = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    uint8_t retrying = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, bool, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcCanIWrite")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, bytestowrite, wait, retrying) : false;
#else
    (void)fileobject;
    (void)bytestowrite;
    (void)wait;
    (void)retrying;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcCoherencyFlushAndPurgeCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcCoherencyFlushAndPurgeCache")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(sectionobjectpointer, fileoffset, length, iostatus, flags);
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)iostatus;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcCopyRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool wait = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcCopyRead")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, wait, buffer, iostatus) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcCopyReadEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool wait = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int64_t ioissuerthread = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcCopyReadEx")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, wait, buffer, iostatus, ioissuerthread) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    (void)ioissuerthread;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcCopyWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool wait = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcCopyWrite")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, wait, buffer) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcCopyWriteEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool wait = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t ioissuerthread = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcCopyWriteEx")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, wait, buffer, ioissuerthread) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)ioissuerthread;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcCopyWriteWontFlush_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcCopyWriteWontFlush")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcDeferWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* postroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bytestowrite = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    bool retrying = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcDeferWrite")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, postroutine, context1, context2, bytestowrite, retrying);
#else
    (void)fileobject;
    (void)postroutine;
    (void)context1;
    (void)context2;
    (void)bytestowrite;
    (void)retrying;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcErrorCallbackRoutine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcErrorCallbackRoutine")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context) : -1;
#else
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcFastCopyRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fileoffset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t pagecount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcFastCopyRead")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, fileoffset, length, pagecount, buffer, iostatus);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)pagecount;
    (void)buffer;
    (void)iostatus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcFastCopyWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fileoffset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcFastCopyWrite")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, fileoffset, length, buffer);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)buffer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcFlushCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcFlushCache")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(sectionobjectpointer, fileoffset, length, iostatus);
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)iostatus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcGetDirtyPages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* loghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dirtypageroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcGetDirtyPages")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(loghandle, dirtypageroutine, context1, context2) : -1;
#else
    (void)loghandle;
    (void)dirtypageroutine;
    (void)context1;
    (void)context2;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromBcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcGetFileObjectFromBcb")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bcb) : NULL;
#else
    (void)bcb;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcGetFileObjectFromSectionPtrs")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionobjectpointer) : NULL;
#else
    (void)sectionobjectpointer;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrsRef_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcGetFileObjectFromSectionPtrsRef")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionobjectpointer) : NULL;
#else
    (void)sectionobjectpointer;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcGetFlushedValidData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool bcblistheld = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcGetFlushedValidData")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionobjectpointer, bcblistheld) : -1;
#else
    (void)sectionobjectpointer;
    (void)bcblistheld;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filesizes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool pinaccess = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lazywritecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcInitializeCacheMap")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, filesizes, pinaccess, callbacks, lazywritecontext);
#else
    (void)fileobject;
    (void)filesizes;
    (void)pinaccess;
    (void)callbacks;
    (void)lazywritecontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMapEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filesizes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool pinaccess = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lazywritecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcInitializeCacheMapEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, filesizes, pinaccess, callbacks, lazywritecontext, flags);
#else
    (void)fileobject;
    (void)filesizes;
    (void)pinaccess;
    (void)callbacks;
    (void)lazywritecontext;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcIsCacheManagerCallbackNeeded_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcIsCacheManagerCallbackNeeded")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(status) : false;
#else
    (void)status;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vpb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcIsThereDirtyData")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vpb) : false;
#else
    (void)vpb;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyDataEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* vpb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* numberofdirtypages = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcIsThereDirtyDataEx")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(vpb, numberofdirtypages) : false;
#else
    (void)vpb;
    (void)numberofdirtypages;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcMapData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcMapData")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, flags, bcb, buffer) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    (void)buffer;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcMdlRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcMdlRead")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, fileoffset, length, mdlchain, iostatus);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)mdlchain;
    (void)iostatus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcMdlReadComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcMdlReadComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, mdlchain);
#else
    (void)fileobject;
    (void)mdlchain;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcMdlWriteAbort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcMdlWriteAbort")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, mdlchain);
#else
    (void)fileobject;
    (void)mdlchain;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcMdlWriteComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcMdlWriteComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, fileoffset, mdlchain);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcPinMappedData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcPinMappedData")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, flags, bcb) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcPinRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcPinRead")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, flags, bcb, buffer) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    (void)buffer;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcPrepareMdlWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcPrepareMdlWrite")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, fileoffset, length, mdlchain, iostatus);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)mdlchain;
    (void)iostatus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcPreparePinWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool zero = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcPreparePinWrite")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, zero, flags, bcb, buffer) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)zero;
    (void)flags;
    (void)bcb;
    (void)buffer;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcPurgeCacheSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcPurgeCacheSection")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionobjectpointer, fileoffset, length, flags) : false;
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)flags;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcRemapBcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcRemapBcb")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bcb) : NULL;
#else
    (void)bcb;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcRepinBcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcRepinBcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bcb);
#else
    (void)bcb;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcScheduleReadAhead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcScheduleReadAhead")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, fileoffset, length);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcScheduleReadAheadEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int64_t ioissuerthread = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcScheduleReadAheadEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, fileoffset, length, ioissuerthread);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)ioissuerthread;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool disablereadahead = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    bool disablewritebehind = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetAdditionalCacheAttributes")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, disablereadahead, disablewritebehind);
#else
    (void)fileobject;
    (void)disablereadahead;
    (void)disablewritebehind;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetAdditionalCacheAttributesEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, flags);
#else
    (void)fileobject;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetBcbOwnerPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ownerpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetBcbOwnerPointer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bcb, ownerpointer);
#else
    (void)bcb;
    (void)ownerpointer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetDirtyPageThreshold_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dirtypagethreshold = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetDirtyPageThreshold")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, dirtypagethreshold);
#else
    (void)fileobject;
    (void)dirtypagethreshold;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetDirtyPinnedData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bcbvoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lsn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetDirtyPinnedData")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bcbvoid, lsn);
#else
    (void)bcbvoid;
    (void)lsn;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetFileSizes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filesizes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetFileSizes")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, filesizes);
#else
    (void)fileobject;
    (void)filesizes;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetFileSizesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filesizes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetFileSizesEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, filesizes) : -1;
#else
    (void)fileobject;
    (void)filesizes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetLogHandleForFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* loghandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* flushtolsnroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetLogHandleForFile")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, loghandle, flushtolsnroutine);
#else
    (void)fileobject;
    (void)loghandle;
    (void)flushtolsnroutine;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetParallelFlushFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool enableparallelflush = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetParallelFlushFile")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, enableparallelflush);
#else
    (void)fileobject;
    (void)enableparallelflush;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcSetReadAheadGranularity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t granularity = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcSetReadAheadGranularity")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject, granularity);
#else
    (void)fileobject;
    (void)granularity;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcUninitializeCacheMap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* truncatesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* uninitializeevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcUninitializeCacheMap")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, truncatesize, uninitializeevent) : false;
#else
    (void)fileobject;
    (void)truncatesize;
    (void)uninitializeevent;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcUnpinData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcUnpinData")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bcb);
#else
    (void)bcb;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcUnpinDataForThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t resourcethreadid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcUnpinDataForThread")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bcb, resourcethreadid);
#else
    (void)bcb;
    (void)resourcethreadid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcUnpinRepinnedBcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool writethrough = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcUnpinRepinnedBcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bcb, writethrough, iostatus);
#else
    (void)bcb;
    (void)writethrough;
    (void)iostatus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcWaitForCurrentLazyWriterActivity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcWaitForCurrentLazyWriterActivity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CcZeroData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* startoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* endoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    bool wait = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CcZeroData")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, startoffset, endoffset, wait) : false;
#else
    (void)fileobject;
    (void)startoffset;
    (void)endoffset;
    (void)wait;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_CompleteAuthToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CompleteAuthToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, ptoken) : -1;
#else
    (void)phcontext;
    (void)ptoken;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ExDisableResourceBoostLite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* resource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExDisableResourceBoostLite")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(resource);
#else
    (void)resource;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ExQueryPoolBlockSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* poolblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* quotacharged = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExQueryPoolBlockSize")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(poolblock, quotacharged) : 0;
#else
    (void)poolblock;
    (void)quotacharged;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ExportSecurityContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppackedcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ptoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExportSecurityContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, fflags, ppackedcontext, ptoken) : -1;
#else
    (void)phcontext;
    (void)fflags;
    (void)ppackedcontext;
    (void)ptoken;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAcknowledgeEcp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAcknowledgeEcp")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ecpcontext);
#else
    (void)ecpcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAcquireFileExclusive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAcquireFileExclusive")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject);
#else
    (void)fileobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t lbn = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t sectorcount = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAddBaseMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn, sectorcount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntryEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t lbn = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t sectorcount = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAddBaseMcbEntryEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn, sectorcount) : -1;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAddLargeMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t lbn = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t sectorcount = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAddLargeMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn, sectorcount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAddMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vbn = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t lbn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t sectorcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAddMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn, sectorcount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cache = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t directorykey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* shortname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* longname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool keybyshortname = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    uint32_t datalength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAddToTunnelCache")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cache, directorykey, shortname, longname, keybyshortname, datalength, data);
#else
    (void)cache;
    (void)directorykey;
    (void)shortname;
    (void)longname;
    (void)keybyshortname;
    (void)datalength;
    (void)data;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCacheEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cache = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t directorykey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* shortname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* longname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t datalength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAddToTunnelCacheEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cache, directorykey, shortname, longname, flags, datalength, data);
#else
    (void)cache;
    (void)directorykey;
    (void)shortname;
    (void)longname;
    (void)flags;
    (void)datalength;
    (void)data;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAllocateAePushLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAllocateAePushLock")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pooltype, tag) : NULL;
#else
    (void)pooltype;
    (void)tag;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t sizeofcontext = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* cleanupcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t pooltag = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ecptype, sizeofcontext, flags, cleanupcallback, pooltag, ecpcontext) : -1;
#else
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)pooltag;
    (void)ecpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterFromLookasideList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t sizeofcontext = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* cleanupcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lookasidelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameterFromLookasideList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ecptype, sizeofcontext, flags, cleanupcallback, lookasidelist, ecpcontext) : -1;
#else
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)lookasidelist;
    (void)ecpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameterList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, ecplist) : -1;
#else
    (void)flags;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAllocateFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* completelockirproutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* unlockroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAllocateFileLock")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(completelockirproutine, unlockroutine) : NULL;
#else
    (void)completelockirproutine;
    (void)unlockroutine;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAllocateResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAllocateResource")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAreNamesEqual_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* constantnamea = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* constantnameb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool ignorecase = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* upcasetable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAreNamesEqual")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(constantnamea, constantnameb, ignorecase, upcasetable) : false;
#else
    (void)constantnamea;
    (void)constantnameb;
    (void)ignorecase;
    (void)upcasetable;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAreThereCurrentOrInProgressFileLocks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAreThereCurrentOrInProgressFileLocks")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock) : false;
#else
    (void)filelock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAreThereWaitingFileLocks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAreThereWaitingFileLocks")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock) : false;
#else
    (void)filelock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlAreVolumeStartupApplicationsComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlAreVolumeStartupApplicationsComplete")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlBalanceReads_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* targetdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlBalanceReads")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(targetdevice) : -1;
#else
    (void)targetdevice;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForMultipleObjects_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* objectarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t waittype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* waitblockarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCancellableWaitForMultipleObjects")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(count, objectarray, waittype, timeout, waitblockarray, irp) : -1;
#else
    (void)count;
    (void)objectarray;
    (void)waittype;
    (void)timeout;
    (void)waitblockarray;
    (void)irp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForSingleObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCancellableWaitForSingleObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object, timeout, irp) : -1;
#else
    (void)object;
    (void)timeout;
    (void)irp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlChangeBackingFileObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* currentfileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newfileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t changebackingtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlChangeBackingFileObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(currentfileobject, newfileobject, changebackingtype, flags) : -1;
#else
    (void)currentfileobject;
    (void)newfileobject;
    (void)changebackingtype;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForOplockRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* allocationsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCheckLockForOplockRequest")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, allocationsize) : false;
#else
    (void)filelock;
    (void)allocationsize;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForReadAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCheckLockForReadAccess")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, irp) : false;
#else
    (void)filelock;
    (void)irp;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForWriteAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCheckLockForWriteAccess")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, irp) : false;
#else
    (void)filelock;
    (void)irp;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* postirproutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCheckOplock")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irp, context, completionroutine, postirproutine) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* postirproutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCheckOplockEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irp, flags, context, completionroutine, postirproutine) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flagsex2 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* completionroutinecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* postirproutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint64_t timeout = km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0;
    void* notifycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* notifyroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCheckOplockEx2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irp, flags, flagsex2, completionroutinecontext, completionroutine, postirproutine, timeout, notifycontext, notifyroutine) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)flagsex2;
    (void)completionroutinecontext;
    (void)completionroutine;
    (void)postirproutine;
    (void)timeout;
    (void)notifycontext;
    (void)notifyroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCheckUpperOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t newloweroplockstate = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* completionroutinecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* prependroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCheckUpperOplock")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, newloweroplockstate, completionroutinecontext, completionroutine, prependroutine, flags) : -1;
#else
    (void)oplock;
    (void)newloweroplockstate;
    (void)completionroutinecontext;
    (void)completionroutine;
    (void)prependroutine;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCopyRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool wait = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    uint32_t lockkey = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCopyRead")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, wait, lockkey, buffer, iostatus, deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)lockkey;
    (void)buffer;
    (void)iostatus;
    (void)deviceobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCopyWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool wait = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    uint32_t lockkey = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCopyWrite")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, wait, lockkey, buffer, iostatus, deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)lockkey;
    (void)buffer;
    (void)iostatus;
    (void)deviceobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCreateSectionForDataScan_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sectionobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sectionfilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* maximumsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t sectionpageprotection = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t allocationattributes = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCreateSectionForDataScan")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionhandle, sectionobject, sectionfilesize, fileobject, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, flags) : -1;
#else
    (void)sectionhandle;
    (void)sectionobject;
    (void)sectionfilesize;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCurrentBatchOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCurrentBatchOplock")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCurrentOplock")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplockH_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlCurrentOplockH")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlDeleteExtraCreateParameterLookasideList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lookaside = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlDeleteExtraCreateParameterLookasideList")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lookaside, flags);
#else
    (void)lookaside;
    (void)flags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlDeleteKeyFromTunnelCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cache = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t directorykey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlDeleteKeyFromTunnelCache")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cache, directorykey);
#else
    (void)cache;
    (void)directorykey;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlDeleteTunnelCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cache = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlDeleteTunnelCache")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cache);
#else
    (void)cache;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlDeregisterUncProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlDeregisterUncProvider")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle);
#else
    (void)handle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlDismountComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t dismountstatus = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlDismountComplete")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(deviceobject, dismountstatus);
#else
    (void)deviceobject;
    (void)dismountstatus;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlDoesDbcsContainWildCards_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlDoesDbcsContainWildCards")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name) : false;
#else
    (void)name;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlDoesNameContainWildCards_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlDoesNameContainWildCards")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name) : false;
#else
    (void)name;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* startingbyte = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t key = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* processid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFastCheckLockForRead")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, startingbyte, length, key, fileobject, processid) : false;
#else
    (void)filelock;
    (void)startingbyte;
    (void)length;
    (void)key;
    (void)fileobject;
    (void)processid;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* startingbyte = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t key = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* processid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFastCheckLockForWrite")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, startingbyte, length, key, fileobject, processid) : false;
#else
    (void)filelock;
    (void)startingbyte;
    (void)length;
    (void)key;
    (void)fileobject;
    (void)processid;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t processid = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFastUnlockAll")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, fileobject, processid, context) : -1;
#else
    (void)filelock;
    (void)fileobject;
    (void)processid;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAllByKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t processid = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t key = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFastUnlockAllByKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, fileobject, processid, key, context) : -1;
#else
    (void)filelock;
    (void)fileobject;
    (void)processid;
    (void)key;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockSingle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t processid = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    uint32_t key = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    bool alreadysynchronized = km_info.Length() > 7 ? km_info[7].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFastUnlockSingle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, fileobject, fileoffset, length, processid, key, context, alreadysynchronized) : -1;
#else
    (void)filelock;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)processid;
    (void)key;
    (void)context;
    (void)alreadysynchronized;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFindExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ecpcontextsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFindExtraCreateParameter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ecplist, ecptype, ecpcontext, ecpcontextsize) : -1;
#else
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cache = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t directorykey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* shortname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* longname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* datalength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFindInTunnelCache")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cache, directorykey, name, shortname, longname, datalength, data) : false;
#else
    (void)cache;
    (void)directorykey;
    (void)name;
    (void)shortname;
    (void)longname;
    (void)datalength;
    (void)data;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCacheEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cache = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t directorykey = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* shortname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* longname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* datalength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFindInTunnelCacheEx")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cache, directorykey, name, shortname, longname, flags, datalength, data) : false;
#else
    (void)cache;
    (void)directorykey;
    (void)name;
    (void)shortname;
    (void)longname;
    (void)flags;
    (void)datalength;
    (void)data;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFreeAePushLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* aepushlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFreeAePushLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(aepushlock);
#else
    (void)aepushlock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFreeExtraCreateParameter")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ecpcontext);
#else
    (void)ecpcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameterList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFreeExtraCreateParameterList")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ecplist);
#else
    (void)ecplist;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlFreeFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlFreeFileLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filelock);
#else
    (void)filelock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetCurrentProcessLoaderList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetCurrentProcessLoaderList")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetEcpListFromIrp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetEcpListFromIrp")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp, ecplist) : -1;
#else
    (void)irp;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetFileSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetFileSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, filesize) : -1;
#else
    (void)fileobject;
    (void)filesize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetNextBaseMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t runindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* vbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sectorcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetNextBaseMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, runindex, vbn, lbn, sectorcount) : false;
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetNextExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* currentecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nextecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* nextecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* nextecpcontextsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetNextExtraCreateParameter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ecplist, currentecpcontext, nextecptype, nextecpcontext, nextecpcontextsize) : -1;
#else
    (void)ecplist;
    (void)currentecpcontext;
    (void)nextecptype;
    (void)nextecpcontext;
    (void)nextecpcontextsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetNextFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool restart = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetNextFileLock")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, restart) : NULL;
#else
    (void)filelock;
    (void)restart;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetNextLargeMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t runindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* vbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sectorcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetNextLargeMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, runindex, vbn, lbn, sectorcount) : false;
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetNextMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t runindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* vbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* sectorcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetNextMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, runindex, vbn, lbn, sectorcount) : false;
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetSectorSizeInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sectorsizeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetSectorSizeInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject, sectorsizeinfo) : -1;
#else
    (void)deviceobject;
    (void)sectorsizeinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetSupportedFeatures_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* supportedfeatures = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetSupportedFeatures")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject, supportedfeatures) : -1;
#else
    (void)deviceobject;
    (void)supportedfeatures;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlGetVirtualDiskNestingLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* nestinglevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* nestingflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlGetVirtualDiskNestingLevel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject, nestinglevel, nestingflags) : -1;
#else
    (void)deviceobject;
    (void)nestinglevel;
    (void)nestingflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastMdlReadWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIncrementCcFastMdlReadWait")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNoWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadNoWait")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNotPossible_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadNotPossible")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadResourceMiss_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadResourceMiss")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadWait_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadWait")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitExtraCreateParameterLookasideList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lookaside = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitExtraCreateParameterLookasideList")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(lookaside, flags, size, tag);
#else
    (void)lookaside;
    (void)flags;
    (void)size;
    (void)tag;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitializeBaseMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb, pooltype);
#else
    (void)mcb;
    (void)pooltype;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcbEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t flags = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitializeBaseMcbEx")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, pooltype, flags) : false;
#else
    (void)mcb;
    (void)pooltype;
    (void)flags;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ecpflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* cleanupcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t totalsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* listallocatedfrom = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitializeExtraCreateParameter")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ecp, ecpflags, cleanupcallback, totalsize, ecptype, listallocatedfrom);
#else
    (void)ecp;
    (void)ecpflags;
    (void)cleanupcallback;
    (void)totalsize;
    (void)ecptype;
    (void)listallocatedfrom;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameterList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitializeExtraCreateParameterList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ecplist) : -1;
#else
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitializeFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* completelockirproutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* unlockroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitializeFileLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filelock, completelockirproutine, unlockroutine);
#else
    (void)filelock;
    (void)completelockirproutine;
    (void)unlockroutine;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitializeLargeMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitializeLargeMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb, pooltype);
#else
    (void)mcb;
    (void)pooltype;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitializeMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitializeMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb, pooltype);
#else
    (void)mcb;
    (void)pooltype;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitializeOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitializeOplock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(oplock);
#else
    (void)oplock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInitializeTunnelCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cache = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInitializeTunnelCache")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(cache);
#else
    (void)cache;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInsertExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInsertExtraCreateParameter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ecplist, ecpcontext) : -1;
#else
    (void)ecplist;
    (void)ecpcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* perfilecontextpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInsertPerFileContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(perfilecontextpointer, ptr) : -1;
#else
    (void)perfilecontextpointer;
    (void)ptr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileObjectContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInsertPerFileObjectContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, ptr) : -1;
#else
    (void)fileobject;
    (void)ptr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerStreamContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* perstreamcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlInsertPerStreamContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(perstreamcontext, ptr) : -1;
#else
    (void)perstreamcontext;
    (void)ptr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIs32BitProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t process = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIs32BitProcess")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process) : false;
#else
    (void)process;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsDaxVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsDaxVolume")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : false;
#else
    (void)fileobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsDbcsInExpression_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* expression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsDbcsInExpression")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(expression, name) : false;
#else
    (void)expression;
    (void)name;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpAcknowledged_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsEcpAcknowledged")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ecpcontext) : false;
#else
    (void)ecpcontext;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpFromUserMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsEcpFromUserMode")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ecpcontext) : false;
#else
    (void)ecpcontext;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsExtentDangling_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t startpage = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t numberofpages = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsExtentDangling")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(startpage, numberofpages, flags) : 0;
#else
    (void)startpage;
    (void)numberofpages;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsMobileOS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsMobileOS")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInExpression_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* expression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool ignorecase = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* upcasetable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsNameInExpression")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(expression, name, ignorecase, upcasetable) : false;
#else
    (void)expression;
    (void)name;
    (void)ignorecase;
    (void)upcasetable;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInUnUpcasedExpression_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* expression = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool ignorecase = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* upcasetable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsNameInUnUpcasedExpression")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(expression, name, ignorecase, upcasetable) : false;
#else
    (void)expression;
    (void)name;
    (void)ignorecase;
    (void)upcasetable;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsNonEmptyDirectoryReparsePointAllowed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t reparsetag = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsNonEmptyDirectoryReparsePointAllowed")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reparsetag) : false;
#else
    (void)reparsetag;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsNtstatusExpected_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t exception = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsNtstatusExpected")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(exception) : false;
#else
    (void)exception;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsPagingFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsPagingFile")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : 0;
#else
    (void)fileobject;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIsSystemPagingFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIsSystemPagingFile")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : 0;
#else
    (void)fileobject;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlIssueDeviceIoControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ioctl = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t flags = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* inputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t inputbufferlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* outputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t outputbufferlength = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* iosbinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlIssueDeviceIoControl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject, ioctl, flags, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, iosbinformation) : -1;
#else
    (void)deviceobject;
    (void)ioctl;
    (void)flags;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)iosbinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlKernelFsControlFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fscontrolcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* inputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t inputbufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* outputbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t outputbufferlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* retoutputbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlKernelFsControlFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fscontrolcode, inputbuffer, inputbufferlength, outputbuffer, outputbufferlength, retoutputbuffersize) : -1;
#else
    (void)fileobject;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)retoutputbuffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLogCcFlushError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t flusherror = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLogCcFlushError")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, deviceobject, sectionobjectpointer, flusherror, flags) : -1;
#else
    (void)filename;
    (void)deviceobject;
    (void)sectionobjectpointer;
    (void)flusherror;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupBaseMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectorcountfromlbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* startinglbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sectorcountfromstartinglbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* arg_6_index = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupBaseMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn, sectorcountfromlbn, startinglbn, sectorcountfromstartinglbn, arg_6_index) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcountfromlbn;
    (void)startinglbn;
    (void)sectorcountfromstartinglbn;
    (void)arg_6_index;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupLargeMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* lbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectorcountfromlbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* startinglbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sectorcountfromstartinglbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* arg_6_index = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupLargeMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn, sectorcountfromlbn, startinglbn, sectorcountfromstartinglbn, arg_6_index) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcountfromlbn;
    (void)startinglbn;
    (void)sectorcountfromstartinglbn;
    (void)arg_6_index;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* vbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupLastBaseMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntryAndIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* opaquemcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* largevbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* largelbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arg_3_index = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupLastBaseMcbEntryAndIndex")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(opaquemcb, largevbn, largelbn, arg_3_index) : false;
#else
    (void)opaquemcb;
    (void)largevbn;
    (void)largelbn;
    (void)arg_3_index;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* vbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupLastLargeMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntryAndIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* opaquemcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* largevbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* largelbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* arg_3_index = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupLastLargeMcbEntryAndIndex")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(opaquemcb, largevbn, largelbn, arg_3_index) : false;
#else
    (void)opaquemcb;
    (void)largevbn;
    (void)largelbn;
    (void)arg_3_index;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* vbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupLastMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vbn = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lbn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sectorcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* arg_4_index = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, lbn, sectorcount, arg_4_index) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    (void)arg_4_index;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* perfilecontextpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ownerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupPerFileContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(perfilecontextpointer, ownerid, instanceid) : NULL;
#else
    (void)perfilecontextpointer;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileObjectContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ownerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupPerFileObjectContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, ownerid, instanceid) : NULL;
#else
    (void)fileobject;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerStreamContextInternal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* streamcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ownerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlLookupPerStreamContextInternal")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(streamcontext, ownerid, instanceid) : NULL;
#else
    (void)streamcontext;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadCompleteDev_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlMdlReadCompleteDev")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, mdlchain, deviceobject) : false;
#else
    (void)fileobject;
    (void)mdlchain;
    (void)deviceobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadDev_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t lockkey = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlMdlReadDev")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, lockkey, mdlchain, iostatus, deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    (void)deviceobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t lockkey = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlMdlReadEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, lockkey, mdlchain, iostatus) : -1;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlMdlWriteCompleteDev_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlMdlWriteCompleteDev")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, mdlchain, deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    (void)deviceobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderIdFromName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovidername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproviderid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlMupGetProviderIdFromName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovidername, pproviderid) : -1;
#else
    (void)pprovidername;
    (void)pproviderid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderInfoFromFileObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t level = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlMupGetProviderInfoFromFileObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfileobject, level, pbuffer, pbuffersize) : -1;
#else
    (void)pfileobject;
    (void)level;
    (void)pbuffer;
    (void)pbuffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNormalizeNtstatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t exception = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t genericexception = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNormalizeNtstatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(exception, genericexception) : -1;
#else
    (void)exception;
    (void)genericexception;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t notifysync = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* notifylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fscontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyCleanup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notifysync, notifylist, fscontext);
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanupAll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t notifysync = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* notifylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyCleanupAll")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notifysync, notifylist);
#else
    (void)notifysync;
    (void)notifylist;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterChangeDirectory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t notifysync = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* notifylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fscontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* fulldirectoryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool watchtree = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    bool ignorebuffer = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    uint32_t completionfilter = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* notifyirp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* traversecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* subjectcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* filtercallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, void*, bool, bool, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyFilterChangeDirectory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notifysync, notifylist, fscontext, fulldirectoryname, watchtree, ignorebuffer, completionfilter, notifyirp, traversecallback, subjectcontext, filtercallback);
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
    (void)fulldirectoryname;
    (void)watchtree;
    (void)ignorebuffer;
    (void)completionfilter;
    (void)notifyirp;
    (void)traversecallback;
    (void)subjectcontext;
    (void)filtercallback;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterReportChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t notifysync = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* notifylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fulltargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t targetnameoffset = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* streamname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* normalizedparentname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t filtermatch = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t action = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* targetcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* filtercontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyFilterReportChange")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notifysync, notifylist, fulltargetname, targetnameoffset, streamname, normalizedparentname, filtermatch, action, targetcontext, filtercontext);
#else
    (void)notifysync;
    (void)notifylist;
    (void)fulltargetname;
    (void)targetnameoffset;
    (void)streamname;
    (void)normalizedparentname;
    (void)filtermatch;
    (void)action;
    (void)targetcontext;
    (void)filtercontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullChangeDirectory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t notifysync = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* notifylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fscontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* fulldirectoryname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool watchtree = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    bool ignorebuffer = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    uint32_t completionfilter = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* notifyirp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* traversecallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* subjectcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, void*, bool, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyFullChangeDirectory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notifysync, notifylist, fscontext, fulldirectoryname, watchtree, ignorebuffer, completionfilter, notifyirp, traversecallback, subjectcontext);
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
    (void)fulldirectoryname;
    (void)watchtree;
    (void)ignorebuffer;
    (void)completionfilter;
    (void)notifyirp;
    (void)traversecallback;
    (void)subjectcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullReportChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t notifysync = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* notifylist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fulltargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t targetnameoffset = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* streamname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* normalizedparentname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t filtermatch = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t action = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* targetcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyFullReportChange")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notifysync, notifylist, fulltargetname, targetnameoffset, streamname, normalizedparentname, filtermatch, action, targetcontext);
#else
    (void)notifysync;
    (void)notifylist;
    (void)fulltargetname;
    (void)targetnameoffset;
    (void)streamname;
    (void)normalizedparentname;
    (void)filtermatch;
    (void)action;
    (void)targetcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyInitializeSync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* notifysync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyInitializeSync")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notifysync);
#else
    (void)notifysync;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyUninitializeSync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* notifysync = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyUninitializeSync")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(notifysync);
#else
    (void)notifysync;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t eventcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyVolumeEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, eventcode) : -1;
#else
    (void)fileobject;
    (void)eventcode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEventEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t eventcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNotifyVolumeEventEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, eventcode, event) : -1;
#else
    (void)fileobject;
    (void)eventcode;
    (void)event;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInBaseMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInBaseMcb")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb) : 0;
#else
    (void)mcb;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInLargeMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInLargeMcb")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb) : 0;
#else
    (void)mcb;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInMcb")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb) : 0;
#else
    (void)mcb;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* postirproutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockBreakH")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irp, flags, context, completionroutine, postirproutine) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* postirproutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* shareaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockBreakH2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irp, flags, context, completionroutine, postirproutine, grantedaccess, shareaccess) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    (void)grantedaccess;
    (void)shareaccess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irpsp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* postirproutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockBreakToNone")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irpsp, irp, context, completionroutine, postirproutine) : -1;
#else
    (void)oplock;
    (void)irpsp;
    (void)irp;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNoneEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* completionroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* postirproutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockBreakToNoneEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irp, flags, context, completionroutine, postirproutine) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t opencount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockFsctrl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irp, opencount) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrlEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t opencount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockFsctrlEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irp, opencount, flags) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockGetAnyBreakOwnerProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockGetAnyBreakOwnerProcess")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock) : -1;
#else
    (void)oplock;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsFastIoPossible_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockIsFastIoPossible")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsSharedRequest_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockIsSharedRequest")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp) : false;
#else
    (void)irp;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlOplockKeysEqual_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fo1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fo2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlOplockKeysEqual")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fo1, fo2) : false;
#else
    (void)fo1;
    (void)fo2;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlPostPagingFileStackOverflow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* stackoverflowroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlPostPagingFileStackOverflow")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(context, event, stackoverflowroutine);
#else
    (void)context;
    (void)event;
    (void)stackoverflowroutine;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlPostStackOverflow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* stackoverflowroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlPostStackOverflow")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(context, event, stackoverflowroutine);
#else
    (void)context;
    (void)event;
    (void)stackoverflowroutine;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteDev_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t lockkey = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlPrepareMdlWriteDev")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, lockkey, mdlchain, iostatus, deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    (void)deviceobject;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t lockkey = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* mdlchain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlPrepareMdlWriteEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileoffset, length, lockkey, mdlchain, iostatus) : -1;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlPrepareToReuseEcp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlPrepareToReuseEcp")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ecpcontext);
#else
    (void)ecpcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlPrivateLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t processid = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    uint32_t key = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    bool failimmediately = km_info.Length() > 6 ? km_info[6].ToBoolean().Value() : false;
    bool exclusivelock = km_info.Length() > 7 ? km_info[7].ToBoolean().Value() : false;
    void* iosb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    bool alreadysynchronized = km_info.Length() > 11 ? km_info[11].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, bool, bool, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlPrivateLock")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, fileobject, fileoffset, length, processid, key, failimmediately, exclusivelock, iosb, irp, context, alreadysynchronized) : false;
#else
    (void)filelock;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)processid;
    (void)key;
    (void)failimmediately;
    (void)exclusivelock;
    (void)iosb;
    (void)irp;
    (void)context;
    (void)alreadysynchronized;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlProcessFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlProcessFileLock")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filelock, irp, context) : -1;
#else
    (void)filelock;
    (void)irp;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlQueryCachedVdl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* vdl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlQueryCachedVdl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, vdl) : -1;
#else
    (void)fileobject;
    (void)vdl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlQueryInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* retfileinformationsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlQueryInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileinformation, length, fileinformationclass, retfileinformationsize) : -1;
#else
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)retfileinformationsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlQueryKernelEaFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* returnedeadata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    void* ealist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t ealistlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* eaindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    bool restartscan = km_info.Length() > 7 ? km_info[7].ToBoolean().Value() : false;
    void* lengthreturned = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlQueryKernelEaFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, returnedeadata, length, returnsingleentry, ealist, ealistlength, eaindex, restartscan, lengthreturned) : -1;
#else
    (void)fileobject;
    (void)returnedeadata;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    (void)lengthreturned;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlQueryMaximumVirtualDiskNestingLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlQueryMaximumVirtualDiskNestingLevel")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRegisterFileSystemFilterCallbacks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filterdriverobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRegisterFileSystemFilterCallbacks")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filterdriverobject, callbacks) : -1;
#else
    (void)filterdriverobject;
    (void)callbacks;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* muphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* redirectordevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool mailslotssupported = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRegisterUncProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(muphandle, redirectordevicename, mailslotssupported) : -1;
#else
    (void)muphandle;
    (void)redirectordevicename;
    (void)mailslotssupported;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* muphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* redirdevname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRegisterUncProviderEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(muphandle, redirdevname, deviceobject, flags) : -1;
#else
    (void)muphandle;
    (void)redirdevname;
    (void)deviceobject;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* redirdevname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* registration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* muphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRegisterUncProviderEx2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(redirdevname, deviceobject, registration, muphandle) : -1;
#else
    (void)redirdevname;
    (void)deviceobject;
    (void)registration;
    (void)muphandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlReleaseFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlReleaseFile")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(fileobject);
#else
    (void)fileobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRemoveBaseMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t sectorcount = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRemoveBaseMcbEntry")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, sectorcount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRemoveDotsFromPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* originalstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t pathlength = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRemoveDotsFromPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(originalstring, pathlength, newlength) : -1;
#else
    (void)originalstring;
    (void)pathlength;
    (void)newlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRemoveExtraCreateParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ecptype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ecpcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ecpcontextsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRemoveExtraCreateParameter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ecplist, ecptype, ecpcontext, ecpcontextsize) : -1;
#else
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRemoveLargeMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t sectorcount = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRemoveLargeMcbEntry")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb, vbn, sectorcount);
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRemoveMcbEntry_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vbn = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t sectorcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRemoveMcbEntry")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb, vbn, sectorcount);
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* perfilecontextpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ownerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRemovePerFileContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(perfilecontextpointer, ownerid, instanceid) : NULL;
#else
    (void)perfilecontextpointer;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileObjectContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ownerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRemovePerFileObjectContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, ownerid, instanceid) : NULL;
#else
    (void)fileobject;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerStreamContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* streamcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ownerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlRemovePerStreamContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(streamcontext, ownerid, instanceid) : NULL;
#else
    (void)streamcontext;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlResetBaseMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlResetBaseMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb);
#else
    (void)mcb;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlResetLargeMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool selfsynchronized = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlResetLargeMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb, selfsynchronized);
#else
    (void)mcb;
    (void)selfsynchronized;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlSetDriverBacking_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* driverobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlSetDriverBacking")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(driverobj, flags) : -1;
#else
    (void)driverobj;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlSetEcpListIntoIrp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ecplist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlSetEcpListIntoIrp")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp, ecplist) : -1;
#else
    (void)irp;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlSetKernelEaFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* eabuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlSetKernelEaFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, eabuffer, length) : -1;
#else
    (void)fileobject;
    (void)eabuffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlSplitBaseMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t amount = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlSplitBaseMcb")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, amount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)amount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlSplitLargeMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t amount = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlSplitLargeMcb")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mcb, vbn, amount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)amount;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerFileContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* perfilecontextpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlTeardownPerFileContexts")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(perfilecontextpointer);
#else
    (void)perfilecontextpointer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerStreamContexts_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* advancedheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlTeardownPerStreamContexts")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(advancedheader);
#else
    (void)advancedheader;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlTruncateBaseMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlTruncateBaseMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb, vbn);
#else
    (void)mcb;
    (void)vbn;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlTruncateLargeMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t vbn = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlTruncateLargeMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb, vbn);
#else
    (void)mcb;
    (void)vbn;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlTruncateMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t vbn = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlTruncateMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb, vbn);
#else
    (void)mcb;
    (void)vbn;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeBaseMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlUninitializeBaseMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb);
#else
    (void)mcb;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeFileLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filelock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlUninitializeFileLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filelock);
#else
    (void)filelock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeLargeMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlUninitializeLargeMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb);
#else
    (void)mcb;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeMcb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlUninitializeMcb")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mcb);
#else
    (void)mcb;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlUninitializeOplock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(oplock);
#else
    (void)oplock;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlUpdateDiskCounters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t bytesread = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t byteswritten = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlUpdateDiskCounters")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bytesread, byteswritten);
#else
    (void)bytesread;
    (void)byteswritten;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlUpperOplockFsctrl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oplock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t opencount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t loweroplockstate = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlUpperOplockFsctrl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oplock, irp, opencount, loweroplockstate, flags) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    (void)loweroplockstate;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlValidateReparsePointBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* reparsebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlValidateReparsePointBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bufferlength, reparsebuffer) : -1;
#else
    (void)bufferlength;
    (void)reparsebuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_FsRtlVolumeDeviceToCorrelationId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* volumedeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FsRtlVolumeDeviceToCorrelationId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volumedeviceobject, guid) : -1;
#else
    (void)volumedeviceobject;
    (void)guid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_GetSecurityUserInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* logonid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* userinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecurityUserInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(logonid, flags, userinformation) : -1;
#else
    (void)logonid;
    (void)flags;
    (void)userinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoAcquireVpbSpinLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irql = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoAcquireVpbSpinLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(irql);
#else
    (void)irql;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoApplyPriorityInfoThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inputpriorityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* outputpriorityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t thread = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoApplyPriorityInfoThread")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inputpriorityinfo, outputpriorityinfo, thread) : -1;
#else
    (void)inputpriorityinfo;
    (void)outputpriorityinfo;
    (void)thread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCheckDesiredAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* desiredaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grantedaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCheckDesiredAccess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(desiredaccess, grantedaccess) : -1;
#else
    (void)desiredaccess;
    (void)grantedaccess;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCheckEaBufferValidity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* eabuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ealength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* erroroffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCheckEaBufferValidity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eabuffer, ealength, erroroffset) : -1;
#else
    (void)eabuffer;
    (void)ealength;
    (void)erroroffset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCheckFunctionAccess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t grantedaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t majorfunction = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t minorfunction = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t iocontrolcode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* arg1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* arg2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCheckFunctionAccess")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(grantedaccess, majorfunction, minorfunction, iocontrolcode, arg1, arg2) : -1;
#else
    (void)grantedaccess;
    (void)majorfunction;
    (void)minorfunction;
    (void)iocontrolcode;
    (void)arg1;
    (void)arg2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetFileInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool setoperation = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCheckQuerySetFileInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileinformationclass, length, setoperation) : -1;
#else
    (void)fileinformationclass;
    (void)length;
    (void)setoperation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fsinformationclass = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool setoperation = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCheckQuerySetVolumeInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fsinformationclass, length, setoperation) : -1;
#else
    (void)fsinformationclass;
    (void)length;
    (void)setoperation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCheckQuotaBufferValidity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* quotabuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t quotalength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* erroroffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCheckQuotaBufferValidity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(quotabuffer, quotalength, erroroffset) : -1;
#else
    (void)quotabuffer;
    (void)quotalength;
    (void)erroroffset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoClearFsTrackOffsetState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoClearFsTrackOffsetState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp) : -1;
#else
    (void)irp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCreateStreamFileObject")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, deviceobject) : NULL;
#else
    (void)fileobject;
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCreateStreamFileObjectEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, deviceobject, filehandle) : NULL;
#else
    (void)fileobject;
    (void)deviceobject;
    (void)filehandle;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* createoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* streamfileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCreateStreamFileObjectEx2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(createoptions, fileobject, deviceobject, streamfileobject, filehandle) : -1;
#else
    (void)createoptions;
    (void)fileobject;
    (void)deviceobject;
    (void)streamfileobject;
    (void)filehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectLite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoCreateStreamFileObjectLite")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, deviceobject) : NULL;
#else
    (void)fileobject;
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoEnumerateDeviceObjectList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* driverobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* deviceobjectlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t deviceobjectlistsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* actualnumberdeviceobjects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoEnumerateDeviceObjectList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(driverobject, deviceobjectlist, deviceobjectlistsize, actualnumberdeviceobjects) : -1;
#else
    (void)driverobject;
    (void)deviceobjectlist;
    (void)deviceobjectlistsize;
    (void)actualnumberdeviceobjects;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoEnumerateRegisteredFiltersList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* driverobjectlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t driverobjectlistsize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* actualnumberdriverobjects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoEnumerateRegisteredFiltersList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(driverobjectlist, driverobjectlistsize, actualnumberdriverobjects) : -1;
#else
    (void)driverobjectlist;
    (void)driverobjectlistsize;
    (void)actualnumberdriverobjects;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoFastQueryNetworkAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t openoptions = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoFastQueryNetworkAttributes")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectattributes, desiredaccess, openoptions, iostatus, buffer) : false;
#else
    (void)objectattributes;
    (void)desiredaccess;
    (void)openoptions;
    (void)iostatus;
    (void)buffer;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetAttachedDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetAttachedDevice")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject) : NULL;
#else
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetBaseFileSystemDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetBaseFileSystemDeviceObject")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : NULL;
#else
    (void)fileobject;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetDeviceAttachmentBaseRef_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetDeviceAttachmentBaseRef")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject) : NULL;
#else
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetDeviceToVerify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetDeviceToVerify")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : NULL;
#else
    (void)thread;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetDiskDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filesystemdeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* diskdeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetDiskDeviceObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filesystemdeviceobject, diskdeviceobject) : -1;
#else
    (void)filesystemdeviceobject;
    (void)diskdeviceobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetFsTrackOffsetState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* retfstrackoffsetblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rettrackedoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetFsTrackOffsetState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp, retfstrackoffsetblob, rettrackedoffset) : -1;
#else
    (void)irp;
    (void)retfstrackoffsetblob;
    (void)rettrackedoffset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetLowerDeviceObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetLowerDeviceObject")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject) : NULL;
#else
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetOplockKeyContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : NULL;
#else
    (void)fileobject;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContextEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetOplockKeyContextEx")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject) : NULL;
#else
    (void)fileobject;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetRequestorProcess")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp) : -1;
#else
    (void)irp;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcessId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetRequestorProcessId")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp) : 0;
#else
    (void)irp;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoGetRequestorSessionId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoGetRequestorSessionId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp, psessionid) : -1;
#else
    (void)irp;
    (void)psessionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoIrpHasFsTrackOffsetExtensionType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoIrpHasFsTrackOffsetExtensionType")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp) : false;
#else
    (void)irp;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoIsOperationSynchronous_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoIsOperationSynchronous")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp) : false;
#else
    (void)irp;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoIsSystemThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoIsSystemThread")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : false;
#else
    (void)thread;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoIsValidNameGraftingBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reparsebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoIsValidNameGraftingBuffer")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp, reparsebuffer) : false;
#else
    (void)irp;
    (void)reparsebuffer;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoPageRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* memorydescriptorlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* startingoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoPageRead")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock) : -1;
#else
    (void)fileobject;
    (void)memorydescriptorlist;
    (void)startingoffset;
    (void)event;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoQueryFileDosDeviceName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* objectnameinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoQueryFileDosDeviceName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, objectnameinformation) : -1;
#else
    (void)fileobject;
    (void)objectnameinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoQueryFileInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoQueryFileInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileinformationclass, length, fileinformation, returnedlength) : -1;
#else
    (void)fileobject;
    (void)fileinformationclass;
    (void)length;
    (void)fileinformation;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoQueryVolumeInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fsinformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* fsinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoQueryVolumeInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fsinformationclass, length, fsinformation, returnedlength) : -1;
#else
    (void)fileobject;
    (void)fsinformationclass;
    (void)length;
    (void)fsinformation;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoQueueThreadIrp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoQueueThreadIrp")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(irp);
#else
    (void)irp;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoRegisterFileSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoRegisterFileSystem")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(deviceobject);
#else
    (void)deviceobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoReleaseVpbSpinLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t irql = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoReleaseVpbSpinLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(irql);
#else
    (void)irql;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoReplaceFileObjectName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t filenamelength = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoReplaceFileObjectName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, newfilename, filenamelength) : -1;
#else
    (void)fileobject;
    (void)newfilename;
    (void)filenamelength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoRequestDeviceRemovalForReset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* physicaldeviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoRequestDeviceRemovalForReset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(physicaldeviceobject, flags) : -1;
#else
    (void)physicaldeviceobject;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoRetrievePriorityInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t thread = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* priorityinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoRetrievePriorityInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp, fileobject, thread, priorityinfo) : -1;
#else
    (void)irp;
    (void)fileobject;
    (void)thread;
    (void)priorityinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoSetDeviceToVerify_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoSetDeviceToVerify")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(thread, deviceobject);
#else
    (void)thread;
    (void)deviceobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoSetFsTrackOffsetState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* irp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fstrackoffsetblob = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t trackedoffset = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoSetFsTrackOffsetState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(irp, fstrackoffsetblob, trackedoffset) : -1;
#else
    (void)irp;
    (void)fstrackoffsetblob;
    (void)trackedoffset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoSetInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoSetInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, fileinformationclass, length, fileinformation) : -1;
#else
    (void)fileobject;
    (void)fileinformationclass;
    (void)length;
    (void)fileinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoSynchronousPageWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fileobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* memorydescriptorlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* startingoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoSynchronousPageWrite")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileobject, memorydescriptorlist, startingoffset, event, iostatusblock) : -1;
#else
    (void)fileobject;
    (void)memorydescriptorlist;
    (void)startingoffset;
    (void)event;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoThreadToProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoThreadToProcess")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : -1;
#else
    (void)thread;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoUnregisterFileSystem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoUnregisterFileSystem")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(deviceobject);
#else
    (void)deviceobject;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_IoVerifyVolume_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* deviceobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool allowrawmount = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IoVerifyVolume")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceobject, allowrawmount) : -1;
#else
    (void)deviceobject;
    (void)allowrawmount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeAcquireQueuedSpinLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t number = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeAcquireQueuedSpinLock")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(number) : 0;
#else
    (void)number;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeAcquireSpinLockRaiseToSynch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* spinlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeAcquireSpinLockRaiseToSynch")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(spinlock) : 0;
#else
    (void)spinlock;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeAttachProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t process = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeAttachProcess")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(process);
#else
    (void)process;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeDetachProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeDetachProcess")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeInitializeMutant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mutant = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool initialowner = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeInitializeMutant")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(mutant, initialowner);
#else
    (void)mutant;
    (void)initialowner;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeInitializeQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeInitializeQueue")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(queue, count);
#else
    (void)queue;
    (void)count;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeInsertHeadQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeInsertHeadQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queue, entry) : -1;
#else
    (void)queue;
    (void)entry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeInsertQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* entry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeInsertQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queue, entry) : -1;
#else
    (void)queue;
    (void)entry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeReadStateMutant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mutant = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeReadStateMutant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mutant) : -1;
#else
    (void)mutant;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeReadStateQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeReadStateQueue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queue) : -1;
#else
    (void)queue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeReleaseMutant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mutant = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t increment = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool abandoned = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    bool wait = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, bool, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeReleaseMutant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mutant, increment, abandoned, wait) : -1;
#else
    (void)mutant;
    (void)increment;
    (void)abandoned;
    (void)wait;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeReleaseQueuedSpinLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t number = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t oldirql = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeReleaseQueuedSpinLock")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(number, oldirql);
#else
    (void)number;
    (void)oldirql;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeRemoveQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int8_t waitmode = static_cast<int8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeRemoveQueue")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queue, waitmode, timeout) : NULL;
#else
    (void)queue;
    (void)waitmode;
    (void)timeout;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeRemoveQueueEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int8_t waitmode = static_cast<int8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool alertable = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* timeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* entryarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int8_t, bool, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeRemoveQueueEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queue, waitmode, alertable, timeout, entryarray, count) : 0;
#else
    (void)queue;
    (void)waitmode;
    (void)alertable;
    (void)timeout;
    (void)entryarray;
    (void)count;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeRundownQueue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* queue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeRundownQueue")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(queue) : NULL;
#else
    (void)queue;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeSetIdealProcessorThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint8_t processor = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeSetIdealProcessorThread")));
    }
    uint8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, processor) : 0;
#else
    (void)thread;
    (void)processor;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeSetKernelStackSwapEnable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool enable = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeSetKernelStackSwapEnable")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enable) : false;
#else
    (void)enable;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeStackAttachProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t process = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* apcstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeStackAttachProcess")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(process, apcstate);
#else
    (void)process;
    (void)apcstate;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeTryToAcquireQueuedSpinLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t number = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* oldirql = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeTryToAcquireQueuedSpinLock")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(number, oldirql) : 0;
#else
    (void)number;
    (void)oldirql;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_KeUnstackDetachProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* apcstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "KeUnstackDetachProcess")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(apcstate);
#else
    (void)apcstate;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MakeSignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fqop = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t messageseqno = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MakeSignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, fqop, pmessage, messageseqno) : -1;
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MapSecurityError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t secstatus = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MapSecurityError")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(secstatus) : -1;
#else
    (void)secstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmCanFileBeTruncated_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newfilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmCanFileBeTruncated")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionpointer, newfilesize) : false;
#else
    (void)sectionpointer;
    (void)newfilesize;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmDoesFileHaveUserWritableReferences_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmDoesFileHaveUserWritableReferences")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionpointer) : 0;
#else
    (void)sectionpointer;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmFlushImageSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flushtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmFlushImageSection")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionobjectpointer, flushtype) : false;
#else
    (void)sectionobjectpointer;
    (void)flushtype;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmForceSectionClosed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool delayclose = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmForceSectionClosed")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionobjectpointer, delayclose) : false;
#else
    (void)sectionobjectpointer;
    (void)delayclose;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmForceSectionClosedEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionobjectpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t forcecloseflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmForceSectionClosedEx")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionobjectpointer, forcecloseflags) : false;
#else
    (void)sectionobjectpointer;
    (void)forcecloseflags;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmGetMaximumFileSectionSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmGetMaximumFileSectionSize")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmIsFileSectionActive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fssectionpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sectionisactive = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmIsFileSectionActive")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fssectionpointer, flags, sectionisactive) : -1;
#else
    (void)fssectionpointer;
    (void)flags;
    (void)sectionisactive;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmIsRecursiveIoFault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmIsRecursiveIoFault")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmMdlPagesAreZero_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mdl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmMdlPagesAreZero")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mdl) : 0;
#else
    (void)mdl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmPrefetchPages_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t numberoflists = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* readlists = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmPrefetchPages")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(numberoflists, readlists) : -1;
#else
    (void)numberoflists;
    (void)readlists;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_MmSetAddressRangeModified_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* address = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MmSetAddressRangeModified")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(address, length) : false;
#else
    (void)address;
    (void)length;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtAccessCheckAndAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    bool objectcreation = km_info.Length() > 7 ? km_info[7].ToBoolean().Value() : false;
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtAccessCheckAndAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeAndAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    bool objectcreation = km_info.Length() > 12 ? km_info[12].ToBoolean().Value() : false;
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtAccessCheckByTypeAndAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    bool objectcreation = km_info.Length() > 12 ? km_info[12].ToBoolean().Value() : false;
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtAccessCheckByTypeResultListAndAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarmByHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
    bool objectcreation = km_info.Length() > 13 ? km_info[13].ToBoolean().Value() : false;
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 16 ? km_napi_arg_u64(km_info[16]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtAccessCheckByTypeResultListAndAuditAlarmByHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtAdjustGroupsToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool resettodefault = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* newstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* previousstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtAdjustGroupsToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenhandle, resettodefault, newstate, bufferlength, previousstate, returnlength) : -1;
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtAdjustPrivilegesToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool disableallprivileges = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* newstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* previousstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtAdjustPrivilegesToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenhandle, disableallprivileges, newstate, bufferlength, previousstate, returnlength) : -1;
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t zerobits = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* regionsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t allocationtype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t protect = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtAllocateVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, zerobits, regionsize, allocationtype, protect) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)regionsize;
    (void)allocationtype;
    (void)protect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemoryEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* regionsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t allocationtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t pageprotection = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* extendedparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t extendedparametercount = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtAllocateVirtualMemoryEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, regionsize, allocationtype, pageprotection, extendedparameters, extendedparametercount) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)extendedparametercount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtCancelIoFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iorequesttocancel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtCancelIoFileEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iorequesttocancel, iostatusblock) : -1;
#else
    (void)filehandle;
    (void)iorequesttocancel;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtCloseObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool generateonclose = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtCloseObjectAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtCreateDirectoryObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* directoryhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtCreateDirectoryObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(directoryhandle, desiredaccess, objectattributes) : -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtCreateEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* eventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t eventtype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    bool initialstate = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtCreateEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventhandle, desiredaccess, objectattributes, eventtype, initialstate) : -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)eventtype;
    (void)initialstate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtCreateFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* allocationsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t fileattributes = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t shareaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t createdisposition = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t createoptions = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* eabuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t ealength = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtCreateFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, desiredaccess, objectattributes, iostatusblock, allocationsize, fileattributes, shareaccess, createdisposition, createoptions, eabuffer, ealength) : -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtCreateSection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* maximumsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t sectionpageprotection = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t allocationattributes = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtCreateSection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionhandle, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, filehandle) : -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtCreateSectionEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* maximumsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t sectionpageprotection = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t allocationattributes = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* extendedparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t extendedparametercount = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtCreateSectionEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionhandle, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, filehandle, extendedparameters, extendedparametercount) : -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    (void)extendedparameters;
    (void)extendedparametercount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtDeleteFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtDeleteFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectattributes) : -1;
#else
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtDeleteObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool generateonclose = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtDeleteObjectAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtDuplicateObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourceprocesshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetprocesshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targethandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t handleattributes = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtDuplicateObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourceprocesshandle, sourcehandle, targetprocesshandle, targethandle, desiredaccess, handleattributes, options) : -1;
#else
    (void)sourceprocesshandle;
    (void)sourcehandle;
    (void)targetprocesshandle;
    (void)targethandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtDuplicateToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* existingtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    bool effectiveonly = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    int32_t tokentype = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* newtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtDuplicateToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(existingtokenhandle, desiredaccess, objectattributes, effectiveonly, tokentype, newtokenhandle) : -1;
#else
    (void)existingtokenhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)effectiveonly;
    (void)tokentype;
    (void)newtokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtFilterToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* existingtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidstodisable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* privilegestodelete = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* restrictedsids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* newtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtFilterToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(existingtokenhandle, flags, sidstodisable, privilegestodelete, restrictedsids, newtokenhandle) : -1;
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)newtokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtFlushBuffersFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t parameterssize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtFlushBuffersFileEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, flags, parameters, parameterssize, iostatusblock) : -1;
#else
    (void)filehandle;
    (void)flags;
    (void)parameters;
    (void)parameterssize;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtFlushVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* regionsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtFlushVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, regionsize, iostatus) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)iostatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtFreeVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* regionsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t freetype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtFreeVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, regionsize, freetype) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)freetype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtImpersonateAnonymousToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtImpersonateAnonymousToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadhandle) : -1;
#else
    (void)threadhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtOpenDirectoryObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* directoryhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtOpenDirectoryObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(directoryhandle, desiredaccess, objectattributes) : -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtOpenFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t shareaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t openoptions = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtOpenFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, desiredaccess, objectattributes, iostatusblock, shareaccess, openoptions) : -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)shareaccess;
    (void)openoptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtOpenObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t grantedaccess = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    bool objectcreation = km_info.Length() > 9 ? km_info[9].ToBoolean().Value() : false;
    bool accessgranted = km_info.Length() > 10 ? km_info[10].ToBoolean().Value() : false;
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, bool, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtOpenObjectAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, clienttoken, desiredaccess, grantedaccess, privileges, objectcreation, accessgranted, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtOpenProcessToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtOpenProcessToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, desiredaccess, tokenhandle) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtOpenProcessTokenEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t handleattributes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtOpenProcessTokenEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, desiredaccess, handleattributes, tokenhandle) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtOpenSymbolicLinkObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* linkhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtOpenSymbolicLinkObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(linkhandle, desiredaccess, objectattributes) : -1;
#else
    (void)linkhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtOpenThreadToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool openasself = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtOpenThreadToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadhandle, desiredaccess, openasself, tokenhandle) : -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtOpenThreadTokenEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool openasself = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    uint32_t handleattributes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtOpenThreadTokenEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadhandle, desiredaccess, openasself, handleattributes, tokenhandle) : -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)handleattributes;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtPrivilegeCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* requiredprivileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtPrivilegeCheck")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clienttoken, requiredprivileges, result) : -1;
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtPrivilegeObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    bool accessgranted = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtPrivilegeObjectAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, clienttoken, desiredaccess, privileges, accessgranted) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtPrivilegedServiceAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool accessgranted = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtPrivilegedServiceAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, servicename, clienttoken, privileges, accessgranted) : -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQueryDirectoryObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* directoryhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    bool restartscan = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQueryDirectoryObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(directoryhandle, buffer, length, returnsingleentry, restartscan, context, returnlength) : -1;
#else
    (void)directoryhandle;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)restartscan;
    (void)context;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQueryEaFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* ealist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t ealistlength = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* eaindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    bool restartscan = km_info.Length() > 8 ? km_info[8].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQueryEaFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, buffer, length, returnsingleentry, ealist, ealistlength, eaindex, restartscan) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQueryFullAttributesFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQueryFullAttributesFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectattributes, fileinformation) : -1;
#else
    (void)objectattributes;
    (void)fileinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQueryInformationByName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQueryInformationByName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectattributes, iostatusblock, fileinformation, length, fileinformationclass) : -1;
#else
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQueryInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQueryInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, fileinformation, length, fileinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQueryInformationToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t tokeninformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t tokeninformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQueryInformationToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength, returnlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQueryQuotaInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* sidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t sidlistlength = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* startsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    bool restartscan = km_info.Length() > 8 ? km_info[8].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQueryQuotaInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, buffer, length, returnsingleentry, sidlist, sidlistlength, startsid, restartscan) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)sidlist;
    (void)sidlistlength;
    (void)startsid;
    (void)restartscan;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQuerySecurityObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQuerySecurityObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, securityinformation, securitydescriptor, length, lengthneeded) : -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQuerySymbolicLinkObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* linkhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* linktarget = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQuerySymbolicLinkObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(linkhandle, linktarget, returnedlength) : -1;
#else
    (void)linkhandle;
    (void)linktarget;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQueryVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t memoryinformationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* memoryinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t memoryinformationlength = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQueryVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, memoryinformationclass, memoryinformation, memoryinformationlength, returnlength) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtQueryVolumeInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fsinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fsinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtQueryVolumeInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, fsinformation, length, fsinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtSetEaFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtSetEaFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, buffer, length) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtSetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* eventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* previousstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtSetEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventhandle, previousstate) : -1;
#else
    (void)eventhandle;
    (void)previousstate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtSetInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fileinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtSetInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, fileinformation, length, fileinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtSetInformationToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t tokeninformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t tokeninformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtSetInformationToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtSetInformationVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t vminformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t numberofentries = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* virtualaddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vminformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t vminformationlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtSetInformationVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, vminformationclass, numberofentries, virtualaddresses, vminformation, vminformationlength) : -1;
#else
    (void)processhandle;
    (void)vminformationclass;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)vminformation;
    (void)vminformationlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtSetQuotaInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtSetQuotaInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, buffer, length) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtSetSecurityObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtSetSecurityObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, securityinformation, securitydescriptor) : -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtSetVolumeInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fsinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fsinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtSetVolumeInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, fsinformation, length, fsinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_NtUnlockFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* byteoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t key = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NtUnlockFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, byteoffset, length, key) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ObInsertObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* passedaccessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t objectpointerbias = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* newobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObInsertObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object, passedaccessstate, desiredaccess, objectpointerbias, newobject, handle) : -1;
#else
    (void)object;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objectpointerbias;
    (void)newobject;
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ObIsKernelHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObIsKernelHandle")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : false;
#else
    (void)handle;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ObMakeTemporaryObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObMakeTemporaryObject")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(object);
#else
    (void)object;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t handleattributes = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* passedaccessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t objecttype = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int8_t accessmode = static_cast<int8_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t, int8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObOpenObjectByPointer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object, handleattributes, passedaccessstate, desiredaccess, objecttype, accessmode, handle) : -1;
#else
    (void)object;
    (void)handleattributes;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointerWithTag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t handleattributes = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* passedaccessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t objecttype = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int8_t accessmode = static_cast<int8_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t, int8_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObOpenObjectByPointerWithTag")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object, handleattributes, passedaccessstate, desiredaccess, objecttype, accessmode, tag, handle) : -1;
#else
    (void)object;
    (void)handleattributes;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)tag;
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ObQueryNameString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* objectnameinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObQueryNameString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object, objectnameinfo, length, returnlength) : -1;
#else
    (void)object;
    (void)objectnameinfo;
    (void)length;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ObQueryObjectAuditingByHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObQueryObjectAuditingByHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, generateonclose) : -1;
#else
    (void)handle;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PfxFindPrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prefixtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfxFindPrefix")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prefixtable, fullname) : NULL;
#else
    (void)prefixtable;
    (void)fullname;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PfxInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prefixtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfxInitialize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prefixtable);
#else
    (void)prefixtable;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PfxInsertPrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prefixtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prefixtableentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfxInsertPrefix")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prefixtable, prefix, prefixtableentry) : false;
#else
    (void)prefixtable;
    (void)prefix;
    (void)prefixtableentry;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PfxRemovePrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prefixtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prefixtableentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PfxRemovePrefix")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prefixtable, prefixtableentry);
#else
    (void)prefixtable;
    (void)prefixtableentry;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PoQueueShutdownWorkItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* workitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PoQueueShutdownWorkItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(workitem) : -1;
#else
    (void)workitem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsAssignImpersonationToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsAssignImpersonationToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, token) : -1;
#else
    (void)thread;
    (void)token;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsChargePoolQuota_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t process = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t amount = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsChargePoolQuota")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(process, pooltype, amount);
#else
    (void)process;
    (void)pooltype;
    (void)amount;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsChargeProcessPoolQuota_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t process = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t amount = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsChargeProcessPoolQuota")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, pooltype, amount) : -1;
#else
    (void)process;
    (void)pooltype;
    (void)amount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsDereferenceImpersonationToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* impersonationtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsDereferenceImpersonationToken")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(impersonationtoken);
#else
    (void)impersonationtoken;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsDereferencePrimaryToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* primarytoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsDereferencePrimaryToken")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(primarytoken);
#else
    (void)primarytoken;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsDisableImpersonation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* impersonationstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsDisableImpersonation")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, impersonationstate) : false;
#else
    (void)thread;
    (void)impersonationstate;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsGetProcessExitTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsGetProcessExitTime")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsGetThreadProcess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsGetThreadProcess")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : -1;
#else
    (void)thread;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsImpersonateClient_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool copyonopen = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    bool effectiveonly = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    int32_t impersonationlevel = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, bool, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsImpersonateClient")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, token, copyonopen, effectiveonly, impersonationlevel) : -1;
#else
    (void)thread;
    (void)token;
    (void)copyonopen;
    (void)effectiveonly;
    (void)impersonationlevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsIsDiskCountersEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsIsDiskCountersEnabled")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsIsSystemThread_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsIsSystemThread")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : false;
#else
    (void)thread;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsIsThreadTerminating_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsIsThreadTerminating")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread) : false;
#else
    (void)thread;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsLookupProcessByProcessId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* process = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsLookupProcessByProcessId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processid, process) : -1;
#else
    (void)processid;
    (void)process;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsLookupThreadByThreadId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* thread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsLookupThreadByThreadId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadid, thread) : -1;
#else
    (void)threadid;
    (void)thread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsReferenceImpersonationToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* copyonopen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* effectiveonly = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* impersonationlevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsReferenceImpersonationToken")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thread, copyonopen, effectiveonly, impersonationlevel) : NULL;
#else
    (void)thread;
    (void)copyonopen;
    (void)effectiveonly;
    (void)impersonationlevel;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsReferencePrimaryToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t process = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsReferencePrimaryToken")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process) : NULL;
#else
    (void)process;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsRestoreImpersonation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* impersonationstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsRestoreImpersonation")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(thread, impersonationstate);
#else
    (void)thread;
    (void)impersonationstate;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsReturnPoolQuota_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t process = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t amount = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsReturnPoolQuota")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(process, pooltype, amount);
#else
    (void)process;
    (void)pooltype;
    (void)amount;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsRevertToSelf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsRevertToSelf")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_PsUpdateDiskCounters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t process = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint64_t bytesread = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t byteswritten = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t readoperationcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t writeoperationcount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t flushoperationcount = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PsUpdateDiskCounters")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(process, bytesread, byteswritten, readoperationcount, writeoperationcount, flushoperationcount);
#else
    (void)process;
    (void)bytesread;
    (void)byteswritten;
    (void)readoperationcount;
    (void)writeoperationcount;
    (void)flushoperationcount;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_QuerySecurityContextToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QuerySecurityContextToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, token) : -1;
#else
    (void)phcontext;
    (void)token;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlAbsoluteToSelfRelativeSD_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* absolutesecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* selfrelativesecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAbsoluteToSelfRelativeSD")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(absolutesecuritydescriptor, selfrelativesecuritydescriptor, bufferlength) : -1;
#else
    (void)absolutesecuritydescriptor;
    (void)selfrelativesecuritydescriptor;
    (void)bufferlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t acerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAddAccessAllowedAce")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(acl, acerevision, accessmask, sid) : -1;
#else
    (void)acl;
    (void)acerevision;
    (void)accessmask;
    (void)sid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t acerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAddAccessAllowedAceEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(acl, acerevision, aceflags, accessmask, sid) : -1;
#else
    (void)acl;
    (void)acerevision;
    (void)aceflags;
    (void)accessmask;
    (void)sid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlAddAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t acerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t startingaceindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* acelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t acelistlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAddAce")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(acl, acerevision, startingaceindex, acelist, acelistlength) : -1;
#else
    (void)acl;
    (void)acerevision;
    (void)startingaceindex;
    (void)acelist;
    (void)acelistlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* identifierauthority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t subauthoritycount = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t subauthority0 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t subauthority1 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t subauthority2 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t subauthority3 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t subauthority4 = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t subauthority5 = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t subauthority6 = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t subauthority7 = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAllocateAndInitializeSid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(identifierauthority, subauthoritycount, subauthority0, subauthority1, subauthority2, subauthority3, subauthority4, subauthority5, subauthority6, subauthority7, sid) : -1;
#else
    (void)identifierauthority;
    (void)subauthoritycount;
    (void)subauthority0;
    (void)subauthority1;
    (void)subauthority2;
    (void)subauthority3;
    (void)subauthority4;
    (void)subauthority5;
    (void)subauthority6;
    (void)subauthority7;
    (void)sid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSidEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* identifierauthority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t subauthoritycount = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* subauthorities = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAllocateAndInitializeSidEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(identifierauthority, subauthoritycount, subauthorities, sid) : -1;
#else
    (void)identifierauthority;
    (void)subauthoritycount;
    (void)subauthorities;
    (void)sid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlAllocateHeap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t size = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAllocateHeap")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heaphandle, flags, size) : NULL;
#else
    (void)heaphandle;
    (void)flags;
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlAppendStringToString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destination = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlAppendStringToString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destination, source) : -1;
#else
    (void)destination;
    (void)source;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCompareAltitudes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* altitude1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* altitude2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCompareAltitudes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(altitude1, altitude2) : -1;
#else
    (void)altitude1;
    (void)altitude2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCompareMemoryUlong_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t length = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t pattern = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCompareMemoryUlong")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(source, length, pattern) : 0;
#else
    (void)source;
    (void)length;
    (void)pattern;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCompressBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t compressionformatandengine = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* uncompressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t uncompressedbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t compressedbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t uncompressedchunksize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* finalcompressedsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* workspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCompressBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compressionformatandengine, uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, uncompressedchunksize, finalcompressedsize, workspace) : -1;
#else
    (void)compressionformatandengine;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)uncompressedchunksize;
    (void)finalcompressedsize;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCompressChunks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uncompressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t uncompressedbuffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t compressedbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* compresseddatainfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t compresseddatainfolength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* workspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCompressChunks")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, compresseddatainfo, compresseddatainfolength, workspace) : -1;
#else
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compresseddatainfo;
    (void)compresseddatainfolength;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCopyLuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourceluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCopyLuid")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(destinationluid, sourceluid);
#else
    (void)destinationluid;
    (void)sourceluid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCopySid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t destinationsidlength = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* destinationsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sourcesid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCopySid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationsidlength, destinationsid, sourcesid) : -1;
#else
    (void)destinationsidlength;
    (void)destinationsid;
    (void)sourcesid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCreateAcl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t acllength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aclrevision = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCreateAcl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(acl, acllength, aclrevision) : -1;
#else
    (void)acl;
    (void)acllength;
    (void)aclrevision;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCreateHeap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* heapbase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t reservesize = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint64_t commitsize = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* lock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCreateHeap")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, heapbase, reservesize, commitsize, lock, parameters) : NULL;
#else
    (void)flags;
    (void)heapbase;
    (void)reservesize;
    (void)commitsize;
    (void)lock;
    (void)parameters;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCreateServiceSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servicesid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* servicesidlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCreateServiceSid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(servicename, servicesid, servicesidlength) : -1;
#else
    (void)servicename;
    (void)servicesid;
    (void)servicesidlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCreateSystemVolumeInformationFolder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* volumerootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCreateSystemVolumeInformationFolder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(volumerootpath) : -1;
#else
    (void)volumerootpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCreateUnicodeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCreateUnicodeString")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationstring, sourcestring) : false;
#else
    (void)destinationstring;
    (void)sourcestring;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCreateVirtualAccountSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t basesubauthority = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sidlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCreateVirtualAccountSid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, basesubauthority, sid, sidlength) : -1;
#else
    (void)name;
    (void)basesubauthority;
    (void)sid;
    (void)sidlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlCustomCPToUnicodeN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxbytesinunicodestring = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* bytesinunicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* customcpstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t bytesincustomcpstring = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlCustomCPToUnicodeN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcp, unicodestring, maxbytesinunicodestring, bytesinunicodestring, customcpstring, bytesincustomcpstring) : -1;
#else
    (void)customcp;
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)customcpstring;
    (void)bytesincustomcpstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDecompressBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t compressionformat = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* uncompressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t uncompressedbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t compressedbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* finaluncompressedsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDecompressBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compressionformat, uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, finaluncompressedsize) : -1;
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)finaluncompressedsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t compressionformat = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* uncompressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t uncompressedbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t compressedbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* finaluncompressedsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* workspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDecompressBufferEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compressionformat, uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, finaluncompressedsize, workspace) : -1;
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)finaluncompressedsize;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t compressionformat = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* uncompressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t uncompressedbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t compressedbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t uncompressedchunksize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* finaluncompressedsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* workspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDecompressBufferEx2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compressionformat, uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, uncompressedchunksize, finaluncompressedsize, workspace) : -1;
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)uncompressedchunksize;
    (void)finaluncompressedsize;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDecompressChunks_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* uncompressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t uncompressedbuffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t compressedbuffersize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* compressedtail = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t compressedtailsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* compresseddatainfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDecompressChunks")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(uncompressedbuffer, uncompressedbuffersize, compressedbuffer, compressedbuffersize, compressedtail, compressedtailsize, compresseddatainfo) : -1;
#else
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compressedtail;
    (void)compressedtailsize;
    (void)compresseddatainfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDecompressFragment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t compressionformat = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* uncompressedfragment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t uncompressedfragmentsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t compressedbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t fragmentoffset = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* finaluncompressedsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* workspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDecompressFragment")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compressionformat, uncompressedfragment, uncompressedfragmentsize, compressedbuffer, compressedbuffersize, fragmentoffset, finaluncompressedsize, workspace) : -1;
#else
    (void)compressionformat;
    (void)uncompressedfragment;
    (void)uncompressedfragmentsize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)fragmentoffset;
    (void)finaluncompressedsize;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDecompressFragmentEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t compressionformat = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* uncompressedfragment = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t uncompressedfragmentsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t compressedbuffersize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t fragmentoffset = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t uncompressedchunksize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* finaluncompressedsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* workspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDecompressFragmentEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compressionformat, uncompressedfragment, uncompressedfragmentsize, compressedbuffer, compressedbuffersize, fragmentoffset, uncompressedchunksize, finaluncompressedsize, workspace) : -1;
#else
    (void)compressionformat;
    (void)uncompressedfragment;
    (void)uncompressedfragmentsize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)fragmentoffset;
    (void)uncompressedchunksize;
    (void)finaluncompressedsize;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDeleteAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t aceindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDeleteAce")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(acl, aceindex) : -1;
#else
    (void)acl;
    (void)aceindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDescribeChunk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t compressionformat = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* endofcompressedbufferplus1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* chunkbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* chunksize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDescribeChunk")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compressionformat, compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize) : -1;
#else
    (void)compressionformat;
    (void)compressedbuffer;
    (void)endofcompressedbufferplus1;
    (void)chunkbuffer;
    (void)chunksize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDestroyHeap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDestroyHeap")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heaphandle) : NULL;
#else
    (void)heaphandle;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDosPathNameToNtPathName_U_WithStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dosfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ntfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filepart = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDosPathNameToNtPathName_U_WithStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dosfilename, ntfilename, filepart, reserved) : -1;
#else
    (void)dosfilename;
    (void)ntfilename;
    (void)filepart;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDowncaseUnicodeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool allocatedestinationstring = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDowncaseUnicodeString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlDuplicateUnicodeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* stringin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* stringout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlDuplicateUnicodeString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, stringin, stringout) : -1;
#else
    (void)flags;
    (void)stringin;
    (void)stringout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlEqualPrefixSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sid2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlEqualPrefixSid")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid1, sid2) : false;
#else
    (void)sid1;
    (void)sid2;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlEqualSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sid2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlEqualSid")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid1, sid2) : false;
#else
    (void)sid1;
    (void)sid2;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlFindUnicodePrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prefixtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t caseinsensitiveindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlFindUnicodePrefix")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prefixtable, fullname, caseinsensitiveindex) : NULL;
#else
    (void)prefixtable;
    (void)fullname;
    (void)caseinsensitiveindex;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlFreeHeap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* heaphandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlFreeHeap")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(heaphandle, flags, baseaddress) : 0;
#else
    (void)heaphandle;
    (void)flags;
    (void)baseaddress;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlFreeSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlFreeSid")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid) : NULL;
#else
    (void)sid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlGenerate8dot3Name_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool allowextendedcharacters = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* name8dot3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGenerate8dot3Name")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, allowextendedcharacters, context, name8dot3) : -1;
#else
    (void)name;
    (void)allowextendedcharacters;
    (void)context;
    (void)name8dot3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlGetAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t aceindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGetAce")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(acl, aceindex, ace) : -1;
#else
    (void)acl;
    (void)aceindex;
    (void)ace;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlGetCompressionWorkSpaceSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t compressionformatandengine = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* compressbufferworkspacesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* compressfragmentworkspacesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGetCompressionWorkSpaceSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compressionformatandengine, compressbufferworkspacesize, compressfragmentworkspacesize) : -1;
#else
    (void)compressionformatandengine;
    (void)compressbufferworkspacesize;
    (void)compressfragmentworkspacesize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlGetDaclSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* daclpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* dacldefaulted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGetDaclSecurityDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, daclpresent, dacl, dacldefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)daclpresent;
    (void)dacl;
    (void)dacldefaulted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlGetGroupSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* group = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* groupdefaulted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGetGroupSecurityDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, group, groupdefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)group;
    (void)groupdefaulted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlGetOwnerSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* owner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ownerdefaulted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGetOwnerSecurityDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, owner, ownerdefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)owner;
    (void)ownerdefaulted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlGetSaclSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* saclpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sacldefaulted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlGetSaclSecurityDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, saclpresent, sacl, sacldefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)saclpresent;
    (void)sacl;
    (void)sacldefaulted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIdentifierAuthoritySid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIdentifierAuthoritySid")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid) : NULL;
#else
    (void)sid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIdnToAscii_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t sourcestringlength = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* destinationstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIdnToAscii")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, sourcestring, sourcestringlength, destinationstring, destinationstringlength) : -1;
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIdnToNameprepUnicode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t sourcestringlength = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* destinationstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIdnToNameprepUnicode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, sourcestring, sourcestringlength, destinationstring, destinationstringlength) : -1;
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIdnToUnicode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t sourcestringlength = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* destinationstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIdnToUnicode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, sourcestring, sourcestringlength, destinationstring, destinationstringlength) : -1;
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlInitCodePageTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tablebase = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* codepagetable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlInitCodePageTable")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(tablebase, codepagetable);
#else
    (void)tablebase;
    (void)codepagetable;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlInitUnicodeStringEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlInitUnicodeStringEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationstring, sourcestring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlInitializeSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* identifierauthority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint8_t subauthoritycount = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlInitializeSid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid, identifierauthority, subauthoritycount) : -1;
#else
    (void)sid;
    (void)identifierauthority;
    (void)subauthoritycount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlInitializeUnicodePrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prefixtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlInitializeUnicodePrefix")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prefixtable);
#else
    (void)prefixtable;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlInsertUnicodePrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prefixtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prefixtableentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlInsertUnicodePrefix")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prefixtable, prefix, prefixtableentry) : false;
#else
    (void)prefixtable;
    (void)prefix;
    (void)prefixtableentry;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIsCloudFilesPlaceholder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t fileattributes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t reparsetag = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIsCloudFilesPlaceholder")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileattributes, reparsetag) : false;
#else
    (void)fileattributes;
    (void)reparsetag;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIsDosDeviceName_U_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* dosfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIsDosDeviceName_U")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dosfilename) : 0;
#else
    (void)dosfilename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIsNonEmptyDirectoryReparsePointAllowed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t reparsetag = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIsNonEmptyDirectoryReparsePointAllowed")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reparsetag) : false;
#else
    (void)reparsetag;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIsNormalizedString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t normform = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t sourcestringlength = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* normalized = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIsNormalizedString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(normform, sourcestring, sourcestringlength, normalized) : -1;
#else
    (void)normform;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)normalized;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t fileattributes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t reparsetag = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIsPartialPlaceholder")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileattributes, reparsetag) : false;
#else
    (void)fileattributes;
    (void)reparsetag;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ispartialplaceholder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIsPartialPlaceholderFileHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, ispartialplaceholder) : -1;
#else
    (void)filehandle;
    (void)ispartialplaceholder;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infobuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ispartialplaceholder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIsPartialPlaceholderFileInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infobuffer, infoclass, ispartialplaceholder) : -1;
#else
    (void)infobuffer;
    (void)infoclass;
    (void)ispartialplaceholder;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIsSandboxedToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int8_t previousmode = static_cast<int8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIsSandboxedToken")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, previousmode) : false;
#else
    (void)context;
    (void)previousmode;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlIsValidOemCharacter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_char = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlIsValidOemCharacter")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_char) : false;
#else
    (void)arg_0_char;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlLengthRequiredSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t subauthoritycount = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlLengthRequiredSid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subauthoritycount) : 0;
#else
    (void)subauthoritycount;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlLengthSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlLengthSid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid) : 0;
#else
    (void)sid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxbytesinunicodestring = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bytesinunicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* multibytestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bytesinmultibytestring = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlMultiByteToUnicodeN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(unicodestring, maxbytesinunicodestring, bytesinunicodestring, multibytestring, bytesinmultibytestring) : -1;
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bytesinunicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* multibytestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t bytesinmultibytestring = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlMultiByteToUnicodeSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bytesinunicodestring, multibytestring, bytesinmultibytestring) : -1;
#else
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlNextUnicodePrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prefixtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool restart = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlNextUnicodePrefix")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prefixtable, restart) : NULL;
#else
    (void)prefixtable;
    (void)restart;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlNormalizeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t normform = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t sourcestringlength = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* destinationstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlNormalizeString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(normform, sourcestring, sourcestringlength, destinationstring, destinationstringlength) : -1;
#else
    (void)normform;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlNtStatusToDosErrorNoTeb_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t status = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlNtStatusToDosErrorNoTeb")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(status) : 0;
#else
    (void)status;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlOemStringToCountedUnicodeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool allocatedestinationstring = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlOemStringToCountedUnicodeString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlOemStringToUnicodeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool allocatedestinationstring = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlOemStringToUnicodeString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlOemToUnicodeN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxbytesinunicodestring = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bytesinunicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* oemstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bytesinoemstring = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlOemToUnicodeN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(unicodestring, maxbytesinunicodestring, bytesinunicodestring, oemstring, bytesinoemstring) : -1;
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)oemstring;
    (void)bytesinoemstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlPrefixString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* string1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* string2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool caseinsensitive = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlPrefixString")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(string1, string2, caseinsensitive) : false;
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* appid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* appidsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* packaged = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlQueryPackageIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenobject, packagefullname, packagesize, appid, appidsize, packaged) : -1;
#else
    (void)tokenobject;
    (void)packagefullname;
    (void)packagesize;
    (void)appid;
    (void)appidsize;
    (void)packaged;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentityEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* packagefullname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* packagesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* appid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* appidsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* dynamicid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlQueryPackageIdentityEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenobject, packagefullname, packagesize, appid, appidsize, dynamicid, flags) : -1;
#else
    (void)tokenobject;
    (void)packagefullname;
    (void)packagesize;
    (void)appid;
    (void)appidsize;
    (void)dynamicid;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlQueryProcessPlaceholderCompatibilityMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlQueryProcessPlaceholderCompatibilityMode")));
    }
    int8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int8_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlQueryThreadPlaceholderCompatibilityMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlQueryThreadPlaceholderCompatibilityMode")));
    }
    int8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int8_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlRandom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* seed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlRandom")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(seed) : 0;
#else
    (void)seed;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlRandomEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* seed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlRandomEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(seed) : 0;
#else
    (void)seed;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlRemoveUnicodePrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prefixtable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prefixtableentry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlRemoveUnicodePrefix")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(prefixtable, prefixtableentry);
#else
    (void)prefixtable;
    (void)prefixtableentry;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlReplaceSidInSd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* numchanges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlReplaceSidInSd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, oldsid, newsid, numchanges) : -1;
#else
    (void)securitydescriptor;
    (void)oldsid;
    (void)newsid;
    (void)numchanges;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlReserveChunk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t compressionformat = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* compressedbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* endofcompressedbufferplus1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* chunkbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t chunksize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlReserveChunk")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(compressionformat, compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize) : -1;
#else
    (void)compressionformat;
    (void)compressedbuffer;
    (void)endofcompressedbufferplus1;
    (void)chunkbuffer;
    (void)chunksize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1970ToTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t elapsedseconds = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* arg_1_time = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSecondsSince1970ToTime")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(elapsedseconds, arg_1_time);
#else
    (void)elapsedseconds;
    (void)arg_1_time;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1980ToTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t elapsedseconds = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* arg_1_time = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSecondsSince1980ToTime")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(elapsedseconds, arg_1_time);
#else
    (void)elapsedseconds;
    (void)arg_1_time;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlSelfRelativeToAbsoluteSD_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* selfrelativesecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* absolutesecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* absolutesecuritydescriptorsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* dacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* daclsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* saclsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* owner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* ownersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* primarygroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* primarygroupsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSelfRelativeToAbsoluteSD")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(selfrelativesecuritydescriptor, absolutesecuritydescriptor, absolutesecuritydescriptorsize, dacl, daclsize, sacl, saclsize, owner, ownersize, primarygroup, primarygroupsize) : -1;
#else
    (void)selfrelativesecuritydescriptor;
    (void)absolutesecuritydescriptor;
    (void)absolutesecuritydescriptorsize;
    (void)dacl;
    (void)daclsize;
    (void)sacl;
    (void)saclsize;
    (void)owner;
    (void)ownersize;
    (void)primarygroup;
    (void)primarygroupsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlSetGroupSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* group = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool groupdefaulted = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSetGroupSecurityDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, group, groupdefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)group;
    (void)groupdefaulted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlSetOwnerSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* owner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool ownerdefaulted = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSetOwnerSecurityDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, owner, ownerdefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)owner;
    (void)ownerdefaulted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlSetProcessPlaceholderCompatibilityMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int8_t mode = static_cast<int8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSetProcessPlaceholderCompatibilityMode")));
    }
    int8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mode) : -1;
#else
    (void)mode;
    int8_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlSetThreadPlaceholderCompatibilityMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int8_t mode = static_cast<int8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSetThreadPlaceholderCompatibilityMode")));
    }
    int8_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mode) : -1;
#else
    (void)mode;
    int8_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlSubAuthorityCountSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSubAuthorityCountSid")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid) : NULL;
#else
    (void)sid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlSubAuthoritySid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subauthority = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlSubAuthoritySid")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid, subauthority) : NULL;
#else
    (void)sid;
    (void)subauthority;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlTimeToSecondsSince1980_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* arg_0_time = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* elapsedseconds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlTimeToSecondsSince1980")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_time, elapsedseconds) : false;
#else
    (void)arg_0_time;
    (void)elapsedseconds;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlUnicodeStringToCountedOemString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool allocatedestinationstring = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUnicodeStringToCountedOemString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlUnicodeToCustomCPN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* customcpstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxbytesincustomcpstring = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* bytesincustomcpstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t bytesinunicodestring = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUnicodeToCustomCPN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcp, customcpstring, maxbytesincustomcpstring, bytesincustomcpstring, unicodestring, bytesinunicodestring) : -1;
#else
    (void)customcp;
    (void)customcpstring;
    (void)maxbytesincustomcpstring;
    (void)bytesincustomcpstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlUnicodeToMultiByteN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* multibytestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxbytesinmultibytestring = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bytesinmultibytestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bytesinunicodestring = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUnicodeToMultiByteN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(multibytestring, maxbytesinmultibytestring, bytesinmultibytestring, unicodestring, bytesinunicodestring) : -1;
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlUnicodeToOemN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oemstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxbytesinoemstring = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bytesinoemstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bytesinunicodestring = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUnicodeToOemN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oemstring, maxbytesinoemstring, bytesinoemstring, unicodestring, bytesinunicodestring) : -1;
#else
    (void)oemstring;
    (void)maxbytesinoemstring;
    (void)bytesinoemstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToCountedOemString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool allocatedestinationstring = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUpcaseUnicodeStringToCountedOemString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToOemString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool allocatedestinationstring = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUpcaseUnicodeStringToOemString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationstring, sourcestring, allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToCustomCPN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* customcpstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t maxbytesincustomcpstring = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* bytesincustomcpstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t bytesinunicodestring = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToCustomCPN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcp, customcpstring, maxbytesincustomcpstring, bytesincustomcpstring, unicodestring, bytesinunicodestring) : -1;
#else
    (void)customcp;
    (void)customcpstring;
    (void)maxbytesincustomcpstring;
    (void)bytesincustomcpstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToMultiByteN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* multibytestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxbytesinmultibytestring = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bytesinmultibytestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bytesinunicodestring = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToMultiByteN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(multibytestring, maxbytesinmultibytestring, bytesinmultibytestring, unicodestring, bytesinunicodestring) : -1;
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToOemN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oemstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t maxbytesinoemstring = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bytesinoemstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bytesinunicodestring = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToOemN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oemstring, maxbytesinoemstring, bytesinoemstring, unicodestring, bytesinunicodestring) : -1;
#else
    (void)oemstring;
    (void)maxbytesinoemstring;
    (void)bytesinoemstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlValidSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlValidSid")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid) : false;
#else
    (void)sid;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlValidateUnicodeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlValidateUnicodeString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, string) : -1;
#else
    (void)flags;
    (void)string;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlxOemStringToUnicodeSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oemstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlxOemStringToUnicodeSize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oemstring) : 0;
#else
    (void)oemstring;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_RtlxUnicodeStringToOemSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlxUnicodeStringToOemSize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(unicodestring) : 0;
#else
    (void)unicodestring;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* primarytokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t previouslygrantedaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int8_t accessmode = static_cast<int8_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAccessCheckFromState")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, primarytokeninformation, clienttokeninformation, desiredaccess, previouslygrantedaccess, privileges, genericmapping, accessmode, grantedaccess, accessstatus) : false;
#else
    (void)securitydescriptor;
    (void)primarytokeninformation;
    (void)clienttokeninformation;
    (void)desiredaccess;
    (void)previouslygrantedaccess;
    (void)privileges;
    (void)genericmapping;
    (void)accessmode;
    (void)grantedaccess;
    (void)accessstatus;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromStateEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* primarytoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t previouslygrantedaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int8_t accessmode = static_cast<int8_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAccessCheckFromStateEx")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, primarytoken, clienttoken, desiredaccess, previouslygrantedaccess, privileges, genericmapping, accessmode, grantedaccess, accessstatus) : false;
#else
    (void)securitydescriptor;
    (void)primarytoken;
    (void)clienttoken;
    (void)desiredaccess;
    (void)previouslygrantedaccess;
    (void)privileges;
    (void)genericmapping;
    (void)accessmode;
    (void)grantedaccess;
    (void)accessstatus;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForAccessConstraints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* accessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAdjustAccessStateForAccessConstraints")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(objecttype, securitydescriptor, accessstate);
#else
    (void)objecttype;
    (void)securitydescriptor;
    (void)accessstate;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForTrustLabel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* accessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAdjustAccessStateForTrustLabel")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(objecttype, securitydescriptor, accessstate);
#else
    (void)objecttype;
    (void)securitydescriptor;
    (void)accessstate;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAdjustObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* originaldescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* proposeddescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* subjectsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* adjusteddescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* applyadjusteddescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAdjustObjectSecurity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectname, originaldescriptor, proposeddescriptor, subjectsecuritycontext, adjusteddescriptor, applyadjusteddescriptor) : -1;
#else
    (void)objectname;
    (void)originaldescriptor;
    (void)proposeddescriptor;
    (void)subjectsecuritycontext;
    (void)adjusteddescriptor;
    (void)applyadjusteddescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAppendPrivileges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* accessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAppendPrivileges")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(accessstate, privileges) : -1;
#else
    (void)accessstate;
    (void)privileges;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditFipsCryptoSelftests_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool bsuccess = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    uint32_t selftestcode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(bool, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditFipsCryptoSelftests")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bsuccess, selftestcode);
#else
    (void)bsuccess;
    (void)selftestcode;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* linkname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool bsuccess = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditHardLinkCreation")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filename, linkname, bsuccess);
#else
    (void)filename;
    (void)linkname;
    (void)bsuccess;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreationWithTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* linkname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool bsuccess = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* transactionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditHardLinkCreationWithTransaction")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filename, linkname, bsuccess, transactionid);
#else
    (void)filename;
    (void)linkname;
    (void)bsuccess;
    (void)transactionid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditTransactionStateChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* transactionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resourcemanagerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t newtransactionstate = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditTransactionStateChange")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(transactionid, resourcemanagerid, newtransactionstate);
#else
    (void)transactionid;
    (void)resourcemanagerid;
    (void)newtransactionstate;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subjectsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditingAnyFileEventsWithContext")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, subjectsecuritycontext) : false;
#else
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContextEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subjectsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* stagingenabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditingAnyFileEventsWithContextEx")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securitydescriptor, subjectsecuritycontext, stagingenabled) : false;
#else
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    (void)stagingenabled;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditingFileEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool accessgranted = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditingFileEvents")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(accessgranted, securitydescriptor) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool accessgranted = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subjectsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditingFileEventsWithContext")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(accessgranted, securitydescriptor, subjectsecuritycontext) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContextEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool accessgranted = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subjectsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* stagingenabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditingFileEventsWithContextEx")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(accessgranted, securitydescriptor, subjectsecuritycontext, stagingenabled) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    (void)stagingenabled;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditingFileOrGlobalEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool accessgranted = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subjectsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditingFileOrGlobalEvents")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(accessgranted, securitydescriptor, subjectsecuritycontext) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEvents_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool accessgranted = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditingHardLinkEvents")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(accessgranted, securitydescriptor) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEventsWithContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    bool accessgranted = km_info.Length() > 0 ? km_info[0].ToBoolean().Value() : false;
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subjectsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeAuditingHardLinkEventsWithContext")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(accessgranted, securitydescriptor, subjectsecuritycontext) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeCaptureSubjectContextEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t thread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t process = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* subjectcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeCaptureSubjectContextEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(thread, process, subjectcontext);
#else
    (void)thread;
    (void)process;
    (void)subjectcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeCheckForCriticalAceRemoval_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* currentdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* subjectsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* aceremoved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeCheckForCriticalAceRemoval")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(currentdescriptor, newdescriptor, subjectsecuritycontext, aceremoved);
#else
    (void)currentdescriptor;
    (void)newdescriptor;
    (void)subjectsecuritycontext;
    (void)aceremoved;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t clientthread = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* clientsecurityqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool remotesession = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* clientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeCreateClientSecurity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientthread, clientsecurityqos, remotesession, clientcontext) : -1;
#else
    (void)clientthread;
    (void)clientsecurityqos;
    (void)remotesession;
    (void)clientcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurityFromSubjectContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subjectcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientsecurityqos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool serverisremote = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* clientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeCreateClientSecurityFromSubjectContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subjectcontext, clientsecurityqos, serverisremote, clientcontext) : -1;
#else
    (void)subjectcontext;
    (void)clientsecurityqos;
    (void)serverisremote;
    (void)clientcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeDeleteClientSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeDeleteClientSecurity")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(clientcontext);
#else
    (void)clientcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeDeleteObjectAuditAlarm")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(object, handle);
#else
    (void)object;
    (void)handle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarmWithTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* transactionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeDeleteObjectAuditAlarmWithTransaction")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(object, handle, transactionid);
#else
    (void)object;
    (void)handle;
    (void)transactionid;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeExamineSacl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resourcesacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    bool accessgranted = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* generateaudit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* generatealarm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeExamineSacl")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(sacl, resourcesacl, token, desiredaccess, accessgranted, generateaudit, generatealarm);
#else
    (void)sacl;
    (void)resourcesacl;
    (void)token;
    (void)desiredaccess;
    (void)accessgranted;
    (void)generateaudit;
    (void)generatealarm;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeFilterToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* existingtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidstodisable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* privilegestodelete = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* restrictedsids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* filteredtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeFilterToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(existingtoken, flags, sidstodisable, privilegestodelete, restrictedsids, filteredtoken) : -1;
#else
    (void)existingtoken;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)filteredtoken;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeFreePrivileges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeFreePrivileges")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(privileges);
#else
    (void)privileges;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeImpersonateClient_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t serverthread = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeImpersonateClient")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(clientcontext, serverthread);
#else
    (void)clientcontext;
    (void)serverthread;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeImpersonateClientEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clientcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t serverthread = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeImpersonateClientEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clientcontext, serverthread) : -1;
#else
    (void)clientcontext;
    (void)serverthread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeLocateProcessImageName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t process = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pimagefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeLocateProcessImageName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(process, pimagefilename) : -1;
#else
    (void)process;
    (void)pimagefilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotification_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* logonid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeMarkLogonSessionForTerminationNotification")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(logonid) : -1;
#else
    (void)logonid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotificationEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* logonid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t pserversilo = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeMarkLogonSessionForTerminationNotificationEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(logonid, pserversilo) : -1;
#else
    (void)logonid;
    (void)pserversilo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* absoluteobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* accessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    bool objectcreated = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    bool accessgranted = km_info.Length() > 6 ? km_info[6].ToBoolean().Value() : false;
    int8_t accessmode = static_cast<int8_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeOpenObjectAuditAlarm")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(objecttypename, object, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, generateonclose);
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)generateonclose;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarmWithTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* absoluteobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* accessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    bool objectcreated = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    bool accessgranted = km_info.Length() > 6 ? km_info[6].ToBoolean().Value() : false;
    int8_t accessmode = static_cast<int8_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* transactionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeOpenObjectAuditAlarmWithTransaction")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(objecttypename, object, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, transactionid, generateonclose);
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)transactionid;
    (void)generateonclose;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* absoluteobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* accessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    bool objectcreated = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    bool accessgranted = km_info.Length() > 6 ? km_info[6].ToBoolean().Value() : false;
    int8_t accessmode = static_cast<int8_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeOpenObjectForDeleteAuditAlarm")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(objecttypename, object, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, generateonclose);
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)generateonclose;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarmWithTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* absoluteobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* accessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    bool objectcreated = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    bool accessgranted = km_info.Length() > 6 ? km_info[6].ToBoolean().Value() : false;
    int8_t accessmode = static_cast<int8_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* transactionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeOpenObjectForDeleteAuditAlarmWithTransaction")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(objecttypename, object, absoluteobjectname, securitydescriptor, accessstate, objectcreated, accessgranted, accessmode, transactionid, generateonclose);
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)transactionid;
    (void)generateonclose;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SePrivilegeCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* requiredprivileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* subjectsecuritycontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int8_t accessmode = static_cast<int8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, int8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SePrivilegeCheck")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(requiredprivileges, subjectsecuritycontext, accessmode) : false;
#else
    (void)requiredprivileges;
    (void)subjectsecuritycontext;
    (void)accessmode;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeQueryAuthenticationIdToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* authenticationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeQueryAuthenticationIdToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, authenticationid) : -1;
#else
    (void)token;
    (void)authenticationid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeQueryInformationToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t tokeninformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeQueryInformationToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, tokeninformationclass, tokeninformation) : -1;
#else
    (void)token;
    (void)tokeninformationclass;
    (void)tokeninformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeQuerySecurityDescriptorInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securityinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectssecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeQuerySecurityDescriptorInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(securityinformation, securitydescriptor, length, objectssecuritydescriptor) : -1;
#else
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)objectssecuritydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeQueryServerSiloToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pserversilo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeQueryServerSiloToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, pserversilo) : -1;
#else
    (void)token;
    (void)pserversilo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeQuerySessionIdToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, sessionid) : -1;
#else
    (void)token;
    (void)sessionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdTokenEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sessionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* isservicesession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeQuerySessionIdTokenEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, sessionid, isservicesession) : -1;
#else
    (void)token;
    (void)sessionid;
    (void)isservicesession;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeRegisterLogonSessionTerminatedRoutine")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackroutine) : -1;
#else
    (void)callbackroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutineEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeRegisterLogonSessionTerminatedRoutineEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackroutine, context) : -1;
#else
    (void)callbackroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeReportSecurityEventWithSubCategory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sourcename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* usersid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* auditparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t auditsubcategoryid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeReportSecurityEventWithSubCategory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, sourcename, usersid, auditparameters, auditsubcategoryid) : -1;
#else
    (void)flags;
    (void)sourcename;
    (void)usersid;
    (void)auditparameters;
    (void)auditsubcategoryid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeSetAccessStateGenericMapping_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* accessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeSetAccessStateGenericMapping")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(accessstate, genericmapping);
#else
    (void)accessstate;
    (void)genericmapping;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* securityinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* modificationdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectssecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeSetSecurityDescriptorInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object, securityinformation, modificationdescriptor, objectssecuritydescriptor, pooltype, genericmapping) : -1;
#else
    (void)object;
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)pooltype;
    (void)genericmapping;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* object = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* securityinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* modificationdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectssecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t autoinheritflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t pooltype = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeSetSecurityDescriptorInfoEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(object, securityinformation, modificationdescriptor, objectssecuritydescriptor, autoinheritflags, pooltype, genericmapping) : -1;
#else
    (void)object;
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)autoinheritflags;
    (void)pooltype;
    (void)genericmapping;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeShouldCheckForAccessRightsFromParent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objecttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* childdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* accessstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeShouldCheckForAccessRightsFromParent")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objecttype, childdescriptor, accessstate) : false;
#else
    (void)objecttype;
    (void)childdescriptor;
    (void)accessstate;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeTokenFromAccessInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* accessinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* requiredlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeTokenFromAccessInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(accessinformation, token, length, requiredlength) : -1;
#else
    (void)accessinformation;
    (void)token;
    (void)length;
    (void)requiredlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeTokenIsAdmin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeTokenIsAdmin")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token) : false;
#else
    (void)token;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeTokenIsRestricted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeTokenIsRestricted")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token) : false;
#else
    (void)token;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeTokenIsWriteRestricted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeTokenIsWriteRestricted")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token) : false;
#else
    (void)token;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeTokenType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeTokenType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token) : -1;
#else
    (void)token;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeUnregisterLogonSessionTerminatedRoutine")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackroutine) : -1;
#else
    (void)callbackroutine;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutineEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* callbackroutine = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SeUnregisterLogonSessionTerminatedRoutineEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(callbackroutine, context) : -1;
#else
    (void)callbackroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SecLookupAccountName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sidsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* nameuse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* domainsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* referenceddomain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SecLookupAccountName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, sidsize, sid, nameuse, domainsize, referenceddomain) : -1;
#else
    (void)name;
    (void)sidsize;
    (void)sid;
    (void)nameuse;
    (void)domainsize;
    (void)referenceddomain;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SecLookupAccountSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* namesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* namebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* domainsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* domainbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* nameuse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SecLookupAccountSid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sid, namesize, namebuffer, domainsize, domainbuffer, nameuse) : -1;
#else
    (void)sid;
    (void)namesize;
    (void)namebuffer;
    (void)domainsize;
    (void)domainbuffer;
    (void)nameuse;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SecLookupWellKnownSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t sidtype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t sidbuffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SecLookupWellKnownSid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sidtype, sid, sidbuffersize, sidsize) : -1;
#else
    (void)sidtype;
    (void)sid;
    (void)sidbuffersize;
    (void)sidsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SecMakeSPN_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serviceclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t instanceport = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* referrer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* spn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    bool allocate = km_info.Length() > 7 ? km_info[7].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SecMakeSPN")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serviceclass, servicename, instancename, instanceport, referrer, spn, length, allocate) : -1;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)spn;
    (void)length;
    (void)allocate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serviceclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t instanceport = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* referrer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* targetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* spn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    bool allocate = km_info.Length() > 8 ? km_info[8].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SecMakeSPNEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serviceclass, servicename, instancename, instanceport, referrer, targetinfo, spn, length, allocate) : -1;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)targetinfo;
    (void)spn;
    (void)length;
    (void)allocate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serviceclass = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint16_t instanceport = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* referrer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* intargetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* spn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* totalsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    bool allocate = km_info.Length() > 8 ? km_info[8].ToBoolean().Value() : false;
    bool istargetinfomarshaled = km_info.Length() > 9 ? km_info[9].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, void*, bool, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SecMakeSPNEx2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serviceclass, servicename, instancename, instanceport, referrer, intargetinfo, spn, totalsize, allocate, istargetinfomarshaled) : -1;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)intargetinfo;
    (void)spn;
    (void)totalsize;
    (void)allocate;
    (void)istargetinfomarshaled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SetContextAttributesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ulattribute = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetContextAttributesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, ulattribute, pbuffer, cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiAcceptSecurityContextAsync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* asynccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t fcontextreq = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t targetdatarep = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* phnewcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pfcontextattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiAcceptSecurityContextAsync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(asynccontext, phcredential, phcontext, pinput, fcontextreq, targetdatarep, phnewcontext, poutput, pfcontextattr, ptsexpiry) : -1;
#else
    (void)asynccontext;
    (void)phcredential;
    (void)phcontext;
    (void)pinput;
    (void)fcontextreq;
    (void)targetdatarep;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiCreateAsyncContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiCreateAsyncContext")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiDeleteSecurityContextAsync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* asynccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiDeleteSecurityContextAsync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(asynccontext, phcontext) : -1;
#else
    (void)asynccontext;
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiFreeAsyncContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiFreeAsyncContext")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(handle);
#else
    (void)handle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiFreeCredentialsHandleAsync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* asynccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiFreeCredentialsHandleAsync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(asynccontext, phcredential) : -1;
#else
    (void)asynccontext;
    (void)phcredential;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiGetAsyncCallStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiGetAsyncCallStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* asynccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t fcontextreq = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t targetdatarep = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* phnewcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* pfcontextattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiInitializeSecurityContextAsyncA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(asynccontext, phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry) : -1;
#else
    (void)asynccontext;
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* asynccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phcredential = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* psztargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t fcontextreq = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t reserved1 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t targetdatarep = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t reserved2 = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* phnewcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* poutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    void* pfcontextattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    void* ptsexpiry = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiInitializeSecurityContextAsyncW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(asynccontext, phcredential, phcontext, psztargetname, fcontextreq, reserved1, targetdatarep, pinput, reserved2, phnewcontext, poutput, pfcontextattr, ptsexpiry) : -1;
#else
    (void)asynccontext;
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiReinitAsyncContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiReinitAsyncContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_SspiSetAsyncNotifyCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SspiSetAsyncNotifyCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(context, callback, callbackdata) : -1;
#else
    (void)context;
    (void)callback;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_VerifySignature_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pmessage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t messageseqno = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfqop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VerifySignature")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phcontext, pmessage, messageseqno, pfqop) : -1;
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwAccessCheckAndAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    bool objectcreation = km_info.Length() > 7 ? km_info[7].ToBoolean().Value() : false;
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwAccessCheckAndAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeAndAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    bool objectcreation = km_info.Length() > 12 ? km_info[12].ToBoolean().Value() : false;
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwAccessCheckByTypeAndAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    bool objectcreation = km_info.Length() > 12 ? km_info[12].ToBoolean().Value() : false;
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwAccessCheckByTypeResultListAndAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarmByHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
    bool objectcreation = km_info.Length() > 13 ? km_info[13].ToBoolean().Value() : false;
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 16 ? km_napi_arg_u64(km_info[16]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwAccessCheckByTypeResultListAndAuditAlarmByHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwAdjustGroupsToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool resettodefault = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* newstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* previousstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwAdjustGroupsToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenhandle, resettodefault, newstate, bufferlength, previousstate, returnlength) : -1;
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwAdjustPrivilegesToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    bool disableallprivileges = km_info.Length() > 1 ? km_info[1].ToBoolean().Value() : false;
    void* newstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* previousstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwAdjustPrivilegesToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenhandle, disableallprivileges, newstate, bufferlength, previousstate, returnlength) : -1;
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t zerobits = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* regionsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t allocationtype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t protect = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwAllocateVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, zerobits, regionsize, allocationtype, protect) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)regionsize;
    (void)allocationtype;
    (void)protect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemoryEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* regionsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t allocationtype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t pageprotection = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* extendedparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t extendedparametercount = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwAllocateVirtualMemoryEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, regionsize, allocationtype, pageprotection, extendedparameters, extendedparametercount) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)extendedparametercount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwCancelIoFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iorequesttocancel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwCancelIoFileEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iorequesttocancel, iostatusblock) : -1;
#else
    (void)filehandle;
    (void)iorequesttocancel;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwCloseObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool generateonclose = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwCloseObjectAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwCreateDirectoryObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* directoryhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwCreateDirectoryObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(directoryhandle, desiredaccess, objectattributes) : -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwCreateEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* eventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t eventtype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    bool initialstate = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwCreateEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventhandle, desiredaccess, objectattributes, eventtype, initialstate) : -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)eventtype;
    (void)initialstate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwCreateSectionEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* maximumsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t sectionpageprotection = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t allocationattributes = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* extendedparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t extendedparametercount = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwCreateSectionEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sectionhandle, desiredaccess, objectattributes, maximumsize, sectionpageprotection, allocationattributes, filehandle, extendedparameters, extendedparametercount) : -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    (void)extendedparameters;
    (void)extendedparametercount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwDeleteFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwDeleteFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectattributes) : -1;
#else
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwDeleteObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool generateonclose = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwDeleteObjectAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwDuplicateObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourceprocesshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sourcehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetprocesshandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* targethandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t handleattributes = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwDuplicateObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourceprocesshandle, sourcehandle, targetprocesshandle, targethandle, desiredaccess, handleattributes, options) : -1;
#else
    (void)sourceprocesshandle;
    (void)sourcehandle;
    (void)targetprocesshandle;
    (void)targethandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwDuplicateToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* existingtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    bool effectiveonly = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    int32_t tokentype = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* newtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwDuplicateToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(existingtokenhandle, desiredaccess, objectattributes, effectiveonly, tokentype, newtokenhandle) : -1;
#else
    (void)existingtokenhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)effectiveonly;
    (void)tokentype;
    (void)newtokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwFilterToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* existingtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sidstodisable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* privilegestodelete = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* restrictedsids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* newtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwFilterToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(existingtokenhandle, flags, sidstodisable, privilegestodelete, restrictedsids, newtokenhandle) : -1;
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)newtokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwFlushBuffersFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFileEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* parameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t parameterssize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwFlushBuffersFileEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, flags, parameters, parameterssize, iostatusblock) : -1;
#else
    (void)filehandle;
    (void)flags;
    (void)parameters;
    (void)parameterssize;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwFlushVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* regionsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* iostatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwFlushVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, regionsize, iostatus) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)iostatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwFreeVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* regionsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t freetype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwFreeVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, regionsize, freetype) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)freetype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwImpersonateAnonymousToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwImpersonateAnonymousToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadhandle) : -1;
#else
    (void)threadhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwOpenDirectoryObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* directoryhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwOpenDirectoryObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(directoryhandle, desiredaccess, objectattributes) : -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwOpenObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t grantedaccess = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    bool objectcreation = km_info.Length() > 9 ? km_info[9].ToBoolean().Value() : false;
    bool accessgranted = km_info.Length() > 10 ? km_info[10].ToBoolean().Value() : false;
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, bool, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwOpenObjectAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, clienttoken, desiredaccess, grantedaccess, privileges, objectcreation, accessgranted, generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwOpenProcessToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwOpenProcessToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, desiredaccess, tokenhandle) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwOpenProcessTokenEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t handleattributes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwOpenProcessTokenEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, desiredaccess, handleattributes, tokenhandle) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwOpenThreadToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool openasself = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwOpenThreadToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadhandle, desiredaccess, openasself, tokenhandle) : -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwOpenThreadTokenEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    bool openasself = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    uint32_t handleattributes = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwOpenThreadTokenEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(threadhandle, desiredaccess, openasself, handleattributes, tokenhandle) : -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)handleattributes;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwPrivilegeCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* requiredprivileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwPrivilegeCheck")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clienttoken, requiredprivileges, result) : -1;
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwPrivilegeObjectAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    bool accessgranted = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwPrivilegeObjectAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, handleid, clienttoken, desiredaccess, privileges, accessgranted) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwPrivilegedServiceAuditAlarm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool accessgranted = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwPrivilegedServiceAuditAlarm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(subsystemname, servicename, clienttoken, privileges, accessgranted) : -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwQueryDirectoryObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* directoryhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 3 ? km_info[3].ToBoolean().Value() : false;
    bool restartscan = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* context = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, bool, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwQueryDirectoryObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(directoryhandle, buffer, length, returnsingleentry, restartscan, context, returnlength) : -1;
#else
    (void)directoryhandle;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)restartscan;
    (void)context;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwQueryEaFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* ealist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t ealistlength = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* eaindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    bool restartscan = km_info.Length() > 8 ? km_info[8].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwQueryEaFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, buffer, length, returnsingleentry, ealist, ealistlength, eaindex, restartscan) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwQueryFullAttributesFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objectattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwQueryFullAttributesFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(objectattributes, fileinformation) : -1;
#else
    (void)objectattributes;
    (void)fileinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwQueryInformationToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t tokeninformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t tokeninformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwQueryInformationToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength, returnlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwQueryObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t objectinformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* objectinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t objectinformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwQueryObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, objectinformationclass, objectinformation, objectinformationlength, returnlength) : -1;
#else
    (void)handle;
    (void)objectinformationclass;
    (void)objectinformation;
    (void)objectinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwQueryQuotaInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    bool returnsingleentry = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* sidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t sidlistlength = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* startsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    bool restartscan = km_info.Length() > 8 ? km_info[8].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwQueryQuotaInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, buffer, length, returnsingleentry, sidlist, sidlistlength, startsid, restartscan) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)sidlist;
    (void)sidlistlength;
    (void)startsid;
    (void)restartscan;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwQuerySecurityObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwQuerySecurityObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, securityinformation, securitydescriptor, length, lengthneeded) : -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwQueryVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* baseaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t memoryinformationclass = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* memoryinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint64_t memoryinformationlength = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwQueryVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, baseaddress, memoryinformationclass, memoryinformation, memoryinformationlength, returnlength) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwQueryVolumeInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fsinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fsinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwQueryVolumeInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, fsinformation, length, fsinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwSetEaFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwSetEaFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, buffer, length) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwSetEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* eventhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* previousstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwSetEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventhandle, previousstate) : -1;
#else
    (void)eventhandle;
    (void)previousstate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwSetInformationToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t tokeninformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t tokeninformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwSetInformationToken")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwSetInformationVirtualMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* processhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t vminformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t numberofentries = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* virtualaddresses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vminformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t vminformationlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwSetInformationVirtualMemory")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(processhandle, vminformationclass, numberofentries, virtualaddresses, vminformation, vminformationlength) : -1;
#else
    (void)processhandle;
    (void)vminformationclass;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)vminformation;
    (void)vminformationlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwSetQuotaInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwSetQuotaInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, buffer, length) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwSetSecurityObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwSetSecurityObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handle, securityinformation, securitydescriptor) : -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwSetVolumeInformationFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fsinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fsinformationclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwSetVolumeInformationFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, fsinformation, length, fsinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_wdk_storage_filesystem_ZwUnlockFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iostatusblock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* byteoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* length = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t key = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ZwUnlockFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, iostatusblock, byteoffset, length, key) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_wdk_storage_filesystem_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_wdk_storage_filesystem_ApplyControlToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ApplyControlToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcAsyncCopyRead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcAsyncCopyRead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcCanIWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcCanIWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcCoherencyFlushAndPurgeCache", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcCoherencyFlushAndPurgeCache_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcCopyRead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcCopyRead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcCopyReadEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcCopyReadEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcCopyWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcCopyWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcCopyWriteEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcCopyWriteEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcCopyWriteWontFlush", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcCopyWriteWontFlush_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcDeferWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcDeferWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcErrorCallbackRoutine", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcErrorCallbackRoutine_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcFastCopyRead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcFastCopyRead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcFastCopyWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcFastCopyWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcFlushCache", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcFlushCache_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcGetDirtyPages", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcGetDirtyPages_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromBcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromBcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrs", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrs_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrsRef", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcGetFileObjectFromSectionPtrsRef_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcGetFlushedValidData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcGetFlushedValidData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMap", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMap_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMapEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcInitializeCacheMapEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcIsCacheManagerCallbackNeeded", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcIsCacheManagerCallbackNeeded_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyDataEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcIsThereDirtyDataEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcMapData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcMapData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcMdlRead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcMdlRead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcMdlReadComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcMdlReadComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcMdlWriteAbort", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcMdlWriteAbort_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcMdlWriteComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcMdlWriteComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcPinMappedData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcPinMappedData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcPinRead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcPinRead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcPrepareMdlWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcPrepareMdlWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcPreparePinWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcPreparePinWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcPurgeCacheSection", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcPurgeCacheSection_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcRemapBcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcRemapBcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcRepinBcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcRepinBcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcScheduleReadAhead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcScheduleReadAhead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcScheduleReadAheadEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcScheduleReadAheadEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributes", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributes_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributesEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetAdditionalCacheAttributesEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetBcbOwnerPointer", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetBcbOwnerPointer_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetDirtyPageThreshold", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetDirtyPageThreshold_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetDirtyPinnedData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetDirtyPinnedData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetFileSizes", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetFileSizes_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetFileSizesEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetFileSizesEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetLogHandleForFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetLogHandleForFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetParallelFlushFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetParallelFlushFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcSetReadAheadGranularity", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcSetReadAheadGranularity_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcUninitializeCacheMap", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcUninitializeCacheMap_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcUnpinData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcUnpinData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcUnpinDataForThread", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcUnpinDataForThread_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcUnpinRepinnedBcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcUnpinRepinnedBcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcWaitForCurrentLazyWriterActivity", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcWaitForCurrentLazyWriterActivity_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CcZeroData", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CcZeroData_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_CompleteAuthToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_CompleteAuthToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ExDisableResourceBoostLite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ExDisableResourceBoostLite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ExQueryPoolBlockSize", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ExQueryPoolBlockSize_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ExportSecurityContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ExportSecurityContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAcknowledgeEcp", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAcknowledgeEcp_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAcquireFileExclusive", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAcquireFileExclusive_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntryEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAddBaseMcbEntryEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAddLargeMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAddLargeMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAddMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAddMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCache", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCache_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCacheEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAddToTunnelCacheEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAllocateAePushLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAllocateAePushLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterFromLookasideList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterFromLookasideList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAllocateExtraCreateParameterList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAllocateFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAllocateFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAllocateResource", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAllocateResource_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAreNamesEqual", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAreNamesEqual_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAreThereCurrentOrInProgressFileLocks", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAreThereCurrentOrInProgressFileLocks_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAreThereWaitingFileLocks", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAreThereWaitingFileLocks_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlAreVolumeStartupApplicationsComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlAreVolumeStartupApplicationsComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlBalanceReads", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlBalanceReads_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForMultipleObjects", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForMultipleObjects_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForSingleObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCancellableWaitForSingleObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlChangeBackingFileObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlChangeBackingFileObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForOplockRequest", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForOplockRequest_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForReadAccess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForReadAccess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForWriteAccess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCheckLockForWriteAccess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx2", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCheckOplockEx2_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCheckUpperOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCheckUpperOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCopyRead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCopyRead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCopyWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCopyWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCreateSectionForDataScan", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCreateSectionForDataScan_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCurrentBatchOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCurrentBatchOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplockH", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlCurrentOplockH_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlDeleteExtraCreateParameterLookasideList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlDeleteExtraCreateParameterLookasideList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlDeleteKeyFromTunnelCache", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlDeleteKeyFromTunnelCache_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlDeleteTunnelCache", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlDeleteTunnelCache_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlDeregisterUncProvider", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlDeregisterUncProvider_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlDismountComplete", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlDismountComplete_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlDoesDbcsContainWildCards", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlDoesDbcsContainWildCards_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlDoesNameContainWildCards", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlDoesNameContainWildCards_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForRead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForRead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFastCheckLockForWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAll", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAll_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAllByKey", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockAllByKey_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockSingle", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFastUnlockSingle_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFindExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFindExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCache", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCache_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCacheEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFindInTunnelCacheEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFreeAePushLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFreeAePushLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameterList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFreeExtraCreateParameterList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlFreeFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlFreeFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetCurrentProcessLoaderList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetCurrentProcessLoaderList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetEcpListFromIrp", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetEcpListFromIrp_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetFileSize", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetFileSize_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetNextBaseMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetNextBaseMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetNextExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetNextExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetNextFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetNextFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetNextLargeMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetNextLargeMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetNextMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetNextMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetSectorSizeInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetSectorSizeInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetSupportedFeatures", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetSupportedFeatures_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlGetVirtualDiskNestingLevel", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlGetVirtualDiskNestingLevel_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastMdlReadWait", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastMdlReadWait_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNoWait", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNoWait_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNotPossible", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadNotPossible_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadResourceMiss", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadResourceMiss_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadWait", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIncrementCcFastReadWait_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitExtraCreateParameterLookasideList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitExtraCreateParameterLookasideList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcbEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitializeBaseMcbEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameterList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitializeExtraCreateParameterList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitializeFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitializeFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitializeLargeMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitializeLargeMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitializeMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitializeMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitializeOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitializeOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInitializeTunnelCache", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInitializeTunnelCache_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInsertExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInsertExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileObjectContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerFileObjectContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerStreamContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlInsertPerStreamContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIs32BitProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIs32BitProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsDaxVolume", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsDaxVolume_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsDbcsInExpression", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsDbcsInExpression_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpAcknowledged", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpAcknowledged_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpFromUserMode", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsEcpFromUserMode_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsExtentDangling", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsExtentDangling_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsMobileOS", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsMobileOS_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInExpression", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInExpression_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInUnUpcasedExpression", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsNameInUnUpcasedExpression_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsNonEmptyDirectoryReparsePointAllowed", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsNonEmptyDirectoryReparsePointAllowed_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsNtstatusExpected", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsNtstatusExpected_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsPagingFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsPagingFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIsSystemPagingFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIsSystemPagingFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlIssueDeviceIoControl", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlIssueDeviceIoControl_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlKernelFsControlFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlKernelFsControlFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLogCcFlushError", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLogCcFlushError_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupBaseMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupBaseMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupLargeMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupLargeMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntryAndIndex", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastBaseMcbEntryAndIndex_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntryAndIndex", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastLargeMcbEntryAndIndex_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupLastMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileObjectContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerFileObjectContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerStreamContextInternal", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlLookupPerStreamContextInternal_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadCompleteDev", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadCompleteDev_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadDev", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadDev_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlMdlReadEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlMdlWriteCompleteDev", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlMdlWriteCompleteDev_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderIdFromName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderIdFromName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderInfoFromFileObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlMupGetProviderInfoFromFileObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNormalizeNtstatus", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNormalizeNtstatus_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanup", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanup_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanupAll", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyCleanupAll_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterChangeDirectory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterChangeDirectory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterReportChange", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFilterReportChange_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullChangeDirectory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullChangeDirectory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullReportChange", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyFullReportChange_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyInitializeSync", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyInitializeSync_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyUninitializeSync", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyUninitializeSync_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEvent", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEvent_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEventEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNotifyVolumeEventEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInBaseMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInBaseMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInLargeMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInLargeMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlNumberOfRunsInMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH2", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakH2_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNone", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNone_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNoneEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockBreakToNoneEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrl", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrl_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrlEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockFsctrlEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockGetAnyBreakOwnerProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockGetAnyBreakOwnerProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsFastIoPossible", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsFastIoPossible_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsSharedRequest", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockIsSharedRequest_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlOplockKeysEqual", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlOplockKeysEqual_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlPostPagingFileStackOverflow", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlPostPagingFileStackOverflow_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlPostStackOverflow", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlPostStackOverflow_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteDev", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteDev_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlPrepareMdlWriteEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlPrepareToReuseEcp", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlPrepareToReuseEcp_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlPrivateLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlPrivateLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlProcessFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlProcessFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlQueryCachedVdl", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlQueryCachedVdl_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlQueryInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlQueryInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlQueryKernelEaFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlQueryKernelEaFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlQueryMaximumVirtualDiskNestingLevel", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlQueryMaximumVirtualDiskNestingLevel_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRegisterFileSystemFilterCallbacks", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRegisterFileSystemFilterCallbacks_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProvider", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProvider_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx2", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRegisterUncProviderEx2_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlReleaseFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlReleaseFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRemoveBaseMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRemoveBaseMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRemoveDotsFromPath", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRemoveDotsFromPath_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRemoveExtraCreateParameter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRemoveExtraCreateParameter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRemoveLargeMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRemoveLargeMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRemoveMcbEntry", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRemoveMcbEntry_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileObjectContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerFileObjectContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerStreamContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlRemovePerStreamContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlResetBaseMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlResetBaseMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlResetLargeMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlResetLargeMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlSetDriverBacking", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlSetDriverBacking_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlSetEcpListIntoIrp", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlSetEcpListIntoIrp_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlSetKernelEaFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlSetKernelEaFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlSplitBaseMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlSplitBaseMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlSplitLargeMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlSplitLargeMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerFileContexts", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerFileContexts_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerStreamContexts", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlTeardownPerStreamContexts_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlTruncateBaseMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlTruncateBaseMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlTruncateLargeMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlTruncateLargeMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlTruncateMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlTruncateMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeBaseMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeBaseMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeFileLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeFileLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeLargeMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeLargeMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeMcb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeMcb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeOplock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlUninitializeOplock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlUpdateDiskCounters", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlUpdateDiskCounters_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlUpperOplockFsctrl", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlUpperOplockFsctrl_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlValidateReparsePointBuffer", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlValidateReparsePointBuffer_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_FsRtlVolumeDeviceToCorrelationId", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_FsRtlVolumeDeviceToCorrelationId_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_GetSecurityUserInfo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_GetSecurityUserInfo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoAcquireVpbSpinLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoAcquireVpbSpinLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoApplyPriorityInfoThread", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoApplyPriorityInfoThread_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCheckDesiredAccess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCheckDesiredAccess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCheckEaBufferValidity", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCheckEaBufferValidity_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCheckFunctionAccess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCheckFunctionAccess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetFileInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetFileInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetVolumeInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCheckQuerySetVolumeInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCheckQuotaBufferValidity", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCheckQuotaBufferValidity_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoClearFsTrackOffsetState", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoClearFsTrackOffsetState_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx2", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectEx2_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectLite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoCreateStreamFileObjectLite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoEnumerateDeviceObjectList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoEnumerateDeviceObjectList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoEnumerateRegisteredFiltersList", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoEnumerateRegisteredFiltersList_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoFastQueryNetworkAttributes", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoFastQueryNetworkAttributes_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetAttachedDevice", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetAttachedDevice_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetBaseFileSystemDeviceObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetBaseFileSystemDeviceObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetDeviceAttachmentBaseRef", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetDeviceAttachmentBaseRef_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetDeviceToVerify", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetDeviceToVerify_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetDiskDeviceObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetDiskDeviceObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetFsTrackOffsetState", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetFsTrackOffsetState_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetLowerDeviceObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetLowerDeviceObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContextEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetOplockKeyContextEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcessId", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetRequestorProcessId_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoGetRequestorSessionId", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoGetRequestorSessionId_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoIrpHasFsTrackOffsetExtensionType", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoIrpHasFsTrackOffsetExtensionType_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoIsOperationSynchronous", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoIsOperationSynchronous_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoIsSystemThread", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoIsSystemThread_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoIsValidNameGraftingBuffer", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoIsValidNameGraftingBuffer_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoPageRead", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoPageRead_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoQueryFileDosDeviceName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoQueryFileDosDeviceName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoQueryFileInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoQueryFileInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoQueryVolumeInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoQueryVolumeInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoQueueThreadIrp", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoQueueThreadIrp_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoRegisterFileSystem", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoRegisterFileSystem_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoReleaseVpbSpinLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoReleaseVpbSpinLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoReplaceFileObjectName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoReplaceFileObjectName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoRequestDeviceRemovalForReset", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoRequestDeviceRemovalForReset_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoRetrievePriorityInfo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoRetrievePriorityInfo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoSetDeviceToVerify", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoSetDeviceToVerify_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoSetFsTrackOffsetState", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoSetFsTrackOffsetState_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoSetInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoSetInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoSynchronousPageWrite", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoSynchronousPageWrite_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoThreadToProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoThreadToProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoUnregisterFileSystem", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoUnregisterFileSystem_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_IoVerifyVolume", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_IoVerifyVolume_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeAcquireQueuedSpinLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeAcquireQueuedSpinLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeAcquireSpinLockRaiseToSynch", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeAcquireSpinLockRaiseToSynch_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeAttachProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeAttachProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeDetachProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeDetachProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeInitializeMutant", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeInitializeMutant_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeInitializeQueue", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeInitializeQueue_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeInsertHeadQueue", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeInsertHeadQueue_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeInsertQueue", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeInsertQueue_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeReadStateMutant", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeReadStateMutant_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeReadStateQueue", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeReadStateQueue_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeReleaseMutant", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeReleaseMutant_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeReleaseQueuedSpinLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeReleaseQueuedSpinLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeRemoveQueue", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeRemoveQueue_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeRemoveQueueEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeRemoveQueueEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeRundownQueue", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeRundownQueue_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeSetIdealProcessorThread", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeSetIdealProcessorThread_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeSetKernelStackSwapEnable", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeSetKernelStackSwapEnable_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeStackAttachProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeStackAttachProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeTryToAcquireQueuedSpinLock", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeTryToAcquireQueuedSpinLock_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_KeUnstackDetachProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_KeUnstackDetachProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MakeSignature", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MakeSignature_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MapSecurityError", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MapSecurityError_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmCanFileBeTruncated", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmCanFileBeTruncated_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmDoesFileHaveUserWritableReferences", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmDoesFileHaveUserWritableReferences_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmFlushImageSection", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmFlushImageSection_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmForceSectionClosed", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmForceSectionClosed_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmForceSectionClosedEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmForceSectionClosedEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmGetMaximumFileSectionSize", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmGetMaximumFileSectionSize_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmIsFileSectionActive", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmIsFileSectionActive_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmIsRecursiveIoFault", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmIsRecursiveIoFault_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmMdlPagesAreZero", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmMdlPagesAreZero_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmPrefetchPages", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmPrefetchPages_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_MmSetAddressRangeModified", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_MmSetAddressRangeModified_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtAccessCheckAndAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtAccessCheckAndAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeAndAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeAndAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarmByHandle", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtAccessCheckByTypeResultListAndAuditAlarmByHandle_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtAdjustGroupsToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtAdjustGroupsToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtAdjustPrivilegesToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtAdjustPrivilegesToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemoryEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtAllocateVirtualMemoryEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtCancelIoFileEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtCancelIoFileEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtCloseObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtCloseObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtCreateDirectoryObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtCreateDirectoryObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtCreateEvent", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtCreateEvent_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtCreateFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtCreateFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtCreateSection", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtCreateSection_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtCreateSectionEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtCreateSectionEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtDeleteFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtDeleteFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtDeleteObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtDeleteObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtDuplicateObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtDuplicateObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtDuplicateToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtDuplicateToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtFilterToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtFilterToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFileEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtFlushBuffersFileEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtFlushVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtFlushVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtFreeVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtFreeVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtImpersonateAnonymousToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtImpersonateAnonymousToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtOpenDirectoryObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtOpenDirectoryObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtOpenFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtOpenFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtOpenObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtOpenObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtOpenProcessToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtOpenProcessToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtOpenProcessTokenEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtOpenProcessTokenEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtOpenSymbolicLinkObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtOpenSymbolicLinkObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtOpenThreadToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtOpenThreadToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtOpenThreadTokenEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtOpenThreadTokenEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtPrivilegeCheck", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtPrivilegeCheck_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtPrivilegeObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtPrivilegeObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtPrivilegedServiceAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtPrivilegedServiceAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQueryDirectoryObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQueryDirectoryObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQueryEaFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQueryEaFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQueryFullAttributesFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQueryFullAttributesFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQueryInformationByName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQueryInformationByName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQueryInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQueryInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQueryInformationToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQueryInformationToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQueryQuotaInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQueryQuotaInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQuerySecurityObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQuerySecurityObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQuerySymbolicLinkObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQuerySymbolicLinkObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQueryVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQueryVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtQueryVolumeInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtQueryVolumeInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtSetEaFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtSetEaFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtSetEvent", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtSetEvent_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtSetInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtSetInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtSetInformationToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtSetInformationToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtSetInformationVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtSetInformationVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtSetQuotaInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtSetQuotaInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtSetSecurityObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtSetSecurityObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtSetVolumeInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtSetVolumeInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_NtUnlockFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_NtUnlockFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ObInsertObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ObInsertObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ObIsKernelHandle", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ObIsKernelHandle_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ObMakeTemporaryObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ObMakeTemporaryObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointer", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointer_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointerWithTag", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ObOpenObjectByPointerWithTag_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ObQueryNameString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ObQueryNameString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ObQueryObjectAuditingByHandle", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ObQueryObjectAuditingByHandle_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PfxFindPrefix", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PfxFindPrefix_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PfxInitialize", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PfxInitialize_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PfxInsertPrefix", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PfxInsertPrefix_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PfxRemovePrefix", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PfxRemovePrefix_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PoQueueShutdownWorkItem", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PoQueueShutdownWorkItem_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsAssignImpersonationToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsAssignImpersonationToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsChargePoolQuota", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsChargePoolQuota_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsChargeProcessPoolQuota", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsChargeProcessPoolQuota_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsDereferenceImpersonationToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsDereferenceImpersonationToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsDereferencePrimaryToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsDereferencePrimaryToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsDisableImpersonation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsDisableImpersonation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsGetProcessExitTime", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsGetProcessExitTime_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsGetThreadProcess", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsGetThreadProcess_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsImpersonateClient", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsImpersonateClient_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsIsDiskCountersEnabled", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsIsDiskCountersEnabled_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsIsSystemThread", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsIsSystemThread_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsIsThreadTerminating", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsIsThreadTerminating_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsLookupProcessByProcessId", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsLookupProcessByProcessId_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsLookupThreadByThreadId", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsLookupThreadByThreadId_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsReferenceImpersonationToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsReferenceImpersonationToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsReferencePrimaryToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsReferencePrimaryToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsRestoreImpersonation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsRestoreImpersonation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsReturnPoolQuota", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsReturnPoolQuota_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsRevertToSelf", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsRevertToSelf_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_PsUpdateDiskCounters", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_PsUpdateDiskCounters_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_QuerySecurityContextToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_QuerySecurityContextToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlAbsoluteToSelfRelativeSD", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlAbsoluteToSelfRelativeSD_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAce", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAce_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAceEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlAddAccessAllowedAceEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlAddAce", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlAddAce_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSidEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlAllocateAndInitializeSidEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlAllocateHeap", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlAllocateHeap_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlAppendStringToString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlAppendStringToString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCompareAltitudes", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCompareAltitudes_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCompareMemoryUlong", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCompareMemoryUlong_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCompressBuffer", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCompressBuffer_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCompressChunks", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCompressChunks_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCopyLuid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCopyLuid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCopySid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCopySid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCreateAcl", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCreateAcl_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCreateHeap", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCreateHeap_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCreateServiceSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCreateServiceSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCreateSystemVolumeInformationFolder", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCreateSystemVolumeInformationFolder_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCreateUnicodeString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCreateUnicodeString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCreateVirtualAccountSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCreateVirtualAccountSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlCustomCPToUnicodeN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlCustomCPToUnicodeN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDecompressBuffer", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDecompressBuffer_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx2", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDecompressBufferEx2_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDecompressChunks", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDecompressChunks_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDecompressFragment", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDecompressFragment_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDecompressFragmentEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDecompressFragmentEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDeleteAce", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDeleteAce_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDescribeChunk", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDescribeChunk_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDestroyHeap", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDestroyHeap_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDosPathNameToNtPathName_U_WithStatus", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDosPathNameToNtPathName_U_WithStatus_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDowncaseUnicodeString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDowncaseUnicodeString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlDuplicateUnicodeString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlDuplicateUnicodeString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlEqualPrefixSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlEqualPrefixSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlEqualSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlEqualSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlFindUnicodePrefix", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlFindUnicodePrefix_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlFreeHeap", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlFreeHeap_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlFreeSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlFreeSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlGenerate8dot3Name", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlGenerate8dot3Name_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlGetAce", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlGetAce_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlGetCompressionWorkSpaceSize", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlGetCompressionWorkSpaceSize_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlGetDaclSecurityDescriptor", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlGetDaclSecurityDescriptor_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlGetGroupSecurityDescriptor", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlGetGroupSecurityDescriptor_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlGetOwnerSecurityDescriptor", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlGetOwnerSecurityDescriptor_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlGetSaclSecurityDescriptor", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlGetSaclSecurityDescriptor_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIdentifierAuthoritySid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIdentifierAuthoritySid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIdnToAscii", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIdnToAscii_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIdnToNameprepUnicode", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIdnToNameprepUnicode_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIdnToUnicode", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIdnToUnicode_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlInitCodePageTable", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlInitCodePageTable_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlInitUnicodeStringEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlInitUnicodeStringEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlInitializeSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlInitializeSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlInitializeUnicodePrefix", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlInitializeUnicodePrefix_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlInsertUnicodePrefix", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlInsertUnicodePrefix_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIsCloudFilesPlaceholder", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIsCloudFilesPlaceholder_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIsDosDeviceName_U", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIsDosDeviceName_U_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIsNonEmptyDirectoryReparsePointAllowed", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIsNonEmptyDirectoryReparsePointAllowed_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIsNormalizedString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIsNormalizedString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholder", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholder_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileHandle", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileHandle_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileInfo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIsPartialPlaceholderFileInfo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIsSandboxedToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIsSandboxedToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlIsValidOemCharacter", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlIsValidOemCharacter_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlLengthRequiredSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlLengthRequiredSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlLengthSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlLengthSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeSize", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlMultiByteToUnicodeSize_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlNextUnicodePrefix", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlNextUnicodePrefix_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlNormalizeString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlNormalizeString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlNtStatusToDosErrorNoTeb", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlNtStatusToDosErrorNoTeb_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlOemStringToCountedUnicodeString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlOemStringToCountedUnicodeString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlOemStringToUnicodeString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlOemStringToUnicodeString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlOemToUnicodeN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlOemToUnicodeN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlPrefixString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlPrefixString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentity", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentity_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentityEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlQueryPackageIdentityEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlQueryProcessPlaceholderCompatibilityMode", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlQueryProcessPlaceholderCompatibilityMode_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlQueryThreadPlaceholderCompatibilityMode", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlQueryThreadPlaceholderCompatibilityMode_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlRandom", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlRandom_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlRandomEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlRandomEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlRemoveUnicodePrefix", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlRemoveUnicodePrefix_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlReplaceSidInSd", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlReplaceSidInSd_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlReserveChunk", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlReserveChunk_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1970ToTime", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1970ToTime_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1980ToTime", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlSecondsSince1980ToTime_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlSelfRelativeToAbsoluteSD", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlSelfRelativeToAbsoluteSD_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlSetGroupSecurityDescriptor", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlSetGroupSecurityDescriptor_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlSetOwnerSecurityDescriptor", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlSetOwnerSecurityDescriptor_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlSetProcessPlaceholderCompatibilityMode", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlSetProcessPlaceholderCompatibilityMode_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlSetThreadPlaceholderCompatibilityMode", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlSetThreadPlaceholderCompatibilityMode_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlSubAuthorityCountSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlSubAuthorityCountSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlSubAuthoritySid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlSubAuthoritySid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlTimeToSecondsSince1980", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlTimeToSecondsSince1980_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlUnicodeStringToCountedOemString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlUnicodeStringToCountedOemString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlUnicodeToCustomCPN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlUnicodeToCustomCPN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlUnicodeToMultiByteN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlUnicodeToMultiByteN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlUnicodeToOemN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlUnicodeToOemN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToCountedOemString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToCountedOemString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToOemString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeStringToOemString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToCustomCPN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToCustomCPN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToMultiByteN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToMultiByteN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToOemN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlUpcaseUnicodeToOemN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlValidSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlValidSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlValidateUnicodeString", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlValidateUnicodeString_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlxOemStringToUnicodeSize", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlxOemStringToUnicodeSize_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_RtlxUnicodeStringToOemSize", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_RtlxUnicodeStringToOemSize_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromState", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromState_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromStateEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAccessCheckFromStateEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForAccessConstraints", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForAccessConstraints_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForTrustLabel", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAdjustAccessStateForTrustLabel_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAdjustObjectSecurity", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAdjustObjectSecurity_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAppendPrivileges", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAppendPrivileges_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditFipsCryptoSelftests", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditFipsCryptoSelftests_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreationWithTransaction", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditHardLinkCreationWithTransaction_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditTransactionStateChange", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditTransactionStateChange_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContextEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditingAnyFileEventsWithContextEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditingFileEvents", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditingFileEvents_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContextEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditingFileEventsWithContextEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditingFileOrGlobalEvents", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditingFileOrGlobalEvents_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEvents", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEvents_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEventsWithContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeAuditingHardLinkEventsWithContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeCaptureSubjectContextEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeCaptureSubjectContextEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeCheckForCriticalAceRemoval", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeCheckForCriticalAceRemoval_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurity", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurity_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurityFromSubjectContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeCreateClientSecurityFromSubjectContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeDeleteClientSecurity", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeDeleteClientSecurity_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarmWithTransaction", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeDeleteObjectAuditAlarmWithTransaction_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeExamineSacl", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeExamineSacl_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeFilterToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeFilterToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeFreePrivileges", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeFreePrivileges_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeImpersonateClient", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeImpersonateClient_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeImpersonateClientEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeImpersonateClientEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeLocateProcessImageName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeLocateProcessImageName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotification", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotification_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotificationEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeMarkLogonSessionForTerminationNotificationEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarmWithTransaction", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeOpenObjectAuditAlarmWithTransaction_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarmWithTransaction", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeOpenObjectForDeleteAuditAlarmWithTransaction_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SePrivilegeCheck", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SePrivilegeCheck_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeQueryAuthenticationIdToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeQueryAuthenticationIdToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeQueryInformationToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeQueryInformationToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeQuerySecurityDescriptorInfo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeQuerySecurityDescriptorInfo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeQueryServerSiloToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeQueryServerSiloToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdTokenEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeQuerySessionIdTokenEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutine", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutine_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutineEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeRegisterLogonSessionTerminatedRoutineEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeReportSecurityEventWithSubCategory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeReportSecurityEventWithSubCategory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeSetAccessStateGenericMapping", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeSetAccessStateGenericMapping_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfo", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfo_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfoEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeSetSecurityDescriptorInfoEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeShouldCheckForAccessRightsFromParent", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeShouldCheckForAccessRightsFromParent_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeTokenFromAccessInformation", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeTokenFromAccessInformation_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeTokenIsAdmin", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeTokenIsAdmin_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeTokenIsRestricted", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeTokenIsRestricted_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeTokenIsWriteRestricted", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeTokenIsWriteRestricted_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeTokenType", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeTokenType_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutine", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutine_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutineEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SeUnregisterLogonSessionTerminatedRoutineEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SecLookupAccountName", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SecLookupAccountName_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SecLookupAccountSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SecLookupAccountSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SecLookupWellKnownSid", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SecLookupWellKnownSid_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SecMakeSPN", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SecMakeSPN_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx2", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SecMakeSPNEx2_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SetContextAttributesW", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SetContextAttributesW_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiAcceptSecurityContextAsync", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiAcceptSecurityContextAsync_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiCreateAsyncContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiCreateAsyncContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiDeleteSecurityContextAsync", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiDeleteSecurityContextAsync_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiFreeAsyncContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiFreeAsyncContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiFreeCredentialsHandleAsync", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiFreeCredentialsHandleAsync_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiGetAsyncCallStatus", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiGetAsyncCallStatus_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncA", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncA_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncW", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiInitializeSecurityContextAsyncW_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiReinitAsyncContext", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiReinitAsyncContext_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_SspiSetAsyncNotifyCallback", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_SspiSetAsyncNotifyCallback_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_VerifySignature", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_VerifySignature_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwAccessCheckAndAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwAccessCheckAndAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeAndAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeAndAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarmByHandle", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwAccessCheckByTypeResultListAndAuditAlarmByHandle_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwAdjustGroupsToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwAdjustGroupsToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwAdjustPrivilegesToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwAdjustPrivilegesToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemoryEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwAllocateVirtualMemoryEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwCancelIoFileEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwCancelIoFileEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwCloseObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwCloseObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwCreateDirectoryObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwCreateDirectoryObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwCreateEvent", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwCreateEvent_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwCreateSectionEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwCreateSectionEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwDeleteFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwDeleteFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwDeleteObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwDeleteObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwDuplicateObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwDuplicateObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwDuplicateToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwDuplicateToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwFilterToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwFilterToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFileEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwFlushBuffersFileEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwFlushVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwFlushVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwFreeVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwFreeVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwImpersonateAnonymousToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwImpersonateAnonymousToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwOpenDirectoryObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwOpenDirectoryObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwOpenObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwOpenObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwOpenProcessToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwOpenProcessToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwOpenProcessTokenEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwOpenProcessTokenEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwOpenThreadToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwOpenThreadToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwOpenThreadTokenEx", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwOpenThreadTokenEx_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwPrivilegeCheck", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwPrivilegeCheck_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwPrivilegeObjectAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwPrivilegeObjectAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwPrivilegedServiceAuditAlarm", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwPrivilegedServiceAuditAlarm_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwQueryDirectoryObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwQueryDirectoryObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwQueryEaFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwQueryEaFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwQueryFullAttributesFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwQueryFullAttributesFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwQueryInformationToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwQueryInformationToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwQueryObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwQueryObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwQueryQuotaInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwQueryQuotaInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwQuerySecurityObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwQuerySecurityObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwQueryVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwQueryVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwQueryVolumeInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwQueryVolumeInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwSetEaFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwSetEaFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwSetEvent", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwSetEvent_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwSetInformationToken", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwSetInformationToken_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwSetInformationVirtualMemory", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwSetInformationVirtualMemory_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwSetQuotaInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwSetQuotaInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwSetSecurityObject", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwSetSecurityObject_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwSetVolumeInformationFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwSetVolumeInformationFile_napi));
    exports.Set("windowssys_windows_wdk_storage_filesystem_ZwUnlockFile", Napi::Function::New(env, windowssys_windows_wdk_storage_filesystem_ZwUnlockFile_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_wdk_storage_filesystem_napi, nullptr };
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
