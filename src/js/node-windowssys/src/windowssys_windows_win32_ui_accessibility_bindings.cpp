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

static Napi::Value windowssys_windows_win32_ui_accessibility_AccSetRunningUtilityState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndapp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwutilitystatemask = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwutilitystate = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccSetRunningUtilityState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndapp, dwutilitystatemask, dwutilitystate) : -1;
#else
    (void)hwndapp;
    (void)dwutilitystatemask;
    (void)dwutilitystate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_AccessibleChildren_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pacccontainer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t ichildstart = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t cchildren = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* rgvarchildren = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcobtained = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessibleChildren")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pacccontainer, ichildstart, cchildren, rgvarchildren, pcobtained) : -1;
#else
    (void)pacccontainer;
    (void)ichildstart;
    (void)cchildren;
    (void)rgvarchildren;
    (void)pcobtained;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_AccessibleObjectFromEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwchildid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppacc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pvarchild = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessibleObjectFromEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, dwid, dwchildid, ppacc, pvarchild) : -1;
#else
    (void)hwnd;
    (void)dwid;
    (void)dwchildid;
    (void)ppacc;
    (void)pvarchild;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_AccessibleObjectFromWindow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppvobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AccessibleObjectFromWindow")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, dwid, riid, ppvobject) : -1;
#else
    (void)hwnd;
    (void)dwid;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_CreateStdAccessibleObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t idobject = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppvobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateStdAccessibleObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, idobject, riid, ppvobject) : -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pclassname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t idobject = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppvobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateStdAccessibleProxyA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, pclassname, idobject, riid, ppvobject) : -1;
#else
    (void)hwnd;
    (void)pclassname;
    (void)idobject;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pclassname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t idobject = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppvobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateStdAccessibleProxyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, pclassname, idobject, riid, ppvobject) : -1;
#else
    (void)hwnd;
    (void)pclassname;
    (void)idobject;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_DockPattern_SetDockPosition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t dockposition = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DockPattern_SetDockPosition")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, dockposition) : -1;
#else
    (void)hobj;
    (void)dockposition;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Collapse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExpandCollapsePattern_Collapse")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Expand_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ExpandCollapsePattern_Expand")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_GetOleaccVersionInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pver = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbuild = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetOleaccVersionInfo")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pver, pbuild);
#else
    (void)pver;
    (void)pbuild;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_accessibility_GetRoleTextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t lrole = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszrole = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchrolemax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetRoleTextA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lrole, lpszrole, cchrolemax) : 0;
#else
    (void)lrole;
    (void)lpszrole;
    (void)cchrolemax;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_GetRoleTextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t lrole = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszrole = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchrolemax = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetRoleTextW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lrole, lpszrole, cchrolemax) : 0;
#else
    (void)lrole;
    (void)lpszrole;
    (void)cchrolemax;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_GetStateTextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t lstatebit = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchstate = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStateTextA")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lstatebit, lpszstate, cchstate) : 0;
#else
    (void)lstatebit;
    (void)lpszstate;
    (void)cchstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_GetStateTextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t lstatebit = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cchstate = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStateTextW")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lstatebit, lpszstate, cchstate) : 0;
#else
    (void)lstatebit;
    (void)lpszstate;
    (void)cchstate;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_GridPattern_GetItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t row = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t column = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* presult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GridPattern_GetItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, row, column, presult) : -1;
#else
    (void)hobj;
    (void)row;
    (void)column;
    (void)presult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_InvokePattern_Invoke_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InvokePattern_Invoke")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_IsWinEventHookInstalled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t event = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsWinEventHookInstalled")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(event) : -1;
#else
    (void)event;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_DoDefaultAction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_DoDefaultAction")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_GetIAccessible_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* paccessible = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_GetIAccessible")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, paccessible) : -1;
#else
    (void)hobj;
    (void)paccessible;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_Select_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flagsselect = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_Select")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, flagsselect) : -1;
#else
    (void)hobj;
    (void)flagsselect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_SetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* szvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_SetValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, szvalue) : -1;
#else
    (void)hobj;
    (void)szvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_LresultFromObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t wparam = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* punk = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LresultFromObject")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(riid, wparam, punk) : -1;
#else
    (void)riid;
    (void)wparam;
    (void)punk;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_MultipleViewPattern_GetViewName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t viewid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppstr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MultipleViewPattern_GetViewName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, viewid, ppstr) : -1;
#else
    (void)hobj;
    (void)viewid;
    (void)ppstr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_MultipleViewPattern_SetCurrentView_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t viewid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MultipleViewPattern_SetCurrentView")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, viewid) : -1;
#else
    (void)hobj;
    (void)viewid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_NotifyWinEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t event = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t idobject = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t idchild = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "NotifyWinEvent")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(event, hwnd, idobject, idchild);
#else
    (void)event;
    (void)hwnd;
    (void)idobject;
    (void)idchild;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_accessibility_ObjectFromLresult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t lresult = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint64_t wparam = km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0;
    void* ppvobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ObjectFromLresult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lresult, riid, wparam, ppvobject) : -1;
#else
    (void)lresult;
    (void)riid;
    (void)wparam;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_RangeValuePattern_SetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double val = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RangeValuePattern_SetValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, val) : -1;
#else
    (void)hobj;
    (void)val;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_RegisterPointerInputTarget_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pointertype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterPointerInputTarget")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, pointertype) : -1;
#else
    (void)hwnd;
    (void)pointertype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_RegisterPointerInputTargetEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pointertype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t fobserve = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterPointerInputTargetEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, pointertype, fobserve) : -1;
#else
    (void)hwnd;
    (void)pointertype;
    (void)fobserve;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_ScrollItemPattern_ScrollIntoView_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ScrollItemPattern_ScrollIntoView")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_ScrollPattern_Scroll_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t horizontalamount = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t verticalamount = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ScrollPattern_Scroll")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, horizontalamount, verticalamount) : -1;
#else
    (void)hobj;
    (void)horizontalamount;
    (void)verticalamount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_ScrollPattern_SetScrollPercent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double horizontalpercent = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double verticalpercent = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ScrollPattern_SetScrollPercent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, horizontalpercent, verticalpercent) : -1;
#else
    (void)hobj;
    (void)horizontalpercent;
    (void)verticalpercent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_SelectionItemPattern_AddToSelection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SelectionItemPattern_AddToSelection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_SelectionItemPattern_RemoveFromSelection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SelectionItemPattern_RemoveFromSelection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_SelectionItemPattern_Select_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SelectionItemPattern_Select")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_SetWinEventHook_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t eventmin = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t eventmax = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hmodwineventproc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfnwineventproc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t idprocess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t idthread = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetWinEventHook")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(eventmin, eventmax, hmodwineventproc, pfnwineventproc, idprocess, idthread, dwflags) : NULL;
#else
    (void)eventmin;
    (void)eventmax;
    (void)hmodwineventproc;
    (void)pfnwineventproc;
    (void)idprocess;
    (void)idthread;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_Cancel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SynchronizedInputPattern_Cancel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_StartListening_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t inputtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SynchronizedInputPattern_StartListening")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, inputtype) : -1;
#else
    (void)hobj;
    (void)inputtype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextPattern_GetSelection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextPattern_GetSelection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextPattern_GetVisibleRanges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextPattern_GetVisibleRanges")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextPattern_RangeFromChild_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hnodechild = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextPattern_RangeFromChild")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, hnodechild, pretval) : -1;
#else
    (void)hobj;
    (void)hnodechild;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextPattern_get_DocumentRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextPattern_get_DocumentRange")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextPattern_get_SupportedTextSelection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextPattern_get_SupportedTextSelection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_AddToSelection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_AddToSelection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_Clone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_Clone")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_Compare_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* range = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_Compare")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, range, pretval) : -1;
#else
    (void)hobj;
    (void)range;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_CompareEndpoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t endpoint = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* targetrange = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t targetendpoint = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_CompareEndpoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, endpoint, targetrange, targetendpoint, pretval) : -1;
#else
    (void)hobj;
    (void)endpoint;
    (void)targetrange;
    (void)targetendpoint;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_ExpandToEnclosingUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t unit = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_ExpandToEnclosingUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, unit) : -1;
#else
    (void)hobj;
    (void)unit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_FindText_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* text = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t backward = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ignorecase = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_FindText")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, text, backward, ignorecase, pretval) : -1;
#else
    (void)hobj;
    (void)text;
    (void)backward;
    (void)ignorecase;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_GetAttributeValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t attributeid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_GetAttributeValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, attributeid, pretval) : -1;
#else
    (void)hobj;
    (void)attributeid;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_GetBoundingRectangles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_GetBoundingRectangles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_GetChildren_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_GetChildren")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_GetEnclosingElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_GetEnclosingElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_GetText_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t maxlength = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_GetText")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, maxlength, pretval) : -1;
#else
    (void)hobj;
    (void)maxlength;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_Move_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t unit = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_Move")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, unit, count, pretval) : -1;
#else
    (void)hobj;
    (void)unit;
    (void)count;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t endpoint = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* targetrange = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t targetendpoint = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_MoveEndpointByRange")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, endpoint, targetrange, targetendpoint) : -1;
#else
    (void)hobj;
    (void)endpoint;
    (void)targetrange;
    (void)targetendpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t endpoint = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t unit = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pretval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_MoveEndpointByUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, endpoint, unit, count, pretval) : -1;
#else
    (void)hobj;
    (void)endpoint;
    (void)unit;
    (void)count;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_RemoveFromSelection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_RemoveFromSelection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_ScrollIntoView_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t aligntotop = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_ScrollIntoView")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, aligntotop) : -1;
#else
    (void)hobj;
    (void)aligntotop;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TextRange_Select_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TextRange_Select")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TogglePattern_Toggle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TogglePattern_Toggle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TransformPattern_Move_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double x = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TransformPattern_Move")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, x, y) : -1;
#else
    (void)hobj;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TransformPattern_Resize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double width = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double height = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TransformPattern_Resize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, width, height) : -1;
#else
    (void)hobj;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_TransformPattern_Rotate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double degrees = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TransformPattern_Rotate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, degrees) : -1;
#else
    (void)hobj;
    (void)degrees;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaAddEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t eventid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t scope = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t cproperties = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* phevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaAddEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, eventid, pcallback, scope, pproperties, cproperties, prequest, phevent) : -1;
#else
    (void)hnode;
    (void)eventid;
    (void)pcallback;
    (void)scope;
    (void)pproperties;
    (void)cproperties;
    (void)prequest;
    (void)phevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaClientsAreListening_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaClientsAreListening")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaDisconnectAllProviders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaDisconnectAllProviders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaDisconnectProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaDisconnectProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovider) : -1;
#else
    (void)pprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaEventAddWindow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaEventAddWindow")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent, hwnd) : -1;
#else
    (void)hevent;
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaEventRemoveWindow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaEventRemoveWindow")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent, hwnd) : -1;
#else
    (void)hevent;
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaFind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pprequesteddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* ppoffsets = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pptreestructures = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaFind")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, pparams, prequest, pprequesteddata, ppoffsets, pptreestructures) : -1;
#else
    (void)hnode;
    (void)pparams;
    (void)prequest;
    (void)pprequesteddata;
    (void)ppoffsets;
    (void)pptreestructures;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaGetErrorDescription_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdescription = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaGetErrorDescription")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdescription) : -1;
#else
    (void)pdescription;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaGetPatternProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t patternid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* phobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaGetPatternProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, patternid, phobj) : -1;
#else
    (void)hnode;
    (void)patternid;
    (void)phobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaGetPropertyValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t propertyid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaGetPropertyValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, propertyid, pvalue) : -1;
#else
    (void)hnode;
    (void)propertyid;
    (void)pvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaGetReservedMixedAttributeValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* punkmixedattributevalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaGetReservedMixedAttributeValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(punkmixedattributevalue) : -1;
#else
    (void)punkmixedattributevalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaGetReservedNotSupportedValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* punknotsupportedvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaGetReservedNotSupportedValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(punknotsupportedvalue) : -1;
#else
    (void)punknotsupportedvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaGetRootNode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaGetRootNode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phnode) : -1;
#else
    (void)phnode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaGetRuntimeId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pruntimeid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaGetRuntimeId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, pruntimeid) : -1;
#else
    (void)hnode;
    (void)pruntimeid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaGetUpdatedCache_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t normalizestate = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pnormalizecondition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pprequesteddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pptreestructure = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaGetUpdatedCache")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, prequest, normalizestate, pnormalizecondition, pprequesteddata, pptreestructure) : -1;
#else
    (void)hnode;
    (void)prequest;
    (void)normalizestate;
    (void)pnormalizecondition;
    (void)pprequesteddata;
    (void)pptreestructure;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaHPatternObjectFromVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaHPatternObjectFromVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvar, phobj) : -1;
#else
    (void)pvar;
    (void)phobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaHTextRangeFromVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phtextrange = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaHTextRangeFromVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvar, phtextrange) : -1;
#else
    (void)pvar;
    (void)phtextrange;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaHUiaNodeFromVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaHUiaNodeFromVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pvar, phnode) : -1;
#else
    (void)pvar;
    (void)phnode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaHasServerSideProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaHasServerSideProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaHostProviderFromHwnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaHostProviderFromHwnd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, ppprovider) : -1;
#else
    (void)hwnd;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaIAccessibleFromProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppaccessible = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvarchild = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaIAccessibleFromProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovider, dwflags, ppaccessible, pvarchild) : -1;
#else
    (void)pprovider;
    (void)dwflags;
    (void)ppaccessible;
    (void)pvarchild;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaLookupId_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t type = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pguid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaLookupId")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(type, pguid) : -1;
#else
    (void)type;
    (void)pguid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaNavigate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t direction = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcondition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pprequesteddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pptreestructure = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaNavigate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode, direction, pcondition, prequest, pprequesteddata, pptreestructure) : -1;
#else
    (void)hnode;
    (void)direction;
    (void)pcondition;
    (void)prequest;
    (void)pprequesteddata;
    (void)pptreestructure;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaNodeFromFocus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprequesteddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pptreestructure = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaNodeFromFocus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(prequest, pprequesteddata, pptreestructure) : -1;
#else
    (void)prequest;
    (void)pprequesteddata;
    (void)pptreestructure;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaNodeFromHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaNodeFromHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, phnode) : -1;
#else
    (void)hwnd;
    (void)phnode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaNodeFromPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    void* prequest = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pprequesteddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pptreestructure = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaNodeFromPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(x, y, prequest, pprequesteddata, pptreestructure) : -1;
#else
    (void)x;
    (void)y;
    (void)prequest;
    (void)pprequesteddata;
    (void)pptreestructure;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaNodeFromProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaNodeFromProvider")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovider, phnode) : -1;
#else
    (void)pprovider;
    (void)phnode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaNodeRelease_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaNodeRelease")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode) : -1;
#else
    (void)hnode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaPatternRelease_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaPatternRelease")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaProviderForNonClient_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t idobject = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t idchild = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaProviderForNonClient")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, idobject, idchild, ppprovider) : -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)idchild;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaProviderFromIAccessible_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* paccessible = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t idchild = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaProviderFromIAccessible")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(paccessible, idchild, dwflags, ppprovider) : -1;
#else
    (void)paccessible;
    (void)idchild;
    (void)dwflags;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaRaiseActiveTextPositionChangedEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* provider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* textrange = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaRaiseActiveTextPositionChangedEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(provider, textrange) : -1;
#else
    (void)provider;
    (void)textrange;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaRaiseAsyncContentLoadedEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t asynccontentloadedstate = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    double percentcomplete = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaRaiseAsyncContentLoadedEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovider, asynccontentloadedstate, percentcomplete) : -1;
#else
    (void)pprovider;
    (void)asynccontentloadedstate;
    (void)percentcomplete;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaRaiseAutomationEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t id = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaRaiseAutomationEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovider, id) : -1;
#else
    (void)pprovider;
    (void)id;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaRaiseChangesEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t eventidcount = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* puiachanges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaRaiseChangesEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovider, eventidcount, puiachanges) : -1;
#else
    (void)pprovider;
    (void)eventidcount;
    (void)puiachanges;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaRaiseNotificationEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* provider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t notificationkind = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t notificationprocessing = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* displaystring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* activityid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaRaiseNotificationEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(provider, notificationkind, notificationprocessing, displaystring, activityid) : -1;
#else
    (void)provider;
    (void)notificationkind;
    (void)notificationprocessing;
    (void)displaystring;
    (void)activityid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaRaiseStructureChangedEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t structurechangetype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pruntimeid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cruntimeidlen = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaRaiseStructureChangedEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovider, structurechangetype, pruntimeid, cruntimeidlen) : -1;
#else
    (void)pprovider;
    (void)structurechangetype;
    (void)pruntimeid;
    (void)cruntimeidlen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaRaiseTextEditTextChangedEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprovider = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t texteditchangetype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pchangeddata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaRaiseTextEditTextChangedEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprovider, texteditchangetype, pchangeddata) : -1;
#else
    (void)pprovider;
    (void)texteditchangetype;
    (void)pchangeddata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaRegisterProviderCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaRegisterProviderCallback")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(pcallback);
#else
    (void)pcallback;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaRemoveEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hevent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaRemoveEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaReturnRawElementProvider_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t wparam = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int64_t lparam = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* el = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaReturnRawElementProvider")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, wparam, lparam, el) : -1;
#else
    (void)hwnd;
    (void)wparam;
    (void)lparam;
    (void)el;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaSetFocus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hnode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaSetFocus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hnode) : -1;
#else
    (void)hnode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UiaTextRangeRelease_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UiaTextRangeRelease")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UnhookWinEvent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwineventhook = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnhookWinEvent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwineventhook) : -1;
#else
    (void)hwineventhook;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTarget_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pointertype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterPointerInputTarget")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, pointertype) : -1;
#else
    (void)hwnd;
    (void)pointertype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTargetEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pointertype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterPointerInputTargetEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, pointertype) : -1;
#else
    (void)hwnd;
    (void)pointertype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_ValuePattern_SetValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ValuePattern_SetValue")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, pval) : -1;
#else
    (void)hobj;
    (void)pval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_VirtualizedItemPattern_Realize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "VirtualizedItemPattern_Realize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_WindowFromAccessibleObject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WindowFromAccessibleObject")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, phwnd) : -1;
#else
    (void)param0;
    (void)phwnd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_WindowPattern_Close_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WindowPattern_Close")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_WindowPattern_SetWindowVisualState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t state = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WindowPattern_SetWindowVisualState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, state) : -1;
#else
    (void)hobj;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_accessibility_WindowPattern_WaitForInputIdle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t milliseconds = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* presult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WindowPattern_WaitForInputIdle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hobj, milliseconds, presult) : -1;
#else
    (void)hobj;
    (void)milliseconds;
    (void)presult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_ui_accessibility_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_ui_accessibility_AccSetRunningUtilityState", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_AccSetRunningUtilityState_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_AccessibleChildren", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_AccessibleChildren_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_AccessibleObjectFromEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_AccessibleObjectFromEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_AccessibleObjectFromWindow", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_AccessibleObjectFromWindow_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_CreateStdAccessibleObject", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_CreateStdAccessibleObject_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyA", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyA_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyW", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyW_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_DockPattern_SetDockPosition", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_DockPattern_SetDockPosition_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Collapse", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Collapse_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Expand", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Expand_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_GetOleaccVersionInfo", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_GetOleaccVersionInfo_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_GetRoleTextA", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_GetRoleTextA_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_GetRoleTextW", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_GetRoleTextW_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_GetStateTextA", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_GetStateTextA_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_GetStateTextW", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_GetStateTextW_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_GridPattern_GetItem", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_GridPattern_GetItem_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_InvokePattern_Invoke", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_InvokePattern_Invoke_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_IsWinEventHookInstalled", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_IsWinEventHookInstalled_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_DoDefaultAction", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_DoDefaultAction_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_GetIAccessible", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_GetIAccessible_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_Select", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_Select_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_SetValue", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_SetValue_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_LresultFromObject", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_LresultFromObject_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_MultipleViewPattern_GetViewName", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_MultipleViewPattern_GetViewName_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_MultipleViewPattern_SetCurrentView", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_MultipleViewPattern_SetCurrentView_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_NotifyWinEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_NotifyWinEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_ObjectFromLresult", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_ObjectFromLresult_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_RangeValuePattern_SetValue", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_RangeValuePattern_SetValue_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_RegisterPointerInputTarget", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_RegisterPointerInputTarget_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_RegisterPointerInputTargetEx", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_RegisterPointerInputTargetEx_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_ScrollItemPattern_ScrollIntoView", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_ScrollItemPattern_ScrollIntoView_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_ScrollPattern_Scroll", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_ScrollPattern_Scroll_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_ScrollPattern_SetScrollPercent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_ScrollPattern_SetScrollPercent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_SelectionItemPattern_AddToSelection", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_SelectionItemPattern_AddToSelection_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_SelectionItemPattern_RemoveFromSelection", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_SelectionItemPattern_RemoveFromSelection_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_SelectionItemPattern_Select", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_SelectionItemPattern_Select_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_SetWinEventHook", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_SetWinEventHook_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_Cancel", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_Cancel_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_StartListening", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_StartListening_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextPattern_GetSelection", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextPattern_GetSelection_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextPattern_GetVisibleRanges", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextPattern_GetVisibleRanges_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextPattern_RangeFromChild", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextPattern_RangeFromChild_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextPattern_get_DocumentRange", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextPattern_get_DocumentRange_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextPattern_get_SupportedTextSelection", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextPattern_get_SupportedTextSelection_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_AddToSelection", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_AddToSelection_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_Clone", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_Clone_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_Compare", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_Compare_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_CompareEndpoints", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_CompareEndpoints_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_ExpandToEnclosingUnit", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_ExpandToEnclosingUnit_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_FindText", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_FindText_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_GetAttributeValue", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_GetAttributeValue_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_GetBoundingRectangles", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_GetBoundingRectangles_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_GetChildren", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_GetChildren_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_GetEnclosingElement", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_GetEnclosingElement_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_GetText", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_GetText_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_Move", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_Move_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByRange", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByRange_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByUnit", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByUnit_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_RemoveFromSelection", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_RemoveFromSelection_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_ScrollIntoView", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_ScrollIntoView_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TextRange_Select", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TextRange_Select_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TogglePattern_Toggle", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TogglePattern_Toggle_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TransformPattern_Move", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TransformPattern_Move_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TransformPattern_Resize", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TransformPattern_Resize_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_TransformPattern_Rotate", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_TransformPattern_Rotate_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaAddEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaAddEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaClientsAreListening", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaClientsAreListening_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaDisconnectAllProviders", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaDisconnectAllProviders_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaDisconnectProvider", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaDisconnectProvider_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaEventAddWindow", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaEventAddWindow_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaEventRemoveWindow", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaEventRemoveWindow_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaFind", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaFind_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaGetErrorDescription", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaGetErrorDescription_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaGetPatternProvider", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaGetPatternProvider_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaGetPropertyValue", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaGetPropertyValue_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaGetReservedMixedAttributeValue", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaGetReservedMixedAttributeValue_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaGetReservedNotSupportedValue", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaGetReservedNotSupportedValue_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaGetRootNode", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaGetRootNode_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaGetRuntimeId", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaGetRuntimeId_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaGetUpdatedCache", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaGetUpdatedCache_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaHPatternObjectFromVariant", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaHPatternObjectFromVariant_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaHTextRangeFromVariant", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaHTextRangeFromVariant_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaHUiaNodeFromVariant", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaHUiaNodeFromVariant_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaHasServerSideProvider", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaHasServerSideProvider_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaHostProviderFromHwnd", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaHostProviderFromHwnd_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaIAccessibleFromProvider", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaIAccessibleFromProvider_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaLookupId", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaLookupId_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaNavigate", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaNavigate_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaNodeFromFocus", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaNodeFromFocus_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaNodeFromHandle", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaNodeFromHandle_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaNodeFromPoint", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaNodeFromPoint_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaNodeFromProvider", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaNodeFromProvider_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaNodeRelease", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaNodeRelease_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaPatternRelease", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaPatternRelease_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaProviderForNonClient", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaProviderForNonClient_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaProviderFromIAccessible", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaProviderFromIAccessible_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaRaiseActiveTextPositionChangedEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaRaiseActiveTextPositionChangedEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaRaiseAsyncContentLoadedEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaRaiseAsyncContentLoadedEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaRaiseAutomationEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaRaiseAutomationEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaRaiseChangesEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaRaiseChangesEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaRaiseNotificationEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaRaiseNotificationEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaRaiseStructureChangedEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaRaiseStructureChangedEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaRaiseTextEditTextChangedEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaRaiseTextEditTextChangedEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaRegisterProviderCallback", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaRegisterProviderCallback_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaRemoveEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaRemoveEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaReturnRawElementProvider", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaReturnRawElementProvider_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaSetFocus", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaSetFocus_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UiaTextRangeRelease", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UiaTextRangeRelease_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UnhookWinEvent", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UnhookWinEvent_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTarget", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTarget_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTargetEx", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTargetEx_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_ValuePattern_SetValue", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_ValuePattern_SetValue_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_VirtualizedItemPattern_Realize", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_VirtualizedItemPattern_Realize_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_WindowFromAccessibleObject", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_WindowFromAccessibleObject_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_WindowPattern_Close", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_WindowPattern_Close_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_WindowPattern_SetWindowVisualState", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_WindowPattern_SetWindowVisualState_napi));
    exports.Set("windowssys_windows_win32_ui_accessibility_WindowPattern_WaitForInputIdle", Napi::Function::New(env, windowssys_windows_win32_ui_accessibility_WindowPattern_WaitForInputIdle_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_ui_accessibility_napi, nullptr };
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
