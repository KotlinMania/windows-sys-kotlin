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

static Napi::Value windowssysWindowsWin32StorageJetJetAddColumnA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szcolumnname, pcolumndef, pvdefault, cbdefault, pcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetAddColumnW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szcolumnname, pcolumndef, pvdefault, cbdefault, pcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetAttachDatabase2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetAttachDatabase2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetAttachDatabaseA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetAttachDatabaseW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBackupA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szbackuppath, grbit, pfnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBackupInstanceA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, szbackuppath, grbit, pfnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBackupInstanceW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, szbackuppath, grbit, pfnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBackupW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szbackuppath, grbit, pfnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBeginExternalBackup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBeginExternalBackup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBeginSessionA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, psesid, szusername, szpassword);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBeginSessionW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, psesid, szusername, szpassword);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBeginTransaction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetBeginTransaction")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBeginTransaction2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetBeginTransaction3_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, trxid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)trxid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCloseDatabase_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCloseFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t hffile = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetCloseFile")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hffile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hffile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCloseFileInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, hffile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)hffile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCloseTable_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCommitTransaction_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCommitTransaction2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, grbit, cmsecdurablecommit, pcommitid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    (void)cmsecdurablecommit;
    (void)pcommitid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCompactA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szdatabasesrc, szdatabasedest, pfnstatus, pconvert, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCompactW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szdatabasesrc, szdatabasedest, pfnstatus, pconvert, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetComputeStats_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t grbit = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetConfigureProcessForCrashDump")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateDatabase2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, pdbid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateDatabase2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, pdbid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateDatabaseA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateDatabaseW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateIndex2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateIndex2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateIndex3A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateIndex3W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateIndex4A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateIndex4W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateIndexA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, grbit, szkey, cbkey, ldensity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateIndexW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, grbit, szkey, cbkey, ldensity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateInstance2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance, szinstancename, szdisplayname, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateInstance2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance, szinstancename, szdisplayname, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateInstanceA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance, szinstancename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)szinstancename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateInstanceW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance, szinstancename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)szinstancename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, lpages, ldensity, ptableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetCreateTableW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, lpages, ldensity, ptableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDefragment2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, callback, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDefragment2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, callback, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDefragment3A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szdatabasename, sztablename, pcpasses, pcseconds, callback, pvcontext, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasename;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)pvcontext;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDefragment3W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szdatabasename, sztablename, pcpasses, pcseconds, callback, pvcontext, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasename;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)pvcontext;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDefragmentA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDefragmentW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDelete_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDeleteColumn2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szcolumnname, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDeleteColumn2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szcolumnname, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDeleteColumnA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDeleteColumnW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDeleteIndexA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDeleteIndexW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDeleteTableA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDeleteTableW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDetachDatabase2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDetachDatabase2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDetachDatabaseA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDetachDatabaseW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDupCursor_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, ptableid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)ptableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetDupSession_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, psesid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)psesid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetEnableMultiInstanceA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psetsysparam, csetsysparam, pcsetsucceed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetEnableMultiInstanceW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psetsysparam, csetsysparam, pcsetsucceed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetEndExternalBackup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEndExternalBackup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetEndExternalBackupInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetEndExternalBackupInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetEndSession_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetEnumerateColumns_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, cenumcolumnid, rgenumcolumnid, pcenumcolumn, prgenumcolumn, pfnrealloc, pvrealloccontext, cbdatamost, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetEscrowUpdate_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, columnid, pv, cbmax, pvold, cboldmax, pcboldactual, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetExternalRestore2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetExternalRestore2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetExternalRestoreA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, genlow, genhigh, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)genlow;
    (void)genhigh;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetExternalRestoreW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, genlow, genhigh, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)genlow;
    (void)genhigh;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetFreeBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbbuf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetFreeBuffer")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pbbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbbuf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetAttachInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szzdatabases, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, szzdatabases, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, szzdatabases, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetAttachInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(wszzdatabases, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetBookmark_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvbookmark, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetColumnInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, pcolumnnameorid, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetColumnInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, pwcolumnnameorid, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pwcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetCurrentIndexA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, cbindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetCurrentIndexW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, cbindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetCursorInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szdatabasename, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szdatabasename, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetDatabaseInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetDatabaseInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetErrorInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pvcontext, pvresult, cbmax, infolevel, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvcontext;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetIndexInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, szindexname, pvresult, cbresult, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetIndexInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, szindexname, pvresult, cbresult, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetInstanceInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pcinstanceinfo, painstanceinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetInstanceInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pcinstanceinfo, painstanceinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetLS_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pls, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pls;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetLock_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetLogInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szzlogs, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, szzlogs, cbmax, pcbactual, ploginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, wszzlogs, cbmax, pcbactual, ploginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, szzlogs, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, wszzlogs, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetLogInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szzlogs, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetObjectInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, objtyp, szcontainername, szobjectname, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)objtyp;
    (void)szcontainername;
    (void)szobjectname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetObjectInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, objtyp, szcontainername, szobjectname, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)objtyp;
    (void)szcontainername;
    (void)szobjectname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetRecordPosition_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, precpos, cbrecpos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    (void)cbrecpos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetRecordSize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, precsize, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetRecordSize2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, precsize, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvsecondarykey, cbsecondarykeymax, pcbsecondarykeyactual, pvprimarybookmark, cbprimarybookmarkmax, pcbprimarybookmarkactual, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetSessionParameter_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, sesparamid, pvparam, cbparammax, pcbparamactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparammax;
    (void)pcbparamactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetSystemParameterA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, sesid, paramid, plparam, szparam, cbmax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetSystemParameterW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, sesid, paramid, plparam, szparam, cbmax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetTableColumnInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szcolumnname, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetTableColumnInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szcolumnname, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetTableIndexInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, pvresult, cbresult, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetTableIndexInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, pvresult, cbresult, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetTableInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetTableInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvresult, cbmax, infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetThreadStats_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pvresult, cbmax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvresult;
    (void)cbmax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, szzlogs, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, wszzlogs, cbmax, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGetVersion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, pwversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)pwversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGotoBookmark_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvbookmark, cbbookmark);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGotoPosition_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, precpos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvsecondarykey, cbsecondarykey, pvprimarybookmark, cbprimarybookmark, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvsecondarykey;
    (void)cbsecondarykey;
    (void)pvprimarybookmark;
    (void)cbprimarybookmark;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetGrowDatabase_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, cpg, pcpgreal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)cpg;
    (void)pcpgreal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetIdle_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetIndexRecordCount_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pcrec, crecmax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pcrec;
    (void)crecmax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetInit")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetInit2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetInit3A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance, prstinfo, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetInit3W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance, prstinfo, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetIntersectIndexes_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, rgindexrange, cindexrange, precordlist, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)rgindexrange;
    (void)cindexrange;
    (void)precordlist;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetMakeKey_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvdata, cbdata, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetMove_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, crow, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)crow;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotAbort_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotEnd_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotPrepare_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psnapid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psnapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, instance, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotThaw_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(snapid, instance, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenDatabaseA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenDatabaseW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenFileA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szfilename, phffile, pulfilesizelow, pulfilesizehigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenFileInstanceA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, szfilename, phffile, pulfilesizelow, pulfilesizehigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenFileInstanceW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, szfilename, phffile, pulfilesizelow, pulfilesizehigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenFileW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szfilename, phffile, pulfilesizelow, pulfilesizehigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenTableA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, pvparameters, cbparameters, grbit, ptableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenTableW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, pvparameters, cbparameters, grbit, ptableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenTempTable_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, prgcolumndef, ccolumn, grbit, ptableid, prgcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenTempTable2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, prgcolumndef, ccolumn, lcid, grbit, ptableid, prgcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)lcid;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenTempTable3_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, prgcolumndef, ccolumn, pidxunicode, grbit, ptableid, prgcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)pidxunicode;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenTemporaryTable_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, popentemporarytable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)popentemporarytable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetOpenTemporaryTable2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, popentemporarytable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)popentemporarytable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetPrepareUpdate_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, prep);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)prep;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetPrereadIndexRanges_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, rgindexranges, cindexranges, pcrangespreread, rgcolumnidpreread, ccolumnidpreread, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)rgindexranges;
    (void)cindexranges;
    (void)pcrangespreread;
    (void)rgcolumnidpreread;
    (void)ccolumnidpreread;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetPrereadKeys_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, rgpvkeys, rgcbkeys, ckeys, pckeyspreread, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)rgpvkeys;
    (void)rgcbkeys;
    (void)ckeys;
    (void)pckeyspreread;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetReadFile_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hffile, pv, cb, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetReadFileInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, hffile, pv, cb, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRegisterCallback_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, cbtyp, pcallback, pvcontext, phcallbackid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)pcallback;
    (void)pvcontext;
    (void)phcallbackid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRenameColumnA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szname, sznamenew, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRenameColumnW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szname, sznamenew, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRenameTableA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, szname, sznamenew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRenameTableW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, szname, sznamenew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetResetSessionContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t sesid = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetResetSessionContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetResetTableSequential_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetResizeDatabase_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, cpgtarget, pcpgactual, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)cpgtarget;
    (void)pcpgactual;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRestore2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sz, szdest, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRestore2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sz, szdest, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRestoreA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szsource, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szsource;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRestoreInstanceA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, sz, szdest, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRestoreInstanceW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, sz, szdest, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRestoreW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(szsource, pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szsource;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRetrieveColumn_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, columnid, pvdata, cbdata, pcbactual, grbit, pretinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pvdata;
    (void)cbdata;
    (void)pcbactual;
    (void)grbit;
    (void)pretinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRetrieveColumns_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pretrievecolumn, cretrievecolumn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pretrievecolumn;
    (void)cretrievecolumn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRetrieveKey_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvkey, cbmax, pcbactual, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvkey;
    (void)cbmax;
    (void)pcbactual;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetRollback_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSeek_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetColumn_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, columnid, pvdata, cbdata, grbit, psetinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    (void)psetinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, szcolumnname, pvdata, cbdata, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, dbid, sztablename, szcolumnname, pvdata, cbdata, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetColumns_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, psetcolumn, csetcolumn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)psetcolumn;
    (void)csetcolumn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetCurrentIndex2A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetCurrentIndex2W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetCurrentIndex3A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, grbit, itagsequence);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetCurrentIndex3W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, grbit, itagsequence);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetCurrentIndex4A_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, pindexid, grbit, itagsequence);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetCurrentIndex4W_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname, pindexid, grbit, itagsequence);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetCurrentIndexA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetCurrentIndexW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, szindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetCursorFilter_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, rgcolumnfilters, ccolumnfilters, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)rgcolumnfilters;
    (void)ccolumnfilters;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetDatabaseSizeA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szdatabasename, cpg, pcpgreal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetDatabaseSizeW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, szdatabasename, cpg, pcpgreal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetIndexRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableidsrc, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableidsrc;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetLS_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, ls, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)ls;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetSessionContext_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, ulcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)ulcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetSessionParameter_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, sesparamid, pvparam, cbparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetSystemParameterA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance, sesid, paramid, lparam, szparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetSystemParameterW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pinstance, sesid, paramid, lparam, szparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetSetTableSequential_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetStopBackup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetStopBackup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetStopBackupInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetStopBackupInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetStopService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetStopService")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetStopServiceInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetStopServiceInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetStopServiceInstance2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetTerm_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetTerm")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetTerm2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetTruncateLog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetTruncateLog")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetTruncateLogInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t instance = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "JetTruncateLogInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetUnregisterCallback_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, cbtyp, hcallbackid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)hcallbackid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetUpdate_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvbookmark, cbbookmark, pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32StorageJetJetUpdate2_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sesid, tableid, pvbookmark, cbbookmark, pcbactual, grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_storage_jet_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32StorageJetJetAddColumnA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetAddColumnA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetAddColumnW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetAddColumnW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetAttachDatabase2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetAttachDatabase2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetAttachDatabase2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetAttachDatabase2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetAttachDatabaseA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetAttachDatabaseA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetAttachDatabaseW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetAttachDatabaseW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBackupA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBackupA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBackupInstanceA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBackupInstanceA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBackupInstanceW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBackupInstanceW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBackupW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBackupW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBeginExternalBackup", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBeginExternalBackup_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBeginSessionA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBeginSessionA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBeginSessionW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBeginSessionW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBeginTransaction", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBeginTransaction_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBeginTransaction2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBeginTransaction2_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetBeginTransaction3", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetBeginTransaction3_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCloseDatabase", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCloseDatabase_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCloseFile", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCloseFile_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCloseFileInstance", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCloseFileInstance_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCloseTable", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCloseTable_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCommitTransaction", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCommitTransaction_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCommitTransaction2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCommitTransaction2_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCompactA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCompactA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCompactW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCompactW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetComputeStats", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetComputeStats_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateDatabase2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateDatabase2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateDatabase2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateDatabase2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateDatabaseA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateDatabaseA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateDatabaseW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateDatabaseW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateIndex2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateIndex2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateIndex2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateIndex2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateIndex3A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateIndex3A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateIndex3W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateIndex3W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateIndex4A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateIndex4A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateIndex4W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateIndex4W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateIndexA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateIndexA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateIndexW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateIndexW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateInstance2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateInstance2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateInstance2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateInstance2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateInstanceA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateInstanceA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateInstanceW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateInstanceW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetCreateTableW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetCreateTableW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDefragment2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDefragment2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDefragment2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDefragment2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDefragment3A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDefragment3A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDefragment3W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDefragment3W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDefragmentA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDefragmentA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDefragmentW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDefragmentW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDelete", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDelete_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDeleteColumn2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDeleteColumn2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDeleteColumn2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDeleteColumn2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDeleteColumnA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDeleteColumnA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDeleteColumnW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDeleteColumnW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDeleteIndexA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDeleteIndexA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDeleteIndexW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDeleteIndexW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDeleteTableA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDeleteTableA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDeleteTableW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDeleteTableW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDetachDatabase2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDetachDatabase2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDetachDatabase2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDetachDatabase2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDetachDatabaseA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDetachDatabaseA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDetachDatabaseW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDetachDatabaseW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDupCursor", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDupCursor_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetDupSession", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetDupSession_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetEnableMultiInstanceA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetEnableMultiInstanceA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetEnableMultiInstanceW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetEnableMultiInstanceW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetEndExternalBackup", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetEndExternalBackup_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetEndExternalBackupInstance", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetEndExternalBackupInstance_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetEndSession", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetEndSession_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetEnumerateColumns", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetEnumerateColumns_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetEscrowUpdate", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetEscrowUpdate_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetExternalRestore2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetExternalRestore2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetExternalRestore2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetExternalRestore2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetExternalRestoreA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetExternalRestoreA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetExternalRestoreW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetExternalRestoreW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetFreeBuffer", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetFreeBuffer_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetAttachInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetAttachInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetAttachInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetAttachInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetBookmark", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetBookmark_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetColumnInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetColumnInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetColumnInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetColumnInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetCurrentIndexA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetCurrentIndexA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetCurrentIndexW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetCurrentIndexW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetCursorInfo", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetCursorInfo_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetDatabaseInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetDatabaseInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetDatabaseInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetDatabaseInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetErrorInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetErrorInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetIndexInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetIndexInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetIndexInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetIndexInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetInstanceInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetInstanceInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetInstanceInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetInstanceInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetLS", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetLS_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetLock", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetLock_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetLogInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetLogInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetLogInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetLogInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetObjectInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetObjectInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetObjectInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetObjectInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetRecordPosition", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetRecordPosition_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetRecordSize", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetRecordSize_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetRecordSize2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetRecordSize2_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetSessionParameter", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetSessionParameter_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetSystemParameterA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetSystemParameterA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetSystemParameterW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetSystemParameterW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetTableColumnInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetTableColumnInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetTableColumnInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetTableColumnInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetTableIndexInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetTableIndexInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetTableIndexInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetTableIndexInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetTableInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetTableInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetTableInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetTableInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetThreadStats", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetThreadStats_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGetVersion", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGetVersion_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGotoBookmark", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGotoBookmark_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGotoPosition", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGotoPosition_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetGrowDatabase", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetGrowDatabase_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetIdle", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetIdle_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetIndexRecordCount", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetIndexRecordCount_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetInit", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetInit_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetInit2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetInit2_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetInit3A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetInit3A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetInit3W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetInit3W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetIntersectIndexes", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetIntersectIndexes_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetMakeKey", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetMakeKey_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetMove", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetMove_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotAbort", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotAbort_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotEnd", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotEnd_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotPrepare", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotPrepare_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotThaw", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotThaw_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenDatabaseA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenDatabaseA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenDatabaseW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenDatabaseW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenFileA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenFileA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenFileInstanceA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenFileInstanceA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenFileInstanceW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenFileInstanceW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenFileW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenFileW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenTableA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenTableA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenTableW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenTableW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenTempTable", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenTempTable_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenTempTable2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenTempTable2_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenTempTable3", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenTempTable3_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenTemporaryTable", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenTemporaryTable_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetOpenTemporaryTable2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetOpenTemporaryTable2_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetPrepareUpdate", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetPrepareUpdate_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetPrereadIndexRanges", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetPrereadIndexRanges_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetPrereadKeys", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetPrereadKeys_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetReadFile", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetReadFile_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetReadFileInstance", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetReadFileInstance_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRegisterCallback", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRegisterCallback_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRenameColumnA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRenameColumnA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRenameColumnW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRenameColumnW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRenameTableA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRenameTableA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRenameTableW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRenameTableW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetResetSessionContext", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetResetSessionContext_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetResetTableSequential", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetResetTableSequential_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetResizeDatabase", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetResizeDatabase_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRestore2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRestore2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRestore2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRestore2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRestoreA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRestoreA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRestoreInstanceA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRestoreInstanceA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRestoreInstanceW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRestoreInstanceW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRestoreW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRestoreW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRetrieveColumn", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRetrieveColumn_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRetrieveColumns", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRetrieveColumns_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRetrieveKey", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRetrieveKey_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetRollback", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetRollback_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSeek", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSeek_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetColumn", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetColumn_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetColumns", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetColumns_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetCurrentIndex2A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetCurrentIndex2A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetCurrentIndex2W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetCurrentIndex2W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetCurrentIndex3A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetCurrentIndex3A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetCurrentIndex3W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetCurrentIndex3W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetCurrentIndex4A", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetCurrentIndex4A_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetCurrentIndex4W", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetCurrentIndex4W_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetCurrentIndexA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetCurrentIndexA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetCurrentIndexW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetCurrentIndexW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetCursorFilter", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetCursorFilter_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetDatabaseSizeA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetDatabaseSizeA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetDatabaseSizeW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetDatabaseSizeW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetIndexRange", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetIndexRange_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetLS", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetLS_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetSessionContext", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetSessionContext_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetSessionParameter", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetSessionParameter_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetSystemParameterA", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetSystemParameterA_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetSystemParameterW", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetSystemParameterW_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetSetTableSequential", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetSetTableSequential_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetStopBackup", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetStopBackup_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetStopBackupInstance", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetStopBackupInstance_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetStopService", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetStopService_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetStopServiceInstance", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetStopServiceInstance_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetStopServiceInstance2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetStopServiceInstance2_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetTerm", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetTerm_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetTerm2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetTerm2_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetTruncateLog", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetTruncateLog_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetTruncateLogInstance", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetTruncateLogInstance_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetUnregisterCallback", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetUnregisterCallback_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetUpdate", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetUpdate_napi));
    exports.Set("windowssysWindowsWin32StorageJetJetUpdate2", Napi::Function::New(env, windowssysWindowsWin32StorageJetJetUpdate2_napi));
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
