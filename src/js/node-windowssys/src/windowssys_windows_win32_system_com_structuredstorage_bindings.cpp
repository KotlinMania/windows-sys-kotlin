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

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_ClearPropVariantArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rgpropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cvars = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ClearPropVariantArray")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(rgpropvar, cvars);
#else
    (void)rgpropvar;
    (void)cvars;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pserverinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pclsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* punkouter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwclsctx = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t grfmode = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pwszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t dwcount = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* presults = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CoGetInstanceFromFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pserverinfo, pclsid, punkouter, dwclsctx, grfmode, pwszname, dwcount, presults) : -1;
#else
    (void)pserverinfo;
    (void)pclsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)grfmode;
    (void)pwszname;
    (void)dwcount;
    (void)presults;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromIStorage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pserverinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pclsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* punkouter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwclsctx = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t dwcount = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* presults = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CoGetInstanceFromIStorage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pserverinfo, pclsid, punkouter, dwclsctx, pstg, dwcount, presults) : -1;
#else
    (void)pserverinfo;
    (void)pclsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)pstg;
    (void)dwcount;
    (void)presults;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_CoGetInterfaceAndReleaseStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* iid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CoGetInterfaceAndReleaseStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstm, iid, ppv) : -1;
#else
    (void)pstm;
    (void)iid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_CreateILockBytesOnHGlobal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hglobal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fdeleteonrelease = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pplkbyt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateILockBytesOnHGlobal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hglobal, fdeleteonrelease, pplkbyt) : -1;
#else
    (void)hglobal;
    (void)fdeleteonrelease;
    (void)pplkbyt;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_CreateStreamOnHGlobal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hglobal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fdeleteonrelease = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateStreamOnHGlobal")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hglobal, fdeleteonrelease, ppstm) : -1;
#else
    (void)hglobal;
    (void)fdeleteonrelease;
    (void)ppstm;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_FmtIdToPropStgName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfmtid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FmtIdToPropStgName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfmtid, oszname) : -1;
#else
    (void)pfmtid;
    (void)oszname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_FreePropVariantArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cvariants = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* rgvars = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreePropVariantArray")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cvariants, rgvars) : -1;
#else
    (void)cvariants;
    (void)rgvars;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_GetConvertStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetConvertStg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstg) : -1;
#else
    (void)pstg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromILockBytes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plkbyt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phglobal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetHGlobalFromILockBytes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plkbyt, phglobal) : -1;
#else
    (void)plkbyt;
    (void)phglobal;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phglobal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetHGlobalFromStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstm, phglobal) : -1;
#else
    (void)pstm;
    (void)phglobal;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBooleanVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromBooleanVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgf, celems, ppropvar) : -1;
#else
    (void)prgf;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cb = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pv, cb, ppropvar) : -1;
#else
    (void)pv;
    (void)cb;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromCLSID_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromCLSID")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(clsid, ppropvar) : -1;
#else
    (void)clsid;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromDoubleVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromDoubleVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgn, celems, ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pftin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromFileTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pftin, ppropvar) : -1;
#else
    (void)pftin;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTimeVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgft = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromFileTimeVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgft, celems, ppropvar) : -1;
#else
    (void)prgft;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromGUIDAsString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromGUIDAsString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guid, ppropvar) : -1;
#else
    (void)guid;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt16Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromInt16Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgn, celems, ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt32Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromInt32Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgn, celems, ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt64Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromInt64Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgn, celems, ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromPropVariantVectorElem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromPropVariantVectorElem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, ielem, ppropvar) : -1;
#else
    (void)propvarin;
    (void)ielem;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t id = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromResource")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinst, id, ppropvar) : -1;
#else
    (void)hinst;
    (void)id;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringAsVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromStringAsVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psz, ppropvar) : -1;
#else
    (void)psz;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgsz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromStringVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgsz, celems, ppropvar) : -1;
#else
    (void)prgsz;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt16Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromUInt16Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgn, celems, ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt32Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromUInt32Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgn, celems, ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt64Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t celems = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromUInt64Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prgn, celems, ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_InitPropVariantVectorFromPropVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarsingle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropvarvector = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantVectorFromPropVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarsingle, ppropvarvector) : -1;
#else
    (void)propvarsingle;
    (void)ppropvarvector;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAM_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpolestream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OleConvertIStorageToOLESTREAM")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstg, lpolestream) : -1;
#else
    (void)pstg;
    (void)lpolestream;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAMEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t cfformat = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t lwidth = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t lheight = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwsize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pmedium = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* polestm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, int32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OleConvertIStorageToOLESTREAMEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstg, cfformat, lwidth, lheight, dwsize, pmedium, polestm) : -1;
#else
    (void)pstg;
    (void)cfformat;
    (void)lwidth;
    (void)lheight;
    (void)dwsize;
    (void)pmedium;
    (void)polestm;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpolestream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ptd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpolestream, pstg, ptd) : -1;
#else
    (void)lpolestream;
    (void)pstg;
    (void)ptd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorageEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* polestm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcfformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* plwwidth = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* plheight = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pmedium = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorageEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(polestm, pstg, pcfformat, plwwidth, plheight, pdwsize, pmedium) : -1;
#else
    (void)polestm;
    (void)pstg;
    (void)pcfformat;
    (void)plwwidth;
    (void)plheight;
    (void)pdwsize;
    (void)pmedium;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropStgNameToFmtId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* oszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfmtid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropStgNameToFmtId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(oszname, pfmtid) : -1;
#else
    (void)oszname;
    (void)pfmtid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantChangeType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropvardest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propvarsrc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t vt = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantChangeType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropvardest, propvarsrc, flags, vt) : -1;
#else
    (void)ppropvardest;
    (void)propvarsrc;
    (void)flags;
    (void)vt;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantClear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantClear")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvar) : -1;
#else
    (void)pvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantCompareEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propvar2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t unit = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t flags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantCompareEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar1, propvar2, unit, flags) : -1;
#else
    (void)propvar1;
    (void)propvar2;
    (void)unit;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantCopy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvardest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvarsrc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantCopy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvardest, pvarsrc) : -1;
#else
    (void)pvardest;
    (void)pvarsrc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetBooleanElem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetBooleanElem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, pfval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pfval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetDoubleElem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pnval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetDoubleElem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetElementCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetElementCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar) : 0;
#else
    (void)propvar;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetFileTimeElem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pftval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetFileTimeElem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, pftval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pftval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt16Elem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pnval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetInt16Elem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt32Elem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pnval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetInt32Elem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt64Elem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pnval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetInt64Elem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetStringElem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppszval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetStringElem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, ppszval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)ppszval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt16Elem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pnval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetUInt16Elem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt32Elem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pnval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetUInt32Elem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt64Elem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ielem = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pnval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetUInt64Elem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ielem, pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToBSTR_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToBSTR")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pbstrout) : -1;
#else
    (void)propvar;
    (void)pbstrout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToBoolean_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToBoolean")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, pfret) : -1;
#else
    (void)propvarin;
    (void)pfret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgf = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToBooleanVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgf, crgf, pcelem) : -1;
#else
    (void)propvar;
    (void)prgf;
    (void)crgf;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToBooleanVectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgf, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgf;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanWithDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fdefault = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToBooleanWithDefault")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, fdefault) : -1;
#else
    (void)propvarin;
    (void)fdefault;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cb = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pv, cb) : -1;
#else
    (void)propvar;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToDouble_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdblret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToDouble")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, pdblret) : -1;
#else
    (void)propvarin;
    (void)pdblret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToDoubleVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgn, crgn, pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToDoubleVectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgn, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleWithDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double dbldefault = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToDoubleWithDefault")));
    }
    double km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, dbldefault) : 0.0;
#else
    (void)propvarin;
    (void)dbldefault;
    double km_res = 0.0;
#endif
    return Napi::Number::New(km_env, static_cast<double>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pstfout = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pftout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToFileTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pstfout, pftout) : -1;
#else
    (void)propvar;
    (void)pstfout;
    (void)pftout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgft = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgft = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToFileTimeVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgft, crgft, pcelem) : -1;
#else
    (void)propvar;
    (void)prgft;
    (void)crgft;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgft = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToFileTimeVectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgft, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgft;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToGUID_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToGUID")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pguid) : -1;
#else
    (void)propvar;
    (void)pguid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* piret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt16")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, piret) : -1;
#else
    (void)propvarin;
    (void)piret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt16Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgn, crgn, pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt16VectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgn, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16WithDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t idefault = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt16WithDefault")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, idefault) : -1;
#else
    (void)propvarin;
    (void)idefault;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* plret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, plret) : -1;
#else
    (void)propvarin;
    (void)plret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt32Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgn, crgn, pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt32VectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgn, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32WithDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t ldefault = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt32WithDefault")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, ldefault) : -1;
#else
    (void)propvarin;
    (void)ldefault;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pllret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, pllret) : -1;
#else
    (void)propvarin;
    (void)pllret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt64Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgn, crgn, pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt64VectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgn, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64WithDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t lldefault = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToInt64WithDefault")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, lldefault) : -1;
#else
    (void)propvarin;
    (void)lldefault;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cch = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, psz, cch) : -1;
#else
    (void)propvar;
    (void)psz;
    (void)cch;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToStringAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, ppszout) : -1;
#else
    (void)propvar;
    (void)ppszout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgsz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgsz = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToStringVector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgsz, crgsz, pcelem) : -1;
#else
    (void)propvar;
    (void)prgsz;
    (void)crgsz;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgsz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToStringVectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgsz, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgsz;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringWithDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszdefault = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToStringWithDefault")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, pszdefault) : NULL;
#else
    (void)propvarin;
    (void)pszdefault;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* puiret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt16")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, puiret) : -1;
#else
    (void)propvarin;
    (void)puiret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt16Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgn, crgn, pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt16VectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgn, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16WithDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t uidefault = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt16WithDefault")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, uidefault) : 0;
#else
    (void)propvarin;
    (void)uidefault;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pulret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, pulret) : -1;
#else
    (void)propvarin;
    (void)pulret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt32Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgn, crgn, pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt32VectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgn, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32WithDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t uldefault = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt32WithDefault")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, uldefault) : 0;
#else
    (void)propvarin;
    (void)uldefault;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pullret = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, pullret) : -1;
#else
    (void)propvarin;
    (void)pullret;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64Vector_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crgn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt64Vector")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, prgn, crgn, pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt64VectorAlloc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, pprgn, pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64WithDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvarin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t ulldefault = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToUInt64WithDefault")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvarin, ulldefault) : 0;
#else
    (void)propvarin;
    (void)ulldefault;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropvar, pvar) : -1;
#else
    (void)ppropvar;
    (void)pvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_PropVariantToWinRTPropertyValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantToWinRTPropertyValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvar, riid, ppv) : -1;
#else
    (void)propvar;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_ReadClassStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pclsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadClassStg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstg, pclsid) : -1;
#else
    (void)pstg;
    (void)pclsid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_ReadClassStm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pclsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadClassStm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstm, pclsid) : -1;
#else
    (void)pstm;
    (void)pclsid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_ReadFmtUserTypeStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lplpszusertype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ReadFmtUserTypeStg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstg, pcf, lplpszusertype) : -1;
#else
    (void)pstg;
    (void)pcf;
    (void)lplpszusertype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_SetConvertStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fconvert = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetConvertStg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstg, fconvert) : -1;
#else
    (void)pstg;
    (void)fconvert;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgConvertPropertyToVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t codepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pma = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgConvertPropertyToVariant")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprop, codepage, pvar, pma) : false;
#else
    (void)pprop;
    (void)codepage;
    (void)pvar;
    (void)pma;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgConvertVariantToProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t codepage = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pprop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t pid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    bool freserved = km_info.Length() > 5 ? km_info[5].ToBoolean().Value() : false;
    void* pcindirect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgConvertVariantToProperty")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvar, codepage, pprop, pcb, pid, freserved, pcindirect) : NULL;
#else
    (void)pvar;
    (void)codepage;
    (void)pprop;
    (void)pcb;
    (void)pid;
    (void)freserved;
    (void)pcindirect;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwcsname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grfmode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstgopen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgCreateDocfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwcsname, grfmode, reserved, ppstgopen) : -1;
#else
    (void)pwcsname;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfileOnILockBytes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plkbyt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grfmode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstgopen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgCreateDocfileOnILockBytes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plkbyt, grfmode, reserved, ppstgopen) : -1;
#else
    (void)plkbyt;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgCreatePropSetStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstorage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pppropsetstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgCreatePropSetStg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstorage, dwreserved, pppropsetstg) : -1;
#else
    (void)pstorage;
    (void)dwreserved;
    (void)pppropsetstg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgCreatePropStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* punk = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fmtid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pclsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grfflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pppropstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgCreatePropStg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(punk, fmtid, pclsid, grfflags, dwreserved, pppropstg) : -1;
#else
    (void)punk;
    (void)fmtid;
    (void)pclsid;
    (void)grfflags;
    (void)dwreserved;
    (void)pppropstg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgCreateStorageEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwcsname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grfmode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t stgfmt = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t grfattrs = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pstgoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppobjectopen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgCreateStorageEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwcsname, grfmode, stgfmt, grfattrs, pstgoptions, psecuritydescriptor, riid, ppobjectopen) : -1;
#else
    (void)pwcsname;
    (void)grfmode;
    (void)stgfmt;
    (void)grfattrs;
    (void)pstgoptions;
    (void)psecuritydescriptor;
    (void)riid;
    (void)ppobjectopen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgDeserializePropVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgDeserializePropVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprop, cbmax, ppropvar) : -1;
#else
    (void)pprop;
    (void)cbmax;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwcsname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppflb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgGetIFillLockBytesOnFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwcsname, ppflb) : -1;
#else
    (void)pwcsname;
    (void)ppflb;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnILockBytes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pilb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppflb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgGetIFillLockBytesOnILockBytes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pilb, ppflb) : -1;
#else
    (void)pilb;
    (void)ppflb;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgIsStorageFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwcsname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgIsStorageFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwcsname) : -1;
#else
    (void)pwcsname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgIsStorageILockBytes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plkbyt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgIsStorageILockBytes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plkbyt) : -1;
#else
    (void)plkbyt;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgOpenAsyncDocfileOnIFillLockBytes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pflb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grfmode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t asyncflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstgopen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgOpenAsyncDocfileOnIFillLockBytes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pflb, grfmode, asyncflags, ppstgopen) : -1;
#else
    (void)pflb;
    (void)grfmode;
    (void)asyncflags;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgOpenLayoutDocfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwcsdfname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grfmode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppstgopen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dflayout.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgOpenLayoutDocfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwcsdfname, grfmode, reserved, ppstgopen) : -1;
#else
    (void)pwcsdfname;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgOpenPropStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* punk = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fmtid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grfflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pppropstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgOpenPropStg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(punk, fmtid, grfflags, dwreserved, pppropstg) : -1;
#else
    (void)punk;
    (void)fmtid;
    (void)grfflags;
    (void)dwreserved;
    (void)pppropstg;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgOpenStorage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwcsname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstgpriority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grfmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* snbexclude = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppstgopen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgOpenStorage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwcsname, pstgpriority, grfmode, snbexclude, reserved, ppstgopen) : -1;
#else
    (void)pwcsname;
    (void)pstgpriority;
    (void)grfmode;
    (void)snbexclude;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwcsname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grfmode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t stgfmt = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t grfattrs = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pstgoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppobjectopen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgOpenStorageEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwcsname, grfmode, stgfmt, grfattrs, pstgoptions, psecuritydescriptor, riid, ppobjectopen) : -1;
#else
    (void)pwcsname;
    (void)grfmode;
    (void)stgfmt;
    (void)grfattrs;
    (void)pstgoptions;
    (void)psecuritydescriptor;
    (void)riid;
    (void)ppobjectopen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageOnILockBytes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plkbyt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pstgpriority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grfmode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* snbexclude = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ppstgopen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgOpenStorageOnILockBytes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plkbyt, pstgpriority, grfmode, snbexclude, reserved, ppstgopen) : -1;
#else
    (void)plkbyt;
    (void)pstgpriority;
    (void)grfmode;
    (void)snbexclude;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgPropertyLengthAsVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbprop = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t codepage = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint8_t breserved = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgPropertyLengthAsVariant")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprop, cbprop, codepage, breserved) : 0;
#else
    (void)pprop;
    (void)cbprop;
    (void)codepage;
    (void)breserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgSerializePropVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppprop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgSerializePropVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppropvar, ppprop, pcb) : -1;
#else
    (void)ppropvar;
    (void)ppprop;
    (void)pcb;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_StgSetTimes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pctime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* patime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pmtime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgSetTimes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpszname, pctime, patime, pmtime) : -1;
#else
    (void)lpszname;
    (void)pctime;
    (void)patime;
    (void)pmtime;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_VariantToPropVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VariantToPropVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvar, ppropvar) : -1;
#else
    (void)pvar;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_WinRTPropertyValueToPropVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* punkpropertyvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinRTPropertyValueToPropVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(punkpropertyvalue, ppropvar) : -1;
#else
    (void)punkpropertyvalue;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_WriteClassStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rclsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WriteClassStg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstg, rclsid) : -1;
#else
    (void)pstg;
    (void)rclsid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_WriteClassStm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rclsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WriteClassStm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstm, rclsid) : -1;
#else
    (void)pstm;
    (void)rclsid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_com_structuredstorage_WriteFmtUserTypeStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t cf = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpszusertype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WriteFmtUserTypeStg")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstg, cf, lpszusertype) : -1;
#else
    (void)pstg;
    (void)cf;
    (void)lpszusertype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_com_structuredstorage_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_ClearPropVariantArray", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_ClearPropVariantArray_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromFile", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromFile_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromIStorage", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromIStorage_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_CoGetInterfaceAndReleaseStream", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_CoGetInterfaceAndReleaseStream_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_CreateILockBytesOnHGlobal", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_CreateILockBytesOnHGlobal_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_CreateStreamOnHGlobal", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_CreateStreamOnHGlobal_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_FmtIdToPropStgName", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_FmtIdToPropStgName_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_FreePropVariantArray", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_FreePropVariantArray_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_GetConvertStg", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_GetConvertStg_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromILockBytes", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromILockBytes_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromStream", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromStream_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBooleanVector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBooleanVector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBuffer", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBuffer_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromCLSID", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromCLSID_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromDoubleVector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromDoubleVector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTime", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTime_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTimeVector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTimeVector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromGUIDAsString", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromGUIDAsString_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt16Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt16Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt32Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt32Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt64Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt64Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromPropVariantVectorElem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromPropVariantVectorElem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromResource", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromResource_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringAsVector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringAsVector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringVector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringVector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt16Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt16Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt32Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt32Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt64Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt64Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_InitPropVariantVectorFromPropVariant", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_InitPropVariantVectorFromPropVariant_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAM", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAM_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAMEx", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAMEx_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorage", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorage_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorageEx", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorageEx_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropStgNameToFmtId", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropStgNameToFmtId_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantChangeType", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantChangeType_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantClear", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantClear_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantCompareEx", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantCompareEx_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantCopy", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantCopy_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetBooleanElem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetBooleanElem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetDoubleElem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetDoubleElem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetElementCount", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetElementCount_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetFileTimeElem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetFileTimeElem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt16Elem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt16Elem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt32Elem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt32Elem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt64Elem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt64Elem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetStringElem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetStringElem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt16Elem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt16Elem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt32Elem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt32Elem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt64Elem", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt64Elem_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToBSTR", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToBSTR_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToBoolean", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToBoolean_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanWithDefault", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanWithDefault_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToBuffer", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToBuffer_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToDouble", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToDouble_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleWithDefault", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleWithDefault_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTime", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTime_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToGUID", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToGUID_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16VectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16VectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16WithDefault", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16WithDefault_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32VectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32VectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32WithDefault", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32WithDefault_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64VectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64VectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64WithDefault", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64WithDefault_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToString", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToString_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringWithDefault", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringWithDefault_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16VectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16VectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16WithDefault", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16WithDefault_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32VectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32VectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32WithDefault", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32WithDefault_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64Vector", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64Vector_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64VectorAlloc", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64VectorAlloc_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64WithDefault", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64WithDefault_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToVariant", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToVariant_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_PropVariantToWinRTPropertyValue", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_PropVariantToWinRTPropertyValue_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_ReadClassStg", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_ReadClassStg_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_ReadClassStm", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_ReadClassStm_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_ReadFmtUserTypeStg", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_ReadFmtUserTypeStg_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_SetConvertStg", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_SetConvertStg_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgConvertPropertyToVariant", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgConvertPropertyToVariant_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgConvertVariantToProperty", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgConvertVariantToProperty_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfile", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfile_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfileOnILockBytes", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfileOnILockBytes_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgCreatePropSetStg", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgCreatePropSetStg_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgCreatePropStg", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgCreatePropStg_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgCreateStorageEx", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgCreateStorageEx_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgDeserializePropVariant", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgDeserializePropVariant_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnFile", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnFile_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnILockBytes", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnILockBytes_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgIsStorageFile", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgIsStorageFile_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgIsStorageILockBytes", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgIsStorageILockBytes_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgOpenAsyncDocfileOnIFillLockBytes", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgOpenAsyncDocfileOnIFillLockBytes_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgOpenLayoutDocfile", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgOpenLayoutDocfile_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgOpenPropStg", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgOpenPropStg_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgOpenStorage", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgOpenStorage_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageEx", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageEx_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageOnILockBytes", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageOnILockBytes_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgPropertyLengthAsVariant", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgPropertyLengthAsVariant_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgSerializePropVariant", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgSerializePropVariant_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_StgSetTimes", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_StgSetTimes_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_VariantToPropVariant", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_VariantToPropVariant_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_WinRTPropertyValueToPropVariant", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_WinRTPropertyValueToPropVariant_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_WriteClassStg", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_WriteClassStg_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_WriteClassStm", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_WriteClassStm_napi));
    exports.Set("windowssys_windows_win32_system_com_structuredstorage_WriteFmtUserTypeStg", Napi::Function::New(env, windowssys_windows_win32_system_com_structuredstorage_WriteFmtUserTypeStg_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_com_structuredstorage_napi, nullptr };
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
