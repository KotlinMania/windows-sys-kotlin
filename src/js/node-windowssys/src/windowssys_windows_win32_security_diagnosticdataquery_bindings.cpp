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

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqCancelDiagnosticRecordOperation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqCloseSession")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t accesslevel = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqCreateSession")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(accesslevel, hsession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)accesslevel;
    (void)hsession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reportstoretype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* reportkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* destinationpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqExtractDiagnosticReport")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, reportstoretype, reportkey, destinationpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)reportstoretype;
    (void)reportkey;
    (void)destinationpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htagdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordLocaleTags")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htagdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htagdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordPage")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcategorydescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordProducerCategories")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcategorydescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcategorydescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hproducerdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordProducers")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hproducerdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hproducerdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hreport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqFreeDiagnosticReport")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hreport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hreport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* accesslevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticDataAccessLevelAllowed")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(accesslevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)accesslevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* record = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordAtIndex")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrecord, arg1Index, record);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecord;
    (void)arg1Index;
    (void)record;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* producernames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t producernamecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t topnbinaries = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* binarystats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* statcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordBinaryDistribution")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, producernames, producernamecount, topnbinaries, binarystats, statcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)topnbinaries;
    (void)binarystats;
    (void)statcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcategorydescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* categorydescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCategoryAtIndex")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcategorydescription, arg1Index, categorydescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcategorydescription;
    (void)arg1Index;
    (void)categorydescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcategorydescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* categorydescriptioncount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCategoryCount")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hcategorydescription, categorydescriptioncount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcategorydescription;
    (void)categorydescriptioncount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* recordcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCount")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hrecord, recordcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecord;
    (void)recordcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htagdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tagdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTagAtIndex")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htagdescription, arg1Index, tagdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htagdescription;
    (void)arg1Index;
    (void)tagdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htagdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* tagdescriptioncount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTagCount")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htagdescription, tagdescriptioncount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htagdescription;
    (void)tagdescriptioncount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* locale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* htagdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTags")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, locale, htagdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)locale;
    (void)htagdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchcriteria = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t pagerecordcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t baserowid = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* hrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordPage")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, searchcriteria, offset, pagerecordcount, baserowid, hrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)searchcriteria;
    (void)offset;
    (void)pagerecordcount;
    (void)baserowid;
    (void)hrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t rowid = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* payload = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordPayload")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, rowid, payload);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)rowid;
    (void)payload;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hproducerdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* producerdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerAtIndex")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hproducerdescription, arg1Index, producerdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hproducerdescription;
    (void)arg1Index;
    (void)producerdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* producername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hcategorydescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerCategories")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, producername, hcategorydescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)producername;
    (void)hcategorydescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hproducerdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* producerdescriptioncount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerCount")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hproducerdescription, producerdescriptioncount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hproducerdescription;
    (void)producerdescriptioncount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hproducerdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducers")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, hproducerdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)hproducerdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchcriteria = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* recordcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* minrowid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* maxrowid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordStats")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, searchcriteria, recordcount, minrowid, maxrowid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)searchcriteria;
    (void)recordcount;
    (void)minrowid;
    (void)maxrowid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* producernames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t producernamecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* generalstats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordSummary")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, producernames, producernamecount, generalstats);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)generalstats;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* producernames = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t producernamecount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* tagstats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* statcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordTagDistribution")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, producernames, producernamecount, tagstats, statcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)tagstats;
    (void)statcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reportstoretype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hreport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticReport")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, reportstoretype, hreport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)reportstoretype;
    (void)hreport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hreport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg1Index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* report = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticReportAtIndex")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hreport, arg1Index, report);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hreport;
    (void)arg1Index;
    (void)report;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hreport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reportcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticReportCount")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hreport, reportcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hreport;
    (void)reportcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reportstoretype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* reportcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetDiagnosticReportStoreReportCount")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, reportstoretype, reportcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)reportstoretype;
    (void)reportcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* accesslevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetSessionAccessLevel")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, accesslevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)accesslevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* currentconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqGetTranscriptConfiguration")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, currentconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)currentconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* providergroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* providerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* providername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* eventid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* eventname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* eventversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* eventkeywords = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* issampledin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqIsDiagnosticRecordSampledIn")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, providergroup, providerid, providername, eventid, eventname, eventversion, eventkeywords, issampledin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)providergroup;
    (void)providerid;
    (void)providername;
    (void)eventid;
    (void)eventname;
    (void)eventversion;
    (void)eventkeywords;
    (void)issampledin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hsession = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* desiredconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DdqSetTranscriptConfiguration")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hsession, desiredconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)desiredconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_security_diagnosticdataquery_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn_napi));
    exports.Set("windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration", Napi::Function::New(env, windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_diagnosticdataquery_napi, nullptr };
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
