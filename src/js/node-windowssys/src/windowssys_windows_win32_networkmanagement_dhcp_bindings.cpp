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

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpAddFilterV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* addfilterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t forceflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpAddFilterV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, addfilterinfo, forceflag) : 0;
#else
    (void)serveripaddress;
    (void)addfilterinfo;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSecurityGroup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpAddSecurityGroup")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pserver) : 0;
#else
    (void)pserver;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpAddServer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* idinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callbackfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpAddServer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, idinfo, newserver, callbackfn, callbackdata) : 0;
#else
    (void)flags;
    (void)idinfo;
    (void)newserver;
    (void)callbackfn;
    (void)callbackdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* addelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpAddSubnetElement")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, addelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* addelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpAddSubnetElementV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, addelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* addelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpAddSubnetElementV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, addelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogGetParams_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* auditlogdir = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* diskcheckinterval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* maxlogfilessize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* minspaceondisk = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpAuditLogGetParams")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, auditlogdir, diskcheckinterval, maxlogfilessize, minspaceondisk) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)auditlogdir;
    (void)diskcheckinterval;
    (void)maxlogfilessize;
    (void)minspaceondisk;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogSetParams_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* auditlogdir = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t diskcheckinterval = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t maxlogfilessize = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t minspaceondisk = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpAuditLogSetParams")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, auditlogdir, diskcheckinterval, maxlogfilessize, minspaceondisk) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)auditlogdir;
    (void)diskcheckinterval;
    (void)maxlogfilessize;
    (void)minspaceondisk;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiCleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCApiCleanup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* version = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCApiInitialize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(version) : 0;
#else
    (void)version;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reservedmustbezero = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateClass")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, reservedmustbezero, classinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClassV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reservedmustbezero = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateClassV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, reservedmustbezero, classinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateClientInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateClientInfoV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoVQ_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateClientInfoVQ")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* optioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateOption")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, optionid, optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateOptionV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateOptionV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* subnetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateSubnet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnetVQ_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* subnetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpCreateSubnetVQ")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDeRegisterParamChange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* event = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDeRegisterParamChange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, reserved, event) : 0;
#else
    (void)flags;
    (void)reserved;
    (void)event;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reservedmustbezero = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDeleteClass")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, reservedmustbezero, classname) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClassV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reservedmustbezero = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDeleteClassV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, reservedmustbezero, classname) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDeleteClientInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfoV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDeleteClientInfoV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteFilterV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* deletefilterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDeleteFilterV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, deletefilterinfo) : 0;
#else
    (void)serveripaddress;
    (void)deletefilterinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteServer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* idinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* newserver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callbackfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDeleteServer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, idinfo, newserver, callbackfn, callbackdata) : 0;
#else
    (void)flags;
    (void)idinfo;
    (void)newserver;
    (void)callbackfn;
    (void)callbackdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSubnet_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t forceflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDeleteSubnet")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, forceflag) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSuperScopeV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* superscopename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDeleteSuperScopeV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, superscopename) : 0;
#else
    (void)serveripaddress;
    (void)superscopename;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDsCleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDsCleanup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpDsInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpDsInit")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClasses_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reservedmustbezero = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* classinfoarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* nread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ntotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumClasses")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, reservedmustbezero, resumehandle, preferredmaximum, classinfoarray, nread, ntotal) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)classinfoarray;
    (void)nread;
    (void)ntotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClassesV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reservedmustbezero = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* classinfoarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* nread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* ntotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumClassesV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, reservedmustbezero, resumehandle, preferredmaximum, classinfoarray, nread, ntotal) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)classinfoarray;
    (void)nread;
    (void)ntotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumFilterV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t listtype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* enumfilterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* elementsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* elementstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumFilterV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, listtype, enumfilterinfo, elementsread, elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)listtype;
    (void)enumfilterinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValues_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* optionvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optionsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* optionstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumOptionValues")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, scopeinfo, resumehandle, preferredmaximum, optionvalues, optionsread, optionstotal) : 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* optionvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* optionsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* optionstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumOptionValuesV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, classname, vendorname, scopeinfo, resumehandle, preferredmaximum, optionvalues, optionsread, optionstotal) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* optionvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* optionsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    void* optionstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumOptionValuesV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, classname, vendorname, scopeinfo, resumehandle, preferredmaximum, optionvalues, optionsread, optionstotal) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* optionsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optionstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumOptions")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, options, optionsread, optionstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* optionsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* optionstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumOptionsV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, classname, vendorname, resumehandle, preferredmaximum, options, optionsread, optionstotal) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* options = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* optionsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* optionstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumOptionsV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, classname, vendorname, resumehandle, preferredmaximum, options, optionsread, optionstotal) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumServers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* idinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* servers = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* callbackfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumServers")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, idinfo, servers, callbackfn, callbackdata) : 0;
#else
    (void)flags;
    (void)idinfo;
    (void)servers;
    (void)callbackfn;
    (void)callbackdata;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClients_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clientsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* clientstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnetClients")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsFilterStatusInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clientsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* clientstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsFilterStatusInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clientsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* clientstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clientsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* clientstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsVQ_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clientsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* clientstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsVQ")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElements_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enumelementtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* enumelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* elementsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* elementstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnetElements")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, enumelementtype, resumehandle, preferredmaximum, enumelementinfo, elementsread, elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enumelementtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* enumelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* elementsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* elementstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnetElementsV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, enumelementtype, resumehandle, preferredmaximum, enumelementinfo, elementsread, elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enumelementtype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* enumelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* elementsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* elementstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnetElementsV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, enumelementtype, resumehandle, preferredmaximum, enumelementinfo, elementsread, elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnets_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* enuminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* elementsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* elementstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnets")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, enuminfo, elementsread, elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetsV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* enuminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* elementsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* elementstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpEnumSubnetsV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, enuminfo, elementsread, elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValues_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetAllOptionValues")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, scopeinfo, values) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValuesV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetAllOptionValuesV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, scopeinfo, values) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* optionstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetAllOptions")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionstruct) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionstruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionsV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* optionstruct = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetAllOptionsV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionstruct) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionstruct;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClassInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reservedmustbezero = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* partialclassinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* filledclassinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetClassInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, reservedmustbezero, partialclassinfo, filledclassinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)partialclassinfo;
    (void)filledclassinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetClientInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, searchinfo, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetClientInfoV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, searchinfo, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetClientInfoV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, searchinfo, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoVQ_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetClientInfoVQ")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, searchinfo, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t clientipaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t clientsubnetmask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* clientoptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetClientOptions")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientipaddress, clientsubnetmask, clientoptions) : 0;
#else
    (void)serveripaddress;
    (void)clientipaddress;
    (void)clientsubnetmask;
    (void)clientoptions;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetFilterV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* globalfilterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetFilterV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, globalfilterinfo) : 0;
#else
    (void)serveripaddress;
    (void)globalfilterinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mibinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetMibInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, mibinfo) : 0;
#else
    (void)serveripaddress;
    (void)mibinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mibinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetMibInfoV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, mibinfo) : 0;
#else
    (void)serveripaddress;
    (void)mibinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mibinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetMibInfoV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, mibinfo) : 0;
#else
    (void)serveripaddress;
    (void)mibinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* optioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetOptionInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, optionid, optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetOptionInfoV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetOptionInfoV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* optionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, optionid, scopeinfo, optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* optionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetOptionValueV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo, optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* optionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetOptionValueV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo, optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOriginalSubnetMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sadaptername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dwsubnetmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetOriginalSubnetMask")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sadaptername, dwsubnetmask) : 0;
#else
    (void)sadaptername;
    (void)dwsubnetmask;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bindelementsinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetServerBindingInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, bindelementsinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementsinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfoV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bindelementsinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetServerBindingInfoV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, bindelementsinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementsinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerSpecificStrings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* serverspecificstrings = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetServerSpecificStrings")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, serverspecificstrings) : 0;
#else
    (void)serveripaddress;
    (void)serverspecificstrings;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetDelayOffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* timedelayinmilliseconds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetSubnetDelayOffer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, timedelayinmilliseconds) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)timedelayinmilliseconds;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* subnetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetSubnetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfoVQ_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* subnetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetSubnetInfoVQ")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSuperScopeInfoV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* superscopetable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetSuperScopeInfoV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, superscopetable) : 0;
#else
    (void)serveripaddress;
    (void)superscopetable;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetThreadOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pflags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetThreadOptions")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pflags, reserved) : 0;
#else
    (void)pflags;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpGetVersion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* majorversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* minorversion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpGetVersion")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, majorversion, minorversion) : 0;
#else
    (void)serveripaddress;
    (void)majorversion;
    (void)minorversion;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyCondition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t parentexpr = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t type = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t suboptionid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t arg_6_operator = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    uint32_t valuelength = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* conditionindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, uint32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyCondition")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policy, parentexpr, type, optionid, suboptionid, vendorname, arg_6_operator, value, valuelength, conditionindex) : 0;
#else
    (void)policy;
    (void)parentexpr;
    (void)type;
    (void)optionid;
    (void)suboptionid;
    (void)vendorname;
    (void)arg_6_operator;
    (void)value;
    (void)valuelength;
    (void)conditionindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyExpr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t parentexpr = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t arg_2_operator = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* exprindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyExpr")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policy, parentexpr, arg_2_operator, exprindex) : 0;
#else
    (void)policy;
    (void)parentexpr;
    (void)arg_2_operator;
    (void)exprindex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* range = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyRange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policy, range) : 0;
#else
    (void)policy;
    (void)range;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4Policy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fglobalpolicy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t subnet = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t processingorder = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t rootoperator = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t enabled = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprCreateV4Policy")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyname, fglobalpolicy, subnet, processingorder, rootoperator, description, enabled, policy) : 0;
#else
    (void)policyname;
    (void)fglobalpolicy;
    (void)subnet;
    (void)processingorder;
    (void)rootoperator;
    (void)description;
    (void)enabled;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4PolicyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fglobalpolicy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t subnet = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t processingorder = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t rootoperator = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t enabled = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprCreateV4PolicyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policyname, fglobalpolicy, subnet, processingorder, rootoperator, description, enabled, policy) : 0;
#else
    (void)policyname;
    (void)fglobalpolicy;
    (void)subnet;
    (void)processingorder;
    (void)rootoperator;
    (void)description;
    (void)enabled;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFindV4DhcpProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propertyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t id = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t type = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprFindV4DhcpProperty")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propertyarray, id, type) : NULL;
#else
    (void)propertyarray;
    (void)id;
    (void)type;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* property = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprFreeV4DhcpProperty")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(property);
#else
    (void)property;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpPropertyArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propertyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprFreeV4DhcpPropertyArray")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(propertyarray);
#else
    (void)propertyarray;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4Policy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprFreeV4Policy")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(policy);
#else
    (void)policy;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyArray")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(policyarray);
#else
    (void)policyarray;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyEx")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(policyex);
#else
    (void)policyex;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyExArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policyexarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyExArray")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(policyexarray);
#else
    (void)policyexarray;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicySingleUC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicySingleUC")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policy) : -1;
#else
    (void)policy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyValid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicyValid")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppolicy) : 0;
#else
    (void)ppolicy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyWellFormed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicyWellFormed")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppolicy) : -1;
#else
    (void)ppolicy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprModifyV4PolicyExpr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t arg_1_operator = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprModifyV4PolicyExpr")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policy, arg_1_operator) : 0;
#else
    (void)policy;
    (void)arg_1_operator;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprResetV4PolicyExpr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpHlprResetV4PolicyExpr")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(policy) : 0;
#else
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClass_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reservedmustbezero = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpModifyClass")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, reservedmustbezero, classinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClassV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t reservedmustbezero = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpModifyClassV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, reservedmustbezero, classinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveDNSRegistrations_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveDNSRegistrations")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOption_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveOption")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, optionid) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveOptionV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveOptionV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, optionid, scopeinfo) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveOptionValueV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveOptionValueV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* removeelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t forceflag = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveSubnetElement")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, removeelementinfo, forceflag) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* removeelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t forceflag = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveSubnetElementV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, removeelementinfo, forceflag) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* removeelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t forceflag = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRemoveSubnetElementV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, removeelementinfo, forceflag) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpRpcFreeMemory_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bufferpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpRpcFreeMemory")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(bufferpointer);
#else
    (void)bufferpointer;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpScanDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t fixflag = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* scanlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpScanDatabase")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, fixflag, scanlist) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)fixflag;
    (void)scanlist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerAuditlogParamsFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerAuditlogParamsFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(configinfo);
#else
    (void)configinfo;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerBackupDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerBackupDatabase")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, path) : 0;
#else
    (void)serveripaddress;
    (void)path;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfig_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerGetConfig")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, configinfo) : 0;
#else
    (void)serveripaddress;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerGetConfigV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, configinfo) : 0;
#else
    (void)serveripaddress;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerGetConfigV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, scopeinfo, configinfo) : 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigVQ_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerGetConfigVQ")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, configinfo) : 0;
#else
    (void)serveripaddress;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttribute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dhcpattribid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdhcpattrib = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerQueryAttribute")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddr, dwreserved, dhcpattribid, pdhcpattrib) : 0;
#else
    (void)serveripaddr;
    (void)dwreserved;
    (void)dhcpattribid;
    (void)pdhcpattrib;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwattribcount = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pdhcpattribs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pdhcpattribarr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerQueryAttributes")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddr, dwreserved, dwattribcount, pdhcpattribs, pdhcpattribarr) : 0;
#else
    (void)serveripaddr;
    (void)dwreserved;
    (void)dwattribcount;
    (void)pdhcpattribs;
    (void)pdhcpattribarr;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryDnsRegCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t unamesize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* uname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t domainsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* domain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerQueryDnsRegCredentials")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, unamesize, uname, domainsize, domain) : 0;
#else
    (void)serveripaddress;
    (void)unamesize;
    (void)uname;
    (void)domainsize;
    (void)domain;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRedoAuthorization_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwreserved = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerRedoAuthorization")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddr, dwreserved) : 0;
#else
    (void)serveripaddr;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRestoreDatabase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerRestoreDatabase")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, path) : 0;
#else
    (void)serveripaddress;
    (void)path;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfig_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldstoset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerSetConfig")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, fieldstoset, configinfo) : 0;
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldstoset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerSetConfigV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, fieldstoset, configinfo) : 0;
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t fieldstoset = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerSetConfigV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, scopeinfo, fieldstoset, configinfo) : 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)fieldstoset;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigVQ_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldstoset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* configinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerSetConfigVQ")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, fieldstoset, configinfo) : 0;
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* uname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* domain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* passwd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerSetDnsRegCredentials")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, uname, domain, passwd) : 0;
#else
    (void)serveripaddress;
    (void)uname;
    (void)domain;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentialsV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* uname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* domain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* passwd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpServerSetDnsRegCredentialsV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, uname, domain, passwd) : 0;
#else
    (void)serveripaddress;
    (void)uname;
    (void)domain;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetClientInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetClientInfoV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetClientInfoV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoVQ_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetClientInfoVQ")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetFilterV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* globalfilterinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetFilterV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, globalfilterinfo) : 0;
#else
    (void)serveripaddress;
    (void)globalfilterinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* optioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetOptionInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, optionid, optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetOptionInfoV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optioninfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetOptionInfoV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* optionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, optionid, scopeinfo, optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* optionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetOptionValueV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo, optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* optionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetOptionValueV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, classname, vendorname, scopeinfo, optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValues_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* optionvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetOptionValues")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, scopeinfo, optionvalues) : 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)optionvalues;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValuesV5_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* classname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optionvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetOptionValuesV5")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, classname, vendorname, scopeinfo, optionvalues) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalues;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bindelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetServerBindingInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, bindelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfoV6_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bindelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetServerBindingInfoV6")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, bindelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetDelayOffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t timedelayinmilliseconds = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetSubnetDelayOffer")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, timedelayinmilliseconds) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)timedelayinmilliseconds;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* subnetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetSubnetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfoVQ_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* subnetinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetSubnetInfoVQ")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSuperScopeV4_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* superscopename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t changeexisting = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetSuperScopeV4")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, superscopename, changeexisting) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)superscopename;
    (void)changeexisting;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpSetThreadOptions_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpSetThreadOptions")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, reserved) : 0;
#else
    (void)flags;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpUndoRequestParams_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* reserved = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* adaptername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* requestidstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpUndoRequestParams")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(flags, reserved, adaptername, requestidstr) : 0;
#else
    (void)flags;
    (void)reserved;
    (void)adaptername;
    (void)requestidstr;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4AddPolicyRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* range = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4AddPolicyRange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, policyname, range) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)policyname;
    (void)range;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4CreateClientInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4CreateClientInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppolicy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4CreatePolicy")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, ppolicy) : 0;
#else
    (void)serveripaddress;
    (void)ppolicy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* policyex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4CreatePolicyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, policyex) : 0;
#else
    (void)serveripaddress;
    (void)policyex;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4DeletePolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fglobalpolicy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4DeletePolicy")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, fglobalpolicy, subnetaddress, policyname) : 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPolicies_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t fglobalpolicy = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* enuminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* elementsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* elementstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4EnumPolicies")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, fglobalpolicy, subnetaddress, enuminfo, elementsread, elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPoliciesEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t globalpolicy = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* enuminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* elementsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* elementstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4EnumPoliciesEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, globalpolicy, subnetaddress, enuminfo, elementsread, elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClients_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clientsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* clientstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4EnumSubnetClients")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClientsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* clientsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* clientstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4EnumSubnetClientsEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, clientinfo, clientsread, clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetReservations_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* enumelementinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* elementsread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* elementstotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4EnumSubnetReservations")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, resumehandle, preferredmaximum, enumelementinfo, elementsread, elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverAddScopeToRelationship_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prelationship = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverAddScopeToRelationship")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, prelationship) : 0;
#else
    (void)serveripaddress;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverCreateRelationship_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prelationship = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverCreateRelationship")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, prelationship) : 0;
#else
    (void)serveripaddress;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteRelationship_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prelationshipname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverDeleteRelationship")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, prelationshipname) : 0;
#else
    (void)serveripaddress;
    (void)prelationshipname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteScopeFromRelationship_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prelationship = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverDeleteScopeFromRelationship")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, prelationship) : 0;
#else
    (void)serveripaddress;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverEnumRelationship_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resumehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t preferredmaximum = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* prelationship = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* relationshipread = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* relationshiptotal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverEnumRelationship")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, resumehandle, preferredmaximum, prelationship, relationshipread, relationshiptotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)prelationship;
    (void)relationshipread;
    (void)relationshiptotal;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetAddressStatus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverGetAddressStatus")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, pstatus) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)pstatus;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetClientInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverGetClientInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, searchinfo, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetRelationship_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prelationshipname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prelationship = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverGetRelationship")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, prelationshipname, prelationship) : 0;
#else
    (void)serveripaddress;
    (void)prelationshipname;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeRelationship_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t scopeid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* prelationship = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverGetScopeRelationship")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, scopeid, prelationship) : 0;
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t scopeid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pstats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverGetScopeStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, scopeid, pstats) : 0;
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)pstats;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetSystemTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pmaxalloweddeltatime = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverGetSystemTime")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, ptime, pmaxalloweddeltatime) : 0;
#else
    (void)serveripaddress;
    (void)ptime;
    (void)pmaxalloweddeltatime;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverSetRelationship_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* prelationship = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverSetRelationship")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, prelationship) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverTriggerAddrAllocation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfailrelname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4FailoverTriggerAddrAllocation")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, pfailrelname) : 0;
#else
    (void)serveripaddress;
    (void)pfailrelname;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetAllOptionValues_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4GetAllOptionValues")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, scopeinfo, values) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4GetClientInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, searchinfo, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfoEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* searchinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4GetClientInfoEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, searchinfo, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetFreeIPAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t scopeid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t startip = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t endip = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t numfreeaddrreq = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* ipaddrlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4GetFreeIPAddress")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, scopeid, startip, endip, numfreeaddrreq, ipaddrlist) : 0;
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)startip;
    (void)endip;
    (void)numfreeaddrreq;
    (void)ipaddrlist;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* optionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4GetOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, policyname, vendorname, scopeinfo, optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fglobalpolicy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4GetPolicy")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, fglobalpolicy, subnetaddress, policyname, policy) : 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t globalpolicy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4GetPolicyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, globalpolicy, subnetaddress, policyname, policy) : 0;
#else
    (void)serveripaddress;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4QueryPolicyEnforcement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fglobalpolicy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* enabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4QueryPolicyEnforcement")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, fglobalpolicy, subnetaddress, enabled) : 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enabled;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemoveOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4RemoveOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, policyname, vendorname, scopeinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemovePolicyRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* range = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4RemovePolicyRange")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, subnetaddress, policyname, range) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)policyname;
    (void)range;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t optionid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* optionvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4SetOptionValue")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, optionid, policyname, vendorname, scopeinfo, optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValues_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* vendorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* scopeinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* optionvalues = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4SetOptionValues")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, flags, policyname, vendorname, scopeinfo, optionvalues) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalues;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldsmodified = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t fglobalpolicy = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4SetPolicy")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, fieldsmodified, fglobalpolicy, subnetaddress, policyname, policy) : 0;
#else
    (void)serveripaddress;
    (void)fieldsmodified;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEnforcement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fglobalpolicy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t enable = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4SetPolicyEnforcement")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, fglobalpolicy, subnetaddress, enable) : 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enable;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t fieldsmodified = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t globalpolicy = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t subnetaddress = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* policyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* policy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV4SetPolicyEx")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, fieldsmodified, globalpolicy, subnetaddress, policyname, policy) : 0;
#else
    (void)serveripaddress;
    (void)fieldsmodified;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV6CreateClientInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clientinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV6CreateClientInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_DhcpV6GetStatelessStatistics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* serveripaddress = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* statelessstats = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DhcpV6GetStatelessStatistics")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(serveripaddress, statelessstats) : 0;
#else
    (void)serveripaddress;
    (void)statelessstats;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiCleanup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Dhcpv6CApiCleanup")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiInitialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* version = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Dhcpv6CApiInitialize")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(version);
#else
    (void)version;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6ReleasePrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* adaptername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* classid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* leaseinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Dhcpv6ReleasePrefix")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(adaptername, classid, leaseinfo) : 0;
#else
    (void)adaptername;
    (void)classid;
    (void)leaseinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RenewPrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* adaptername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pclassid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prefixleaseinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwtimetowait = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t bvalidateprefix = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Dhcpv6RenewPrefix")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(adaptername, pclassid, prefixleaseinfo, pdwtimetowait, bvalidateprefix) : 0;
#else
    (void)adaptername;
    (void)pclassid;
    (void)prefixleaseinfo;
    (void)pdwtimetowait;
    (void)bvalidateprefix;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RequestPrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* adaptername = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pclassid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prefixleaseinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwtimetowait = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Dhcpv6RequestPrefix")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(adaptername, pclassid, prefixleaseinfo, pdwtimetowait) : 0;
#else
    (void)adaptername;
    (void)pclassid;
    (void)prefixleaseinfo;
    (void)pdwtimetowait;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_networkmanagement_dhcp_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpAddFilterV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpAddFilterV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSecurityGroup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSecurityGroup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpAddServer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpAddServer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElement", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElement_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogGetParams", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogGetParams_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogSetParams", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogSetParams_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiCleanup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiCleanup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiInitialize", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiInitialize_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClass", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClass_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClassV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClassV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoVQ", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoVQ_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOption", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOption_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnet", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnet_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnetVQ", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnetVQ_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDeRegisterParamChange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDeRegisterParamChange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClass", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClass_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClassV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClassV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfoV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfoV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteFilterV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteFilterV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteServer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteServer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSubnet", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSubnet_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSuperScopeV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSuperScopeV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDsCleanup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDsCleanup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpDsInit", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpDsInit_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClasses", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClasses_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClassesV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClassesV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumFilterV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumFilterV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValues", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValues_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptions", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptions_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumServers", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumServers_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClients", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClients_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsFilterStatusInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsFilterStatusInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsVQ", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsVQ_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElements", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElements_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnets", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnets_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetsV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetsV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValues", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValues_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValuesV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValuesV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptions", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptions_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionsV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionsV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClassInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClassInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoVQ", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoVQ_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientOptions", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientOptions_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetFilterV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetFilterV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValue", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValue_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOriginalSubnetMask", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOriginalSubnetMask_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfoV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfoV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerSpecificStrings", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerSpecificStrings_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetDelayOffer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetDelayOffer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfoVQ", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfoVQ_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSuperScopeInfoV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSuperScopeInfoV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetThreadOptions", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetThreadOptions_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpGetVersion", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpGetVersion_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyCondition", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyCondition_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyExpr", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyExpr_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyRange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyRange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4Policy", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4Policy_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4PolicyEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4PolicyEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFindV4DhcpProperty", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFindV4DhcpProperty_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpProperty", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpProperty_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpPropertyArray", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpPropertyArray_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4Policy", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4Policy_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyArray", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyArray_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyExArray", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyExArray_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicySingleUC", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicySingleUC_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyValid", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyValid_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyWellFormed", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyWellFormed_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprModifyV4PolicyExpr", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprModifyV4PolicyExpr_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprResetV4PolicyExpr", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprResetV4PolicyExpr_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClass", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClass_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClassV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClassV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveDNSRegistrations", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveDNSRegistrations_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOption", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOption_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValue", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValue_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElement", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElement_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpRpcFreeMemory", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpRpcFreeMemory_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpScanDatabase", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpScanDatabase_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerAuditlogParamsFree", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerAuditlogParamsFree_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerBackupDatabase", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerBackupDatabase_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfig", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfig_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigVQ", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigVQ_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttribute", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttribute_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttributes", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttributes_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryDnsRegCredentials", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryDnsRegCredentials_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRedoAuthorization", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRedoAuthorization_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRestoreDatabase", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRestoreDatabase_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfig", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfig_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigVQ", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigVQ_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentials", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentials_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentialsV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentialsV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoVQ", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoVQ_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetFilterV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetFilterV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValue", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValue_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValues", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValues_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValuesV5", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValuesV5_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfoV6", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfoV6_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetDelayOffer", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetDelayOffer_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfoVQ", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfoVQ_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSuperScopeV4", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSuperScopeV4_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpSetThreadOptions", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpSetThreadOptions_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpUndoRequestParams", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpUndoRequestParams_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4AddPolicyRange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4AddPolicyRange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicy", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicy_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicyEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicyEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4DeletePolicy", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4DeletePolicy_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPolicies", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPolicies_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPoliciesEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPoliciesEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClients", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClients_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClientsEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClientsEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetReservations", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetReservations_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverAddScopeToRelationship", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverAddScopeToRelationship_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverCreateRelationship", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverCreateRelationship_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteRelationship", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteRelationship_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteScopeFromRelationship", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteScopeFromRelationship_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverEnumRelationship", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverEnumRelationship_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetAddressStatus", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetAddressStatus_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetClientInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetClientInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetRelationship", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetRelationship_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeRelationship", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeRelationship_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetSystemTime", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetSystemTime_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverSetRelationship", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverSetRelationship_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverTriggerAddrAllocation", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverTriggerAddrAllocation_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetAllOptionValues", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetAllOptionValues_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfoEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfoEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetFreeIPAddress", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetFreeIPAddress_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetOptionValue", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetOptionValue_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicy", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicy_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicyEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicyEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4QueryPolicyEnforcement", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4QueryPolicyEnforcement_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemoveOptionValue", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemoveOptionValue_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemovePolicyRange", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemovePolicyRange_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValue", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValue_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValues", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValues_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicy", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicy_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEnforcement", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEnforcement_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEx", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEx_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV6CreateClientInfo", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV6CreateClientInfo_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_DhcpV6GetStatelessStatistics", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_DhcpV6GetStatelessStatistics_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiCleanup", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiCleanup_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiInitialize", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiInitialize_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6ReleasePrefix", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6ReleasePrefix_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RenewPrefix", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RenewPrefix_napi));
    exports.Set("windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RequestPrefix", Napi::Function::New(env, windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RequestPrefix_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_networkmanagement_dhcp_napi, nullptr };
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
