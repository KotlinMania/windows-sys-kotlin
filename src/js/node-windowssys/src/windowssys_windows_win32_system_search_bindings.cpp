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

static Napi::Value windowssysWindowsWin32SystemSearchODBCGetTryWaitValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ODBCGetTryWaitValue")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchODBCSetTryWaitValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwvalue = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ODBCSetTryWaitValue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLAllocConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLAllocConnect")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(environmenthandle, connectionhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)environmenthandle;
    (void)connectionhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLAllocEnv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLAllocEnv")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(environmenthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)environmenthandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLAllocHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t handletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* inputhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* outputhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLAllocHandle")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handletype, inputhandle, outputhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handletype;
    (void)inputhandle;
    (void)outputhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLAllocHandleStd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t fhandletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hinput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phoutput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLAllocHandleStd")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fhandletype, hinput, phoutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fhandletype;
    (void)hinput;
    (void)phoutput;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLAllocStmt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLAllocStmt")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle, statementhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    (void)statementhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLBindCol_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t columnnumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t targettype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* targetvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t bufferlength = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* strlenOrInd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLBindCol")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, columnnumber, targettype, targetvalue, bufferlength, strlenOrInd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)targettype;
    (void)targetvalue;
    (void)bufferlength;
    (void)strlenOrInd;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLBindParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t parameternumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t valuetype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t parametertype = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint64_t lengthprecision = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    int16_t parameterscale = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* parametervalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* strlenOrInd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, uint64_t, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLBindParam")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue, strlenOrInd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)parameternumber;
    (void)valuetype;
    (void)parametertype;
    (void)lengthprecision;
    (void)parameterscale;
    (void)parametervalue;
    (void)strlenOrInd;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLBindParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t ipar = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t fparamtype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t fctype = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int16_t fsqltype = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint64_t cbcoldef = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    int16_t ibscale = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int64_t cbvaluemax = km_info.Length() > 8 ? km_napi_arg_i64(km_info[8]) : 0;
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, int16_t, uint64_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLBindParameter")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, ipar, fparamtype, fctype, fsqltype, cbcoldef, ibscale, rgbvalue, cbvaluemax, pcbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)ipar;
    (void)fparamtype;
    (void)fctype;
    (void)fsqltype;
    (void)cbcoldef;
    (void)ibscale;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLBrowseConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szconnstrin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchconnstrin = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchconnstroutmax = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcchconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLBrowseConnect")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLBrowseConnectA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szconnstrin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbconnstrin = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbconnstroutmax = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLBrowseConnectA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, szconnstrin, cbconnstrin, szconnstrout, cbconnstroutmax, pcbconnstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cbconnstrin;
    (void)szconnstrout;
    (void)cbconnstroutmax;
    (void)pcbconnstrout;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLBrowseConnectW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szconnstrin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchconnstrin = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchconnstroutmax = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcchconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLBrowseConnectW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLBulkOperations_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t operation = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLBulkOperations")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, operation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)operation;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLCancel")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLCancelHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t handletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* inputhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLCancelHandle")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handletype, inputhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handletype;
    (void)inputhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLCloseCursor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLCloseCursor")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLCloseEnumServers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLCloseEnumServers")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henumhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henumhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColAttribute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t columnnumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t fieldidentifier = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* characterattribute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t bufferlength = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* stringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* numericattribute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColAttribute")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, columnnumber, fieldidentifier, characterattribute, bufferlength, stringlength, numericattribute);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)fieldidentifier;
    (void)characterattribute;
    (void)bufferlength;
    (void)stringlength;
    (void)numericattribute;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColAttributeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t icol = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t ifield = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcharattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbcharattrmax = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbcharattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pnumattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColAttributeA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, icol, ifield, pcharattr, cbcharattrmax, pcbcharattr, pnumattr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)icol;
    (void)ifield;
    (void)pcharattr;
    (void)cbcharattrmax;
    (void)pcbcharattr;
    (void)pnumattr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColAttributeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t icol = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t ifield = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcharattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbdescmax = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbcharattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pnumattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColAttributeW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, icol, ifield, pcharattr, cbdescmax, pcbcharattr, pnumattr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)icol;
    (void)ifield;
    (void)pcharattr;
    (void)cbdescmax;
    (void)pcbcharattr;
    (void)pnumattr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t icol = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t fdesctype = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgbdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbdescmax = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColAttributes")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, icol, fdesctype, rgbdesc, cbdescmax, pcbdesc, pfdesc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColAttributesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t icol = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t fdesctype = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgbdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbdescmax = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColAttributesA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, icol, fdesctype, rgbdesc, cbdescmax, pcbdesc, pfdesc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColAttributesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t icol = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t fdesctype = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgbdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbdescmax = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColAttributesW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, icol, fdesctype, rgbdesc, cbdescmax, pcbdesc, pfdesc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColumnPrivileges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cchcolumnname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColumnPrivileges")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)szcolumnname;
    (void)cchcolumnname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cbcolumnname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColumnPrivilegesA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, szcolumnname, cbcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)szcolumnname;
    (void)cbcolumnname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cchcolumnname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColumnPrivilegesW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)szcolumnname;
    (void)cchcolumnname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColumns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* catalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t namelength1 = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* schemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t namelength2 = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* tablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t namelength3 = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* columnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t namelength4 = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColumns")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, columnname, namelength4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)catalogname;
    (void)namelength1;
    (void)schemaname;
    (void)namelength2;
    (void)tablename;
    (void)namelength3;
    (void)columnname;
    (void)namelength4;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColumnsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cbcolumnname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColumnsA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, szcolumnname, cbcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)szcolumnname;
    (void)cbcolumnname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLColumnsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cchcolumnname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLColumnsW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)szcolumnname;
    (void)cchcolumnname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLCompleteAsync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t handletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* asyncretcodeptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLCompleteAsync")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handletype, handle, asyncretcodeptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handletype;
    (void)handle;
    (void)asyncretcodeptr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t namelength1 = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* username = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t namelength2 = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* authentication = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t namelength3 = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLConnect")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle, servername, namelength1, username, namelength2, authentication, namelength3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    (void)servername;
    (void)namelength1;
    (void)username;
    (void)namelength2;
    (void)authentication;
    (void)namelength3;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLConnectA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szdsn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbdsn = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbuid = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szauthstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbauthstr = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLConnectA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, szdsn, cbdsn, szuid, cbuid, szauthstr, cbauthstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)szdsn;
    (void)cbdsn;
    (void)szuid;
    (void)cbuid;
    (void)szauthstr;
    (void)cbauthstr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLConnectW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szdsn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchdsn = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szuid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchuid = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szauthstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchauthstr = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLConnectW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, szdsn, cchdsn, szuid, cchuid, szauthstr, cchauthstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)szdsn;
    (void)cchdsn;
    (void)szuid;
    (void)cchuid;
    (void)szauthstr;
    (void)cchauthstr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLCopyDesc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcedeschandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* targetdeschandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLCopyDesc")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sourcedeschandle, targetdeschandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcedeschandle;
    (void)targetdeschandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDataSources_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t direction = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* servername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t bufferlength1 = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* namelength1ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t bufferlength2 = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* namelength2ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDataSources")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(environmenthandle, direction, servername, bufferlength1, namelength1ptr, description, bufferlength2, namelength2ptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)environmenthandle;
    (void)direction;
    (void)servername;
    (void)bufferlength1;
    (void)namelength1ptr;
    (void)description;
    (void)bufferlength2;
    (void)namelength2ptr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDataSourcesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t fdirection = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szdsn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cbdsnmax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbdsn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbdescriptionmax = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcbdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDataSourcesA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henv, fdirection, szdsn, cbdsnmax, pcbdsn, szdescription, cbdescriptionmax, pcbdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)fdirection;
    (void)szdsn;
    (void)cbdsnmax;
    (void)pcbdsn;
    (void)szdescription;
    (void)cbdescriptionmax;
    (void)pcbdescription;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDataSourcesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t fdirection = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szdsn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cchdsnmax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcchdsn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* wszdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchdescriptionmax = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcchdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDataSourcesW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henv, fdirection, szdsn, cchdsnmax, pcchdsn, wszdescription, cchdescriptionmax, pcchdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)fdirection;
    (void)szdsn;
    (void)cchdsnmax;
    (void)pcchdsn;
    (void)wszdescription;
    (void)cchdescriptionmax;
    (void)pcchdescription;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDescribeCol_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t columnnumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* columnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t bufferlength = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* namelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* datatype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* columnsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* decimaldigits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* nullable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDescribeCol")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, columnnumber, columnname, bufferlength, namelength, datatype, columnsize, decimaldigits, nullable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)columnname;
    (void)bufferlength;
    (void)namelength;
    (void)datatype;
    (void)columnsize;
    (void)decimaldigits;
    (void)nullable;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDescribeColA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t icol = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szcolname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cbcolnamemax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbcolname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pfsqltype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbcoldef = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pibscale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pfnullable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDescribeColA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, icol, szcolname, cbcolnamemax, pcbcolname, pfsqltype, pcbcoldef, pibscale, pfnullable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)icol;
    (void)szcolname;
    (void)cbcolnamemax;
    (void)pcbcolname;
    (void)pfsqltype;
    (void)pcbcoldef;
    (void)pibscale;
    (void)pfnullable;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDescribeColW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t icol = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szcolname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cchcolnamemax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcchcolname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pfsqltype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pcbcoldef = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pibscale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pfnullable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDescribeColW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, icol, szcolname, cchcolnamemax, pcchcolname, pfsqltype, pcbcoldef, pibscale, pfnullable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)icol;
    (void)szcolname;
    (void)cchcolnamemax;
    (void)pcchcolname;
    (void)pfsqltype;
    (void)pcbcoldef;
    (void)pibscale;
    (void)pfnullable;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDescribeParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t ipar = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfsqltype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbparamdef = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pibscale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pfnullable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDescribeParam")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, ipar, pfsqltype, pcbparamdef, pibscale, pfnullable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)ipar;
    (void)pfsqltype;
    (void)pcbparamdef;
    (void)pibscale;
    (void)pfnullable;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDisconnect")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDriverConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t hwnd = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* szconnstrin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cchconnstrin = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int16_t cchconnstroutmax = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcchconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint16_t fdrivercompletion = static_cast<uint16_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int64_t, void*, int16_t, void*, int16_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDriverConnect")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, hwnd, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout, fdrivercompletion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    (void)fdrivercompletion;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDriverConnectA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t hwnd = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* szconnstrin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cbconnstrin = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int16_t cbconnstroutmax = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint16_t fdrivercompletion = static_cast<uint16_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int64_t, void*, int16_t, void*, int16_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDriverConnectA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, hwnd, szconnstrin, cbconnstrin, szconnstrout, cbconnstroutmax, pcbconnstrout, fdrivercompletion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cbconnstrin;
    (void)szconnstrout;
    (void)cbconnstroutmax;
    (void)pcbconnstrout;
    (void)fdrivercompletion;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDriverConnectW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t hwnd = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    void* szconnstrin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cchconnstrin = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int16_t cchconnstroutmax = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcchconnstrout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint16_t fdrivercompletion = static_cast<uint16_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int64_t, void*, int16_t, void*, int16_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDriverConnectW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, hwnd, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout, fdrivercompletion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    (void)fdrivercompletion;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDrivers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t fdirection = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szdriverdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cchdriverdescmax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcchdriverdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szdriverattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchdrvrattrmax = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcchdrvrattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDrivers")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henv, fdirection, szdriverdesc, cchdriverdescmax, pcchdriverdesc, szdriverattributes, cchdrvrattrmax, pcchdrvrattr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cchdriverdescmax;
    (void)pcchdriverdesc;
    (void)szdriverattributes;
    (void)cchdrvrattrmax;
    (void)pcchdrvrattr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDriversA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t fdirection = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szdriverdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cbdriverdescmax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbdriverdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szdriverattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbdrvrattrmax = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcbdrvrattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDriversA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henv, fdirection, szdriverdesc, cbdriverdescmax, pcbdriverdesc, szdriverattributes, cbdrvrattrmax, pcbdrvrattr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cbdriverdescmax;
    (void)pcbdriverdesc;
    (void)szdriverattributes;
    (void)cbdrvrattrmax;
    (void)pcbdrvrattr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLDriversW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t fdirection = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szdriverdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cchdriverdescmax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcchdriverdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szdriverattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchdrvrattrmax = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcchdrvrattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDriversW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henv, fdirection, szdriverdesc, cchdriverdescmax, pcchdriverdesc, szdriverattributes, cchdrvrattrmax, pcchdrvrattr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cchdriverdescmax;
    (void)pcchdriverdesc;
    (void)szdriverattributes;
    (void)cchdrvrattrmax;
    (void)pcchdrvrattr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLEndTran_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t handletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t completiontype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLEndTran")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handletype, handle, completiontype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handletype;
    (void)handle;
    (void)completiontype;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sqlstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* nativeerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* messagetext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t bufferlength = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* textlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLError")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(environmenthandle, connectionhandle, statementhandle, sqlstate, nativeerror, messagetext, bufferlength, textlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)environmenthandle;
    (void)connectionhandle;
    (void)statementhandle;
    (void)sqlstate;
    (void)nativeerror;
    (void)messagetext;
    (void)bufferlength;
    (void)textlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLErrorA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szsqlstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pfnativeerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szerrormsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cberrormsgmax = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcberrormsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLErrorA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henv, hdbc, hstmt, szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax, pcberrormsg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)hdbc;
    (void)hstmt;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)cberrormsgmax;
    (void)pcberrormsg;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLErrorW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* wszsqlstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pfnativeerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* wszerrormsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t ccherrormsgmax = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pccherrormsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLErrorW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henv, hdbc, hstmt, wszsqlstate, pfnativeerror, wszerrormsg, ccherrormsgmax, pccherrormsg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)hdbc;
    (void)hstmt;
    (void)wszsqlstate;
    (void)pfnativeerror;
    (void)wszerrormsg;
    (void)ccherrormsgmax;
    (void)pccherrormsg;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLExecDirect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* statementtext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t textlength = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLExecDirect")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, statementtext, textlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)statementtext;
    (void)textlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLExecDirectA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cbsqlstr = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLExecDirectA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szsqlstr, cbsqlstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cbsqlstr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLExecDirectW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t textlength = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLExecDirectW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szsqlstr, textlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)textlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLExecute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLExecute")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLExtendedFetch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t ffetchtype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t irow = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* pcrow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* rgfrowstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLExtendedFetch")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, ffetchtype, irow, pcrow, rgfrowstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)ffetchtype;
    (void)irow;
    (void)pcrow;
    (void)rgfrowstatus;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLFetch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLFetch")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLFetchScroll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t fetchorientation = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t fetchoffset = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLFetchScroll")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, fetchorientation, fetchoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)fetchorientation;
    (void)fetchoffset;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLForeignKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szpkcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchpkcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szpkschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchpkschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szpktablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchpktablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szfkcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cchfkcatalogname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* szfkschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    int16_t cchfkschemaname = static_cast<int16_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* szfktablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    int16_t cchfktablename = static_cast<int16_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLForeignKeys")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szpkcatalogname, cchpkcatalogname, szpkschemaname, cchpkschemaname, szpktablename, cchpktablename, szfkcatalogname, cchfkcatalogname, szfkschemaname, cchfkschemaname, szfktablename, cchfktablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szpkcatalogname;
    (void)cchpkcatalogname;
    (void)szpkschemaname;
    (void)cchpkschemaname;
    (void)szpktablename;
    (void)cchpktablename;
    (void)szfkcatalogname;
    (void)cchfkcatalogname;
    (void)szfkschemaname;
    (void)cchfkschemaname;
    (void)szfktablename;
    (void)cchfktablename;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLForeignKeysA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szpkcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbpkcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szpkschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbpkschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szpktablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbpktablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szfkcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cbfkcatalogname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* szfkschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    int16_t cbfkschemaname = static_cast<int16_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* szfktablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    int16_t cbfktablename = static_cast<int16_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLForeignKeysA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szpkcatalogname, cbpkcatalogname, szpkschemaname, cbpkschemaname, szpktablename, cbpktablename, szfkcatalogname, cbfkcatalogname, szfkschemaname, cbfkschemaname, szfktablename, cbfktablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szpkcatalogname;
    (void)cbpkcatalogname;
    (void)szpkschemaname;
    (void)cbpkschemaname;
    (void)szpktablename;
    (void)cbpktablename;
    (void)szfkcatalogname;
    (void)cbfkcatalogname;
    (void)szfkschemaname;
    (void)cbfkschemaname;
    (void)szfktablename;
    (void)cbfktablename;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLForeignKeysW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szpkcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchpkcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szpkschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchpkschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szpktablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchpktablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szfkcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cchfkcatalogname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* szfkschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    int16_t cchfkschemaname = static_cast<int16_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* szfktablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    int16_t cchfktablename = static_cast<int16_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLForeignKeysW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szpkcatalogname, cchpkcatalogname, szpkschemaname, cchpkschemaname, szpktablename, cchpktablename, szfkcatalogname, cchfkcatalogname, szfkschemaname, cchfkschemaname, szfktablename, cchfktablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szpkcatalogname;
    (void)cchpkcatalogname;
    (void)szpkschemaname;
    (void)cchpkschemaname;
    (void)szpktablename;
    (void)cchpktablename;
    (void)szfkcatalogname;
    (void)cchfkcatalogname;
    (void)szfkschemaname;
    (void)cchfkschemaname;
    (void)szfktablename;
    (void)cchfktablename;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLFreeConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLFreeConnect")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLFreeEnv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLFreeEnv")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(environmenthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)environmenthandle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLFreeHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t handletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLFreeHandle")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handletype, handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handletype;
    (void)handle;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLFreeStmt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t option = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLFreeStmt")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, option);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)option;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetConnectAttr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t bufferlength = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* stringlengthptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetConnectAttr")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle, attribute, value, bufferlength, stringlengthptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlengthptr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetConnectAttrA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fattribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cbvaluemax = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetConnectAttrA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, fattribute, rgbvalue, cbvaluemax, pcbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetConnectAttrW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fattribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cbvaluemax = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetConnectAttrW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, fattribute, rgbvalue, cbvaluemax, pcbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetConnectOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t option = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetConnectOption")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle, option, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetConnectOptionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t foption = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetConnectOptionA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, foption, pvparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)foption;
    (void)pvparam;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetConnectOptionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t foption = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetConnectOptionW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, foption, pvparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)foption;
    (void)pvparam;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetCursorName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cursorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t bufferlength = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* namelengthptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetCursorName")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, cursorname, bufferlength, namelengthptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)cursorname;
    (void)bufferlength;
    (void)namelengthptr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetCursorNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcursor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcursormax = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbcursor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetCursorNameA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcursor, cbcursormax, pcbcursor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcursor;
    (void)cbcursormax;
    (void)pcbcursor;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetCursorNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcursor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcursormax = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcchcursor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetCursorNameW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcursor, cchcursormax, pcchcursor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcursor;
    (void)cchcursormax;
    (void)pcchcursor;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t columnnumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t targettype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* targetvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t bufferlength = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* strlenOrIndptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetData")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, columnnumber, targettype, targetvalue, bufferlength, strlenOrIndptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)targettype;
    (void)targetvalue;
    (void)bufferlength;
    (void)strlenOrIndptr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDescField_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* descriptorhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t recnumber = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t fieldidentifier = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t bufferlength = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* stringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDescField")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(descriptorhandle, recnumber, fieldidentifier, value, bufferlength, stringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDescFieldA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t irecord = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t ifield = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t cbbufferlength = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* stringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDescFieldA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdesc, irecord, ifield, rgbvalue, cbbufferlength, stringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesc;
    (void)irecord;
    (void)ifield;
    (void)rgbvalue;
    (void)cbbufferlength;
    (void)stringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDescFieldW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t irecord = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t ifield = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t cbbufferlength = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* stringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDescFieldW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdesc, irecord, ifield, rgbvalue, cbbufferlength, stringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesc;
    (void)irecord;
    (void)ifield;
    (void)rgbvalue;
    (void)cbbufferlength;
    (void)stringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDescRec_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* descriptorhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t recnumber = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t bufferlength = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* stringlengthptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* typeptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* subtypeptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* lengthptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* precisionptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* scaleptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* nullableptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, void*, int16_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDescRec")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(descriptorhandle, recnumber, name, bufferlength, stringlengthptr, typeptr, subtypeptr, lengthptr, precisionptr, scaleptr, nullableptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)name;
    (void)bufferlength;
    (void)stringlengthptr;
    (void)typeptr;
    (void)subtypeptr;
    (void)lengthptr;
    (void)precisionptr;
    (void)scaleptr;
    (void)nullableptr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDescRecA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t irecord = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cbnamemax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pftype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfsubtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* plength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pprecision = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pscale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pnullable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, void*, int16_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDescRecA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdesc, irecord, szname, cbnamemax, pcbname, pftype, pfsubtype, plength, pprecision, pscale, pnullable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesc;
    (void)irecord;
    (void)szname;
    (void)cbnamemax;
    (void)pcbname;
    (void)pftype;
    (void)pfsubtype;
    (void)plength;
    (void)pprecision;
    (void)pscale;
    (void)pnullable;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDescRecW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdesc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t irecord = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cchnamemax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pftype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfsubtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* plength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pprecision = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pscale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pnullable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, void*, int16_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDescRecW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdesc, irecord, szname, cchnamemax, pcchname, pftype, pfsubtype, plength, pprecision, pscale, pnullable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesc;
    (void)irecord;
    (void)szname;
    (void)cchnamemax;
    (void)pcchname;
    (void)pftype;
    (void)pfsubtype;
    (void)plength;
    (void)pprecision;
    (void)pscale;
    (void)pnullable;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDiagField_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t handletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t recnumber = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t diagidentifier = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* diaginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int16_t bufferlength = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* stringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDiagField")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handletype, handle, recnumber, diagidentifier, diaginfo, bufferlength, stringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handletype;
    (void)handle;
    (void)recnumber;
    (void)diagidentifier;
    (void)diaginfo;
    (void)bufferlength;
    (void)stringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDiagFieldA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t fhandletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t irecord = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t fdiagfield = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* rgbdiaginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int16_t cbdiaginfomax = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbdiaginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDiagFieldA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fhandletype, handle, irecord, fdiagfield, rgbdiaginfo, cbdiaginfomax, pcbdiaginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)fdiagfield;
    (void)rgbdiaginfo;
    (void)cbdiaginfomax;
    (void)pcbdiaginfo;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDiagFieldW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t fhandletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t irecord = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t fdiagfield = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* rgbdiaginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int16_t cbbufferlength = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbstringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDiagFieldW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fhandletype, handle, irecord, fdiagfield, rgbdiaginfo, cbbufferlength, pcbstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)fdiagfield;
    (void)rgbdiaginfo;
    (void)cbbufferlength;
    (void)pcbstringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDiagRec_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t handletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t recnumber = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sqlstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* nativeerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* messagetext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t bufferlength = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* textlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDiagRec")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handletype, handle, recnumber, sqlstate, nativeerror, messagetext, bufferlength, textlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handletype;
    (void)handle;
    (void)recnumber;
    (void)sqlstate;
    (void)nativeerror;
    (void)messagetext;
    (void)bufferlength;
    (void)textlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDiagRecA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t fhandletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t irecord = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szsqlstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pfnativeerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szerrormsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cberrormsgmax = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcberrormsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDiagRecA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fhandletype, handle, irecord, szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax, pcberrormsg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)cberrormsgmax;
    (void)pcberrormsg;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetDiagRecW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t fhandletype = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t irecord = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szsqlstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pfnativeerror = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* szerrormsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t ccherrormsgmax = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pccherrormsg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetDiagRecW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fhandletype, handle, irecord, szsqlstate, pfnativeerror, szerrormsg, ccherrormsgmax, pccherrormsg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)ccherrormsgmax;
    (void)pccherrormsg;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetEnvAttr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t bufferlength = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* stringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetEnvAttr")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(environmenthandle, attribute, value, bufferlength, stringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)environmenthandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetFunctions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t functionid = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* supported = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetFunctions")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle, functionid, supported);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    (void)functionid;
    (void)supported;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t infotype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* infovalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t bufferlength = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* stringlengthptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetInfo")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle, infotype, infovalue, bufferlength, stringlengthptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    (void)infotype;
    (void)infovalue;
    (void)bufferlength;
    (void)stringlengthptr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t finfotype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgbinfovalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cbinfovaluemax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbinfovalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetInfoA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, finfotype, rgbinfovalue, cbinfovaluemax, pcbinfovalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)finfotype;
    (void)rgbinfovalue;
    (void)cbinfovaluemax;
    (void)pcbinfovalue;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t finfotype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgbinfovalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cbinfovaluemax = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbinfovalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetInfoW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, finfotype, rgbinfovalue, cbinfovaluemax, pcbinfovalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)finfotype;
    (void)rgbinfovalue;
    (void)cbinfovaluemax;
    (void)pcbinfovalue;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetNextEnumeration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prgenumdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pienumlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetNextEnumeration")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(henumhandle, prgenumdata, pienumlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henumhandle;
    (void)prgenumdata;
    (void)pienumlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetStmtAttr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t bufferlength = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* stringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetStmtAttr")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, attribute, value, bufferlength, stringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetStmtAttrA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fattribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cbvaluemax = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetStmtAttrA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, fattribute, rgbvalue, cbvaluemax, pcbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetStmtAttrW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fattribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cbvaluemax = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetStmtAttrW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, fattribute, rgbvalue, cbvaluemax, pcbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetStmtOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t option = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetStmtOption")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, option, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetTypeInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t datatype = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetTypeInfo")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, datatype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)datatype;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetTypeInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t datatype = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetTypeInfoA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, datatype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)datatype;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLGetTypeInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t datatype = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetTypeInfoW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, datatype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)datatype;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLInitEnumServers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwchservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwchinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLInitEnumServers")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pwchservername, pwchinstancename);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)pwchservername;
    (void)pwchinstancename;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t param2 = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLLinkedCatalogsA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t param2 = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLLinkedCatalogsW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLLinkedServers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLLinkedServers")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLMoreResults_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLMoreResults")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLNativeSql_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szsqlstrin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cchsqlstrin = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t cchsqlstrmax = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLNativeSql")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, szsqlstrin, cchsqlstrin, szsqlstr, cchsqlstrmax, pcbsqlstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cchsqlstrin;
    (void)szsqlstr;
    (void)cchsqlstrmax;
    (void)pcbsqlstr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLNativeSqlA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szsqlstrin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cbsqlstrin = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t cbsqlstrmax = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLNativeSqlA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, szsqlstrin, cbsqlstrin, szsqlstr, cbsqlstrmax, pcbsqlstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cbsqlstrin;
    (void)szsqlstr;
    (void)cbsqlstrmax;
    (void)pcbsqlstr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLNativeSqlW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szsqlstrin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cchsqlstrin = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t cchsqlstrmax = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcchsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLNativeSqlW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, szsqlstrin, cchsqlstrin, szsqlstr, cchsqlstrmax, pcchsqlstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cchsqlstrin;
    (void)szsqlstr;
    (void)cchsqlstrmax;
    (void)pcchsqlstr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLNumParams_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcpar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLNumParams")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, pcpar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)pcpar;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLNumResultCols_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* columncount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLNumResultCols")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, columncount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)columncount;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLParamData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLParamData")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)value;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLParamOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t crow = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pirow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLParamOptions")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, crow, pirow);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)crow;
    (void)pirow;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLPrepare_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* statementtext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t textlength = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLPrepare")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, statementtext, textlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)statementtext;
    (void)textlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLPrepareA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cbsqlstr = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLPrepareA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szsqlstr, cbsqlstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cbsqlstr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLPrepareW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szsqlstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cchsqlstr = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLPrepareW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szsqlstr, cchsqlstr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cchsqlstr;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLPrimaryKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLPrimaryKeys")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLPrimaryKeysA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLPrimaryKeysA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLPrimaryKeysW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLPrimaryKeysW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLProcedureColumns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szprocname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchprocname = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cchcolumnname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLProcedureColumns")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname, szcolumnname, cchcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    (void)szcolumnname;
    (void)cchcolumnname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLProcedureColumnsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szprocname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbprocname = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cbcolumnname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLProcedureColumnsA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, szprocname, cbprocname, szcolumnname, cbcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)szprocname;
    (void)cbprocname;
    (void)szcolumnname;
    (void)cbcolumnname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLProcedureColumnsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szprocname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchprocname = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cchcolumnname = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLProcedureColumnsW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname, szcolumnname, cchcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    (void)szcolumnname;
    (void)cchcolumnname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLProcedures_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szprocname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchprocname = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLProcedures")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLProceduresA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szprocname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbprocname = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLProceduresA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, szprocname, cbprocname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)szprocname;
    (void)cbprocname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLProceduresW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* szprocname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchprocname = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLProceduresW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLPutData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t strlenOrInd = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLPutData")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, data, strlenOrInd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)data;
    (void)strlenOrInd;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLRowCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rowcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLRowCount")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, rowcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)rowcount;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetConnectAttr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t stringlength = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetConnectAttr")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle, attribute, value, stringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetConnectAttrA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fattribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cbvalue = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetConnectAttrA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, fattribute, rgbvalue, cbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvalue;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetConnectAttrW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fattribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cbvalue = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetConnectAttrW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, fattribute, rgbvalue, cbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvalue;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetConnectOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t option = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t value = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetConnectOption")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(connectionhandle, option, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)connectionhandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetConnectOptionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t foption = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t vparam = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetConnectOptionA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, foption, vparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)foption;
    (void)vparam;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetConnectOptionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t foption = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t vparam = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetConnectOptionW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdbc, foption, vparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdbc;
    (void)foption;
    (void)vparam;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetCursorName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cursorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t namelength = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetCursorName")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, cursorname, namelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)cursorname;
    (void)namelength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetCursorNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcursor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcursor = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetCursorNameA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcursor, cbcursor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcursor;
    (void)cbcursor;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetCursorNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcursor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcursor = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetCursorNameW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcursor, cchcursor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcursor;
    (void)cchcursor;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetDescField_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* descriptorhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t recnumber = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t fieldidentifier = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t bufferlength = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetDescField")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(descriptorhandle, recnumber, fieldidentifier, value, bufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetDescFieldW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* descriptorhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t recnumber = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t fieldidentifier = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t bufferlength = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetDescFieldW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(descriptorhandle, recnumber, fieldidentifier, value, bufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetDescRec_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* descriptorhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int16_t recnumber = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t type = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t subtype = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t length = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    int16_t precision = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int16_t scale = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* stringlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* indicator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, int16_t, int64_t, int16_t, int16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetDescRec")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(descriptorhandle, recnumber, type, subtype, length, precision, scale, data, stringlength, indicator);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)type;
    (void)subtype;
    (void)length;
    (void)precision;
    (void)scale;
    (void)data;
    (void)stringlength;
    (void)indicator;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetEnvAttr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t stringlength = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetEnvAttr")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(environmenthandle, attribute, value, stringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)environmenthandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t parameternumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t valuetype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t parametertype = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint64_t lengthprecision = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    int16_t parameterscale = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* parametervalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* strlenOrInd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, uint64_t, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetParam")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue, strlenOrInd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)parameternumber;
    (void)valuetype;
    (void)parametertype;
    (void)lengthprecision;
    (void)parameterscale;
    (void)parametervalue;
    (void)strlenOrInd;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetPos_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t irow = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint16_t foption = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t flock = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint64_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetPos")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, irow, foption, flock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)irow;
    (void)foption;
    (void)flock;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetScrollOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t fconcurrency = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t crowkeyset = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint16_t crowrowset = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int64_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetScrollOptions")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, fconcurrency, crowkeyset, crowrowset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)fconcurrency;
    (void)crowkeyset;
    (void)crowrowset;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetStmtAttr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t stringlength = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetStmtAttr")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, attribute, value, stringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetStmtAttrW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fattribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgbvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cbvaluemax = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetStmtAttrW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, fattribute, rgbvalue, cbvaluemax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSetStmtOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t option = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint64_t value = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetStmtOption")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, option, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSpecialColumns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t identifiertype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* catalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t namelength1 = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* schemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int16_t namelength2 = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* tablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int16_t namelength3 = static_cast<int16_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint16_t scope = static_cast<uint16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint16_t nullable = static_cast<uint16_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSpecialColumns")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, identifiertype, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, scope, nullable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)identifiertype;
    (void)catalogname;
    (void)namelength1;
    (void)schemaname;
    (void)namelength2;
    (void)tablename;
    (void)namelength3;
    (void)scope;
    (void)nullable;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSpecialColumnsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t fcoltype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cbcatalogname = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int16_t cbschemaname = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int16_t cbtablename = static_cast<int16_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint16_t fscope = static_cast<uint16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint16_t fnullable = static_cast<uint16_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSpecialColumnsA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, fcoltype, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, fscope, fnullable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)fcoltype;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)fscope;
    (void)fnullable;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLSpecialColumnsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t fcoltype = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint16_t fscope = static_cast<uint16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint16_t fnullable = static_cast<uint16_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSpecialColumnsW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, fcoltype, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, fscope, fnullable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)fcoltype;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)fscope;
    (void)fnullable;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* catalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t namelength1 = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* schemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t namelength2 = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* tablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t namelength3 = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint16_t unique = static_cast<uint16_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint16_t reserved = static_cast<uint16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLStatistics")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, unique, reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)catalogname;
    (void)namelength1;
    (void)schemaname;
    (void)namelength2;
    (void)tablename;
    (void)namelength3;
    (void)unique;
    (void)reserved;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLStatisticsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint16_t funique = static_cast<uint16_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint16_t faccuracy = static_cast<uint16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLStatisticsA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, funique, faccuracy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)funique;
    (void)faccuracy;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLStatisticsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint16_t funique = static_cast<uint16_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint16_t faccuracy = static_cast<uint16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLStatisticsW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, funique, faccuracy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)funique;
    (void)faccuracy;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLTablePrivileges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLTablePrivileges")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLTablePrivilegesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLTablePrivilegesA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLTablePrivilegesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLTablePrivilegesW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLTables_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* catalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t namelength1 = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* schemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t namelength2 = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* tablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t namelength3 = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* tabletype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t namelength4 = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLTables")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, tabletype, namelength4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)statementhandle;
    (void)catalogname;
    (void)namelength1;
    (void)schemaname;
    (void)namelength2;
    (void)tablename;
    (void)namelength3;
    (void)tabletype;
    (void)namelength4;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLTablesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cbcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cbschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cbtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* sztabletype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cbtabletype = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLTablesA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, sztabletype, cbtabletype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)sztabletype;
    (void)cbtabletype;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLTablesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szcatalogname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int16_t cchcatalogname = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szschemaname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int16_t cchschemaname = static_cast<int16_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int16_t cchtablename = static_cast<int16_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* sztabletype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int16_t cchtabletype = static_cast<int16_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLTablesW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, sztabletype, cchtabletype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)sztabletype;
    (void)cchtabletype;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchSQLTransact_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t completiontype = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLTransact")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(environmenthandle, connectionhandle, completiontype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)environmenthandle;
    (void)connectionhandle;
    (void)completiontype;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpBatch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_batch")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpBind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t param3 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t param5 = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t param6 = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t param7 = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_bind")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpColfmt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t param2 = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t param3 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t param4 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t param6 = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t param7 = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, uint8_t, int32_t, int32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_colfmt")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpCollen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_collen")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpColptr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_colptr")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpColumns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_columns")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_control")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpDone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_done")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpExec_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_exec")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpGetcolfmt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t param4 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* param5 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_getcolfmt")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpInitA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t param4 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_initA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpInitW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t param4 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_initW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpMoretext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_moretext")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpReadfmtA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_readfmtA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpReadfmtW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_readfmtW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpSendrow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_sendrow")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpSetcolfmt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t param4 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_setcolfmt")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpWritefmtA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_writefmtA")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchBcpWritefmtW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_writefmtW")));
    }
    int16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemSearchDbprtypeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t param0 = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "dbprtypeA")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)param0;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemSearchDbprtypeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t param0 = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "dbprtypeW")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)param0;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static void register_windows_win32_system_search_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32SystemSearchODBCGetTryWaitValue", Napi::Function::New(env, windowssysWindowsWin32SystemSearchODBCGetTryWaitValue_napi));
    exports.Set("windowssysWindowsWin32SystemSearchODBCSetTryWaitValue", Napi::Function::New(env, windowssysWindowsWin32SystemSearchODBCSetTryWaitValue_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLAllocConnect", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLAllocConnect_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLAllocEnv", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLAllocEnv_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLAllocHandle", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLAllocHandle_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLAllocHandleStd", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLAllocHandleStd_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLAllocStmt", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLAllocStmt_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLBindCol", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLBindCol_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLBindParam", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLBindParam_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLBindParameter", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLBindParameter_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLBrowseConnect", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLBrowseConnect_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLBrowseConnectA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLBrowseConnectA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLBrowseConnectW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLBrowseConnectW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLBulkOperations", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLBulkOperations_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLCancel", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLCancel_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLCancelHandle", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLCancelHandle_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLCloseCursor", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLCloseCursor_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLCloseEnumServers", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLCloseEnumServers_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColAttribute", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColAttribute_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColAttributeA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColAttributeA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColAttributeW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColAttributeW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColAttributes", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColAttributes_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColAttributesA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColAttributesA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColAttributesW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColAttributesW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColumnPrivileges", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColumnPrivileges_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColumns", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColumns_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColumnsA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColumnsA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLColumnsW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLColumnsW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLCompleteAsync", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLCompleteAsync_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLConnect", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLConnect_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLConnectA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLConnectA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLConnectW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLConnectW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLCopyDesc", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLCopyDesc_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDataSources", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDataSources_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDataSourcesA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDataSourcesA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDataSourcesW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDataSourcesW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDescribeCol", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDescribeCol_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDescribeColA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDescribeColA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDescribeColW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDescribeColW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDescribeParam", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDescribeParam_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDisconnect", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDisconnect_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDriverConnect", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDriverConnect_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDriverConnectA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDriverConnectA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDriverConnectW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDriverConnectW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDrivers", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDrivers_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDriversA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDriversA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLDriversW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLDriversW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLEndTran", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLEndTran_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLError", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLError_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLErrorA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLErrorA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLErrorW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLErrorW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLExecDirect", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLExecDirect_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLExecDirectA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLExecDirectA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLExecDirectW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLExecDirectW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLExecute", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLExecute_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLExtendedFetch", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLExtendedFetch_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLFetch", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLFetch_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLFetchScroll", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLFetchScroll_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLForeignKeys", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLForeignKeys_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLForeignKeysA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLForeignKeysA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLForeignKeysW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLForeignKeysW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLFreeConnect", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLFreeConnect_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLFreeEnv", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLFreeEnv_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLFreeHandle", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLFreeHandle_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLFreeStmt", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLFreeStmt_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetConnectAttr", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetConnectAttr_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetConnectAttrA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetConnectAttrA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetConnectAttrW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetConnectAttrW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetConnectOption", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetConnectOption_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetConnectOptionA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetConnectOptionA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetConnectOptionW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetConnectOptionW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetCursorName", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetCursorName_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetCursorNameA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetCursorNameA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetCursorNameW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetCursorNameW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetData", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetData_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDescField", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDescField_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDescFieldA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDescFieldA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDescFieldW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDescFieldW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDescRec", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDescRec_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDescRecA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDescRecA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDescRecW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDescRecW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDiagField", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDiagField_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDiagFieldA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDiagFieldA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDiagFieldW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDiagFieldW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDiagRec", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDiagRec_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDiagRecA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDiagRecA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetDiagRecW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetDiagRecW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetEnvAttr", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetEnvAttr_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetFunctions", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetFunctions_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetInfo", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetInfo_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetInfoA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetInfoA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetInfoW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetInfoW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetNextEnumeration", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetNextEnumeration_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetStmtAttr", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetStmtAttr_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetStmtAttrA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetStmtAttrA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetStmtAttrW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetStmtAttrW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetStmtOption", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetStmtOption_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetTypeInfo", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetTypeInfo_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetTypeInfoA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetTypeInfoA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLGetTypeInfoW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLGetTypeInfoW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLInitEnumServers", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLInitEnumServers_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLLinkedServers", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLLinkedServers_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLMoreResults", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLMoreResults_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLNativeSql", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLNativeSql_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLNativeSqlA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLNativeSqlA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLNativeSqlW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLNativeSqlW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLNumParams", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLNumParams_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLNumResultCols", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLNumResultCols_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLParamData", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLParamData_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLParamOptions", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLParamOptions_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLPrepare", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLPrepare_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLPrepareA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLPrepareA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLPrepareW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLPrepareW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLPrimaryKeys", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLPrimaryKeys_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLPrimaryKeysA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLPrimaryKeysA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLPrimaryKeysW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLPrimaryKeysW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLProcedureColumns", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLProcedureColumns_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLProcedureColumnsA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLProcedureColumnsA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLProcedureColumnsW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLProcedureColumnsW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLProcedures", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLProcedures_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLProceduresA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLProceduresA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLProceduresW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLProceduresW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLPutData", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLPutData_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLRowCount", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLRowCount_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetConnectAttr", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetConnectAttr_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetConnectAttrA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetConnectAttrA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetConnectAttrW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetConnectAttrW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetConnectOption", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetConnectOption_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetConnectOptionA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetConnectOptionA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetConnectOptionW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetConnectOptionW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetCursorName", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetCursorName_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetCursorNameA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetCursorNameA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetCursorNameW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetCursorNameW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetDescField", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetDescField_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetDescFieldW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetDescFieldW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetDescRec", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetDescRec_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetEnvAttr", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetEnvAttr_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetParam", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetParam_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetPos", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetPos_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetScrollOptions", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetScrollOptions_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetStmtAttr", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetStmtAttr_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetStmtAttrW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetStmtAttrW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSetStmtOption", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSetStmtOption_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSpecialColumns", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSpecialColumns_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSpecialColumnsA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSpecialColumnsA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLSpecialColumnsW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLSpecialColumnsW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLStatistics", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLStatistics_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLStatisticsA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLStatisticsA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLStatisticsW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLStatisticsW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLTablePrivileges", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLTablePrivileges_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLTablePrivilegesA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLTablePrivilegesA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLTablePrivilegesW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLTablePrivilegesW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLTables", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLTables_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLTablesA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLTablesA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLTablesW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLTablesW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchSQLTransact", Napi::Function::New(env, windowssysWindowsWin32SystemSearchSQLTransact_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpBatch", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpBatch_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpBind", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpBind_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpColfmt", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpColfmt_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpCollen", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpCollen_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpColptr", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpColptr_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpColumns", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpColumns_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpControl", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpControl_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpDone", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpDone_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpExec", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpExec_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpGetcolfmt", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpGetcolfmt_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpInitA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpInitA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpInitW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpInitW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpMoretext", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpMoretext_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpReadfmtA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpReadfmtA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpReadfmtW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpReadfmtW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpSendrow", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpSendrow_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpSetcolfmt", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpSetcolfmt_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpWritefmtA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpWritefmtA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchBcpWritefmtW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchBcpWritefmtW_napi));
    exports.Set("windowssysWindowsWin32SystemSearchDbprtypeA", Napi::Function::New(env, windowssysWindowsWin32SystemSearchDbprtypeA_napi));
    exports.Set("windowssysWindowsWin32SystemSearchDbprtypeW", Napi::Function::New(env, windowssysWindowsWin32SystemSearchDbprtypeW_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_search_napi, nullptr };
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
