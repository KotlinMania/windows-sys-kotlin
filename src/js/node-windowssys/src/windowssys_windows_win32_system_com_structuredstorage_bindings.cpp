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

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(rgpropvar, cvars);
    } else {
        errno = ENOSYS;
    }
#else
    (void)rgpropvar;
    (void)cvars;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pserverinfo, pclsid, punkouter, dwclsctx, grfmode, pwszname, dwcount, presults);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pserverinfo;
    (void)pclsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)grfmode;
    (void)pwszname;
    (void)dwcount;
    (void)presults;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pserverinfo, pclsid, punkouter, dwclsctx, pstg, dwcount, presults);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pserverinfo;
    (void)pclsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)pstg;
    (void)dwcount;
    (void)presults;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstm, iid, ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)iid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hglobal, fdeleteonrelease, pplkbyt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hglobal;
    (void)fdeleteonrelease;
    (void)pplkbyt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hglobal, fdeleteonrelease, ppstm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hglobal;
    (void)fdeleteonrelease;
    (void)ppstm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pfmtid, oszname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfmtid;
    (void)oszname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cvariants, rgvars);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cvariants;
    (void)rgvars;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageGetConvertStg_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetConvertStg")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(plkbyt, phglobal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plkbyt;
    (void)phglobal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstm, phglobal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)phglobal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgf, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgf;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pv, cb, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pv;
    (void)cb;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clsid, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsid;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgn, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pftin, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pftin;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgft, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgft;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(guid, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)guid;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgn, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgn, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgn, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, ielem, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)ielem;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hinst, id, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinst;
    (void)id;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psz, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psz;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgsz, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgsz;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgn, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgn, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(prgn, celems, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarsingle, ppropvarvector);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarsingle;
    (void)ppropvarvector;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstg, lpolestream);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)lpolestream;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstg, cfformat, lwidth, lheight, dwsize, pmedium, polestm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)cfformat;
    (void)lwidth;
    (void)lheight;
    (void)dwsize;
    (void)pmedium;
    (void)polestm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpolestream, pstg, ptd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpolestream;
    (void)pstg;
    (void)ptd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(polestm, pstg, pcfformat, plwwidth, plheight, pdwsize, pmedium);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)polestm;
    (void)pstg;
    (void)pcfformat;
    (void)plwwidth;
    (void)plheight;
    (void)pdwsize;
    (void)pmedium;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(oszname, pfmtid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oszname;
    (void)pfmtid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropvardest, propvarsrc, flags, vt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppropvardest;
    (void)propvarsrc;
    (void)flags;
    (void)vt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantClear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantClear")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar1, propvar2, unit, flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar1;
    (void)propvar2;
    (void)unit;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pvardest, pvarsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvardest;
    (void)pvarsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, pfval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)pfval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetElementCount")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)propvar;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, pftval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)pftval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, ppszval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)ppszval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ielem, pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pbstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pbstrout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, pfret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)pfret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgf, crgf, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgf;
    (void)crgf;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgf, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgf;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, fdefault);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)fdefault;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pv, cb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, pdblret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)pdblret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgn, crgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault_napi(const Napi::CallbackInfo& km_info) {
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
    double km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, dbldefault);
    } else {
        errno = ENOSYS;
        km_res = 0.0;
    }
#else
    (void)propvarin;
    (void)dbldefault;
    errno = ENOSYS;
    double km_res = 0.0;
#endif
    return Napi::Number::New(km_env, static_cast<double>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pstfout, pftout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pstfout;
    (void)pftout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgft, crgft, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgft;
    (void)crgft;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgft, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgft;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pguid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pguid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, piret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)piret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgn, crgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, idefault);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)idefault;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, plret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)plret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgn, crgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, ldefault);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)ldefault;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, pllret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)pllret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgn, crgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, lldefault);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)lldefault;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToString_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, psz, cch);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)psz;
    (void)cch;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, ppszout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)ppszout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgsz, crgsz, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgsz;
    (void)crgsz;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgsz, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgsz;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, pszdefault);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)propvarin;
    (void)pszdefault;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, puiret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)puiret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgn, crgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault_napi(const Napi::CallbackInfo& km_info) {
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
    uint16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, uidefault);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)propvarin;
    (void)uidefault;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, pulret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)pulret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgn, crgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, uldefault);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)propvarin;
    (void)uldefault;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, pullret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvarin;
    (void)pullret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, prgn, crgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, pprgn, pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault_napi(const Napi::CallbackInfo& km_info) {
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
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvarin, ulldefault);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)propvarin;
    (void)ulldefault;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropvar, pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppropvar;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(propvar, riid, ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvar;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageReadClassStg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstg, pclsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)pclsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageReadClassStm_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstm, pclsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)pclsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstg, pcf, lplpszusertype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)pcf;
    (void)lplpszusertype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageSetConvertStg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstg, fconvert);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)fconvert;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant_napi(const Napi::CallbackInfo& km_info) {
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
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pprop, codepage, pvar, pma);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pprop;
    (void)codepage;
    (void)pvar;
    (void)pma;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pvar, codepage, pprop, pcb, pid, freserved, pcindirect);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)pvar;
    (void)codepage;
    (void)pprop;
    (void)pcb;
    (void)pid;
    (void)freserved;
    (void)pcindirect;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwcsname, grfmode, reserved, ppstgopen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwcsname;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(plkbyt, grfmode, reserved, ppstgopen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plkbyt;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstorage, dwreserved, pppropsetstg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstorage;
    (void)dwreserved;
    (void)pppropsetstg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(punk, fmtid, pclsid, grfflags, dwreserved, pppropstg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punk;
    (void)fmtid;
    (void)pclsid;
    (void)grfflags;
    (void)dwreserved;
    (void)pppropstg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwcsname, grfmode, stgfmt, grfattrs, pstgoptions, psecuritydescriptor, riid, ppobjectopen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwcsname;
    (void)grfmode;
    (void)stgfmt;
    (void)grfattrs;
    (void)pstgoptions;
    (void)psecuritydescriptor;
    (void)riid;
    (void)ppobjectopen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pprop, cbmax, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pprop;
    (void)cbmax;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwcsname, ppflb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwcsname;
    (void)ppflb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pilb, ppflb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pilb;
    (void)ppflb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwcsname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgIsStorageFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwcsname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwcsname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plkbyt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "StgIsStorageILockBytes")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(plkbyt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plkbyt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pflb, grfmode, asyncflags, ppstgopen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pflb;
    (void)grfmode;
    (void)asyncflags;
    (void)ppstgopen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwcsdfname, grfmode, reserved, ppstgopen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwcsdfname;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(punk, fmtid, grfflags, dwreserved, pppropstg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punk;
    (void)fmtid;
    (void)grfflags;
    (void)dwreserved;
    (void)pppropstg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwcsname, pstgpriority, grfmode, snbexclude, reserved, ppstgopen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwcsname;
    (void)pstgpriority;
    (void)grfmode;
    (void)snbexclude;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwcsname, grfmode, stgfmt, grfattrs, pstgoptions, psecuritydescriptor, riid, ppobjectopen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwcsname;
    (void)grfmode;
    (void)stgfmt;
    (void)grfattrs;
    (void)pstgoptions;
    (void)psecuritydescriptor;
    (void)riid;
    (void)ppobjectopen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(plkbyt, pstgpriority, grfmode, snbexclude, reserved, ppstgopen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plkbyt;
    (void)pstgpriority;
    (void)grfmode;
    (void)snbexclude;
    (void)reserved;
    (void)ppstgopen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pprop, cbprop, codepage, breserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pprop;
    (void)cbprop;
    (void)codepage;
    (void)breserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppropvar, ppprop, pcb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppropvar;
    (void)ppprop;
    (void)pcb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageStgSetTimes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszname, pctime, patime, pmtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszname;
    (void)pctime;
    (void)patime;
    (void)pmtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pvar, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvar;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(punkpropertyvalue, ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punkpropertyvalue;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageWriteClassStg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstg, rclsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)rclsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageWriteClassStm_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstm, rclsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    (void)rclsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstg, cf, lpszusertype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstg;
    (void)cf;
    (void)lpszusertype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_com_structuredstorage_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageGetConvertStg", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageGetConvertStg_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantClear", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantClear_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToString", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToString_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageReadClassStg", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageReadClassStg_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageReadClassStm", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageReadClassStm_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageSetConvertStg", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageSetConvertStg_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageStgSetTimes", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageStgSetTimes_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageWriteClassStg", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageWriteClassStg_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageWriteClassStm", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageWriteClassStm_napi));
    exports.Set("windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg", Napi::Function::New(env, windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg_napi));
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
