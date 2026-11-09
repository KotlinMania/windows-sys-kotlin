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

static Napi::Value windowssys_windows_win32_storage_jet_JetAddColumnA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcolumndef = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvdefault = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbdefault = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcolumnid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetAddColumnA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szcolumnname, pcolumndef, pvdefault, cbdefault, pcolumnid) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetAddColumnW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcolumndef = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvdefault = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbdefault = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcolumnid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetAddColumnW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szcolumnname, pcolumndef, pvdefault, cbdefault, pcolumnid) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetAttachDatabase2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpgdatabasesizemax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetAttachDatabase2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetAttachDatabase2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpgdatabasesizemax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetAttachDatabase2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetAttachDatabaseA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetAttachDatabaseA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetAttachDatabaseW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetAttachDatabaseW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBackupA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szbackuppath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfnstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBackupA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szbackuppath, grbit, pfnstatus) : -1;
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBackupInstanceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szbackuppath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfnstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBackupInstanceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, szbackuppath, grbit, pfnstatus) : -1;
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBackupInstanceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szbackuppath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfnstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBackupInstanceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, szbackuppath, grbit, pfnstatus) : -1;
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBackupW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szbackuppath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pfnstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBackupW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szbackuppath, grbit, pfnstatus) : -1;
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBeginExternalBackup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBeginExternalBackup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(grbit) : -1;
#else
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBeginExternalBackupInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBeginExternalBackupInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, grbit) : -1;
#else
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBeginSessionA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* psesid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBeginSessionA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, psesid, szusername, szpassword) : -1;
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBeginSessionW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* psesid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBeginSessionW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, psesid, szusername, szpassword) : -1;
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBeginTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBeginTransaction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid) : -1;
#else
    (void)sesid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBeginTransaction2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBeginTransaction2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetBeginTransaction3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    int64_t trxid = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBeginTransaction3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, trxid, grbit) : -1;
#else
    (void)sesid;
    (void)trxid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCloseDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCloseDatabase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCloseFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hffile = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCloseFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hffile) : -1;
#else
    (void)hffile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCloseFileInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hffile = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCloseFileInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, hffile) : -1;
#else
    (void)instance;
    (void)hffile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCloseTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCloseTable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid) : -1;
#else
    (void)sesid;
    (void)tableid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCommitTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCommitTransaction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCommitTransaction2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t cmsecdurablecommit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcommitid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCommitTransaction2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, grbit, cmsecdurablecommit, pcommitid) : -1;
#else
    (void)sesid;
    (void)grbit;
    (void)cmsecdurablecommit;
    (void)pcommitid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCompactA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szdatabasesrc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdatabasedest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pconvert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCompactA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szdatabasesrc, szdatabasedest, pfnstatus, pconvert, grbit) : -1;
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCompactW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szdatabasesrc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdatabasedest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pconvert = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCompactW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szdatabasesrc, szdatabasedest, pfnstatus, pconvert, grbit) : -1;
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetComputeStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetComputeStats")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid) : -1;
#else
    (void)sesid;
    (void)tableid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetConfigureProcessForCrashDump_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetConfigureProcessForCrashDump")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(grbit) : -1;
#else
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateDatabase2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpgdatabasesizemax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdbid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateDatabase2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, pdbid, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateDatabase2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpgdatabasesizemax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdbid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateDatabase2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, pdbid, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateDatabaseA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szconnect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdbid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateDatabaseA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateDatabaseW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szconnect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdbid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateDatabaseW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateIndex2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pindexcreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cindexcreate = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateIndex2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateIndex2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pindexcreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cindexcreate = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateIndex2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateIndex3A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pindexcreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cindexcreate = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateIndex3A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateIndex3W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pindexcreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cindexcreate = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateIndex3W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateIndex4A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pindexcreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cindexcreate = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateIndex4A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateIndex4W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pindexcreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cindexcreate = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateIndex4W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateIndexA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbkey = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t ldensity = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateIndexA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, grbit, szkey, cbkey, ldensity) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateIndexW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbkey = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t ldensity = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateIndexW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, grbit, szkey, cbkey, ldensity) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateInstance2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdisplayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateInstance2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance, szinstancename, szdisplayname, grbit) : -1;
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateInstance2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdisplayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateInstance2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance, szinstancename, szdisplayname, grbit) : -1;
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateInstanceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateInstanceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance, szinstancename) : -1;
#else
    (void)pinstance;
    (void)szinstancename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateInstanceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateInstanceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance, szinstancename) : -1;
#else
    (void)pinstance;
    (void)szinstancename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t lpages = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ldensity = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ptableid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, lpages, ldensity, ptableid) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptablecreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableColumnIndex2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptablecreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableColumnIndex2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptablecreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableColumnIndex3A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptablecreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableColumnIndex3W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptablecreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableColumnIndex4A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptablecreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableColumnIndex4W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptablecreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableColumnIndexA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptablecreate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableColumnIndexW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetCreateTableW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t lpages = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ldensity = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ptableid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCreateTableW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, lpages, ldensity, ptableid) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDefragment2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcpasses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcseconds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDefragment2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, callback, grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDefragment2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcpasses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcseconds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDefragment2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, callback, grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDefragment3A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szdatabasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcpasses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcseconds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDefragment3A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szdatabasename, sztablename, pcpasses, pcseconds, callback, pvcontext, grbit) : -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)pvcontext;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDefragment3W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szdatabasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcpasses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcseconds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* callback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDefragment3W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szdatabasename, sztablename, pcpasses, pcseconds, callback, pvcontext, grbit) : -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)pvcontext;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDefragmentA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcpasses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcseconds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDefragmentA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDefragmentW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcpasses = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcseconds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDefragmentW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDelete_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDelete")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid) : -1;
#else
    (void)sesid;
    (void)tableid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDeleteColumn2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDeleteColumn2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szcolumnname, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDeleteColumn2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDeleteColumn2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szcolumnname, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDeleteColumnA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDeleteColumnA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szcolumnname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDeleteColumnW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDeleteColumnW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szcolumnname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDeleteIndexA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDeleteIndexA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDeleteIndexW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDeleteIndexW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDeleteTableA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDeleteTableA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDeleteTableW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDeleteTableW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDetachDatabase2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDetachDatabase2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDetachDatabase2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDetachDatabase2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDetachDatabaseA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDetachDatabaseA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename) : -1;
#else
    (void)sesid;
    (void)szfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDetachDatabaseW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDetachDatabaseW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename) : -1;
#else
    (void)sesid;
    (void)szfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDupCursor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* ptableid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDupCursor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, ptableid, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)ptableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetDupSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* psesid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetDupSession")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, psesid) : -1;
#else
    (void)sesid;
    (void)psesid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetEnableMultiInstanceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psetsysparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t csetsysparam = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcsetsucceed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEnableMultiInstanceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psetsysparam, csetsysparam, pcsetsucceed) : -1;
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetEnableMultiInstanceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psetsysparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t csetsysparam = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcsetsucceed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEnableMultiInstanceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psetsysparam, csetsysparam, pcsetsucceed) : -1;
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetEndExternalBackup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEndExternalBackup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEndExternalBackupInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEndExternalBackupInstance2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, grbit) : -1;
#else
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetEndSession_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEndSession")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetEnumerateColumns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t cenumcolumnid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgenumcolumnid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcenumcolumn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* prgenumcolumn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pfnrealloc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pvrealloccontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t cbdatamost = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEnumerateColumns")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, cenumcolumnid, rgenumcolumnid, pcenumcolumn, prgenumcolumn, pfnrealloc, pvrealloccontext, cbdatamost, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)cenumcolumnid;
    (void)rgenumcolumnid;
    (void)pcenumcolumn;
    (void)prgenumcolumn;
    (void)pfnrealloc;
    (void)pvrealloccontext;
    (void)cbdatamost;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetEscrowUpdate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t columnid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pvold = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cboldmax = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcboldactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEscrowUpdate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, columnid, pv, cbmax, pvold, cboldmax, pcboldactual, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pv;
    (void)cbmax;
    (void)pvold;
    (void)cboldmax;
    (void)pcboldactual;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetExternalRestore2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcheckpointfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szlogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rgrstmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t crstfilemap = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szbackuplogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ploginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sztargetinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* sztargetinstancelogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* sztargetinstancecheckpointpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetExternalRestore2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, pfn) : -1;
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)ploginfo;
    (void)sztargetinstancename;
    (void)sztargetinstancelogpath;
    (void)sztargetinstancecheckpointpath;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetExternalRestore2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcheckpointfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szlogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rgrstmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t crstfilemap = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szbackuplogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* ploginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* sztargetinstancename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* sztargetinstancelogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* sztargetinstancecheckpointpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetExternalRestore2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, pfn) : -1;
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)ploginfo;
    (void)sztargetinstancename;
    (void)sztargetinstancelogpath;
    (void)sztargetinstancecheckpointpath;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetExternalRestoreA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcheckpointfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szlogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rgrstmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t crstfilemap = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szbackuplogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t genlow = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t genhigh = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetExternalRestoreA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, genlow, genhigh, pfn) : -1;
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)genlow;
    (void)genhigh;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetExternalRestoreW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szcheckpointfilepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szlogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rgrstmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t crstfilemap = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* szbackuplogpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t genlow = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t genhigh = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetExternalRestoreW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, genlow, genhigh, pfn) : -1;
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)genlow;
    (void)genhigh;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetFreeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetFreeBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbbuf) : -1;
#else
    (void)pbbuf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetAttachInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szzdatabases = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetAttachInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szzdatabases, cbmax, pcbactual) : -1;
#else
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szzdatabases = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetAttachInfoInstanceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, szzdatabases, cbmax, pcbactual) : -1;
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szzdatabases = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetAttachInfoInstanceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, szzdatabases, cbmax, pcbactual) : -1;
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetAttachInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* wszzdatabases = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetAttachInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(wszzdatabases, cbmax, pcbactual) : -1;
#else
    (void)wszzdatabases;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetBookmark_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvbookmark = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetBookmark")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvbookmark, cbmax, pcbactual) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetColumnInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcolumnnameorid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetColumnInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, pcolumnnameorid, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetColumnInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pwcolumnnameorid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetColumnInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, pwcolumnnameorid, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pwcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetCurrentIndexA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbindexname = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetCurrentIndexA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, cbindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetCurrentIndexW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbindexname = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetCurrentIndexW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, cbindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetCursorInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetCursorInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szdatabasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetDatabaseFileInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szdatabasename, pvresult, cbmax, infolevel) : -1;
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szdatabasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetDatabaseFileInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szdatabasename, pvresult, cbmax, infolevel) : -1;
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetDatabaseInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetDatabaseInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetDatabaseInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetDatabaseInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetErrorInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetErrorInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvcontext, pvresult, cbmax, infolevel, grbit) : -1;
#else
    (void)pvcontext;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetIndexInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbresult = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetIndexInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, szindexname, pvresult, cbresult, infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetIndexInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbresult = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetIndexInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, szindexname, pvresult, cbresult, infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetInstanceInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcinstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* painstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetInstanceInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcinstanceinfo, painstanceinfo) : -1;
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetInstanceInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcinstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* painstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetInstanceInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcinstanceinfo, painstanceinfo) : -1;
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetInstanceMiscInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetInstanceMiscInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, pvresult, cbmax, infolevel) : -1;
#else
    (void)instance;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetLS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pls = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetLS")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pls, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pls;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetLock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetLock")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetLogInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szzlogs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetLogInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szzlogs, cbmax, pcbactual) : -1;
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szzlogs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ploginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetLogInfoInstance2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, szzlogs, cbmax, pcbactual, ploginfo) : -1;
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* wszzlogs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ploginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetLogInfoInstance2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, wszzlogs, cbmax, pcbactual, ploginfo) : -1;
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szzlogs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetLogInfoInstanceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, szzlogs, cbmax, pcbactual) : -1;
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* wszzlogs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetLogInfoInstanceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, wszzlogs, cbmax, pcbactual) : -1;
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetLogInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szzlogs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetLogInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szzlogs, cbmax, pcbactual) : -1;
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetObjectInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t objtyp = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szcontainername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* szobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetObjectInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, objtyp, szcontainername, szobjectname, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)objtyp;
    (void)szcontainername;
    (void)szobjectname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetObjectInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t objtyp = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* szcontainername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* szobjectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetObjectInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, objtyp, szcontainername, szobjectname, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)objtyp;
    (void)szcontainername;
    (void)szobjectname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetRecordPosition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* precpos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbrecpos = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetRecordPosition")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, precpos, cbrecpos) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    (void)cbrecpos;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetRecordSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* precsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetRecordSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, precsize, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetRecordSize2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* precsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetRecordSize2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, precsize, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetSecondaryIndexBookmark_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvsecondarykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbsecondarykeymax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbsecondarykeyactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pvprimarybookmark = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t cbprimarybookmarkmax = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcbprimarybookmarkactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetSecondaryIndexBookmark")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvsecondarykey, cbsecondarykeymax, pcbsecondarykeyactual, pvprimarybookmark, cbprimarybookmarkmax, pcbprimarybookmarkactual, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvsecondarykey;
    (void)cbsecondarykeymax;
    (void)pcbsecondarykeyactual;
    (void)pvprimarybookmark;
    (void)cbprimarybookmarkmax;
    (void)pcbprimarybookmarkactual;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetSessionParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t sesparamid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbparammax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbparamactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetSessionParameter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, sesparamid, pvparam, cbparammax, pcbparamactual) : -1;
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparammax;
    (void)pcbparamactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetSystemParameterA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t sesid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t paramid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* plparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* szparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetSystemParameterA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, sesid, paramid, plparam, szparam, cbmax) : -1;
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetSystemParameterW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t sesid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t paramid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* plparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* szparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetSystemParameterW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, sesid, paramid, plparam, szparam, cbmax) : -1;
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetTableColumnInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetTableColumnInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szcolumnname, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetTableColumnInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetTableColumnInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szcolumnname, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetTableIndexInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbresult = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetTableIndexInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, pvresult, cbresult, infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetTableIndexInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbresult = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetTableIndexInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, pvresult, cbresult, infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetTableInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetTableInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetTableInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t infolevel = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetTableInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvresult, cbmax, infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetThreadStats_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetThreadStats")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvresult, cbmax) : -1;
#else
    (void)pvresult;
    (void)cbmax;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szzlogs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetTruncateLogInfoInstanceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, szzlogs, cbmax, pcbactual) : -1;
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* wszzlogs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetTruncateLogInfoInstanceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, wszzlogs, cbmax, pcbactual) : -1;
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGetVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pwversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGetVersion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, pwversion) : -1;
#else
    (void)sesid;
    (void)pwversion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGotoBookmark_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvbookmark = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbookmark = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGotoBookmark")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvbookmark, cbbookmark) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGotoPosition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* precpos = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGotoPosition")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, precpos) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGotoSecondaryIndexBookmark_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvsecondarykey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbsecondarykey = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvprimarybookmark = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbprimarybookmark = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGotoSecondaryIndexBookmark")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvsecondarykey, cbsecondarykey, pvprimarybookmark, cbprimarybookmark, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvsecondarykey;
    (void)cbsecondarykey;
    (void)pvprimarybookmark;
    (void)cbprimarybookmark;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetGrowDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t cpg = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcpgreal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetGrowDatabase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, cpg, pcpgreal) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)cpg;
    (void)pcpgreal;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetIdle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetIdle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetIndexRecordCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pcrec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t crecmax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetIndexRecordCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pcrec, crecmax) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pcrec;
    (void)crecmax;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetInit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance) : -1;
#else
    (void)pinstance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetInit2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetInit2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance, grbit) : -1;
#else
    (void)pinstance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetInit3A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prstinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetInit3A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance, prstinfo, grbit) : -1;
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetInit3W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prstinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetInit3W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance, prstinfo, grbit) : -1;
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetIntersectIndexes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* rgindexrange = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cindexrange = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* precordlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetIntersectIndexes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, rgindexrange, cindexrange, precordlist, grbit) : -1;
#else
    (void)sesid;
    (void)rgindexrange;
    (void)cindexrange;
    (void)precordlist;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetMakeKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetMakeKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvdata, cbdata, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetMove_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int32_t crow = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetMove")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, crow, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)crow;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotAbort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotAbort")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, grbit) : -1;
#else
    (void)snapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotEnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotEnd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, grbit) : -1;
#else
    (void)snapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pcinstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* painstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotFreezeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit) : -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pcinstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* painstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotFreezeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit) : -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pcinstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* painstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotGetFreezeInfoA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit) : -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pcinstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* painstanceinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotGetFreezeInfoW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit) : -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotPrepare_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psnapid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotPrepare")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(psnapid, grbit) : -1;
#else
    (void)psnapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotPrepareInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t instance = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotPrepareInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, instance, grbit) : -1;
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotThaw_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotThaw")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, grbit) : -1;
#else
    (void)snapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotTruncateLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, grbit) : -1;
#else
    (void)snapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLogInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t snapid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t instance = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOSSnapshotTruncateLogInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(snapid, instance, grbit) : -1;
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenDatabaseA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szconnect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdbid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenDatabaseA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenDatabaseW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szconnect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdbid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenDatabaseW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenFileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phffile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pulfilesizelow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pulfilesizehigh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenFileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szfilename, phffile, pulfilesizelow, pulfilesizehigh) : -1;
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenFileInstanceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phffile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pulfilesizelow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pulfilesizehigh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenFileInstanceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, szfilename, phffile, pulfilesizelow, pulfilesizehigh) : -1;
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenFileInstanceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phffile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pulfilesizelow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pulfilesizehigh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenFileInstanceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, szfilename, phffile, pulfilesizelow, pulfilesizehigh) : -1;
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenFileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phffile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pulfilesizelow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pulfilesizehigh = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenFileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szfilename, phffile, pulfilesizelow, pulfilesizehigh) : -1;
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenTableA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbparameters = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* ptableid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenTableA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, pvparameters, cbparameters, grbit, ptableid) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenTableW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvparameters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbparameters = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* ptableid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenTableW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, pvparameters, cbparameters, grbit, ptableid) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenTempTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* prgcolumndef = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ccolumn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ptableid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* prgcolumnid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenTempTable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, prgcolumndef, ccolumn, grbit, ptableid, prgcolumnid) : -1;
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenTempTable2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* prgcolumndef = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ccolumn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t lcid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ptableid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* prgcolumnid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenTempTable2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, prgcolumndef, ccolumn, lcid, grbit, ptableid, prgcolumnid) : -1;
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)lcid;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenTempTable3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* prgcolumndef = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ccolumn = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pidxunicode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ptableid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* prgcolumnid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenTempTable3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, prgcolumndef, ccolumn, pidxunicode, grbit, ptableid, prgcolumnid) : -1;
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)pidxunicode;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenTemporaryTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* popentemporarytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenTemporaryTable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, popentemporarytable) : -1;
#else
    (void)sesid;
    (void)popentemporarytable;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetOpenTemporaryTable2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* popentemporarytable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetOpenTemporaryTable2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, popentemporarytable) : -1;
#else
    (void)sesid;
    (void)popentemporarytable;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetPrepareUpdate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t prep = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetPrepareUpdate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, prep) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)prep;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetPrereadIndexRanges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* rgindexranges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cindexranges = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcrangespreread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* rgcolumnidpreread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t ccolumnidpreread = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetPrereadIndexRanges")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, rgindexranges, cindexranges, pcrangespreread, rgcolumnidpreread, ccolumnidpreread, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)rgindexranges;
    (void)cindexranges;
    (void)pcrangespreread;
    (void)rgcolumnidpreread;
    (void)ccolumnidpreread;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetPrereadKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* rgpvkeys = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* rgcbkeys = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t ckeys = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pckeyspreread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetPrereadKeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, rgpvkeys, rgcbkeys, ckeys, pckeyspreread, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)rgpvkeys;
    (void)rgcbkeys;
    (void)ckeys;
    (void)pckeyspreread;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetReadFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hffile = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cb = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetReadFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hffile, pv, cb, pcbactual) : -1;
#else
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetReadFileInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t hffile = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cb = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetReadFileInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, hffile, pv, cb, pcbactual) : -1;
#else
    (void)instance;
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRegisterCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t cbtyp = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvcontext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* phcallbackid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRegisterCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, cbtyp, pcallback, pvcontext, phcallbackid) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)pcallback;
    (void)pvcontext;
    (void)phcallbackid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRenameColumnA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sznamenew = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRenameColumnA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szname, sznamenew, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRenameColumnW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sznamenew = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRenameColumnW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szname, sznamenew, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRenameTableA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sznamenew = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRenameTableA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, szname, sznamenew) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRenameTableW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* szname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* sznamenew = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRenameTableW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, szname, sznamenew) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetResetSessionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetResetSessionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid) : -1;
#else
    (void)sesid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetResetTableSequential_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetResetTableSequential")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetResizeDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t cpgtarget = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcpgactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetResizeDatabase")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, cpgtarget, pcpgactual, grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)cpgtarget;
    (void)pcpgactual;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRestore2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szdest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRestore2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sz, szdest, pfn) : -1;
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRestore2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szdest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRestore2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sz, szdest, pfn) : -1;
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRestoreA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRestoreA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szsource, pfn) : -1;
#else
    (void)szsource;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRestoreInstanceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* sz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRestoreInstanceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, sz, szdest, pfn) : -1;
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRestoreInstanceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* sz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* szdest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRestoreInstanceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, sz, szdest, pfn) : -1;
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRestoreW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* szsource = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRestoreW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(szsource, pfn) : -1;
#else
    (void)szsource;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRetrieveColumn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t columnid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pretinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRetrieveColumn")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, columnid, pvdata, cbdata, pcbactual, grbit, pretinfo) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pvdata;
    (void)cbdata;
    (void)pcbactual;
    (void)grbit;
    (void)pretinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRetrieveColumns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pretrievecolumn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cretrievecolumn = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRetrieveColumns")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pretrievecolumn, cretrievecolumn) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pretrievecolumn;
    (void)cretrievecolumn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRetrieveKey_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbmax = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRetrieveKey")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvkey, cbmax, pcbactual, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvkey;
    (void)cbmax;
    (void)pcbactual;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetRollback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetRollback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSeek_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSeek")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetColumn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t columnid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* psetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetColumn")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, columnid, pvdata, cbdata, grbit, psetinfo) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    (void)psetinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetColumnDefaultValueA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, szcolumnname, pvdata, cbdata, grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t dbid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sztablename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* szcolumnname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbdata = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetColumnDefaultValueW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, dbid, sztablename, szcolumnname, pvdata, cbdata, grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetColumns_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* psetcolumn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t csetcolumn = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetColumns")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, psetcolumn, csetcolumn) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)psetcolumn;
    (void)csetcolumn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetCurrentIndex2A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetCurrentIndex2A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetCurrentIndex2W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetCurrentIndex2W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetCurrentIndex3A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t itagsequence = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetCurrentIndex3A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, grbit, itagsequence) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetCurrentIndex3W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t itagsequence = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetCurrentIndex3W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, grbit, itagsequence) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetCurrentIndex4A_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pindexid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t itagsequence = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetCurrentIndex4A")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, pindexid, grbit, itagsequence) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetCurrentIndex4W_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pindexid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t itagsequence = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetCurrentIndex4W")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname, pindexid, grbit, itagsequence) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetCurrentIndexA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetCurrentIndexA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetCurrentIndexW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* szindexname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetCurrentIndexW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, szindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetCursorFilter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* rgcolumnfilters = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ccolumnfilters = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetCursorFilter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, rgcolumnfilters, ccolumnfilters, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)rgcolumnfilters;
    (void)ccolumnfilters;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetDatabaseSizeA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szdatabasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpg = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcpgreal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetDatabaseSizeA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szdatabasename, cpg, pcpgreal) : -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetDatabaseSizeW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    void* szdatabasename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cpg = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcpgreal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetDatabaseSizeW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, szdatabasename, cpg, pcpgreal) : -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetIndexRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableidsrc = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetIndexRange")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableidsrc, grbit) : -1;
#else
    (void)sesid;
    (void)tableidsrc;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetLS_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint64_t ls = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetLS")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, ls, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)ls;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetSessionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t ulcontext = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetSessionContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, ulcontext) : -1;
#else
    (void)sesid;
    (void)ulcontext;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetSessionParameter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t sesparamid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbparam = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetSessionParameter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, sesparamid, pvparam, cbparam) : -1;
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetSystemParameterA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t sesid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t paramid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t lparam = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* szparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetSystemParameterA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance, sesid, paramid, lparam, szparam) : -1;
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetSystemParameterW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t sesid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t paramid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t lparam = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    void* szparam = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetSystemParameterW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinstance, sesid, paramid, lparam, szparam) : -1;
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetSetTableSequential_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetSetTableSequential")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetStopBackup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetStopBackup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetStopBackupInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetStopBackupInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetStopService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetStopService")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetStopServiceInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetStopServiceInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetStopServiceInstance2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetStopServiceInstance2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, grbit) : -1;
#else
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetTerm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetTerm")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetTerm2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetTerm2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance, grbit) : -1;
#else
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetTruncateLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetTruncateLog")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetTruncateLogInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetTruncateLogInstance")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetUnregisterCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    uint32_t cbtyp = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t hcallbackid = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetUnregisterCallback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, cbtyp, hcallbackid) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)hcallbackid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetUpdate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvbookmark = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbookmark = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetUpdate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvbookmark, cbbookmark, pcbactual) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_storage_jet_JetUpdate2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
    uint64_t tableid = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* pvbookmark = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbbookmark = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbactual = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetUpdate2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sesid, tableid, pvbookmark, cbbookmark, pcbactual, grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_storage_jet_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_storage_jet_JetAddColumnA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetAddColumnA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetAddColumnW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetAddColumnW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetAttachDatabase2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetAttachDatabase2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetAttachDatabase2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetAttachDatabase2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetAttachDatabaseA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetAttachDatabaseA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetAttachDatabaseW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetAttachDatabaseW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBackupA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBackupA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBackupInstanceA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBackupInstanceA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBackupInstanceW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBackupInstanceW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBackupW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBackupW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBeginExternalBackup", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBeginExternalBackup_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBeginExternalBackupInstance", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBeginExternalBackupInstance_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBeginSessionA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBeginSessionA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBeginSessionW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBeginSessionW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBeginTransaction", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBeginTransaction_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBeginTransaction2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBeginTransaction2_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetBeginTransaction3", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetBeginTransaction3_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCloseDatabase", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCloseDatabase_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCloseFile", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCloseFile_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCloseFileInstance", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCloseFileInstance_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCloseTable", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCloseTable_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCommitTransaction", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCommitTransaction_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCommitTransaction2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCommitTransaction2_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCompactA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCompactA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCompactW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCompactW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetComputeStats", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetComputeStats_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetConfigureProcessForCrashDump", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetConfigureProcessForCrashDump_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateDatabase2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateDatabase2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateDatabase2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateDatabase2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateDatabaseA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateDatabaseA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateDatabaseW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateDatabaseW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateIndex2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateIndex2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateIndex2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateIndex2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateIndex3A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateIndex3A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateIndex3W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateIndex3W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateIndex4A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateIndex4A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateIndex4W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateIndex4W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateIndexA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateIndexA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateIndexW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateIndexW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateInstance2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateInstance2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateInstance2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateInstance2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateInstanceA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateInstanceA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateInstanceW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateInstanceW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetCreateTableW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetCreateTableW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDefragment2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDefragment2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDefragment2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDefragment2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDefragment3A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDefragment3A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDefragment3W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDefragment3W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDefragmentA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDefragmentA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDefragmentW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDefragmentW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDelete", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDelete_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDeleteColumn2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDeleteColumn2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDeleteColumn2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDeleteColumn2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDeleteColumnA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDeleteColumnA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDeleteColumnW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDeleteColumnW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDeleteIndexA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDeleteIndexA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDeleteIndexW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDeleteIndexW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDeleteTableA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDeleteTableA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDeleteTableW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDeleteTableW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDetachDatabase2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDetachDatabase2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDetachDatabase2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDetachDatabase2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDetachDatabaseA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDetachDatabaseA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDetachDatabaseW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDetachDatabaseW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDupCursor", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDupCursor_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetDupSession", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetDupSession_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetEnableMultiInstanceA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetEnableMultiInstanceA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetEnableMultiInstanceW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetEnableMultiInstanceW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetEndExternalBackup", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetEndExternalBackup_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance2_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetEndSession", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetEndSession_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetEnumerateColumns", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetEnumerateColumns_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetEscrowUpdate", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetEscrowUpdate_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetExternalRestore2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetExternalRestore2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetExternalRestore2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetExternalRestore2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetExternalRestoreA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetExternalRestoreA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetExternalRestoreW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetExternalRestoreW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetFreeBuffer", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetFreeBuffer_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetAttachInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetAttachInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetAttachInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetAttachInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetBookmark", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetBookmark_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetColumnInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetColumnInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetColumnInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetColumnInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetCurrentIndexA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetCurrentIndexA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetCurrentIndexW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetCurrentIndexW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetCursorInfo", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetCursorInfo_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetDatabaseInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetDatabaseInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetDatabaseInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetDatabaseInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetErrorInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetErrorInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetIndexInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetIndexInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetIndexInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetIndexInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetInstanceInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetInstanceInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetInstanceInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetInstanceInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetInstanceMiscInfo", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetInstanceMiscInfo_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetLS", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetLS_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetLock", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetLock_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetLogInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetLogInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetLogInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetLogInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetObjectInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetObjectInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetObjectInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetObjectInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetRecordPosition", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetRecordPosition_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetRecordSize", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetRecordSize_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetRecordSize2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetRecordSize2_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetSecondaryIndexBookmark", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetSecondaryIndexBookmark_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetSessionParameter", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetSessionParameter_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetSystemParameterA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetSystemParameterA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetSystemParameterW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetSystemParameterW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetTableColumnInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetTableColumnInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetTableColumnInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetTableColumnInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetTableIndexInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetTableIndexInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetTableIndexInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetTableIndexInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetTableInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetTableInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetTableInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetTableInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetThreadStats", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetThreadStats_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGetVersion", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGetVersion_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGotoBookmark", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGotoBookmark_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGotoPosition", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGotoPosition_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGotoSecondaryIndexBookmark", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGotoSecondaryIndexBookmark_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetGrowDatabase", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetGrowDatabase_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetIdle", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetIdle_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetIndexRecordCount", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetIndexRecordCount_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetInit", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetInit_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetInit2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetInit2_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetInit3A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetInit3A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetInit3W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetInit3W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetIntersectIndexes", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetIntersectIndexes_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetMakeKey", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetMakeKey_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetMove", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetMove_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotAbort", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotAbort_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotEnd", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotEnd_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotPrepare", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotPrepare_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotPrepareInstance", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotPrepareInstance_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotThaw", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotThaw_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLog", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLog_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLogInstance", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLogInstance_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenDatabaseA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenDatabaseA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenDatabaseW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenDatabaseW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenFileA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenFileA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenFileInstanceA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenFileInstanceA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenFileInstanceW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenFileInstanceW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenFileW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenFileW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenTableA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenTableA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenTableW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenTableW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenTempTable", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenTempTable_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenTempTable2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenTempTable2_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenTempTable3", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenTempTable3_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenTemporaryTable", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenTemporaryTable_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetOpenTemporaryTable2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetOpenTemporaryTable2_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetPrepareUpdate", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetPrepareUpdate_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetPrereadIndexRanges", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetPrereadIndexRanges_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetPrereadKeys", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetPrereadKeys_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetReadFile", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetReadFile_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetReadFileInstance", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetReadFileInstance_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRegisterCallback", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRegisterCallback_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRenameColumnA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRenameColumnA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRenameColumnW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRenameColumnW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRenameTableA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRenameTableA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRenameTableW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRenameTableW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetResetSessionContext", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetResetSessionContext_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetResetTableSequential", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetResetTableSequential_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetResizeDatabase", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetResizeDatabase_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRestore2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRestore2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRestore2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRestore2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRestoreA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRestoreA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRestoreInstanceA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRestoreInstanceA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRestoreInstanceW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRestoreInstanceW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRestoreW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRestoreW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRetrieveColumn", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRetrieveColumn_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRetrieveColumns", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRetrieveColumns_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRetrieveKey", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRetrieveKey_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetRollback", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetRollback_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSeek", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSeek_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetColumn", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetColumn_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetColumns", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetColumns_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetCurrentIndex2A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetCurrentIndex2A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetCurrentIndex2W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetCurrentIndex2W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetCurrentIndex3A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetCurrentIndex3A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetCurrentIndex3W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetCurrentIndex3W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetCurrentIndex4A", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetCurrentIndex4A_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetCurrentIndex4W", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetCurrentIndex4W_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetCurrentIndexA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetCurrentIndexA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetCurrentIndexW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetCurrentIndexW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetCursorFilter", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetCursorFilter_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetDatabaseSizeA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetDatabaseSizeA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetDatabaseSizeW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetDatabaseSizeW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetIndexRange", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetIndexRange_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetLS", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetLS_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetSessionContext", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetSessionContext_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetSessionParameter", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetSessionParameter_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetSystemParameterA", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetSystemParameterA_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetSystemParameterW", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetSystemParameterW_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetSetTableSequential", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetSetTableSequential_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetStopBackup", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetStopBackup_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetStopBackupInstance", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetStopBackupInstance_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetStopService", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetStopService_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetStopServiceInstance", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetStopServiceInstance_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetStopServiceInstance2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetStopServiceInstance2_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetTerm", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetTerm_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetTerm2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetTerm2_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetTruncateLog", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetTruncateLog_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetTruncateLogInstance", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetTruncateLogInstance_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetUnregisterCallback", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetUnregisterCallback_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetUpdate", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetUpdate_napi));
    exports.Set("windowssys_windows_win32_storage_jet_JetUpdate2", Napi::Function::New(env, windowssys_windows_win32_storage_jet_JetUpdate2_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_storage_jet_napi, nullptr };
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
