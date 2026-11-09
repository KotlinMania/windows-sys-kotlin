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

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_ApplyLocalManagementSyncML_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* syncmlrequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* syncmlresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmlocalmanagement.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ApplyLocalManagementSyncML")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(syncmlrequest, syncmlresult) : -1;
#else
    (void)syncmlrequest;
    (void)syncmlresult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementService_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszupn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppmgmtinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiscoverManagementService")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszupn, ppmgmtinfo) : -1;
#else
    (void)pszupn;
    (void)ppmgmtinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementServiceEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszupn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszdiscoveryservicecandidate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppmgmtinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DiscoverManagementServiceEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszupn, pszdiscoveryservicecandidate, ppmgmtinfo) : -1;
#else
    (void)pszupn;
    (void)pszdiscoveryservicecandidate;
    (void)ppmgmtinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceManagementConfigInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* providerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configstringbufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* configstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDeviceManagementConfigInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(providerid, configstringbufferlength, configstring) : -1;
#else
    (void)providerid;
    (void)configstringbufferlength;
    (void)configstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceRegistrationInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t deviceinformationclass = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* ppdeviceregistrationinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDeviceRegistrationInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(deviceinformationclass, ppdeviceregistrationinfo) : -1;
#else
    (void)deviceinformationclass;
    (void)ppdeviceregistrationinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_GetManagementAppHyperlink_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cchhyperlink = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pszhyperlink = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetManagementAppHyperlink")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cchhyperlink, pszhyperlink) : -1;
#else
    (void)cchhyperlink;
    (void)pszhyperlink;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_IsDeviceRegisteredWithManagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfisdeviceregisteredwithmanagement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cchupn = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszupn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsDeviceRegisteredWithManagement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfisdeviceregisteredwithmanagement, cchupn, pszupn) : -1;
#else
    (void)pfisdeviceregisteredwithmanagement;
    (void)cchupn;
    (void)pszupn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_IsManagementRegistrationAllowed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pfismanagementregistrationallowed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsManagementRegistrationAllowed")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pfismanagementregistrationallowed) : -1;
#else
    (void)pfismanagementregistrationallowed;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_IsMdmUxWithoutAadAllowed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* isenrollmentallowed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsMdmUxWithoutAadAllowed")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(isenrollmentallowed) : -1;
#else
    (void)isenrollmentallowed;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithLocalManagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* alreadyregistered = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmlocalmanagement.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterDeviceWithLocalManagement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(alreadyregistered) : -1;
#else
    (void)alreadyregistered;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszupn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppszmdmserviceuri = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppzsaccesstoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterDeviceWithManagement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszupn, ppszmdmserviceuri, ppzsaccesstoken) : -1;
#else
    (void)pszupn;
    (void)ppszmdmserviceuri;
    (void)ppzsaccesstoken;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* usertoken = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterDeviceWithManagementUsingAADCredentials")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(usertoken) : -1;
#else
    (void)usertoken;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterDeviceWithManagementUsingAADDeviceCredentials")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mdmapplicationid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterDeviceWithManagementUsingAADDeviceCredentials2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(mdmapplicationid) : -1;
#else
    (void)mdmapplicationid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_SetDeviceManagementConfigInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* providerid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* configstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetDeviceManagementConfigInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(providerid, configstring) : -1;
#else
    (void)providerid;
    (void)configstring;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_SetManagedExternally_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t ismanagedexternally = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetManagedExternally")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ismanagedexternally) : -1;
#else
    (void)ismanagedexternally;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithLocalManagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmlocalmanagement.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterDeviceWithLocalManagement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithManagement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* enrollmentid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterDeviceWithManagement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(enrollmentid) : -1;
#else
    (void)enrollmentid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_management_mobiledevicemanagementregistration_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_ApplyLocalManagementSyncML", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_ApplyLocalManagementSyncML_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementService", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementService_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementServiceEx", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementServiceEx_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceManagementConfigInfo", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceManagementConfigInfo_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceRegistrationInfo", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceRegistrationInfo_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_GetManagementAppHyperlink", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_GetManagementAppHyperlink_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_IsDeviceRegisteredWithManagement", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_IsDeviceRegisteredWithManagement_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_IsManagementRegistrationAllowed", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_IsManagementRegistrationAllowed_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_IsMdmUxWithoutAadAllowed", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_IsMdmUxWithoutAadAllowed_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithLocalManagement", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithLocalManagement_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagement", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagement_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADCredentials", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADCredentials_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials2", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials2_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_SetDeviceManagementConfigInfo", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_SetDeviceManagementConfigInfo_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_SetManagedExternally", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_SetManagedExternally_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithLocalManagement", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithLocalManagement_napi));
    exports.Set("windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithManagement", Napi::Function::New(env, windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithManagement_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_management_mobiledevicemanagementregistration_napi, nullptr };
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
