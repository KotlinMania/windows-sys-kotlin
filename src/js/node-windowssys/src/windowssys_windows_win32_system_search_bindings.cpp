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

static Napi::Value windowssys_windows_win32_system_search_ODBCGetTryWaitValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ODBCGetTryWaitValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_ODBCSetTryWaitValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwvalue = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ODBCSetTryWaitValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwvalue) : -1;
#else
    (void)dwvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLAllocConnect_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(environmenthandle, connectionhandle) : -1;
#else
    (void)environmenthandle;
    (void)connectionhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLAllocEnv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLAllocEnv")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(environmenthandle) : -1;
#else
    (void)environmenthandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLAllocHandle_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handletype, inputhandle, outputhandle) : -1;
#else
    (void)handletype;
    (void)inputhandle;
    (void)outputhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLAllocHandleStd_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fhandletype, hinput, phoutput) : -1;
#else
    (void)fhandletype;
    (void)hinput;
    (void)phoutput;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLAllocStmt_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle, statementhandle) : -1;
#else
    (void)connectionhandle;
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLBindCol_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t columnnumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t targettype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* targetvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t bufferlength = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* strlen_or_ind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLBindCol")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, columnnumber, targettype, targetvalue, bufferlength, strlen_or_ind) : -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)targettype;
    (void)targetvalue;
    (void)bufferlength;
    (void)strlen_or_ind;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLBindParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t parameternumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t valuetype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t parametertype = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint64_t lengthprecision = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    int16_t parameterscale = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* parametervalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* strlen_or_ind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, uint64_t, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLBindParam")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue, strlen_or_ind) : -1;
#else
    (void)statementhandle;
    (void)parameternumber;
    (void)valuetype;
    (void)parametertype;
    (void)lengthprecision;
    (void)parameterscale;
    (void)parametervalue;
    (void)strlen_or_ind;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLBindParameter_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, ipar, fparamtype, fctype, fsqltype, cbcoldef, ibscale, rgbvalue, cbvaluemax, pcbvalue) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLBrowseConnect_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout) : -1;
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLBrowseConnectA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, szconnstrin, cbconnstrin, szconnstrout, cbconnstroutmax, pcbconnstrout) : -1;
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cbconnstrin;
    (void)szconnstrout;
    (void)cbconnstroutmax;
    (void)pcbconnstrout;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLBrowseConnectW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout) : -1;
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLBulkOperations_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, operation) : -1;
#else
    (void)statementhandle;
    (void)operation;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLCancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLCancel")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle) : -1;
#else
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLCancelHandle_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handletype, inputhandle) : -1;
#else
    (void)handletype;
    (void)inputhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLCloseCursor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLCloseCursor")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle) : -1;
#else
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLCloseEnumServers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* henumhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLCloseEnumServers")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henumhandle) : -1;
#else
    (void)henumhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColAttribute_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, columnnumber, fieldidentifier, characterattribute, bufferlength, stringlength, numericattribute) : -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)fieldidentifier;
    (void)characterattribute;
    (void)bufferlength;
    (void)stringlength;
    (void)numericattribute;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColAttributeA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, icol, ifield, pcharattr, cbcharattrmax, pcbcharattr, pnumattr) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)ifield;
    (void)pcharattr;
    (void)cbcharattrmax;
    (void)pcbcharattr;
    (void)pnumattr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColAttributeW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, icol, ifield, pcharattr, cbdescmax, pcbcharattr, pnumattr) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)ifield;
    (void)pcharattr;
    (void)cbdescmax;
    (void)pcbcharattr;
    (void)pnumattr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColAttributes_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, icol, fdesctype, rgbdesc, cbdescmax, pcbdesc, pfdesc) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColAttributesA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, icol, fdesctype, rgbdesc, cbdescmax, pcbdesc, pfdesc) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColAttributesW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, icol, fdesctype, rgbdesc, cbdescmax, pcbdesc, pfdesc) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColumnPrivileges_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColumnPrivilegesA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, szcolumnname, cbcolumnname) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColumnPrivilegesW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColumns_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, columnname, namelength4) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColumnsA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, szcolumnname, cbcolumnname) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLColumnsW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLCompleteAsync_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handletype, handle, asyncretcodeptr) : -1;
#else
    (void)handletype;
    (void)handle;
    (void)asyncretcodeptr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLConnect_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle, servername, namelength1, username, namelength2, authentication, namelength3) : -1;
#else
    (void)connectionhandle;
    (void)servername;
    (void)namelength1;
    (void)username;
    (void)namelength2;
    (void)authentication;
    (void)namelength3;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLConnectA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, szdsn, cbdsn, szuid, cbuid, szauthstr, cbauthstr) : -1;
#else
    (void)hdbc;
    (void)szdsn;
    (void)cbdsn;
    (void)szuid;
    (void)cbuid;
    (void)szauthstr;
    (void)cbauthstr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLConnectW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, szdsn, cchdsn, szuid, cchuid, szauthstr, cchauthstr) : -1;
#else
    (void)hdbc;
    (void)szdsn;
    (void)cchdsn;
    (void)szuid;
    (void)cchuid;
    (void)szauthstr;
    (void)cchauthstr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLCopyDesc_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcedeschandle, targetdeschandle) : -1;
#else
    (void)sourcedeschandle;
    (void)targetdeschandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDataSources_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(environmenthandle, direction, servername, bufferlength1, namelength1ptr, description, bufferlength2, namelength2ptr) : -1;
#else
    (void)environmenthandle;
    (void)direction;
    (void)servername;
    (void)bufferlength1;
    (void)namelength1ptr;
    (void)description;
    (void)bufferlength2;
    (void)namelength2ptr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDataSourcesA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henv, fdirection, szdsn, cbdsnmax, pcbdsn, szdescription, cbdescriptionmax, pcbdescription) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdsn;
    (void)cbdsnmax;
    (void)pcbdsn;
    (void)szdescription;
    (void)cbdescriptionmax;
    (void)pcbdescription;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDataSourcesW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henv, fdirection, szdsn, cchdsnmax, pcchdsn, wszdescription, cchdescriptionmax, pcchdescription) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdsn;
    (void)cchdsnmax;
    (void)pcchdsn;
    (void)wszdescription;
    (void)cchdescriptionmax;
    (void)pcchdescription;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDescribeCol_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, columnnumber, columnname, bufferlength, namelength, datatype, columnsize, decimaldigits, nullable) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDescribeColA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, icol, szcolname, cbcolnamemax, pcbcolname, pfsqltype, pcbcoldef, pibscale, pfnullable) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDescribeColW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, icol, szcolname, cchcolnamemax, pcchcolname, pfsqltype, pcbcoldef, pibscale, pfnullable) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDescribeParam_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, ipar, pfsqltype, pcbparamdef, pibscale, pfnullable) : -1;
#else
    (void)hstmt;
    (void)ipar;
    (void)pfsqltype;
    (void)pcbparamdef;
    (void)pibscale;
    (void)pfnullable;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDisconnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLDisconnect")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle) : -1;
#else
    (void)connectionhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDriverConnect_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, hwnd, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout, fdrivercompletion) : -1;
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    (void)fdrivercompletion;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDriverConnectA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, hwnd, szconnstrin, cbconnstrin, szconnstrout, cbconnstroutmax, pcbconnstrout, fdrivercompletion) : -1;
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cbconnstrin;
    (void)szconnstrout;
    (void)cbconnstroutmax;
    (void)pcbconnstrout;
    (void)fdrivercompletion;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDriverConnectW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, hwnd, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout, fdrivercompletion) : -1;
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    (void)fdrivercompletion;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDrivers_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henv, fdirection, szdriverdesc, cchdriverdescmax, pcchdriverdesc, szdriverattributes, cchdrvrattrmax, pcchdrvrattr) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cchdriverdescmax;
    (void)pcchdriverdesc;
    (void)szdriverattributes;
    (void)cchdrvrattrmax;
    (void)pcchdrvrattr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDriversA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henv, fdirection, szdriverdesc, cbdriverdescmax, pcbdriverdesc, szdriverattributes, cbdrvrattrmax, pcbdrvrattr) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cbdriverdescmax;
    (void)pcbdriverdesc;
    (void)szdriverattributes;
    (void)cbdrvrattrmax;
    (void)pcbdrvrattr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLDriversW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henv, fdirection, szdriverdesc, cchdriverdescmax, pcchdriverdesc, szdriverattributes, cchdrvrattrmax, pcchdrvrattr) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cchdriverdescmax;
    (void)pcchdriverdesc;
    (void)szdriverattributes;
    (void)cchdrvrattrmax;
    (void)pcchdrvrattr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLEndTran_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handletype, handle, completiontype) : -1;
#else
    (void)handletype;
    (void)handle;
    (void)completiontype;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLError_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(environmenthandle, connectionhandle, statementhandle, sqlstate, nativeerror, messagetext, bufferlength, textlength) : -1;
#else
    (void)environmenthandle;
    (void)connectionhandle;
    (void)statementhandle;
    (void)sqlstate;
    (void)nativeerror;
    (void)messagetext;
    (void)bufferlength;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLErrorA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henv, hdbc, hstmt, szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax, pcberrormsg) : -1;
#else
    (void)henv;
    (void)hdbc;
    (void)hstmt;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)cberrormsgmax;
    (void)pcberrormsg;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLErrorW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henv, hdbc, hstmt, wszsqlstate, pfnativeerror, wszerrormsg, ccherrormsgmax, pccherrormsg) : -1;
#else
    (void)henv;
    (void)hdbc;
    (void)hstmt;
    (void)wszsqlstate;
    (void)pfnativeerror;
    (void)wszerrormsg;
    (void)ccherrormsgmax;
    (void)pccherrormsg;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLExecDirect_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, statementtext, textlength) : -1;
#else
    (void)statementhandle;
    (void)statementtext;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLExecDirectA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szsqlstr, cbsqlstr) : -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cbsqlstr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLExecDirectW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szsqlstr, textlength) : -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLExecute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLExecute")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle) : -1;
#else
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLExtendedFetch_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, ffetchtype, irow, pcrow, rgfrowstatus) : -1;
#else
    (void)hstmt;
    (void)ffetchtype;
    (void)irow;
    (void)pcrow;
    (void)rgfrowstatus;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLFetch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLFetch")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle) : -1;
#else
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLFetchScroll_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, fetchorientation, fetchoffset) : -1;
#else
    (void)statementhandle;
    (void)fetchorientation;
    (void)fetchoffset;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLForeignKeys_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szpkcatalogname, cchpkcatalogname, szpkschemaname, cchpkschemaname, szpktablename, cchpktablename, szfkcatalogname, cchfkcatalogname, szfkschemaname, cchfkschemaname, szfktablename, cchfktablename) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLForeignKeysA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szpkcatalogname, cbpkcatalogname, szpkschemaname, cbpkschemaname, szpktablename, cbpktablename, szfkcatalogname, cbfkcatalogname, szfkschemaname, cbfkschemaname, szfktablename, cbfktablename) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLForeignKeysW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szpkcatalogname, cchpkcatalogname, szpkschemaname, cchpkschemaname, szpktablename, cchpktablename, szfkcatalogname, cchfkcatalogname, szfkschemaname, cchfkschemaname, szfktablename, cchfktablename) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLFreeConnect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* connectionhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLFreeConnect")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle) : -1;
#else
    (void)connectionhandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLFreeEnv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* environmenthandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLFreeEnv")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(environmenthandle) : -1;
#else
    (void)environmenthandle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLFreeHandle_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handletype, handle) : -1;
#else
    (void)handletype;
    (void)handle;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLFreeStmt_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, option) : -1;
#else
    (void)statementhandle;
    (void)option;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetConnectAttr_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle, attribute, value, bufferlength, stringlengthptr) : -1;
#else
    (void)connectionhandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlengthptr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetConnectAttrA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, fattribute, rgbvalue, cbvaluemax, pcbvalue) : -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetConnectAttrW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, fattribute, rgbvalue, cbvaluemax, pcbvalue) : -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetConnectOption_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle, option, value) : -1;
#else
    (void)connectionhandle;
    (void)option;
    (void)value;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetConnectOptionA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, foption, pvparam) : -1;
#else
    (void)hdbc;
    (void)foption;
    (void)pvparam;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetConnectOptionW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, foption, pvparam) : -1;
#else
    (void)hdbc;
    (void)foption;
    (void)pvparam;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetCursorName_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, cursorname, bufferlength, namelengthptr) : -1;
#else
    (void)statementhandle;
    (void)cursorname;
    (void)bufferlength;
    (void)namelengthptr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetCursorNameA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcursor, cbcursormax, pcbcursor) : -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cbcursormax;
    (void)pcbcursor;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetCursorNameW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcursor, cchcursormax, pcchcursor) : -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cchcursormax;
    (void)pcchcursor;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t columnnumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t targettype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* targetvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t bufferlength = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* strlen_or_indptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLGetData")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, columnnumber, targettype, targetvalue, bufferlength, strlen_or_indptr) : -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)targettype;
    (void)targetvalue;
    (void)bufferlength;
    (void)strlen_or_indptr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDescField_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(descriptorhandle, recnumber, fieldidentifier, value, bufferlength, stringlength) : -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDescFieldA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdesc, irecord, ifield, rgbvalue, cbbufferlength, stringlength) : -1;
#else
    (void)hdesc;
    (void)irecord;
    (void)ifield;
    (void)rgbvalue;
    (void)cbbufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDescFieldW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdesc, irecord, ifield, rgbvalue, cbbufferlength, stringlength) : -1;
#else
    (void)hdesc;
    (void)irecord;
    (void)ifield;
    (void)rgbvalue;
    (void)cbbufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDescRec_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(descriptorhandle, recnumber, name, bufferlength, stringlengthptr, typeptr, subtypeptr, lengthptr, precisionptr, scaleptr, nullableptr) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDescRecA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdesc, irecord, szname, cbnamemax, pcbname, pftype, pfsubtype, plength, pprecision, pscale, pnullable) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDescRecW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdesc, irecord, szname, cchnamemax, pcchname, pftype, pfsubtype, plength, pprecision, pscale, pnullable) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDiagField_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handletype, handle, recnumber, diagidentifier, diaginfo, bufferlength, stringlength) : -1;
#else
    (void)handletype;
    (void)handle;
    (void)recnumber;
    (void)diagidentifier;
    (void)diaginfo;
    (void)bufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDiagFieldA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fhandletype, handle, irecord, fdiagfield, rgbdiaginfo, cbdiaginfomax, pcbdiaginfo) : -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)fdiagfield;
    (void)rgbdiaginfo;
    (void)cbdiaginfomax;
    (void)pcbdiaginfo;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDiagFieldW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fhandletype, handle, irecord, fdiagfield, rgbdiaginfo, cbbufferlength, pcbstringlength) : -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)fdiagfield;
    (void)rgbdiaginfo;
    (void)cbbufferlength;
    (void)pcbstringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDiagRec_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(handletype, handle, recnumber, sqlstate, nativeerror, messagetext, bufferlength, textlength) : -1;
#else
    (void)handletype;
    (void)handle;
    (void)recnumber;
    (void)sqlstate;
    (void)nativeerror;
    (void)messagetext;
    (void)bufferlength;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDiagRecA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fhandletype, handle, irecord, szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax, pcberrormsg) : -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)cberrormsgmax;
    (void)pcberrormsg;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetDiagRecW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fhandletype, handle, irecord, szsqlstate, pfnativeerror, szerrormsg, ccherrormsgmax, pccherrormsg) : -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)ccherrormsgmax;
    (void)pccherrormsg;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetEnvAttr_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(environmenthandle, attribute, value, bufferlength, stringlength) : -1;
#else
    (void)environmenthandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetFunctions_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle, functionid, supported) : -1;
#else
    (void)connectionhandle;
    (void)functionid;
    (void)supported;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle, infotype, infovalue, bufferlength, stringlengthptr) : -1;
#else
    (void)connectionhandle;
    (void)infotype;
    (void)infovalue;
    (void)bufferlength;
    (void)stringlengthptr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, finfotype, rgbinfovalue, cbinfovaluemax, pcbinfovalue) : -1;
#else
    (void)hdbc;
    (void)finfotype;
    (void)rgbinfovalue;
    (void)cbinfovaluemax;
    (void)pcbinfovalue;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, finfotype, rgbinfovalue, cbinfovaluemax, pcbinfovalue) : -1;
#else
    (void)hdbc;
    (void)finfotype;
    (void)rgbinfovalue;
    (void)cbinfovaluemax;
    (void)pcbinfovalue;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetNextEnumeration_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(henumhandle, prgenumdata, pienumlength) : -1;
#else
    (void)henumhandle;
    (void)prgenumdata;
    (void)pienumlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetStmtAttr_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, attribute, value, bufferlength, stringlength) : -1;
#else
    (void)statementhandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetStmtAttrA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, fattribute, rgbvalue, cbvaluemax, pcbvalue) : -1;
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetStmtAttrW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, fattribute, rgbvalue, cbvaluemax, pcbvalue) : -1;
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetStmtOption_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, option, value) : -1;
#else
    (void)statementhandle;
    (void)option;
    (void)value;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetTypeInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, datatype) : -1;
#else
    (void)statementhandle;
    (void)datatype;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetTypeInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, datatype) : -1;
#else
    (void)statementhandle;
    (void)datatype;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLGetTypeInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, datatype) : -1;
#else
    (void)statementhandle;
    (void)datatype;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLInitEnumServers_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwchservername, pwchinstancename) : NULL;
#else
    (void)pwchservername;
    (void)pwchinstancename;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_search_SQLLinkedCatalogsA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLLinkedCatalogsW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLLinkedServers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLLinkedServers")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLMoreResults_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hstmt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLMoreResults")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt) : -1;
#else
    (void)hstmt;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLNativeSql_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, szsqlstrin, cchsqlstrin, szsqlstr, cchsqlstrmax, pcbsqlstr) : -1;
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cchsqlstrin;
    (void)szsqlstr;
    (void)cchsqlstrmax;
    (void)pcbsqlstr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLNativeSqlA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, szsqlstrin, cbsqlstrin, szsqlstr, cbsqlstrmax, pcbsqlstr) : -1;
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cbsqlstrin;
    (void)szsqlstr;
    (void)cbsqlstrmax;
    (void)pcbsqlstr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLNativeSqlW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, szsqlstrin, cchsqlstrin, szsqlstr, cchsqlstrmax, pcchsqlstr) : -1;
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cchsqlstrin;
    (void)szsqlstr;
    (void)cchsqlstrmax;
    (void)pcchsqlstr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLNumParams_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, pcpar) : -1;
#else
    (void)hstmt;
    (void)pcpar;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLNumResultCols_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, columncount) : -1;
#else
    (void)statementhandle;
    (void)columncount;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLParamData_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, value) : -1;
#else
    (void)statementhandle;
    (void)value;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLParamOptions_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, crow, pirow) : -1;
#else
    (void)hstmt;
    (void)crow;
    (void)pirow;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLPrepare_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, statementtext, textlength) : -1;
#else
    (void)statementhandle;
    (void)statementtext;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLPrepareA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szsqlstr, cbsqlstr) : -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cbsqlstr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLPrepareW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szsqlstr, cchsqlstr) : -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cchsqlstr;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLPrimaryKeys_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLPrimaryKeysA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLPrimaryKeysW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLProcedureColumns_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname, szcolumnname, cchcolumnname) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLProcedureColumnsA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, szprocname, cbprocname, szcolumnname, cbcolumnname) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLProcedureColumnsW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname, szcolumnname, cchcolumnname) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLProcedures_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLProceduresA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, szprocname, cbprocname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)szprocname;
    (void)cbprocname;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLProceduresW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLPutData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t strlen_or_ind = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLPutData")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, data, strlen_or_ind) : -1;
#else
    (void)statementhandle;
    (void)data;
    (void)strlen_or_ind;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLRowCount_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, rowcount) : -1;
#else
    (void)statementhandle;
    (void)rowcount;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetConnectAttr_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle, attribute, value, stringlength) : -1;
#else
    (void)connectionhandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetConnectAttrA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, fattribute, rgbvalue, cbvalue) : -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvalue;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetConnectAttrW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, fattribute, rgbvalue, cbvalue) : -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvalue;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetConnectOption_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(connectionhandle, option, value) : -1;
#else
    (void)connectionhandle;
    (void)option;
    (void)value;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetConnectOptionA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, foption, vparam) : -1;
#else
    (void)hdbc;
    (void)foption;
    (void)vparam;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetConnectOptionW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdbc, foption, vparam) : -1;
#else
    (void)hdbc;
    (void)foption;
    (void)vparam;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetCursorName_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, cursorname, namelength) : -1;
#else
    (void)statementhandle;
    (void)cursorname;
    (void)namelength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetCursorNameA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcursor, cbcursor) : -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cbcursor;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetCursorNameW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcursor, cchcursor) : -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cchcursor;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetDescField_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(descriptorhandle, recnumber, fieldidentifier, value, bufferlength) : -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetDescFieldW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(descriptorhandle, recnumber, fieldidentifier, value, bufferlength) : -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetDescRec_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(descriptorhandle, recnumber, type, subtype, length, precision, scale, data, stringlength, indicator) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetEnvAttr_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(environmenthandle, attribute, value, stringlength) : -1;
#else
    (void)environmenthandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetParam_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* statementhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t parameternumber = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t valuetype = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t parametertype = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint64_t lengthprecision = km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0;
    int16_t parameterscale = static_cast<int16_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* parametervalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* strlen_or_ind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, uint64_t, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SQLSetParam")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue, strlen_or_ind) : -1;
#else
    (void)statementhandle;
    (void)parameternumber;
    (void)valuetype;
    (void)parametertype;
    (void)lengthprecision;
    (void)parameterscale;
    (void)parametervalue;
    (void)strlen_or_ind;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetPos_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, irow, foption, flock) : -1;
#else
    (void)hstmt;
    (void)irow;
    (void)foption;
    (void)flock;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetScrollOptions_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, fconcurrency, crowkeyset, crowrowset) : -1;
#else
    (void)hstmt;
    (void)fconcurrency;
    (void)crowkeyset;
    (void)crowrowset;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetStmtAttr_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, attribute, value, stringlength) : -1;
#else
    (void)statementhandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetStmtAttrW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, fattribute, rgbvalue, cbvaluemax) : -1;
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSetStmtOption_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, option, value) : -1;
#else
    (void)statementhandle;
    (void)option;
    (void)value;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSpecialColumns_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, identifiertype, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, scope, nullable) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSpecialColumnsA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, fcoltype, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, fscope, fnullable) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLSpecialColumnsW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, fcoltype, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, fscope, fnullable) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLStatistics_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, unique, reserved) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLStatisticsA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, funique, faccuracy) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLStatisticsW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, funique, faccuracy) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLTablePrivileges_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLTablePrivilegesA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLTablePrivilegesW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLTables_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, tabletype, namelength4) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLTablesA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, sztabletype, cbtabletype) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLTablesW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, sztabletype, cchtabletype) : -1;
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
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_SQLTransact_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(environmenthandle, connectionhandle, completiontype) : -1;
#else
    (void)environmenthandle;
    (void)connectionhandle;
    (void)completiontype;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_batch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_batch")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_bind_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_colfmt_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_collen_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_colptr_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_columns_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_control_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_done_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_done")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_exec_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_getcolfmt_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4, param5) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_initA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_initW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_moretext_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_readfmtA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_readfmtW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_sendrow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "bcp_sendrow")));
    }
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_setcolfmt_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, param4) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_writefmtA_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_bcp_writefmtW_napi(const Napi::CallbackInfo& km_info) {
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
    int16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_system_search_dbprtypeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t param0 = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "dbprtypeA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_system_search_dbprtypeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t param0 = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "dbprtypeW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static void register_windows_win32_system_search_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_system_search_ODBCGetTryWaitValue", Napi::Function::New(env, windowssys_windows_win32_system_search_ODBCGetTryWaitValue_napi));
    exports.Set("windowssys_windows_win32_system_search_ODBCSetTryWaitValue", Napi::Function::New(env, windowssys_windows_win32_system_search_ODBCSetTryWaitValue_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLAllocConnect", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLAllocConnect_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLAllocEnv", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLAllocEnv_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLAllocHandle", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLAllocHandle_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLAllocHandleStd", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLAllocHandleStd_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLAllocStmt", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLAllocStmt_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLBindCol", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLBindCol_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLBindParam", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLBindParam_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLBindParameter", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLBindParameter_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLBrowseConnect", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLBrowseConnect_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLBrowseConnectA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLBrowseConnectA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLBrowseConnectW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLBrowseConnectW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLBulkOperations", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLBulkOperations_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLCancel", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLCancel_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLCancelHandle", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLCancelHandle_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLCloseCursor", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLCloseCursor_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLCloseEnumServers", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLCloseEnumServers_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColAttribute", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColAttribute_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColAttributeA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColAttributeA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColAttributeW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColAttributeW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColAttributes", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColAttributes_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColAttributesA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColAttributesA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColAttributesW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColAttributesW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColumnPrivileges", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColumnPrivileges_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColumnPrivilegesA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColumnPrivilegesA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColumnPrivilegesW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColumnPrivilegesW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColumns", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColumns_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColumnsA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColumnsA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLColumnsW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLColumnsW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLCompleteAsync", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLCompleteAsync_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLConnect", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLConnect_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLConnectA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLConnectA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLConnectW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLConnectW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLCopyDesc", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLCopyDesc_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDataSources", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDataSources_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDataSourcesA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDataSourcesA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDataSourcesW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDataSourcesW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDescribeCol", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDescribeCol_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDescribeColA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDescribeColA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDescribeColW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDescribeColW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDescribeParam", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDescribeParam_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDisconnect", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDisconnect_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDriverConnect", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDriverConnect_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDriverConnectA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDriverConnectA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDriverConnectW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDriverConnectW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDrivers", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDrivers_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDriversA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDriversA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLDriversW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLDriversW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLEndTran", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLEndTran_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLError", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLError_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLErrorA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLErrorA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLErrorW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLErrorW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLExecDirect", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLExecDirect_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLExecDirectA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLExecDirectA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLExecDirectW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLExecDirectW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLExecute", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLExecute_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLExtendedFetch", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLExtendedFetch_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLFetch", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLFetch_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLFetchScroll", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLFetchScroll_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLForeignKeys", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLForeignKeys_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLForeignKeysA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLForeignKeysA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLForeignKeysW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLForeignKeysW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLFreeConnect", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLFreeConnect_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLFreeEnv", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLFreeEnv_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLFreeHandle", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLFreeHandle_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLFreeStmt", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLFreeStmt_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetConnectAttr", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetConnectAttr_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetConnectAttrA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetConnectAttrA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetConnectAttrW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetConnectAttrW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetConnectOption", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetConnectOption_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetConnectOptionA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetConnectOptionA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetConnectOptionW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetConnectOptionW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetCursorName", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetCursorName_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetCursorNameA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetCursorNameA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetCursorNameW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetCursorNameW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetData", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetData_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDescField", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDescField_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDescFieldA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDescFieldA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDescFieldW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDescFieldW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDescRec", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDescRec_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDescRecA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDescRecA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDescRecW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDescRecW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDiagField", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDiagField_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDiagFieldA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDiagFieldA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDiagFieldW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDiagFieldW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDiagRec", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDiagRec_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDiagRecA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDiagRecA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetDiagRecW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetDiagRecW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetEnvAttr", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetEnvAttr_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetFunctions", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetFunctions_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetInfo", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetInfo_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetInfoA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetInfoA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetInfoW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetInfoW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetNextEnumeration", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetNextEnumeration_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetStmtAttr", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetStmtAttr_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetStmtAttrA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetStmtAttrA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetStmtAttrW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetStmtAttrW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetStmtOption", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetStmtOption_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetTypeInfo", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetTypeInfo_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetTypeInfoA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetTypeInfoA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLGetTypeInfoW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLGetTypeInfoW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLInitEnumServers", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLInitEnumServers_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLLinkedCatalogsA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLLinkedCatalogsA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLLinkedCatalogsW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLLinkedCatalogsW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLLinkedServers", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLLinkedServers_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLMoreResults", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLMoreResults_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLNativeSql", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLNativeSql_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLNativeSqlA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLNativeSqlA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLNativeSqlW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLNativeSqlW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLNumParams", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLNumParams_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLNumResultCols", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLNumResultCols_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLParamData", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLParamData_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLParamOptions", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLParamOptions_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLPrepare", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLPrepare_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLPrepareA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLPrepareA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLPrepareW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLPrepareW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLPrimaryKeys", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLPrimaryKeys_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLPrimaryKeysA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLPrimaryKeysA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLPrimaryKeysW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLPrimaryKeysW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLProcedureColumns", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLProcedureColumns_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLProcedureColumnsA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLProcedureColumnsA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLProcedureColumnsW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLProcedureColumnsW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLProcedures", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLProcedures_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLProceduresA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLProceduresA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLProceduresW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLProceduresW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLPutData", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLPutData_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLRowCount", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLRowCount_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetConnectAttr", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetConnectAttr_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetConnectAttrA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetConnectAttrA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetConnectAttrW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetConnectAttrW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetConnectOption", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetConnectOption_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetConnectOptionA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetConnectOptionA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetConnectOptionW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetConnectOptionW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetCursorName", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetCursorName_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetCursorNameA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetCursorNameA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetCursorNameW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetCursorNameW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetDescField", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetDescField_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetDescFieldW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetDescFieldW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetDescRec", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetDescRec_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetEnvAttr", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetEnvAttr_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetParam", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetParam_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetPos", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetPos_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetScrollOptions", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetScrollOptions_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetStmtAttr", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetStmtAttr_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetStmtAttrW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetStmtAttrW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSetStmtOption", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSetStmtOption_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSpecialColumns", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSpecialColumns_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSpecialColumnsA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSpecialColumnsA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLSpecialColumnsW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLSpecialColumnsW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLStatistics", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLStatistics_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLStatisticsA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLStatisticsA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLStatisticsW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLStatisticsW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLTablePrivileges", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLTablePrivileges_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLTablePrivilegesA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLTablePrivilegesA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLTablePrivilegesW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLTablePrivilegesW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLTables", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLTables_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLTablesA", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLTablesA_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLTablesW", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLTablesW_napi));
    exports.Set("windowssys_windows_win32_system_search_SQLTransact", Napi::Function::New(env, windowssys_windows_win32_system_search_SQLTransact_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_batch", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_batch_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_bind", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_bind_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_colfmt", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_colfmt_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_collen", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_collen_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_colptr", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_colptr_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_columns", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_columns_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_control", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_control_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_done", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_done_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_exec", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_exec_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_getcolfmt", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_getcolfmt_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_initA", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_initA_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_initW", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_initW_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_moretext", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_moretext_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_readfmtA", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_readfmtA_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_readfmtW", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_readfmtW_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_sendrow", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_sendrow_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_setcolfmt", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_setcolfmt_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_writefmtA", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_writefmtA_napi));
    exports.Set("windowssys_windows_win32_system_search_bcp_writefmtW", Napi::Function::New(env, windowssys_windows_win32_system_search_bcp_writefmtW_napi));
    exports.Set("windowssys_windows_win32_system_search_dbprtypeA", Napi::Function::New(env, windowssys_windows_win32_system_search_dbprtypeA_napi));
    exports.Set("windowssys_windows_win32_system_search_dbprtypeW", Napi::Function::New(env, windowssys_windows_win32_system_search_dbprtypeW_napi));
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
