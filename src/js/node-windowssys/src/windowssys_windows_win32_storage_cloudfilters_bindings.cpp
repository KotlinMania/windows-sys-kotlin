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

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfCloseHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfCloseHandle")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filehandle);
#else
    (void)filehandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfConnectSyncRoot_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* syncrootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbacktable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* callbackcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t connectflags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* connectionkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfConnectSyncRoot")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(syncrootpath, callbacktable, callbackcontext, connectflags, connectionkey) : -1;
#else
    (void)syncrootpath;
    (void)callbacktable;
    (void)callbackcontext;
    (void)connectflags;
    (void)connectionkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfConvertToPlaceholder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fileidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t fileidentitylength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t convertflags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* convertusn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfConvertToPlaceholder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, fileidentity, fileidentitylength, convertflags, convertusn, overlapped) : -1;
#else
    (void)filehandle;
    (void)fileidentity;
    (void)fileidentitylength;
    (void)convertflags;
    (void)convertusn;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfCreatePlaceholders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* basedirectorypath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* placeholderarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t placeholdercount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t createflags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* entriesprocessed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfCreatePlaceholders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(basedirectorypath, placeholderarray, placeholdercount, createflags, entriesprocessed) : -1;
#else
    (void)basedirectorypath;
    (void)placeholderarray;
    (void)placeholdercount;
    (void)createflags;
    (void)entriesprocessed;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfDehydratePlaceholder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t startingoffset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t length = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int32_t dehydrateflags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfDehydratePlaceholder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, startingoffset, length, dehydrateflags, overlapped) : -1;
#else
    (void)filehandle;
    (void)startingoffset;
    (void)length;
    (void)dehydrateflags;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfDisconnectSyncRoot_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t connectionkey = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfDisconnectSyncRoot")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionkey) : -1;
#else
    (void)connectionkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfExecute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* opinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* opparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfExecute")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(opinfo, opparams) : -1;
#else
    (void)opinfo;
    (void)opparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetCorrelationVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* correlationvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetCorrelationVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, correlationvector) : -1;
#else
    (void)filehandle;
    (void)correlationvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* infobuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t infobufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetPlaceholderInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, infoclass, infobuffer, infobufferlength, returnedlength) : -1;
#else
    (void)filehandle;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t startingoffset = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t length = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* infobuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t infobufferlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetPlaceholderRangeInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, infoclass, startingoffset, length, infobuffer, infobufferlength, returnedlength) : -1;
#else
    (void)filehandle;
    (void)infoclass;
    (void)startingoffset;
    (void)length;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfoForHydration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t connectionkey = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t transferkey = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t fileid = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t startingoffset = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int64_t rangelength = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* infobuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t infobuffersize = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* infobufferwritten = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int32_t, int64_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetPlaceholderRangeInfoForHydration")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionkey, transferkey, fileid, infoclass, startingoffset, rangelength, infobuffer, infobuffersize, infobufferwritten) : -1;
#else
    (void)connectionkey;
    (void)transferkey;
    (void)fileid;
    (void)infoclass;
    (void)startingoffset;
    (void)rangelength;
    (void)infobuffer;
    (void)infobuffersize;
    (void)infobufferwritten;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromAttributeTag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t fileattributes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t reparsetag = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromAttributeTag")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fileattributes, reparsetag) : 0;
#else
    (void)fileattributes;
    (void)reparsetag;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFileInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* infobuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromFileInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(infobuffer, infoclass) : 0;
#else
    (void)infobuffer;
    (void)infoclass;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFindData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* finddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetPlaceholderStateFromFindData")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(finddata) : 0;
#else
    (void)finddata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetPlatformInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* platformversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetPlatformInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(platformversion) : -1;
#else
    (void)platformversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* infobuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t infobufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetSyncRootInfoByHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, infoclass, infobuffer, infobufferlength, returnedlength) : -1;
#else
    (void)filehandle;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t infoclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* infobuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t infobufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnedlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetSyncRootInfoByPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filepath, infoclass, infobuffer, infobufferlength, returnedlength) : -1;
#else
    (void)filepath;
    (void)infoclass;
    (void)infobuffer;
    (void)infobufferlength;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetTransferKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* transferkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetTransferKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, transferkey) : -1;
#else
    (void)filehandle;
    (void)transferkey;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfGetWin32HandleFromProtectedHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protectedhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfGetWin32HandleFromProtectedHandle")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protectedhandle) : NULL;
#else
    (void)protectedhandle;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfHydratePlaceholder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t startingoffset = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t length = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int32_t hydrateflags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfHydratePlaceholder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, startingoffset, length, hydrateflags, overlapped) : -1;
#else
    (void)filehandle;
    (void)startingoffset;
    (void)length;
    (void)hydrateflags;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfOpenFileWithOplock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* protectedhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfOpenFileWithOplock")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filepath, flags, protectedhandle) : -1;
#else
    (void)filepath;
    (void)flags;
    (void)protectedhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfQuerySyncProviderStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t connectionkey = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* providerstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfQuerySyncProviderStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionkey, providerstatus) : -1;
#else
    (void)connectionkey;
    (void)providerstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfReferenceProtectedHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protectedhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfReferenceProtectedHandle")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(protectedhandle) : false;
#else
    (void)protectedhandle;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfRegisterSyncRoot_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* syncrootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* registration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* policies = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t registerflags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfRegisterSyncRoot")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(syncrootpath, registration, policies, registerflags) : -1;
#else
    (void)syncrootpath;
    (void)registration;
    (void)policies;
    (void)registerflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfReleaseProtectedHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* protectedhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfReleaseProtectedHandle")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(protectedhandle);
#else
    (void)protectedhandle;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfReleaseTransferKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* transferkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfReleaseTransferKey")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(filehandle, transferkey);
#else
    (void)filehandle;
    (void)transferkey;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t connectionkey = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t transferkey = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t providerprogresstotal = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t providerprogresscompleted = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfReportProviderProgress")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted) : -1;
#else
    (void)connectionkey;
    (void)transferkey;
    (void)providerprogresstotal;
    (void)providerprogresscompleted;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t connectionkey = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t transferkey = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t requestkey = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int64_t providerprogresstotal = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    int64_t providerprogresscompleted = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    uint32_t targetsessionid = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfReportProviderProgress2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid) : -1;
#else
    (void)connectionkey;
    (void)transferkey;
    (void)requestkey;
    (void)providerprogresstotal;
    (void)providerprogresscompleted;
    (void)targetsessionid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfReportSyncStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* syncrootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* syncstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfReportSyncStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(syncrootpath, syncstatus) : -1;
#else
    (void)syncrootpath;
    (void)syncstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfRevertPlaceholder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t revertflags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfRevertPlaceholder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, revertflags, overlapped) : -1;
#else
    (void)filehandle;
    (void)revertflags;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfSetCorrelationVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* correlationvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfSetCorrelationVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, correlationvector) : -1;
#else
    (void)filehandle;
    (void)correlationvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfSetInSyncState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t insyncstate = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t insyncflags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* insyncusn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfSetInSyncState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, insyncstate, insyncflags, insyncusn) : -1;
#else
    (void)filehandle;
    (void)insyncstate;
    (void)insyncflags;
    (void)insyncusn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfSetPinState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pinstate = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t pinflags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfSetPinState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, pinstate, pinflags, overlapped) : -1;
#else
    (void)filehandle;
    (void)pinstate;
    (void)pinflags;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfUnregisterSyncRoot_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* syncrootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfUnregisterSyncRoot")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(syncrootpath) : -1;
#else
    (void)syncrootpath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfUpdatePlaceholder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fsmetadata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fileidentity = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t fileidentitylength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* dehydraterangearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dehydraterangecount = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t updateflags = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* updateusn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfUpdatePlaceholder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filehandle, fsmetadata, fileidentity, fileidentitylength, dehydraterangearray, dehydraterangecount, updateflags, updateusn, overlapped) : -1;
#else
    (void)filehandle;
    (void)fsmetadata;
    (void)fileidentity;
    (void)fileidentitylength;
    (void)dehydraterangearray;
    (void)dehydraterangecount;
    (void)updateflags;
    (void)updateusn;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_cloudfilters_CfUpdateSyncProviderStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t connectionkey = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t providerstatus = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("cldapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CfUpdateSyncProviderStatus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionkey, providerstatus) : -1;
#else
    (void)connectionkey;
    (void)providerstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_storage_cloudfilters_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfCloseHandle", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfCloseHandle_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfConnectSyncRoot", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfConnectSyncRoot_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfConvertToPlaceholder", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfConvertToPlaceholder_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfCreatePlaceholders", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfCreatePlaceholders_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfDehydratePlaceholder", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfDehydratePlaceholder_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfDisconnectSyncRoot", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfDisconnectSyncRoot_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfExecute", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfExecute_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetCorrelationVector", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetCorrelationVector_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderInfo", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderInfo_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfo", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfo_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfoForHydration", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderRangeInfoForHydration_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromAttributeTag", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromAttributeTag_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFileInfo", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFileInfo_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFindData", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetPlaceholderStateFromFindData_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetPlatformInfo", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetPlatformInfo_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByHandle", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByHandle_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByPath", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetSyncRootInfoByPath_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetTransferKey", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetTransferKey_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfGetWin32HandleFromProtectedHandle", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfGetWin32HandleFromProtectedHandle_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfHydratePlaceholder", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfHydratePlaceholder_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfOpenFileWithOplock", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfOpenFileWithOplock_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfQuerySyncProviderStatus", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfQuerySyncProviderStatus_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfReferenceProtectedHandle", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfReferenceProtectedHandle_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfRegisterSyncRoot", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfRegisterSyncRoot_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfReleaseProtectedHandle", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfReleaseProtectedHandle_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfReleaseTransferKey", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfReleaseTransferKey_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress2", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfReportProviderProgress2_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfReportSyncStatus", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfReportSyncStatus_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfRevertPlaceholder", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfRevertPlaceholder_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfSetCorrelationVector", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfSetCorrelationVector_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfSetInSyncState", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfSetInSyncState_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfSetPinState", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfSetPinState_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfUnregisterSyncRoot", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfUnregisterSyncRoot_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfUpdatePlaceholder", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfUpdatePlaceholder_napi));
    exports.Set("windowssys_windows_win32_storage_cloudfilters_CfUpdateSyncProviderStatus", Napi::Function::New(env, windowssys_windows_win32_storage_cloudfilters_CfUpdateSyncProviderStatus_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_storage_cloudfilters_napi, nullptr };
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
