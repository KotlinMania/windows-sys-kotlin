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

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupClose_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupClose")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc) : -1;
#else
    (void)hbc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupEnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupEnd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc) : -1;
#else
    (void)hbc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pv);
#else
    (void)pv;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetBackupLogsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszzbackuplogfiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupGetBackupLogsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc, ppwszzbackuplogfiles, pcbsize) : -1;
#else
    (void)hbc;
    (void)ppwszzbackuplogfiles;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDatabaseNamesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszzattachmentinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupGetDatabaseNamesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc, ppwszzattachmentinformation, pcbsize) : -1;
#else
    (void)hbc;
    (void)ppwszzattachmentinformation;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDynamicFileListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszzfilelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupGetDynamicFileListW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc, ppwszzfilelist, pcbsize) : -1;
#else
    (void)hbc;
    (void)ppwszzfilelist;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupOpenFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszattachmentname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbreadhintsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* plifilesize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupOpenFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc, pwszattachmentname, cbreadhintsize, plifilesize) : -1;
#else
    (void)hbc;
    (void)pwszattachmentname;
    (void)cbreadhintsize;
    (void)plifilesize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupPrepareW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grbitjet = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwbackupflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupPrepareW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszservername, grbitjet, dwbackupflags, phbc) : -1;
#else
    (void)pwszservername;
    (void)grbitjet;
    (void)dwbackupflags;
    (void)phbc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupRead")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc, pvbuffer, cbbuffer, pcbread) : -1;
#else
    (void)hbc;
    (void)pvbuffer;
    (void)cbbuffer;
    (void)pcbread;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupTruncateLogs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvBackupTruncateLogs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc) : -1;
#else
    (void)hbc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvIsServerOnlineW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfserveronline = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvIsServerOnlineW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszservername, pfserveronline) : -1;
#else
    (void)pwszservername;
    (void)pfserveronline;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreEnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvRestoreEnd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc) : -1;
#else
    (void)hbc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreGetDatabaseLocationsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppwszzdatabaselocationlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvRestoreGetDatabaseLocationsW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc, ppwszzdatabaselocationlist, pcbsize) : -1;
#else
    (void)hbc;
    (void)ppwszzdatabaselocationlist;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvRestorePrepareW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwrestoreflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvRestorePrepareW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszservername, dwrestoreflags, phbc) : -1;
#else
    (void)pwszservername;
    (void)dwrestoreflags;
    (void)phbc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterComplete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t hrrestorestate = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvRestoreRegisterComplete")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc, hrrestorestate) : -1;
#else
    (void)hbc;
    (void)hrrestorestate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterThroughFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszcheckpointfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszlogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rgrstmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t crstmap = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pwszbackuplogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t genlow = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t genhigh = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvRestoreRegisterThroughFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc, pwszcheckpointfilepath, pwszlogpath, rgrstmap, crstmap, pwszbackuplogpath, genlow, genhigh) : -1;
#else
    (void)hbc;
    (void)pwszcheckpointfilepath;
    (void)pwszlogpath;
    (void)rgrstmap;
    (void)crstmap;
    (void)pwszbackuplogpath;
    (void)genlow;
    (void)genhigh;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pwszcheckpointfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pwszlogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rgrstmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t crstmap = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pwszbackuplogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t genlow = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t genhigh = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvRestoreRegisterW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbc, pwszcheckpointfilepath, pwszlogpath, rgrstmap, crstmap, pwszbackuplogpath, genlow, genhigh) : -1;
#else
    (void)hbc;
    (void)pwszcheckpointfilepath;
    (void)pwszlogpath;
    (void)rgrstmap;
    (void)crstmap;
    (void)pwszbackuplogpath;
    (void)genlow;
    (void)genhigh;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_CertSrvServerControlW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pwszservername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwcontrolflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcbout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppbout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CertSrvServerControlW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pwszservername, dwcontrolflags, pcbout, ppbout) : -1;
#else
    (void)pwszservername;
    (void)dwcontrolflags;
    (void)pcbout;
    (void)ppbout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_PstAcquirePrivateKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PstAcquirePrivateKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcert) : -1;
#else
    (void)pcert;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_PstGetCertificateChain_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptrustedissuers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppcertchaincontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PstGetCertificateChain")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcert, ptrustedissuers, ppcertchaincontext) : -1;
#else
    (void)pcert;
    (void)ptrustedissuers;
    (void)ppcertchaincontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_PstGetCertificates_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ccriteria = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgpcriteria = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t bisclient = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pdwcertchaincontextcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ppcertchaincontexts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PstGetCertificates")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptargetname, ccriteria, rgpcriteria, bisclient, pdwcertchaincontextcount, ppcertchaincontexts) : -1;
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)bisclient;
    (void)pdwcertchaincontextcount;
    (void)ppcertchaincontexts;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ccriteria = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgpcriteria = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pptrustedissuers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PstGetTrustAnchors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptargetname, ccriteria, rgpcriteria, pptrustedissuers) : -1;
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)pptrustedissuers;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchorsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ccriteria = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* rgpcriteria = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pptrustedissuers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PstGetTrustAnchorsEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptargetname, ccriteria, rgpcriteria, pcertcontext, pptrustedissuers) : -1;
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)pcertcontext;
    (void)pptrustedissuers;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_PstGetUserNameForCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcertcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* username = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PstGetUserNameForCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcertcontext, username) : -1;
#else
    (void)pcertcontext;
    (void)username;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_PstMapCertificate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptokeninformationtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pptokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PstMapCertificate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcert, ptokeninformationtype, pptokeninformation) : -1;
#else
    (void)pcert;
    (void)ptokeninformationtype;
    (void)pptokeninformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_security_cryptography_certificates_PstValidate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptargetname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bisclient = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* prequestedissuancepolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* phadditionalcertstore = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pprovguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PstValidate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptargetname, bisclient, prequestedissuancepolicy, phadditionalcertstore, pcert, pprovguid) : -1;
#else
    (void)ptargetname;
    (void)bisclient;
    (void)prequestedissuancepolicy;
    (void)phadditionalcertstore;
    (void)pcert;
    (void)pprovguid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_security_cryptography_certificates_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupClose", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupClose_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupEnd", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupEnd_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupFree", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupFree_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetBackupLogsW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetBackupLogsW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDatabaseNamesW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDatabaseNamesW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDynamicFileListW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDynamicFileListW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupOpenFileW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupOpenFileW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupPrepareW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupPrepareW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupRead", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupRead_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupTruncateLogs", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupTruncateLogs_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvIsServerOnlineW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvIsServerOnlineW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreEnd", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreEnd_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreGetDatabaseLocationsW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreGetDatabaseLocationsW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvRestorePrepareW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvRestorePrepareW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterComplete", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterComplete_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterThroughFile", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterThroughFile_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_CertSrvServerControlW", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_CertSrvServerControlW_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_PstAcquirePrivateKey", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_PstAcquirePrivateKey_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_PstGetCertificateChain", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_PstGetCertificateChain_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_PstGetCertificates", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_PstGetCertificates_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchors", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchors_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchorsEx", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchorsEx_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_PstGetUserNameForCertificate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_PstGetUserNameForCertificate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_PstMapCertificate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_PstMapCertificate_napi));
    exports.Set("windowssys_windows_win32_security_cryptography_certificates_PstValidate", Napi::Function::New(env, windowssys_windows_win32_security_cryptography_certificates_PstValidate_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_cryptography_certificates_napi, nullptr };
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
