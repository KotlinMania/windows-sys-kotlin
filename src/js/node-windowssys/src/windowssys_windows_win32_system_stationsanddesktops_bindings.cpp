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

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t msg = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t wparam = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int64_t lparam = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BroadcastSystemMessageA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(flags, lpinfo, msg, wparam, lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t msg = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t wparam = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int64_t lparam = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* pbsminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BroadcastSystemMessageExA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(flags, lpinfo, msg, wparam, lparam, pbsminfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)pbsminfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t msg = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t wparam = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int64_t lparam = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* pbsminfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BroadcastSystemMessageExW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(flags, lpinfo, msg, wparam, lparam, pbsminfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)pbsminfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t msg = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint64_t wparam = km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0;
    int64_t lparam = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BroadcastSystemMessageW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(flags, lpinfo, msg, wparam, lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)lpinfo;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdesktop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseDesktop")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdesktop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesktop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwinsta = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseWindowStation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwinsta);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwinsta;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszdesktop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpsa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateDesktopA")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszdesktop, lpszdevice, pdevmode, dwflags, dwdesiredaccess, lpsa);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszdesktop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpsa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t ulheapsize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pvoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateDesktopExA")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszdesktop, lpszdevice, pdevmode, dwflags, dwdesiredaccess, lpsa, ulheapsize, pvoid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    (void)ulheapsize;
    (void)pvoid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszdesktop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpsa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t ulheapsize = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pvoid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateDesktopExW")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszdesktop, lpszdevice, pdevmode, dwflags, dwdesiredaccess, lpsa, ulheapsize, pvoid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    (void)ulheapsize;
    (void)pvoid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszdesktop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpszdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpsa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateDesktopW")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszdesktop, lpszdevice, pdevmode, dwflags, dwdesiredaccess, lpsa);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpszdesktop;
    (void)lpszdevice;
    (void)pdevmode;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwinsta = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpsa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateWindowStationA")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpwinsta, dwflags, dwdesiredaccess, lpsa);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpwinsta;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpwinsta = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpsa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateWindowStationW")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpwinsta, dwflags, dwdesiredaccess, lpsa);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpwinsta;
    (void)dwflags;
    (void)dwdesiredaccess;
    (void)lpsa;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwinsta = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpenumfunc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t lparam = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumDesktopsA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwinsta, lpenumfunc, lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwinsta;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwinsta = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpenumfunc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t lparam = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumDesktopsW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwinsta, lpenumfunc, lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwinsta;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpenumfunc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t lparam = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumWindowStationsA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpenumfunc, lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpenumfunc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t lparam = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumWindowStationsW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpenumfunc, lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetProcessWindowStation")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwthreadid = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThreadDesktop")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwthreadid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwthreadid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nindex = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpnlengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUserObjectInformationA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hobj, nindex, pvinfo, nlength, lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nindex = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpnlengthneeded = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetUserObjectInformationW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hobj, nindex, pvinfo, nlength, lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszdesktop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t finherit = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenDesktopA")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszdesktop, dwflags, finherit, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpszdesktop;
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszdesktop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t finherit = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenDesktopW")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszdesktop, dwflags, finherit, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpszdesktop;
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t finherit = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenInputDesktop")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwflags, finherit, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwflags;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszwinsta = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t finherit = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenWindowStationA")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszwinsta, finherit, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpszwinsta;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpszwinsta = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t finherit = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenWindowStationW")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(lpszwinsta, finherit, dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)lpszwinsta;
    (void)finherit;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwinsta = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetProcessWindowStation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwinsta);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwinsta;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdesktop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThreadDesktop")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdesktop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesktop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nindex = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetUserObjectInformationA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hobj, nindex, pvinfo, nlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nindex = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetUserObjectInformationW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hobj, nindex, pvinfo, nlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)nindex;
    (void)pvinfo;
    (void)nlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdesktop = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SwitchDesktop")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdesktop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdesktop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_system_stationsanddesktops_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW_napi));
    exports.Set("windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop", Napi::Function::New(env, windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_system_stationsanddesktops_napi, nullptr };
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
