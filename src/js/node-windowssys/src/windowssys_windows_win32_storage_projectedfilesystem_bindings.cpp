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

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjAllocateAlignedBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t size = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjAllocateAlignedBuffer")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namespacevirtualizationcontext, size) : NULL;
#else
    (void)namespacevirtualizationcontext;
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjClearNegativePathCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* totalentrynumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjClearNegativePathCache")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namespacevirtualizationcontext, totalentrynumber) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)totalentrynumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjCompleteCommand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t commandid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t completionresult = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* extendedparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjCompleteCommand")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namespacevirtualizationcontext, commandid, completionresult, extendedparameters) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)commandid;
    (void)completionresult;
    (void)extendedparameters;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjDeleteFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* destinationfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t updateflags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* failurereason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjDeleteFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namespacevirtualizationcontext, destinationfilename, updateflags, failurereason) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)updateflags;
    (void)failurereason;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjDoesNameContainWildCards_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjDoesNameContainWildCards")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename) : false;
#else
    (void)filename;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameCompare_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filename2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjFileNameCompare")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename1, filename2) : -1;
#else
    (void)filename1;
    (void)filename2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameMatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filenametocheck = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pattern = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjFileNameMatch")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filenametocheck, pattern) : false;
#else
    (void)filenametocheck;
    (void)pattern;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filebasicinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* direntrybufferhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjFillDirEntryBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, filebasicinfo, direntrybufferhandle) : -1;
#else
    (void)filename;
    (void)filebasicinfo;
    (void)direntrybufferhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* direntrybufferhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* filebasicinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* extendedinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjFillDirEntryBuffer2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(direntrybufferhandle, filename, filebasicinfo, extendedinfo) : -1;
#else
    (void)direntrybufferhandle;
    (void)filename;
    (void)filebasicinfo;
    (void)extendedinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjFreeAlignedBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjFreeAlignedBuffer")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(buffer);
#else
    (void)buffer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjGetOnDiskFileState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* destinationfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filestate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjGetOnDiskFileState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(destinationfilename, filestate) : -1;
#else
    (void)destinationfilename;
    (void)filestate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjGetVirtualizationInstanceInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* virtualizationinstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjGetVirtualizationInstanceInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namespacevirtualizationcontext, virtualizationinstanceinfo) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)virtualizationinstanceinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjMarkDirectoryAsPlaceholder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rootpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetpathname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* versioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* virtualizationinstanceid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjMarkDirectoryAsPlaceholder")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rootpathname, targetpathname, versioninfo, virtualizationinstanceid) : -1;
#else
    (void)rootpathname;
    (void)targetpathname;
    (void)versioninfo;
    (void)virtualizationinstanceid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjStartVirtualizing_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* virtualizationrootpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* callbacks = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* instancecontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjStartVirtualizing")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(virtualizationrootpath, callbacks, instancecontext, options, namespacevirtualizationcontext) : -1;
#else
    (void)virtualizationrootpath;
    (void)callbacks;
    (void)instancecontext;
    (void)options;
    (void)namespacevirtualizationcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjStopVirtualizing_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjStopVirtualizing")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(namespacevirtualizationcontext);
#else
    (void)namespacevirtualizationcontext;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjUpdateFileIfNeeded_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* destinationfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* placeholderinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t placeholderinfosize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t updateflags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* failurereason = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjUpdateFileIfNeeded")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize, updateflags, failurereason) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)placeholderinfo;
    (void)placeholderinfosize;
    (void)updateflags;
    (void)failurereason;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjWriteFileData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* datastreamid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint64_t byteoffset = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjWriteFileData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namespacevirtualizationcontext, datastreamid, buffer, byteoffset, length) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)datastreamid;
    (void)buffer;
    (void)byteoffset;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* destinationfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* placeholderinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t placeholderinfosize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjWritePlaceholderInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)placeholderinfo;
    (void)placeholderinfosize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* namespacevirtualizationcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* destinationfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* placeholderinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t placeholderinfosize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* extendedinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("projectedfslib.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrjWritePlaceholderInfo2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(namespacevirtualizationcontext, destinationfilename, placeholderinfo, placeholderinfosize, extendedinfo) : -1;
#else
    (void)namespacevirtualizationcontext;
    (void)destinationfilename;
    (void)placeholderinfo;
    (void)placeholderinfosize;
    (void)extendedinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_storage_projectedfilesystem_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjAllocateAlignedBuffer", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjAllocateAlignedBuffer_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjClearNegativePathCache", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjClearNegativePathCache_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjCompleteCommand", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjCompleteCommand_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjDeleteFile", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjDeleteFile_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjDoesNameContainWildCards", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjDoesNameContainWildCards_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameCompare", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameCompare_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameMatch", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameMatch_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer2", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer2_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjFreeAlignedBuffer", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjFreeAlignedBuffer_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjGetOnDiskFileState", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjGetOnDiskFileState_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjGetVirtualizationInstanceInfo", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjGetVirtualizationInstanceInfo_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjMarkDirectoryAsPlaceholder", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjMarkDirectoryAsPlaceholder_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjStartVirtualizing", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjStartVirtualizing_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjStopVirtualizing", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjStopVirtualizing_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjUpdateFileIfNeeded", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjUpdateFileIfNeeded_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjWriteFileData", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjWriteFileData_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo_napi));
    exports.Set("windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo2", Napi::Function::New(env, windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo2_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_storage_projectedfilesystem_napi, nullptr };
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
