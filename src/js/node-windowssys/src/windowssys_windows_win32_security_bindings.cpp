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

static Napi::Value windowssysWindowsWin32SecurityAccessCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* privilegeset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* privilegesetlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheck")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, clienttoken, desiredaccess, genericmapping, privilegeset, privilegesetlength, grantedaccess, accessstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)genericmapping;
    (void)privilegeset;
    (void)privilegesetlength;
    (void)grantedaccess;
    (void)accessstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pfgenerateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckAndAuditAlarmA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess, genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* pfgenerateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckAndAuditAlarmW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess, genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckByType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* privilegeset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* privilegesetlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckByType")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, principalselfsid, clienttoken, desiredaccess, objecttypelist, objecttypelistlength, genericmapping, privilegeset, privilegesetlength, grantedaccess, accessstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)principalselfsid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)privilegeset;
    (void)privilegesetlength;
    (void)grantedaccess;
    (void)accessstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* pfgenerateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckByTypeAndAuditAlarmA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
    void* accessstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* pfgenerateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckByTypeAndAuditAlarmW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckByTypeResultList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* privilegeset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* privilegesetlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* grantedaccesslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* accessstatuslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckByTypeResultList")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, principalselfsid, clienttoken, desiredaccess, objecttypelist, objecttypelistlength, genericmapping, privilegeset, privilegesetlength, grantedaccesslist, accessstatuslist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)principalselfsid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)privilegeset;
    (void)privilegesetlength;
    (void)grantedaccesslist;
    (void)accessstatuslist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
    void* accessstatuslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* pfgenerateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatuslist, pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatuslist;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 13 ? km_info[13].ToNumber().Int32Value() : 0);
    void* grantedaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* accessstatuslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
    void* pfgenerateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 16 ? km_napi_arg_u64(km_info[16]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmByHandleA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatuslist, pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatuslist;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 12 ? km_napi_arg_u64(km_info[12]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 13 ? km_info[13].ToNumber().Int32Value() : 0);
    void* grantedaccesslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* accessstatuslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
    void* pfgenerateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 16 ? km_napi_arg_u64(km_info[16]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmByHandleW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccesslist, accessstatuslist, pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccesslist;
    (void)accessstatuslist;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* principalselfsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t audittype = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* objecttypelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    uint32_t objecttypelistlength = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
    void* grantedaccesslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
    void* accessstatuslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 14 ? km_napi_arg_u64(km_info[14]) : 0));
    void* pfgenerateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 15 ? km_napi_arg_u64(km_info[15]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccesslist, accessstatuslist, pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccesslist;
    (void)accessstatuslist;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAccessAllowedAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAccessAllowedAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, accessmask, psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAccessAllowedAceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAccessAllowedAceEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAccessAllowedObjectAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objecttypeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* inheritedobjecttypeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAccessAllowedObjectAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, objecttypeguid, inheritedobjecttypeguid, psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAccessDeniedAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAccessDeniedAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, accessmask, psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAccessDeniedAceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAccessDeniedAceEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAccessDeniedObjectAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objecttypeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* inheritedobjecttypeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAccessDeniedObjectAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, objecttypeguid, inheritedobjecttypeguid, psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwstartingaceindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pacelist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t nacelistlength = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, dwstartingaceindex, pacelist, nacelistlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)dwstartingaceindex;
    (void)pacelist;
    (void)nacelistlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAuditAccessAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwaccessmask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t bauditsuccess = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t bauditfailure = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAuditAccessAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, dwaccessmask, psid, bauditsuccess, bauditfailure);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)dwaccessmask;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAuditAccessAceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwaccessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t bauditsuccess = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t bauditfailure = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAuditAccessAceEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, dwaccessmask, psid, bauditsuccess, bauditfailure);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)dwaccessmask;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddAuditAccessObjectAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* objecttypeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* inheritedobjecttypeguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t bauditsuccess = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t bauditfailure = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddAuditAccessObjectAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, objecttypeguid, inheritedobjecttypeguid, psid, bauditsuccess, bauditfailure);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddConditionalAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint8_t acetype = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* conditionstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddConditionalAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, acetype, accessmask, psid, conditionstr, returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)acetype;
    (void)accessmask;
    (void)psid;
    (void)conditionstr;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddMandatoryAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t mandatorypolicy = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* plabelsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddMandatoryAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, mandatorypolicy, plabelsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)mandatorypolicy;
    (void)plabelsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddResourceAttributeAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pattributeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* preturnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddResourceAttributeAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, psid, pattributeinfo, preturnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    (void)pattributeinfo;
    (void)preturnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAddScopedPolicyIDAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwacerevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t aceflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t accessmask = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AddScopedPolicyIDAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAdjustTokenGroups_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t resettodefault = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* previousstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AdjustTokenGroups")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tokenhandle, resettodefault, newstate, bufferlength, previousstate, returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAdjustTokenPrivileges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t disableallprivileges = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* previousstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AdjustTokenPrivileges")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tokenhandle, disableallprivileges, newstate, bufferlength, previousstate, returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAllocateAndInitializeSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pidentifierauthority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t nsubauthoritycount = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t nsubauthority0 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t nsubauthority1 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t nsubauthority2 = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t nsubauthority3 = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t nsubauthority4 = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t nsubauthority5 = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t nsubauthority6 = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t nsubauthority7 = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllocateAndInitializeSid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pidentifierauthority, nsubauthoritycount, nsubauthority0, nsubauthority1, nsubauthority2, nsubauthority3, nsubauthority4, nsubauthority5, nsubauthority6, nsubauthority7, psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pidentifierauthority;
    (void)nsubauthoritycount;
    (void)nsubauthority0;
    (void)nsubauthority1;
    (void)nsubauthority2;
    (void)nsubauthority3;
    (void)nsubauthority4;
    (void)nsubauthority5;
    (void)nsubauthority6;
    (void)nsubauthority7;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAllocateLocallyUniqueId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* luid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AllocateLocallyUniqueId")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(luid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)luid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAreAllAccessesGranted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t grantedaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AreAllAccessesGranted")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(grantedaccess, desiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)grantedaccess;
    (void)desiredaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityAreAnyAccessesGranted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t grantedaccess = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AreAnyAccessesGranted")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(grantedaccess, desiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)grantedaccess;
    (void)desiredaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityCheckTokenCapability_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* capabilitysidtocheck = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hascapability = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckTokenCapability")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tokenhandle, capabilitysidtocheck, hascapability);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)capabilitysidtocheck;
    (void)hascapability;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityCheckTokenMembership_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sidtocheck = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ismember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckTokenMembership")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tokenhandle, sidtocheck, ismember);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)sidtocheck;
    (void)ismember;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityCheckTokenMembershipEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sidtocheck = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ismember = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckTokenMembershipEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tokenhandle, sidtocheck, flags, ismember);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)sidtocheck;
    (void)flags;
    (void)ismember;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* parentdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* currentsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objecttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool isdirectoryobject = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertToAutoInheritPrivateObjectSecurity")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(parentdescriptor, currentsecuritydescriptor, newsecuritydescriptor, objecttype, isdirectoryobject, genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)parentdescriptor;
    (void)currentsecuritydescriptor;
    (void)newsecuritydescriptor;
    (void)objecttype;
    (void)isdirectoryobject;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityCopySid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t ndestinationsidlength = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdestinationsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psourcesid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CopySid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ndestinationsidlength, pdestinationsid, psourcesid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndestinationsidlength;
    (void)pdestinationsid;
    (void)psourcesid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityCreatePrivateObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* parentdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* creatordescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t isdirectoryobject = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePrivateObjectSecurity")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(parentdescriptor, creatordescriptor, newdescriptor, isdirectoryobject, token, genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)parentdescriptor;
    (void)creatordescriptor;
    (void)newdescriptor;
    (void)isdirectoryobject;
    (void)token;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* parentdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* creatordescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objecttype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t iscontainerobject = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t autoinheritflags = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePrivateObjectSecurityEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(parentdescriptor, creatordescriptor, newdescriptor, objecttype, iscontainerobject, autoinheritflags, token, genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)parentdescriptor;
    (void)creatordescriptor;
    (void)newdescriptor;
    (void)objecttype;
    (void)iscontainerobject;
    (void)autoinheritflags;
    (void)token;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* parentdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* creatordescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objecttypes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t guidcount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t iscontainerobject = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t autoinheritflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePrivateObjectSecurityWithMultipleInheritance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(parentdescriptor, creatordescriptor, newdescriptor, objecttypes, guidcount, iscontainerobject, autoinheritflags, token, genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)parentdescriptor;
    (void)creatordescriptor;
    (void)newdescriptor;
    (void)objecttypes;
    (void)guidcount;
    (void)iscontainerobject;
    (void)autoinheritflags;
    (void)token;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityCreateRestrictedToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* existingtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t disablesidcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sidstodisable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t deleteprivilegecount = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* privilegestodelete = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t restrictedsidcount = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* sidstorestrict = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* newtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateRestrictedToken")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(existingtokenhandle, flags, disablesidcount, sidstodisable, deleteprivilegecount, privilegestodelete, restrictedsidcount, sidstorestrict, newtokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)disablesidcount;
    (void)sidstodisable;
    (void)deleteprivilegecount;
    (void)privilegestodelete;
    (void)restrictedsidcount;
    (void)sidstorestrict;
    (void)newtokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityCreateWellKnownSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t wellknownsidtype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* domainsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateWellKnownSid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(wellknownsidtype, domainsid, psid, cbsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wellknownsidtype;
    (void)domainsid;
    (void)psid;
    (void)cbsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDeleteAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwaceindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwaceindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwaceindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* capname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* capabilitygroupsids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* capabilitygroupsidcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* capabilitysids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* capabilitysidcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-base-l1-2-2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeriveCapabilitySidsFromName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(capname, capabilitygroupsids, capabilitygroupsidcount, capabilitysids, capabilitysidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)capname;
    (void)capabilitygroupsids;
    (void)capabilitygroupsidcount;
    (void)capabilitysids;
    (void)capabilitysidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objectdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroyPrivateObjectSecurity")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(objectdescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectdescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDuplicateToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* existingtokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t impersonationlevel = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* duplicatetokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DuplicateToken")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(existingtokenhandle, impersonationlevel, duplicatetokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)existingtokenhandle;
    (void)impersonationlevel;
    (void)duplicatetokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityDuplicateTokenEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hexistingtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lptokenattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t impersonationlevel = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t tokentype = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phnewtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DuplicateTokenEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hexistingtoken, dwdesiredaccess, lptokenattributes, impersonationlevel, tokentype, phnewtoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hexistingtoken;
    (void)dwdesiredaccess;
    (void)lptokenattributes;
    (void)impersonationlevel;
    (void)tokentype;
    (void)phnewtoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityEqualDomainSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psid2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfequal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EqualDomainSid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid1, psid2, pfequal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid1;
    (void)psid2;
    (void)pfequal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityEqualPrefixSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psid2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EqualPrefixSid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid1, psid2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid1;
    (void)psid2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityEqualSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psid2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EqualSid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid1, psid2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid1;
    (void)psid2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityFindFirstFreeAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FindFirstFreeAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, pace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)pace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityFreeSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FreeSid")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)psid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SecurityGetAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwaceindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, dwaceindex, pace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwaceindex;
    (void)pace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetAclInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* paclinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t naclinformationlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t dwaclinformationclass = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAclInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, paclinformation, naclinformationlength, dwaclinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)paclinformation;
    (void)naclinformationlength;
    (void)dwaclinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetAppContainerAce_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* acl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t startingaceindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* appcontainerace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* appcontaineraceindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetAppContainerAce")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(acl, startingaceindex, appcontainerace, appcontaineraceindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)acl;
    (void)startingaceindex;
    (void)appcontainerace;
    (void)appcontaineraceindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetCachedSigningLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* signinglevel = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* thumbprint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* thumbprintsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* thumbprintalgorithm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCachedSigningLevel")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(file, flags, signinglevel, thumbprint, thumbprintsize, thumbprintalgorithm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)file;
    (void)flags;
    (void)signinglevel;
    (void)thumbprint;
    (void)thumbprintsize;
    (void)thumbprintalgorithm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetFileSecurityA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t requestedinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpnlengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetFileSecurityA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpfilename, requestedinformation, psecuritydescriptor, nlength, lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetFileSecurityW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t requestedinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpnlengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetFileSecurityW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpfilename, requestedinformation, psecuritydescriptor, nlength, lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetKernelObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t requestedinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpnlengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetKernelObjectSecurity")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handle, requestedinformation, psecuritydescriptor, nlength, lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetLengthSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetLengthSid")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetPrivateObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* objectdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resultantdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t descriptorlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPrivateObjectSecurity")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(objectdescriptor, securityinformation, resultantdescriptor, descriptorlength, returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectdescriptor;
    (void)securityinformation;
    (void)resultantdescriptor;
    (void)descriptorlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetSecurityDescriptorControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcontrol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwrevision = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecurityDescriptorControl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, pcontrol, lpdwrevision);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)pcontrol;
    (void)lpdwrevision;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetSecurityDescriptorDacl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbdaclpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbdacldefaulted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecurityDescriptorDacl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, lpbdaclpresent, pdacl, lpbdacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)lpbdaclpresent;
    (void)pdacl;
    (void)lpbdacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetSecurityDescriptorGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbgroupdefaulted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecurityDescriptorGroup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, pgroup, lpbgroupdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)pgroup;
    (void)lpbgroupdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetSecurityDescriptorLength_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecurityDescriptorLength")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetSecurityDescriptorOwner_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* powner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpbownerdefaulted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecurityDescriptorOwner")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, powner, lpbownerdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)powner;
    (void)lpbownerdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rmcontrol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecurityDescriptorRMControl")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(securitydescriptor, rmcontrol);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)securitydescriptor;
    (void)rmcontrol;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetSecurityDescriptorSacl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbsaclpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* lpbsacldefaulted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSecurityDescriptorSacl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, lpbsaclpresent, psacl, lpbsacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)lpbsaclpresent;
    (void)psacl;
    (void)lpbsacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetSidIdentifierAuthority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSidIdentifierAuthority")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)psid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SecurityGetSidLengthRequired_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t nsubauthoritycount = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSidLengthRequired")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(nsubauthoritycount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nsubauthoritycount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetSidSubAuthority_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t nsubauthority = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSidSubAuthority")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid, nsubauthority);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)psid;
    (void)nsubauthority;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SecurityGetSidSubAuthorityCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetSidSubAuthorityCount")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)psid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SecurityGetTokenInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t tokeninformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t tokeninformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* returnlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetTokenInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength, returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetUserObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psirequested = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpnlengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUserObjectSecurity")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hobj, psirequested, psid, nlength, lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)psirequested;
    (void)psid;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityGetWindowsAccountDomainSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pdomainsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* cbdomainsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetWindowsAccountDomainSid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid, pdomainsid, cbdomainsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid;
    (void)pdomainsid;
    (void)cbdomainsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityImpersonateAnonymousToken_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* threadhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImpersonateAnonymousToken")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(threadhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityImpersonateLoggedOnUser_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* htoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImpersonateLoggedOnUser")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityImpersonateSelf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t impersonationlevel = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImpersonateSelf")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(impersonationlevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)impersonationlevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityInitializeAcl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t nacllength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwaclrevision = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeAcl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, nacllength, dwaclrevision);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)nacllength;
    (void)dwaclrevision;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityInitializeSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwrevision = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeSecurityDescriptor")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, dwrevision);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)dwrevision;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityInitializeSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pidentifierauthority = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint8_t nsubauthoritycount = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeSid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sid, pidentifierauthority, nsubauthoritycount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sid;
    (void)pidentifierauthority;
    (void)nsubauthoritycount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityIsTokenRestricted_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsTokenRestricted")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityIsValidAcl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsValidAcl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityIsValidSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsValidSecurityDescriptor")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityIsValidSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsValidSid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityIsWellKnownSid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t wellknownsidtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsWellKnownSid")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psid, wellknownsidtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid;
    (void)wellknownsidtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLogonUserA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszdomain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwlogontype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwlogonprovider = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LogonUserA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszusername, lpszdomain, lpszpassword, dwlogontype, dwlogonprovider, phtoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLogonUserExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszdomain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwlogontype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwlogonprovider = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pplogonsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppprofilebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pdwprofilelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pquotalimits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LogonUserExA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszusername, lpszdomain, lpszpassword, dwlogontype, dwlogonprovider, phtoken, pplogonsid, ppprofilebuffer, pdwprofilelength, pquotalimits);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    (void)pplogonsid;
    (void)ppprofilebuffer;
    (void)pdwprofilelength;
    (void)pquotalimits;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLogonUserExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszdomain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwlogontype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwlogonprovider = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pplogonsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* ppprofilebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pdwprofilelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pquotalimits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LogonUserExW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszusername, lpszdomain, lpszpassword, dwlogontype, dwlogonprovider, phtoken, pplogonsid, ppprofilebuffer, pdwprofilelength, pquotalimits);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    (void)pplogonsid;
    (void)ppprofilebuffer;
    (void)pdwprofilelength;
    (void)pquotalimits;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLogonUserW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszusername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszdomain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszpassword = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwlogontype = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwlogonprovider = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phtoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LogonUserW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszusername, lpszdomain, lpszpassword, dwlogontype, dwlogonprovider, phtoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupAccountNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpaccountname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* referenceddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* cchreferenceddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* peuse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupAccountNameA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, lpaccountname, sid, cbsid, referenceddomainname, cchreferenceddomainname, peuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpaccountname;
    (void)sid;
    (void)cbsid;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupAccountNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpaccountname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cbsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* referenceddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* cchreferenceddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* peuse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupAccountNameW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, lpaccountname, sid, cbsid, referenceddomainname, cchreferenceddomainname, peuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpaccountname;
    (void)sid;
    (void)cbsid;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupAccountSidA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* referenceddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* cchreferenceddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* peuse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupAccountSidA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, sid, name, cchname, referenceddomainname, cchreferenceddomainname, peuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)sid;
    (void)name;
    (void)cchname;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupAccountSidW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* referenceddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* cchreferenceddomainname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* peuse = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupAccountSidW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, sid, name, cchname, referenceddomainname, cchreferenceddomainname, peuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)sid;
    (void)name;
    (void)cchname;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdisplayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cchdisplayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lplanguageid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupPrivilegeDisplayNameA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, lpname, lpdisplayname, cchdisplayname, lplanguageid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpdisplayname;
    (void)cchdisplayname;
    (void)lplanguageid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdisplayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cchdisplayname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lplanguageid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupPrivilegeDisplayNameW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, lpname, lpdisplayname, cchdisplayname, lplanguageid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpdisplayname;
    (void)cchdisplayname;
    (void)lplanguageid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupPrivilegeNameA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupPrivilegeNameA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, lpluid, lpname, cchname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpluid;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupPrivilegeNameW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* cchname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupPrivilegeNameW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, lpluid, lpname, cchname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpluid;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupPrivilegeValueA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupPrivilegeValueA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, lpname, lpluid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpluid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityLookupPrivilegeValueW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpluid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LookupPrivilegeValueW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpsystemname, lpname, lpluid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpluid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityMakeAbsoluteSD_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pselfrelativesecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pabsolutesecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwabsolutesecuritydescriptorsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* lpdwdaclsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpdwsaclsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* powner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* lpdwownersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* pprimarygroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    void* lpdwprimarygroupsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 10 ? km_napi_arg_u64(km_info[10]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MakeAbsoluteSD")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pselfrelativesecuritydescriptor, pabsolutesecuritydescriptor, lpdwabsolutesecuritydescriptorsize, pdacl, lpdwdaclsize, psacl, lpdwsaclsize, powner, lpdwownersize, pprimarygroup, lpdwprimarygroupsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pselfrelativesecuritydescriptor;
    (void)pabsolutesecuritydescriptor;
    (void)lpdwabsolutesecuritydescriptorsize;
    (void)pdacl;
    (void)lpdwdaclsize;
    (void)psacl;
    (void)lpdwsaclsize;
    (void)powner;
    (void)lpdwownersize;
    (void)pprimarygroup;
    (void)lpdwprimarygroupsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityMakeSelfRelativeSD_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pabsolutesecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pselfrelativesecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpdwbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MakeSelfRelativeSD")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pabsolutesecuritydescriptor, pselfrelativesecuritydescriptor, lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pabsolutesecuritydescriptor;
    (void)pselfrelativesecuritydescriptor;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityMapGenericMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* accessmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MapGenericMask")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(accessmask, genericmapping);
    } else {
        errno = ENOSYS;
    }
#else
    (void)accessmask;
    (void)genericmapping;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32SecurityObjectCloseAuditAlarmA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t generateonclose = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObjectCloseAuditAlarmA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityObjectCloseAuditAlarmW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t generateonclose = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObjectCloseAuditAlarmW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t generateonclose = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObjectDeleteAuditAlarmA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t generateonclose = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObjectDeleteAuditAlarmW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityObjectOpenAuditAlarmA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t grantedaccess = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    int32_t accessgranted = static_cast<int32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObjectOpenAuditAlarmA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, objecttypename, objectname, psecuritydescriptor, clienttoken, desiredaccess, grantedaccess, privileges, objectcreation, accessgranted, generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)psecuritydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityObjectOpenAuditAlarmW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objecttypename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* objectname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t grantedaccess = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    int32_t objectcreation = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    int32_t accessgranted = static_cast<int32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* generateonclose = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObjectOpenAuditAlarmW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, objecttypename, objectname, psecuritydescriptor, clienttoken, desiredaccess, grantedaccess, privileges, objectcreation, accessgranted, generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)psecuritydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t accessgranted = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObjectPrivilegeAuditAlarmA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, clienttoken, desiredaccess, privileges, accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* handleid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t desiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t accessgranted = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObjectPrivilegeAuditAlarmW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, handleid, clienttoken, desiredaccess, privileges, accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityPrivilegeCheck_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* requiredprivileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pfresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrivilegeCheck")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(clienttoken, requiredprivileges, pfresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)pfresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t accessgranted = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrivilegedServiceAuditAlarmA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, servicename, clienttoken, privileges, accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* subsystemname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* servicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clienttoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* privileges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t accessgranted = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PrivilegedServiceAuditAlarmW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(subsystemname, servicename, clienttoken, privileges, accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityQuerySecurityAccessMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* desiredaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "QuerySecurityAccessMask")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(securityinformation, desiredaccess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)securityinformation;
    (void)desiredaccess;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32SecurityRevertToSelf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RevertToSelf")));
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

static Napi::Value windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* unicodestring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* sid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool allocatedestinationstring = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlConvertSidToUnicodeString")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(unicodestring, sid, allocatedestinationstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unicodestring;
    (void)sid;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securitydescriptorlength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* newsecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* newsecuritydescriptorlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    bool checkonly = km_info.Length() > 4 ? km_info[4].ToBoolean().Value() : false;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RtlNormalizeSecurityDescriptor")));
    }
    bool km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(securitydescriptor, securitydescriptorlength, newsecuritydescriptor, newsecuritydescriptorlength, checkonly);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)securitydescriptor;
    (void)securitydescriptorlength;
    (void)newsecuritydescriptor;
    (void)newsecuritydescriptorlength;
    (void)checkonly;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssysWindowsWin32SecuritySetAclInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* paclinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t naclinformationlength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t dwaclinformationclass = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetAclInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pacl, paclinformation, naclinformationlength, dwaclinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)paclinformation;
    (void)naclinformationlength;
    (void)dwaclinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetCachedSigningLevel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcefiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t sourcefilecount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* targetfile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetCachedSigningLevel")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(sourcefiles, sourcefilecount, flags, targetfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcefiles;
    (void)sourcefilecount;
    (void)flags;
    (void)targetfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetFileSecurityA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetFileSecurityA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpfilename, securityinformation, psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetFileSecurityW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetFileSecurityW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpfilename, securityinformation, psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetKernelObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetKernelObjectSecurity")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(handle, securityinformation, securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetPrivateObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* modificationdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objectssecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetPrivateObjectSecurity")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(securityinformation, modificationdescriptor, objectssecuritydescriptor, genericmapping, token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)genericmapping;
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* modificationdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* objectssecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t autoinheritflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* genericmapping = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetPrivateObjectSecurityEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(securityinformation, modificationdescriptor, objectssecuritydescriptor, autoinheritflags, genericmapping, token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)autoinheritflags;
    (void)genericmapping;
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetSecurityAccessMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t securityinformation = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* desiredaccess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSecurityAccessMask")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(securityinformation, desiredaccess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)securityinformation;
    (void)desiredaccess;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32SecuritySetSecurityDescriptorControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t controlbitsofinterest = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t controlbitstoset = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSecurityDescriptorControl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, controlbitsofinterest, controlbitstoset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)controlbitsofinterest;
    (void)controlbitstoset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetSecurityDescriptorDacl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bdaclpresent = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pdacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t bdacldefaulted = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSecurityDescriptorDacl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, bdaclpresent, pdacl, bdacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)bdaclpresent;
    (void)pdacl;
    (void)bdacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetSecurityDescriptorGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pgroup = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bgroupdefaulted = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSecurityDescriptorGroup")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, pgroup, bgroupdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)pgroup;
    (void)bgroupdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetSecurityDescriptorOwner_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* powner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bownerdefaulted = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSecurityDescriptorOwner")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, powner, bownerdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)powner;
    (void)bownerdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* securitydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rmcontrol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSecurityDescriptorRMControl")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(securitydescriptor, rmcontrol);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)securitydescriptor;
    (void)rmcontrol;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetSecurityDescriptorSacl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* psecuritydescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t bsaclpresent = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psacl = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t bsacldefaulted = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetSecurityDescriptorSacl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(psecuritydescriptor, bsaclpresent, psacl, bsacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)bsaclpresent;
    (void)psacl;
    (void)bsacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetTokenInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tokenhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t tokeninformationclass = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* tokeninformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t tokeninformationlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetTokenInformation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SecuritySetUserObjectSecurity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psirequested = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetUserObjectSecurity")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hobj, psirequested, psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)psirequested;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_security_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32SecurityAccessCheck", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheck_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckByType", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckByType_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckByTypeResultList", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckByTypeResultList_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW_napi));
    exports.Set("windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW", Napi::Function::New(env, windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAccessAllowedAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAccessAllowedAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAccessAllowedAceEx", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAccessAllowedAceEx_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAccessAllowedObjectAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAccessAllowedObjectAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAccessDeniedAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAccessDeniedAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAccessDeniedAceEx", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAccessDeniedAceEx_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAccessDeniedObjectAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAccessDeniedObjectAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAuditAccessAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAuditAccessAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAuditAccessAceEx", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAuditAccessAceEx_napi));
    exports.Set("windowssysWindowsWin32SecurityAddAuditAccessObjectAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddAuditAccessObjectAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddConditionalAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddConditionalAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddMandatoryAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddMandatoryAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddResourceAttributeAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddResourceAttributeAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAddScopedPolicyIDAce", Napi::Function::New(env, windowssysWindowsWin32SecurityAddScopedPolicyIDAce_napi));
    exports.Set("windowssysWindowsWin32SecurityAdjustTokenGroups", Napi::Function::New(env, windowssysWindowsWin32SecurityAdjustTokenGroups_napi));
    exports.Set("windowssysWindowsWin32SecurityAdjustTokenPrivileges", Napi::Function::New(env, windowssysWindowsWin32SecurityAdjustTokenPrivileges_napi));
    exports.Set("windowssysWindowsWin32SecurityAllocateAndInitializeSid", Napi::Function::New(env, windowssysWindowsWin32SecurityAllocateAndInitializeSid_napi));
    exports.Set("windowssysWindowsWin32SecurityAllocateLocallyUniqueId", Napi::Function::New(env, windowssysWindowsWin32SecurityAllocateLocallyUniqueId_napi));
    exports.Set("windowssysWindowsWin32SecurityAreAllAccessesGranted", Napi::Function::New(env, windowssysWindowsWin32SecurityAreAllAccessesGranted_napi));
    exports.Set("windowssysWindowsWin32SecurityAreAnyAccessesGranted", Napi::Function::New(env, windowssysWindowsWin32SecurityAreAnyAccessesGranted_napi));
    exports.Set("windowssysWindowsWin32SecurityCheckTokenCapability", Napi::Function::New(env, windowssysWindowsWin32SecurityCheckTokenCapability_napi));
    exports.Set("windowssysWindowsWin32SecurityCheckTokenMembership", Napi::Function::New(env, windowssysWindowsWin32SecurityCheckTokenMembership_napi));
    exports.Set("windowssysWindowsWin32SecurityCheckTokenMembershipEx", Napi::Function::New(env, windowssysWindowsWin32SecurityCheckTokenMembershipEx_napi));
    exports.Set("windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity", Napi::Function::New(env, windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity_napi));
    exports.Set("windowssysWindowsWin32SecurityCopySid", Napi::Function::New(env, windowssysWindowsWin32SecurityCopySid_napi));
    exports.Set("windowssysWindowsWin32SecurityCreatePrivateObjectSecurity", Napi::Function::New(env, windowssysWindowsWin32SecurityCreatePrivateObjectSecurity_napi));
    exports.Set("windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx", Napi::Function::New(env, windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx_napi));
    exports.Set("windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance", Napi::Function::New(env, windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance_napi));
    exports.Set("windowssysWindowsWin32SecurityCreateRestrictedToken", Napi::Function::New(env, windowssysWindowsWin32SecurityCreateRestrictedToken_napi));
    exports.Set("windowssysWindowsWin32SecurityCreateWellKnownSid", Napi::Function::New(env, windowssysWindowsWin32SecurityCreateWellKnownSid_napi));
    exports.Set("windowssysWindowsWin32SecurityDeleteAce", Napi::Function::New(env, windowssysWindowsWin32SecurityDeleteAce_napi));
    exports.Set("windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName", Napi::Function::New(env, windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName_napi));
    exports.Set("windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity", Napi::Function::New(env, windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity_napi));
    exports.Set("windowssysWindowsWin32SecurityDuplicateToken", Napi::Function::New(env, windowssysWindowsWin32SecurityDuplicateToken_napi));
    exports.Set("windowssysWindowsWin32SecurityDuplicateTokenEx", Napi::Function::New(env, windowssysWindowsWin32SecurityDuplicateTokenEx_napi));
    exports.Set("windowssysWindowsWin32SecurityEqualDomainSid", Napi::Function::New(env, windowssysWindowsWin32SecurityEqualDomainSid_napi));
    exports.Set("windowssysWindowsWin32SecurityEqualPrefixSid", Napi::Function::New(env, windowssysWindowsWin32SecurityEqualPrefixSid_napi));
    exports.Set("windowssysWindowsWin32SecurityEqualSid", Napi::Function::New(env, windowssysWindowsWin32SecurityEqualSid_napi));
    exports.Set("windowssysWindowsWin32SecurityFindFirstFreeAce", Napi::Function::New(env, windowssysWindowsWin32SecurityFindFirstFreeAce_napi));
    exports.Set("windowssysWindowsWin32SecurityFreeSid", Napi::Function::New(env, windowssysWindowsWin32SecurityFreeSid_napi));
    exports.Set("windowssysWindowsWin32SecurityGetAce", Napi::Function::New(env, windowssysWindowsWin32SecurityGetAce_napi));
    exports.Set("windowssysWindowsWin32SecurityGetAclInformation", Napi::Function::New(env, windowssysWindowsWin32SecurityGetAclInformation_napi));
    exports.Set("windowssysWindowsWin32SecurityGetAppContainerAce", Napi::Function::New(env, windowssysWindowsWin32SecurityGetAppContainerAce_napi));
    exports.Set("windowssysWindowsWin32SecurityGetCachedSigningLevel", Napi::Function::New(env, windowssysWindowsWin32SecurityGetCachedSigningLevel_napi));
    exports.Set("windowssysWindowsWin32SecurityGetFileSecurityA", Napi::Function::New(env, windowssysWindowsWin32SecurityGetFileSecurityA_napi));
    exports.Set("windowssysWindowsWin32SecurityGetFileSecurityW", Napi::Function::New(env, windowssysWindowsWin32SecurityGetFileSecurityW_napi));
    exports.Set("windowssysWindowsWin32SecurityGetKernelObjectSecurity", Napi::Function::New(env, windowssysWindowsWin32SecurityGetKernelObjectSecurity_napi));
    exports.Set("windowssysWindowsWin32SecurityGetLengthSid", Napi::Function::New(env, windowssysWindowsWin32SecurityGetLengthSid_napi));
    exports.Set("windowssysWindowsWin32SecurityGetPrivateObjectSecurity", Napi::Function::New(env, windowssysWindowsWin32SecurityGetPrivateObjectSecurity_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSecurityDescriptorControl", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSecurityDescriptorControl_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSecurityDescriptorDacl", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSecurityDescriptorDacl_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSecurityDescriptorGroup", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSecurityDescriptorGroup_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSecurityDescriptorLength", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSecurityDescriptorLength_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSecurityDescriptorOwner", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSecurityDescriptorOwner_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSecurityDescriptorSacl", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSecurityDescriptorSacl_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSidIdentifierAuthority", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSidIdentifierAuthority_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSidLengthRequired", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSidLengthRequired_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSidSubAuthority", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSidSubAuthority_napi));
    exports.Set("windowssysWindowsWin32SecurityGetSidSubAuthorityCount", Napi::Function::New(env, windowssysWindowsWin32SecurityGetSidSubAuthorityCount_napi));
    exports.Set("windowssysWindowsWin32SecurityGetTokenInformation", Napi::Function::New(env, windowssysWindowsWin32SecurityGetTokenInformation_napi));
    exports.Set("windowssysWindowsWin32SecurityGetUserObjectSecurity", Napi::Function::New(env, windowssysWindowsWin32SecurityGetUserObjectSecurity_napi));
    exports.Set("windowssysWindowsWin32SecurityGetWindowsAccountDomainSid", Napi::Function::New(env, windowssysWindowsWin32SecurityGetWindowsAccountDomainSid_napi));
    exports.Set("windowssysWindowsWin32SecurityImpersonateAnonymousToken", Napi::Function::New(env, windowssysWindowsWin32SecurityImpersonateAnonymousToken_napi));
    exports.Set("windowssysWindowsWin32SecurityImpersonateLoggedOnUser", Napi::Function::New(env, windowssysWindowsWin32SecurityImpersonateLoggedOnUser_napi));
    exports.Set("windowssysWindowsWin32SecurityImpersonateSelf", Napi::Function::New(env, windowssysWindowsWin32SecurityImpersonateSelf_napi));
    exports.Set("windowssysWindowsWin32SecurityInitializeAcl", Napi::Function::New(env, windowssysWindowsWin32SecurityInitializeAcl_napi));
    exports.Set("windowssysWindowsWin32SecurityInitializeSecurityDescriptor", Napi::Function::New(env, windowssysWindowsWin32SecurityInitializeSecurityDescriptor_napi));
    exports.Set("windowssysWindowsWin32SecurityInitializeSid", Napi::Function::New(env, windowssysWindowsWin32SecurityInitializeSid_napi));
    exports.Set("windowssysWindowsWin32SecurityIsTokenRestricted", Napi::Function::New(env, windowssysWindowsWin32SecurityIsTokenRestricted_napi));
    exports.Set("windowssysWindowsWin32SecurityIsValidAcl", Napi::Function::New(env, windowssysWindowsWin32SecurityIsValidAcl_napi));
    exports.Set("windowssysWindowsWin32SecurityIsValidSecurityDescriptor", Napi::Function::New(env, windowssysWindowsWin32SecurityIsValidSecurityDescriptor_napi));
    exports.Set("windowssysWindowsWin32SecurityIsValidSid", Napi::Function::New(env, windowssysWindowsWin32SecurityIsValidSid_napi));
    exports.Set("windowssysWindowsWin32SecurityIsWellKnownSid", Napi::Function::New(env, windowssysWindowsWin32SecurityIsWellKnownSid_napi));
    exports.Set("windowssysWindowsWin32SecurityLogonUserA", Napi::Function::New(env, windowssysWindowsWin32SecurityLogonUserA_napi));
    exports.Set("windowssysWindowsWin32SecurityLogonUserExA", Napi::Function::New(env, windowssysWindowsWin32SecurityLogonUserExA_napi));
    exports.Set("windowssysWindowsWin32SecurityLogonUserExW", Napi::Function::New(env, windowssysWindowsWin32SecurityLogonUserExW_napi));
    exports.Set("windowssysWindowsWin32SecurityLogonUserW", Napi::Function::New(env, windowssysWindowsWin32SecurityLogonUserW_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupAccountNameA", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupAccountNameA_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupAccountNameW", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupAccountNameW_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupAccountSidA", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupAccountSidA_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupAccountSidW", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupAccountSidW_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupPrivilegeNameA", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupPrivilegeNameA_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupPrivilegeNameW", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupPrivilegeNameW_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupPrivilegeValueA", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupPrivilegeValueA_napi));
    exports.Set("windowssysWindowsWin32SecurityLookupPrivilegeValueW", Napi::Function::New(env, windowssysWindowsWin32SecurityLookupPrivilegeValueW_napi));
    exports.Set("windowssysWindowsWin32SecurityMakeAbsoluteSD", Napi::Function::New(env, windowssysWindowsWin32SecurityMakeAbsoluteSD_napi));
    exports.Set("windowssysWindowsWin32SecurityMakeSelfRelativeSD", Napi::Function::New(env, windowssysWindowsWin32SecurityMakeSelfRelativeSD_napi));
    exports.Set("windowssysWindowsWin32SecurityMapGenericMask", Napi::Function::New(env, windowssysWindowsWin32SecurityMapGenericMask_napi));
    exports.Set("windowssysWindowsWin32SecurityObjectCloseAuditAlarmA", Napi::Function::New(env, windowssysWindowsWin32SecurityObjectCloseAuditAlarmA_napi));
    exports.Set("windowssysWindowsWin32SecurityObjectCloseAuditAlarmW", Napi::Function::New(env, windowssysWindowsWin32SecurityObjectCloseAuditAlarmW_napi));
    exports.Set("windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA", Napi::Function::New(env, windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA_napi));
    exports.Set("windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW", Napi::Function::New(env, windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW_napi));
    exports.Set("windowssysWindowsWin32SecurityObjectOpenAuditAlarmA", Napi::Function::New(env, windowssysWindowsWin32SecurityObjectOpenAuditAlarmA_napi));
    exports.Set("windowssysWindowsWin32SecurityObjectOpenAuditAlarmW", Napi::Function::New(env, windowssysWindowsWin32SecurityObjectOpenAuditAlarmW_napi));
    exports.Set("windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA", Napi::Function::New(env, windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA_napi));
    exports.Set("windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW", Napi::Function::New(env, windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW_napi));
    exports.Set("windowssysWindowsWin32SecurityPrivilegeCheck", Napi::Function::New(env, windowssysWindowsWin32SecurityPrivilegeCheck_napi));
    exports.Set("windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA", Napi::Function::New(env, windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA_napi));
    exports.Set("windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW", Napi::Function::New(env, windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW_napi));
    exports.Set("windowssysWindowsWin32SecurityQuerySecurityAccessMask", Napi::Function::New(env, windowssysWindowsWin32SecurityQuerySecurityAccessMask_napi));
    exports.Set("windowssysWindowsWin32SecurityRevertToSelf", Napi::Function::New(env, windowssysWindowsWin32SecurityRevertToSelf_napi));
    exports.Set("windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString", Napi::Function::New(env, windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString_napi));
    exports.Set("windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor", Napi::Function::New(env, windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor_napi));
    exports.Set("windowssysWindowsWin32SecuritySetAclInformation", Napi::Function::New(env, windowssysWindowsWin32SecuritySetAclInformation_napi));
    exports.Set("windowssysWindowsWin32SecuritySetCachedSigningLevel", Napi::Function::New(env, windowssysWindowsWin32SecuritySetCachedSigningLevel_napi));
    exports.Set("windowssysWindowsWin32SecuritySetFileSecurityA", Napi::Function::New(env, windowssysWindowsWin32SecuritySetFileSecurityA_napi));
    exports.Set("windowssysWindowsWin32SecuritySetFileSecurityW", Napi::Function::New(env, windowssysWindowsWin32SecuritySetFileSecurityW_napi));
    exports.Set("windowssysWindowsWin32SecuritySetKernelObjectSecurity", Napi::Function::New(env, windowssysWindowsWin32SecuritySetKernelObjectSecurity_napi));
    exports.Set("windowssysWindowsWin32SecuritySetPrivateObjectSecurity", Napi::Function::New(env, windowssysWindowsWin32SecuritySetPrivateObjectSecurity_napi));
    exports.Set("windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx", Napi::Function::New(env, windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx_napi));
    exports.Set("windowssysWindowsWin32SecuritySetSecurityAccessMask", Napi::Function::New(env, windowssysWindowsWin32SecuritySetSecurityAccessMask_napi));
    exports.Set("windowssysWindowsWin32SecuritySetSecurityDescriptorControl", Napi::Function::New(env, windowssysWindowsWin32SecuritySetSecurityDescriptorControl_napi));
    exports.Set("windowssysWindowsWin32SecuritySetSecurityDescriptorDacl", Napi::Function::New(env, windowssysWindowsWin32SecuritySetSecurityDescriptorDacl_napi));
    exports.Set("windowssysWindowsWin32SecuritySetSecurityDescriptorGroup", Napi::Function::New(env, windowssysWindowsWin32SecuritySetSecurityDescriptorGroup_napi));
    exports.Set("windowssysWindowsWin32SecuritySetSecurityDescriptorOwner", Napi::Function::New(env, windowssysWindowsWin32SecuritySetSecurityDescriptorOwner_napi));
    exports.Set("windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl", Napi::Function::New(env, windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl_napi));
    exports.Set("windowssysWindowsWin32SecuritySetSecurityDescriptorSacl", Napi::Function::New(env, windowssysWindowsWin32SecuritySetSecurityDescriptorSacl_napi));
    exports.Set("windowssysWindowsWin32SecuritySetTokenInformation", Napi::Function::New(env, windowssysWindowsWin32SecuritySetTokenInformation_napi));
    exports.Set("windowssysWindowsWin32SecuritySetUserObjectSecurity", Napi::Function::New(env, windowssysWindowsWin32SecuritySetUserObjectSecurity_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_security_napi, nullptr };
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
