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

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathArc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float startangle = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathArc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathArcI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    float startangle = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathArcI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y1 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float x2 = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float y2 = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float x3 = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float y3 = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float x4 = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
    float y4 = km_info.Length() > 8 ? km_info[8].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathBezier")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x1, y1, x2, y2, x3, y3, x4, y4) : -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezierI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y1 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t x2 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t y2 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t x3 = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t y3 = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t x4 = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t y4 = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathBezierI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x1, y1, x2, y2, x3, y3, x4, y4) : -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathBeziers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziersI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathBeziersI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathClosedCurve")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathClosedCurve2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count, tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathClosedCurve2I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count, tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurveI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathClosedCurveI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathCurve")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathCurve2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count, tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathCurve2I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count, tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t offset = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t numberofsegments = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathCurve3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count, offset, numberofsegments, tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t offset = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t numberofsegments = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathCurve3I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count, offset, numberofsegments, tension) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurveI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathCurveI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathEllipse")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, width, height) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipseI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathEllipseI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, width, height) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y1 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float x2 = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float y2 = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathLine")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x1, y1, x2, y2) : -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathLine2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathLine2I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathLineI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y1 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t x2 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t y2 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathLineI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x1, y1, x2, y2) : -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* addingpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t arg_2_connect = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, addingpath, arg_2_connect) : -1;
#else
    (void)path;
    (void)addingpath;
    (void)arg_2_connect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathPie_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float startangle = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathPie")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathPieI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    float startangle = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathPieI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathPolygon")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygonI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathPolygonI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, points, count) : -1;
#else
    (void)path;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathRectangle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, width, height) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangleI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathRectangleI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, width, height) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathRectangles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, rects, count) : -1;
#else
    (void)path;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectanglesI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathRectanglesI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, rects, count) : -1;
#else
    (void)path;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t length = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* family = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t style = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    float emsize = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    void* layoutrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, float, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, string, length, family, style, emsize, layoutrect, format) : -1;
#else
    (void)path;
    (void)string;
    (void)length;
    (void)family;
    (void)style;
    (void)emsize;
    (void)layoutrect;
    (void)format;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAddPathStringI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t length = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* family = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t style = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    float emsize = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    void* layoutrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, float, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAddPathStringI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, string, length, family, style, emsize, layoutrect, format) : -1;
#else
    (void)path;
    (void)string;
    (void)length;
    (void)family;
    (void)style;
    (void)emsize;
    (void)layoutrect;
    (void)format;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipAlloc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t size = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipAlloc")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(size) : NULL;
#else
    (void)size;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dstrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* srcrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t unit = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBeginContainer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, dstrect, srcrect, unit, state) : -1;
#else
    (void)graphics;
    (void)dstrect;
    (void)srcrect;
    (void)unit;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBeginContainer2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, state) : -1;
#else
    (void)graphics;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBeginContainerI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dstrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* srcrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t unit = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBeginContainerI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, dstrect, srcrect, unit, state) : -1;
#else
    (void)graphics;
    (void)dstrect;
    (void)srcrect;
    (void)unit;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapApplyEffect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* effect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* roi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t useauxdata = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* auxdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* auxdatasize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapApplyEffect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, effect, roi, useauxdata, auxdata, auxdatasize) : -1;
#else
    (void)bitmap;
    (void)effect;
    (void)roi;
    (void)useauxdata;
    (void)auxdata;
    (void)auxdatasize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapConvertFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pinputbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t format = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t dithertype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t palettetype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* palette = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    float alphathresholdpercent = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapConvertFormat")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pinputbitmap, format, dithertype, palettetype, palette, alphathresholdpercent) : -1;
#else
    (void)pinputbitmap;
    (void)format;
    (void)dithertype;
    (void)palettetype;
    (void)palette;
    (void)alphathresholdpercent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapCreateApplyEffect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* inputbitmaps = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t numinputs = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* effect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* roi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* outputrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* outputbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t useauxdata = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* auxdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* auxdatasize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapCreateApplyEffect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(inputbitmaps, numinputs, effect, roi, outputrect, outputbitmap, useauxdata, auxdata, auxdatasize) : -1;
#else
    (void)inputbitmaps;
    (void)numinputs;
    (void)effect;
    (void)roi;
    (void)outputrect;
    (void)outputbitmap;
    (void)useauxdata;
    (void)auxdata;
    (void)auxdatasize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogram_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t format = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t numberofentries = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* channel0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* channel1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* channel2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* channel3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapGetHistogram")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, format, numberofentries, channel0, channel1, channel2, channel3) : -1;
#else
    (void)bitmap;
    (void)format;
    (void)numberofentries;
    (void)channel0;
    (void)channel1;
    (void)channel2;
    (void)channel3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogramSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t format = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* numberofentries = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapGetHistogramSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, numberofentries) : -1;
#else
    (void)format;
    (void)numberofentries;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetPixel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* color = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapGetPixel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, x, y, color) : -1;
#else
    (void)bitmap;
    (void)x;
    (void)y;
    (void)color;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapLockBits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t format = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lockedbitmapdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapLockBits")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, rect, flags, format, lockedbitmapdata) : -1;
#else
    (void)bitmap;
    (void)rect;
    (void)flags;
    (void)format;
    (void)lockedbitmapdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetPixel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t color = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapSetPixel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, x, y, color) : -1;
#else
    (void)bitmap;
    (void)x;
    (void)y;
    (void)color;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetResolution_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float xdpi = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float ydpi = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapSetResolution")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, xdpi, ydpi) : -1;
#else
    (void)bitmap;
    (void)xdpi;
    (void)ydpi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipBitmapUnlockBits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lockedbitmapdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipBitmapUnlockBits")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, lockedbitmapdata) : -1;
#else
    (void)bitmap;
    (void)lockedbitmapdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipClearPathMarkers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipClearPathMarkers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapArea_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    int32_t format = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* srcbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* dstbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, float, float, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneBitmapArea")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(x, y, width, height, format, srcbitmap, dstbitmap) : -1;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)srcbitmap;
    (void)dstbitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapAreaI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t format = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* srcbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* dstbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneBitmapAreaI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(x, y, width, height, format, srcbitmap, dstbitmap) : -1;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)srcbitmap;
    (void)dstbitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneBrush_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clonebrush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneBrush")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, clonebrush) : -1;
#else
    (void)brush;
    (void)clonebrush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneCustomLineCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clonedcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneCustomLineCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, clonedcap) : -1;
#else
    (void)customcap;
    (void)clonedcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneFont_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clonefont = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneFont")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font, clonefont) : -1;
#else
    (void)font;
    (void)clonefont;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneFontFamily_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontfamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clonedfontfamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneFontFamily")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontfamily, clonedfontfamily) : -1;
#else
    (void)fontfamily;
    (void)clonedfontfamily;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cloneimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, cloneimage) : -1;
#else
    (void)image;
    (void)cloneimage;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneImageAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cloneimageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneImageAttributes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, cloneimageattr) : -1;
#else
    (void)imageattr;
    (void)cloneimageattr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clonematrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, clonematrix) : -1;
#else
    (void)matrix;
    (void)clonematrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipClonePath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clonepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipClonePath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, clonepath) : -1;
#else
    (void)path;
    (void)clonepath;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipClonePen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clonepen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipClonePen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, clonepen) : -1;
#else
    (void)pen;
    (void)clonepen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cloneregion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, cloneregion) : -1;
#else
    (void)region;
    (void)cloneregion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCloneStringFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCloneStringFormat")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, newformat) : -1;
#else
    (void)format;
    (void)newformat;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipClosePathFigure")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigures_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipClosePathFigures")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCombineRegionPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, path, combinemode) : -1;
#else
    (void)region;
    (void)path;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCombineRegionRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, rect, combinemode) : -1;
#else
    (void)region;
    (void)rect;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCombineRegionRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, rect, combinemode) : -1;
#else
    (void)region;
    (void)rect;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* region2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCombineRegionRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, region2, combinemode) : -1;
#else
    (void)region;
    (void)region2;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipComment_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t sizedata = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipComment")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, sizedata, data) : -1;
#else
    (void)graphics;
    (void)sizedata;
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlus_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* refgraphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* conversionfailureflag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t emftype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* out_metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipConvertToEmfPlus")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(refgraphics, metafile, conversionfailureflag, emftype, description, out_metafile) : -1;
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)emftype;
    (void)description;
    (void)out_metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* refgraphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* conversionfailureflag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t emftype = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* out_metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipConvertToEmfPlusToFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(refgraphics, metafile, conversionfailureflag, filename, emftype, description, out_metafile) : -1;
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)filename;
    (void)emftype;
    (void)description;
    (void)out_metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* refgraphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* conversionfailureflag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t emftype = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* out_metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipConvertToEmfPlusToStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(refgraphics, metafile, conversionfailureflag, stream, emftype, description, out_metafile) : -1;
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)stream;
    (void)emftype;
    (void)description;
    (void)out_metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateAdjustableArrowCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float height = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t isfilled = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* cap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateAdjustableArrowCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(height, width, isfilled, cap) : -1;
#else
    (void)height;
    (void)width;
    (void)isfilled;
    (void)cap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, bitmap) : -1;
#else
    (void)filename;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFileICM_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromFileICM")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, bitmap) : -1;
#else
    (void)filename;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGdiDib_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* gdibitmapinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* gdibitmapdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromGdiDib")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(gdibitmapinfo, gdibitmapdata, bitmap) : -1;
#else
    (void)gdibitmapinfo;
    (void)gdibitmapdata;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGraphics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t width = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* target = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromGraphics")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(width, height, target, bitmap) : -1;
#else
    (void)width;
    (void)height;
    (void)target;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHBITMAP_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hbm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hpal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromHBITMAP")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbm, hpal, bitmap) : -1;
#else
    (void)hbm;
    (void)hpal;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHICON_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hicon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromHICON")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hicon, bitmap) : -1;
#else
    (void)hicon;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromResource_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbitmapname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromResource")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstance, lpbitmapname, bitmap) : -1;
#else
    (void)hinstance;
    (void)lpbitmapname;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromScan0_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t width = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t stride = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t format = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* scan0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromScan0")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(width, height, stride, format, scan0, bitmap) : -1;
#else
    (void)width;
    (void)height;
    (void)stride;
    (void)format;
    (void)scan0;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stream, bitmap) : -1;
#else
    (void)stream;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStreamICM_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateBitmapFromStreamICM")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stream, bitmap) : -1;
#else
    (void)stream;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateCachedBitmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* cachedbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateCachedBitmap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, graphics, cachedbitmap) : -1;
#else
    (void)bitmap;
    (void)graphics;
    (void)cachedbitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateCustomLineCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fillpath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* strokepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t basecap = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    float baseinset = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateCustomLineCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fillpath, strokepath, basecap, baseinset, customcap) : -1;
#else
    (void)fillpath;
    (void)strokepath;
    (void)basecap;
    (void)baseinset;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateFont_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontfamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float emsize = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t style = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t unit = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateFont")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontfamily, emsize, style, unit, font) : -1;
#else
    (void)fontfamily;
    (void)emsize;
    (void)style;
    (void)unit;
    (void)font;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFamilyFromName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fontcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* fontfamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateFontFamilyFromName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(name, fontcollection, fontfamily) : -1;
#else
    (void)name;
    (void)fontcollection;
    (void)fontfamily;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromDC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateFontFromDC")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, font) : -1;
#else
    (void)hdc;
    (void)font;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logfont = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateFontFromLogfontA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, logfont, font) : -1;
#else
    (void)hdc;
    (void)logfont;
    (void)font;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* logfont = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateFontFromLogfontW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, logfont, font) : -1;
#else
    (void)hdc;
    (void)logfont;
    (void)font;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateFromHDC")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, graphics) : -1;
#else
    (void)hdc;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdevice = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateFromHDC2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, hdevice, graphics) : -1;
#else
    (void)hdc;
    (void)hdevice;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWND_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateFromHWND")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, graphics) : -1;
#else
    (void)hwnd;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWNDICM_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateFromHWNDICM")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, graphics) : -1;
#else
    (void)hwnd;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateHBITMAPFromBitmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hbmreturn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t background = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateHBITMAPFromBitmap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, hbmreturn, background) : -1;
#else
    (void)bitmap;
    (void)hbmreturn;
    (void)background;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateHICONFromBitmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hbmreturn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateHICONFromBitmap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bitmap, hbmreturn) : -1;
#else
    (void)bitmap;
    (void)hbmreturn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateHalftonePalette_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateHalftonePalette")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateHatchBrush_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t hatchstyle = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t forecol = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t backcol = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateHatchBrush")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hatchstyle, forecol, backcol, brush) : -1;
#else
    (void)hatchstyle;
    (void)forecol;
    (void)backcol;
    (void)brush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateImageAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateImageAttributes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr) : -1;
#else
    (void)imageattr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrush_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* point1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* point2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t color1 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t color2 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* linegradient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateLineBrush")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(point1, point2, color1, color2, wrapmode, linegradient) : -1;
#else
    (void)point1;
    (void)point2;
    (void)color1;
    (void)color2;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t color1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t color2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t mode = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* linegradient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rect, color1, color2, mode, wrapmode, linegradient) : -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)mode;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t color1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t color2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t mode = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* linegradient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rect, color1, color2, mode, wrapmode, linegradient) : -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)mode;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t color1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t color2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    float angle = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    int32_t isanglescalable = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* linegradient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectWithAngle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rect, color1, color2, angle, isanglescalable, wrapmode, linegradient) : -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)angle;
    (void)isanglescalable;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngleI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t color1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t color2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    float angle = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    int32_t isanglescalable = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* linegradient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectWithAngleI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rect, color1, color2, angle, isanglescalable, wrapmode, linegradient) : -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)angle;
    (void)isanglescalable;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* point1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* point2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t color1 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t color2 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* linegradient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateLineBrushI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(point1, point2, color1, color2, wrapmode, linegradient) : -1;
#else
    (void)point1;
    (void)point2;
    (void)color1;
    (void)color2;
    (void)wrapmode;
    (void)linegradient;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix) : -1;
#else
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float m11 = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float m12 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float m21 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float m22 = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float dx = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float dy = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateMatrix2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(m11, m12, m21, m22, dx, dy, matrix) : -1;
#else
    (void)m11;
    (void)m12;
    (void)m21;
    (void)m22;
    (void)dx;
    (void)dy;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dstplg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateMatrix3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rect, dstplg, matrix) : -1;
#else
    (void)rect;
    (void)dstplg;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dstplg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateMatrix3I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rect, dstplg, matrix) : -1;
#else
    (void)rect;
    (void)dstplg;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromEmf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hemf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t deleteemf = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateMetafileFromEmf")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hemf, deleteemf, metafile) : -1;
#else
    (void)hemf;
    (void)deleteemf;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateMetafileFromFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(file, metafile) : -1;
#else
    (void)file;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateMetafileFromStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stream, metafile) : -1;
#else
    (void)stream;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwmf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t deletewmf = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* wmfplaceablefileheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateMetafileFromWmf")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwmf, deletewmf, wmfplaceablefileheader, metafile) : -1;
#else
    (void)hwmf;
    (void)deletewmf;
    (void)wmfplaceablefileheader;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmfFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* file = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* wmfplaceablefileheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateMetafileFromWmfFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(file, wmfplaceablefileheader, metafile) : -1;
#else
    (void)file;
    (void)wmfplaceablefileheader;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreatePath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t brushmode = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreatePath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brushmode, path) : -1;
#else
    (void)brushmode;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t param3 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreatePath2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, path) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t param3 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreatePath2I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2, param3, path) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradient_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* polygradient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreatePathGradient")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(points, count, wrapmode, polygradient) : -1;
#else
    (void)points;
    (void)count;
    (void)wrapmode;
    (void)polygradient;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientFromPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* polygradient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreatePathGradientFromPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, polygradient) : -1;
#else
    (void)path;
    (void)polygradient;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* polygradient = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreatePathGradientI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(points, count, wrapmode, polygradient) : -1;
#else
    (void)points;
    (void)count;
    (void)wrapmode;
    (void)polygradient;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreatePathIter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreatePathIter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, path) : -1;
#else
    (void)iterator;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreatePen1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t color = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float width = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t unit = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, float, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreatePen1")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(color, width, unit, pen) : -1;
#else
    (void)color;
    (void)width;
    (void)unit;
    (void)pen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreatePen2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float width = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t unit = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreatePen2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, width, unit, pen) : -1;
#else
    (void)brush;
    (void)width;
    (void)unit;
    (void)pen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region) : -1;
#else
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionHrgn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hrgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateRegionHrgn")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hrgn, region) : -1;
#else
    (void)hrgn;
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateRegionPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, region) : -1;
#else
    (void)path;
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateRegionRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rect, region) : -1;
#else
    (void)rect;
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateRegionRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rect, region) : -1;
#else
    (void)rect;
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRgnData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* regiondata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t size = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateRegionRgnData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(regiondata, size, region) : -1;
#else
    (void)regiondata;
    (void)size;
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateSolidFill_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t color = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateSolidFill")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(color, brush) : -1;
#else
    (void)color;
    (void)brush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateStreamOnFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t access = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateStreamOnFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, access, stream) : -1;
#else
    (void)filename;
    (void)access;
    (void)stream;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateStringFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t formatattributes = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t language = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateStringFormat")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(formatattributes, language, format) : -1;
#else
    (void)formatattributes;
    (void)language;
    (void)format;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* texture = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateTexture")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, wrapmode, texture) : -1;
#else
    (void)image;
    (void)wrapmode;
    (void)texture;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    void* texture = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateTexture2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, wrapmode, x, y, width, height, texture) : -1;
#else
    (void)image;
    (void)wrapmode;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* texture = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateTexture2I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, wrapmode, x, y, width, height, texture) : -1;
#else
    (void)image;
    (void)wrapmode;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    void* texture = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateTextureIA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, imageattributes, x, y, width, height, texture) : -1;
#else
    (void)image;
    (void)imageattributes;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIAI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* texture = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipCreateTextureIAI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, imageattributes, x, y, width, height, texture) : -1;
#else
    (void)image;
    (void)imageattributes;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteBrush_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteBrush")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush) : -1;
#else
    (void)brush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteCachedBitmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cachedbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteCachedBitmap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cachedbitmap) : -1;
#else
    (void)cachedbitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteCustomLineCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteCustomLineCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap) : -1;
#else
    (void)customcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteEffect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* effect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteEffect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(effect) : -1;
#else
    (void)effect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteFont_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteFont")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font) : -1;
#else
    (void)font;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteFontFamily_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontfamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteFontFamily")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontfamily) : -1;
#else
    (void)fontfamily;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteGraphics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteGraphics")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics) : -1;
#else
    (void)graphics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix) : -1;
#else
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeletePath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeletePath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeletePathIter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeletePathIter")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator) : -1;
#else
    (void)iterator;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeletePen_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeletePen")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen) : -1;
#else
    (void)pen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeletePrivateFontCollection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeletePrivateFontCollection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontcollection) : -1;
#else
    (void)fontcollection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region) : -1;
#else
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDeleteStringFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDeleteStringFormat")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format) : -1;
#else
    (void)format;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDisposeImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDisposeImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image) : -1;
#else
    (void)image;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDisposeImageAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDisposeImageAttributes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr) : -1;
#else
    (void)imageattr;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawArc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float startangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawArc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawArcI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    float startangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawArcI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawBezier_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x1 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y1 = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float x2 = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float y2 = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float x3 = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float y3 = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
    float x4 = km_info.Length() > 8 ? km_info[8].ToNumber().FloatValue() : 0.0f;
    float y4 = km_info.Length() > 9 ? km_info[9].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawBezier")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x1, y1, x2, y2, x3, y3, x4, y4) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawBezierI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x1 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y1 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t x2 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t y2 = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t x3 = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t y3 = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t x4 = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    int32_t y4 = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawBezierI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x1, y1, x2, y2, x3, y3, x4, y4) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawBeziers")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziersI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawBeziersI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawCachedBitmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* cachedbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawCachedBitmap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, cachedbitmap, x, y) : -1;
#else
    (void)graphics;
    (void)cachedbitmap;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawClosedCurve")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawClosedCurve2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count, tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawClosedCurve2I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count, tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurveI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawClosedCurveI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawCurve")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawCurve2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count, tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawCurve2I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count, tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t offset = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t numberofsegments = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawCurve3")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count, offset, numberofsegments, tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t offset = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t numberofsegments = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawCurve3I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count, offset, numberofsegments, tension) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawCurveI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawCurveI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawDriverString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* text = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t length = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawDriverString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, text, length, font, brush, positions, flags, matrix) : -1;
#else
    (void)graphics;
    (void)text;
    (void)length;
    (void)font;
    (void)brush;
    (void)positions;
    (void)flags;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawEllipse")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipseI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawEllipseI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, x, y) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImageFX_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* xform = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* effect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImageFX")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, source, xform, effect, imageattributes, srcunit) : -1;
#else
    (void)graphics;
    (void)image;
    (void)source;
    (void)xform;
    (void)effect;
    (void)imageattributes;
    (void)srcunit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImageI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImageI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, x, y) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float srcx = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float srcy = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float srcwidth = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float srcheight = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImagePointRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, x, y, srcx, srcy, srcwidth, srcheight, srcunit) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t srcx = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t srcy = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t srcwidth = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t srcheight = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImagePointRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, x, y, srcx, srcy, srcwidth, srcheight, srcunit) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* dstpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImagePoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, dstpoints, count) : -1;
#else
    (void)graphics;
    (void)image;
    (void)dstpoints;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* dstpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImagePointsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, dstpoints, count) : -1;
#else
    (void)graphics;
    (void)image;
    (void)dstpoints;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float srcx = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float srcy = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float srcwidth = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float srcheight = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    int64_t callback = km_info.Length() > 10 ? km_napi_arg_i64(km_info[10]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, float, float, float, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImagePointsRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, points, count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata) : -1;
#else
    (void)graphics;
    (void)image;
    (void)points;
    (void)count;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t srcx = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t srcy = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t srcwidth = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t srcheight = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    int64_t callback = km_info.Length() > 10 ? km_napi_arg_i64(km_info[10]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImagePointsRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, points, count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata) : -1;
#else
    (void)graphics;
    (void)image;
    (void)points;
    (void)count;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImageRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImageRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float dstx = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float dsty = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float dstwidth = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float dstheight = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float srcx = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float srcy = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
    float srcwidth = km_info.Length() > 8 ? km_info[8].ToNumber().FloatValue() : 0.0f;
    float srcheight = km_info.Length() > 9 ? km_info[9].ToNumber().FloatValue() : 0.0f;
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    int64_t callback = km_info.Length() > 12 ? km_napi_arg_i64(km_info[12]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, float, float, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImageRectRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata) : -1;
#else
    (void)graphics;
    (void)image;
    (void)dstx;
    (void)dsty;
    (void)dstwidth;
    (void)dstheight;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dstx = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t dsty = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t dstwidth = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t dstheight = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t srcx = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t srcy = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t srcwidth = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    int32_t srcheight = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 11 ? km_napi_arg_u64(km_info[11]) : 0));
    int64_t callback = km_info.Length() > 12 ? km_napi_arg_i64(km_info[12]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 13 ? km_napi_arg_u64(km_info[13]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawImageRectRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, image, dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata) : -1;
#else
    (void)graphics;
    (void)image;
    (void)dstx;
    (void)dsty;
    (void)dstwidth;
    (void)dstheight;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawLine_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x1 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y1 = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float x2 = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float y2 = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawLine")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x1, y1, x2, y2) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawLineI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x1 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y1 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t x2 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t y2 = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawLineI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x1, y1, x2, y2) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawLines_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawLines")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawLinesI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawLinesI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, path) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawPie_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float startangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawPie")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawPieI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    float startangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawPieI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawPolygon")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygonI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawPolygonI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, points, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawRectangle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangleI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawRectangleI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawRectangles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, rects, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawRectanglesI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawRectanglesI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pen, rects, count) : -1;
#else
    (void)graphics;
    (void)pen;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipDrawString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t length = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* layoutrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* stringformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipDrawString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, string, length, font, layoutrect, stringformat, brush) : -1;
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)brush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEmfToWmfBits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hemf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbdata16 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pdata16 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t imapmode = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t eflags = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEmfToWmfBits")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hemf, cbdata16, pdata16, imapmode, eflags) : 0;
#else
    (void)hemf;
    (void)cbdata16;
    (void)pdata16;
    (void)imapmode;
    (void)eflags;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEndContainer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t state = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEndContainer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, state) : -1;
#else
    (void)graphics;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t callback = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destpoint, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t callback = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPointI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destpoint, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t callback = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destpoints, count, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int64_t callback = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPointsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destpoints, count, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t callback = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destrect, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int64_t callback = km_info.Length() > 3 ? km_napi_arg_i64(km_info[3]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destrect, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* srcrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t callback = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destpoint, srcrect, srcunit, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* srcrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t callback = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPointI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destpoint, srcrect, srcunit, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* srcrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t callback = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destpoints, count, srcrect, srcunit, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destpoints = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* srcrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int64_t callback = km_info.Length() > 6 ? km_napi_arg_i64(km_info[6]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPointsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destpoints, count, srcrect, srcunit, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* srcrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t callback = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destrect, srcrect, srcunit, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* destrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* srcrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t srcunit = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int64_t callback = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* imageattributes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, metafile, destrect, srcrect, srcunit, callback, callbackdata, imageattributes) : -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillClosedCurve")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, points, count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    int32_t fillmode = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillClosedCurve2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, points, count, tension, fillmode) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)tension;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float tension = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    int32_t fillmode = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillClosedCurve2I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, points, count, tension, fillmode) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)tension;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurveI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillClosedCurveI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, points, count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillEllipse_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillEllipse")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillEllipseI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillEllipseI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, path) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillPie_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float startangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillPie")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillPieI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    float startangle = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float sweepangle = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillPieI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, x, y, width, height, startangle, sweepangle) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fillmode = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillPolygon")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, points, count, fillmode) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillPolygon2")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, points, count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2I_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillPolygon2I")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, points, count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillPolygonI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fillmode = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillPolygonI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, points, count, fillmode) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillRectangle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float x = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillRectangle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillRectangleI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillRectangleI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, x, y, width, height) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillRectangles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillRectangles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, rects, count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillRectanglesI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillRectanglesI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, rects, count) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)rects;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFillRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFillRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, brush, region) : -1;
#else
    (void)graphics;
    (void)brush;
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFindFirstImageItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* item = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFindFirstImageItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, item) : -1;
#else
    (void)image;
    (void)item;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFindNextImageItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* item = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFindNextImageItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, item) : -1;
#else
    (void)image;
    (void)item;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFlattenPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float flatness = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFlattenPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, matrix, flatness) : -1;
#else
    (void)path;
    (void)matrix;
    (void)flatness;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFlush_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t intention = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFlush")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, intention) : -1;
#else
    (void)graphics;
    (void)intention;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(ptr);
#else
    (void)ptr;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapFillState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fillstate = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapFillState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cap, fillstate) : -1;
#else
    (void)cap;
    (void)fillstate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapHeight_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* height = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapHeight")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cap, height) : -1;
#else
    (void)cap;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapMiddleInset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* middleinset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapMiddleInset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cap, middleinset) : -1;
#else
    (void)cap;
    (void)middleinset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapWidth_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* width = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapWidth")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cap, width) : -1;
#else
    (void)cap;
    (void)width;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetAllPropertyItems_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t totalbuffersize = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t numproperties = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* allitems = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetAllPropertyItems")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, totalbuffersize, numproperties, allitems) : -1;
#else
    (void)image;
    (void)totalbuffersize;
    (void)numproperties;
    (void)allitems;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetBrushType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetBrushType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, type) : -1;
#else
    (void)brush;
    (void)type;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCellAscent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* family = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t style = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* cellascent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCellAscent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, style, cellascent) : -1;
#else
    (void)family;
    (void)style;
    (void)cellascent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCellDescent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* family = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t style = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* celldescent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCellDescent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, style, celldescent) : -1;
#else
    (void)family;
    (void)style;
    (void)celldescent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetClip_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetClip")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, region) : -1;
#else
    (void)graphics;
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetClipBounds_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetClipBounds")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, rect) : -1;
#else
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetClipBoundsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetClipBoundsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, rect) : -1;
#else
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* compositingmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCompositingMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, compositingmode) : -1;
#else
    (void)graphics;
    (void)compositingmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingQuality_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* compositingquality = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCompositingQuality")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, compositingquality) : -1;
#else
    (void)graphics;
    (void)compositingquality;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* basecap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCustomLineCapBaseCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, basecap) : -1;
#else
    (void)customcap;
    (void)basecap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseInset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* inset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCustomLineCapBaseInset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, inset) : -1;
#else
    (void)customcap;
    (void)inset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeCaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* startcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* endcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCustomLineCapStrokeCaps")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, startcap, endcap) : -1;
#else
    (void)customcap;
    (void)startcap;
    (void)endcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeJoin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* linejoin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCustomLineCapStrokeJoin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, linejoin) : -1;
#else
    (void)customcap;
    (void)linejoin;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* captype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCustomLineCapType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, captype) : -1;
#else
    (void)customcap;
    (void)captype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapWidthScale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* widthscale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetCustomLineCapWidthScale")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, widthscale) : -1;
#else
    (void)customcap;
    (void)widthscale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetDC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetDC")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, hdc) : -1;
#else
    (void)graphics;
    (void)hdc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetDpiX_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dpi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetDpiX")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, dpi) : -1;
#else
    (void)graphics;
    (void)dpi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetDpiY_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dpi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetDpiY")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, dpi) : -1;
#else
    (void)graphics;
    (void)dpi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameterSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* effect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetEffectParameterSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(effect, size) : -1;
#else
    (void)effect;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* effect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetEffectParameters")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(effect, size, params) : -1;
#else
    (void)effect;
    (void)size;
    (void)params;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetEmHeight_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* family = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t style = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* emheight = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetEmHeight")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, style, emheight) : -1;
#else
    (void)family;
    (void)style;
    (void)emheight;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clsidencoder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetEncoderParameterList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, clsidencoder, size, buffer) : -1;
#else
    (void)image;
    (void)clsidencoder;
    (void)size;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterListSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* clsidencoder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetEncoderParameterListSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, clsidencoder, size) : -1;
#else
    (void)image;
    (void)clsidencoder;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetFamily_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* family = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetFamily")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font, family) : -1;
#else
    (void)font;
    (void)family;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetFamilyName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* family = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* name = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint16_t language = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetFamilyName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, name, language) : -1;
#else
    (void)family;
    (void)name;
    (void)language;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* numfound = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetFontCollectionFamilyCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontcollection, numfound) : -1;
#else
    (void)fontcollection;
    (void)numfound;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t numsought = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* gpfamilies = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* numfound = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetFontCollectionFamilyList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontcollection, numsought, gpfamilies, numfound) : -1;
#else
    (void)fontcollection;
    (void)numsought;
    (void)gpfamilies;
    (void)numfound;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeight_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* height = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetFontHeight")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font, graphics, height) : -1;
#else
    (void)font;
    (void)graphics;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeightGivenDPI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float dpi = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    void* height = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetFontHeightGivenDPI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font, dpi, height) : -1;
#else
    (void)font;
    (void)dpi;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetFontSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetFontSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font, size) : -1;
#else
    (void)font;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetFontStyle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* style = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetFontStyle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font, style) : -1;
#else
    (void)font;
    (void)style;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetFontUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* unit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetFontUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font, unit) : -1;
#else
    (void)font;
    (void)unit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilyMonospace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nativefamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetGenericFontFamilyMonospace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nativefamily) : -1;
#else
    (void)nativefamily;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySansSerif_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nativefamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetGenericFontFamilySansSerif")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nativefamily) : -1;
#else
    (void)nativefamily;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySerif_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nativefamily = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetGenericFontFamilySerif")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nativefamily) : -1;
#else
    (void)nativefamily;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetHatchBackgroundColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* backcol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetHatchBackgroundColor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, backcol) : -1;
#else
    (void)brush;
    (void)backcol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetHatchForegroundColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* forecol = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetHatchForegroundColor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, forecol) : -1;
#else
    (void)brush;
    (void)forecol;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetHatchStyle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hatchstyle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetHatchStyle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, hatchstyle) : -1;
#else
    (void)brush;
    (void)hatchstyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetHemfFromMetafile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hemf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetHemfFromMetafile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(metafile, hemf) : -1;
#else
    (void)metafile;
    (void)hemf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageAttributesAdjustedPalette_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* colorpalette = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t coloradjusttype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageAttributesAdjustedPalette")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, colorpalette, coloradjusttype) : -1;
#else
    (void)imageattr;
    (void)colorpalette;
    (void)coloradjusttype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageBounds_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* srcrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* srcunit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageBounds")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, srcrect, srcunit) : -1;
#else
    (void)image;
    (void)srcrect;
    (void)srcunit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecoders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t numdecoders = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* decoders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageDecoders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(numdecoders, size, decoders) : -1;
#else
    (void)numdecoders;
    (void)size;
    (void)decoders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecodersSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* numdecoders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageDecodersSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(numdecoders, size) : -1;
#else
    (void)numdecoders;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageDimension_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* width = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* height = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageDimension")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, width, height) : -1;
#else
    (void)image;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncoders_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t numencoders = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* encoders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageEncoders")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(numencoders, size, encoders) : -1;
#else
    (void)numencoders;
    (void)size;
    (void)encoders;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncodersSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* numencoders = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageEncodersSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(numencoders, size) : -1;
#else
    (void)numencoders;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageFlags")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, flags) : -1;
#else
    (void)image;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageGraphicsContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageGraphicsContext")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, graphics) : -1;
#else
    (void)image;
    (void)graphics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageHeight_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* height = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageHeight")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, height) : -1;
#else
    (void)image;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageHorizontalResolution_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resolution = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageHorizontalResolution")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, resolution) : -1;
#else
    (void)image;
    (void)resolution;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageItemData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* item = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageItemData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, item) : -1;
#else
    (void)image;
    (void)item;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImagePalette_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* palette = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t size = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImagePalette")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, palette, size) : -1;
#else
    (void)image;
    (void)palette;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImagePaletteSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImagePaletteSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, size) : -1;
#else
    (void)image;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImagePixelFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImagePixelFormat")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, format) : -1;
#else
    (void)image;
    (void)format;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageRawFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageRawFormat")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, format) : -1;
#else
    (void)image;
    (void)format;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageThumbnail_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t thumbwidth = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t thumbheight = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* thumbimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t callback = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    void* callbackdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageThumbnail")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, thumbwidth, thumbheight, thumbimage, callback, callbackdata) : -1;
#else
    (void)image;
    (void)thumbwidth;
    (void)thumbheight;
    (void)thumbimage;
    (void)callback;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, type) : -1;
#else
    (void)image;
    (void)type;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageVerticalResolution_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resolution = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageVerticalResolution")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, resolution) : -1;
#else
    (void)image;
    (void)resolution;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetImageWidth_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* width = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetImageWidth")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, width) : -1;
#else
    (void)image;
    (void)width;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetInterpolationMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interpolationmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetInterpolationMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, interpolationmode) : -1;
#else
    (void)graphics;
    (void)interpolationmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* blend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLineBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, blend, positions, count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlendCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLineBlendCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLineColors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* colors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLineColors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, colors) : -1;
#else
    (void)brush;
    (void)colors;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLineGammaCorrection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* usegammacorrection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLineGammaCorrection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, usegammacorrection) : -1;
#else
    (void)brush;
    (void)usegammacorrection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* blend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLinePresetBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, blend, positions, count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlendCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLinePresetBlendCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLineRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLineRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, rect) : -1;
#else
    (void)brush;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLineRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLineRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, rect) : -1;
#else
    (void)brush;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLineSpacing_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* family = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t style = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* linespacing = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLineSpacing")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, style, linespacing) : -1;
#else
    (void)family;
    (void)style;
    (void)linespacing;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLineTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLineTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLineWrapMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* wrapmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLineWrapMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* logfonta = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLogFontA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font, graphics, logfonta) : -1;
#else
    (void)font;
    (void)graphics;
    (void)logfonta;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* logfontw = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetLogFontW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(font, graphics, logfontw) : -1;
#else
    (void)font;
    (void)graphics;
    (void)logfontw;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetMatrixElements_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrixout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetMatrixElements")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, matrixout) : -1;
#else
    (void)matrix;
    (void)matrixout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileDownLevelRasterizationLimit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* metafilerasterizationlimitdpi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetMetafileDownLevelRasterizationLimit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(metafile, metafilerasterizationlimitdpi) : -1;
#else
    (void)metafile;
    (void)metafilerasterizationlimitdpi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromEmf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hemf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* header = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromEmf")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hemf, header) : -1;
#else
    (void)hemf;
    (void)header;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* header = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, header) : -1;
#else
    (void)filename;
    (void)header;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromMetafile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* header = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromMetafile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(metafile, header) : -1;
#else
    (void)metafile;
    (void)header;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* header = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stream, header) : -1;
#else
    (void)stream;
    (void)header;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromWmf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwmf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* wmfplaceablefileheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* header = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromWmf")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwmf, wmfplaceablefileheader, header) : -1;
#else
    (void)hwmf;
    (void)wmfplaceablefileheader;
    (void)header;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetNearestColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* argb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetNearestColor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, argb) : -1;
#else
    (void)graphics;
    (void)argb;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPageScale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* scale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPageScale")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, scale) : -1;
#else
    (void)graphics;
    (void)scale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPageUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* unit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPageUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, unit) : -1;
#else
    (void)graphics;
    (void)unit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pathdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, pathdata) : -1;
#else
    (void)path;
    (void)pathdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathFillMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* fillmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathFillMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, fillmode) : -1;
#else
    (void)path;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* blend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, blend, positions, count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlendCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientBlendCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* colors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientCenterColor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, colors) : -1;
#else
    (void)brush;
    (void)colors;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientCenterPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, points) : -1;
#else
    (void)brush;
    (void)points;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPointI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientCenterPointI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, points) : -1;
#else
    (void)brush;
    (void)points;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientFocusScales_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* xscale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* yscale = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientFocusScales")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, xscale, yscale) : -1;
#else
    (void)brush;
    (void)xscale;
    (void)yscale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientGammaCorrection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* usegammacorrection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientGammaCorrection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, usegammacorrection) : -1;
#else
    (void)brush;
    (void)usegammacorrection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, path) : -1;
#else
    (void)brush;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPointCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientPointCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* blend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientPresetBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, blend, positions, count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlendCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientPresetBlendCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, rect) : -1;
#else
    (void)brush;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, rect) : -1;
#else
    (void)brush;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientSurroundColorCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, count) : -1;
#else
    (void)brush;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorsWithCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* color = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientSurroundColorsWithCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, color, count) : -1;
#else
    (void)brush;
    (void)color;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientWrapMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* wrapmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathGradientWrapMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathLastPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lastpoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathLastPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, lastpoint) : -1;
#else
    (void)path;
    (void)lastpoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathPoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathPoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, points, count) : -1;
#else
    (void)param0;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathPointsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathPointsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, points, count) : -1;
#else
    (void)param0;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathTypes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* types = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathTypes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, types, count) : -1;
#else
    (void)path;
    (void)types;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBounds_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bounds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathWorldBounds")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, bounds, matrix, pen) : -1;
#else
    (void)path;
    (void)bounds;
    (void)matrix;
    (void)pen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBoundsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* bounds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPathWorldBoundsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, bounds, matrix, pen) : -1;
#else
    (void)path;
    (void)bounds;
    (void)matrix;
    (void)pen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenBrushFill_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenBrushFill")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, brush) : -1;
#else
    (void)pen;
    (void)brush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* argb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenColor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, argb) : -1;
#else
    (void)pen;
    (void)argb;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenCompoundArray")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, dash, count) : -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenCompoundCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, count) : -1;
#else
    (void)pen;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomEndCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenCustomEndCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, customcap) : -1;
#else
    (void)pen;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomStartCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenCustomStartCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, customcap) : -1;
#else
    (void)pen;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenDashArray")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, dash, count) : -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCap197819_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dashcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenDashCap197819")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, dashcap) : -1;
#else
    (void)pen;
    (void)dashcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenDashCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, count) : -1;
#else
    (void)pen;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashOffset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* offset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenDashOffset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, offset) : -1;
#else
    (void)pen;
    (void)offset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashStyle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dashstyle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenDashStyle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, dashstyle) : -1;
#else
    (void)pen;
    (void)dashstyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenEndCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* endcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenEndCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, endcap) : -1;
#else
    (void)pen;
    (void)endcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenFillType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* type = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenFillType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, type) : -1;
#else
    (void)pen;
    (void)type;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenLineJoin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* linejoin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenLineJoin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, linejoin) : -1;
#else
    (void)pen;
    (void)linejoin;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenMiterLimit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* miterlimit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenMiterLimit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, miterlimit) : -1;
#else
    (void)pen;
    (void)miterlimit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* penmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, penmode) : -1;
#else
    (void)pen;
    (void)penmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenStartCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* startcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenStartCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, startcap) : -1;
#else
    (void)pen;
    (void)startcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, matrix) : -1;
#else
    (void)pen;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* unit = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, unit) : -1;
#else
    (void)pen;
    (void)unit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPenWidth_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* width = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPenWidth")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, width) : -1;
#else
    (void)pen;
    (void)width;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPixelOffsetMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pixeloffsetmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPixelOffsetMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pixeloffsetmode) : -1;
#else
    (void)graphics;
    (void)pixeloffsetmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPointCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPointCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, count) : -1;
#else
    (void)path;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* numofproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPropertyCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, numofproperty) : -1;
#else
    (void)image;
    (void)numofproperty;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyIdList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t numofproperty = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* list = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPropertyIdList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, numofproperty, list) : -1;
#else
    (void)image;
    (void)numofproperty;
    (void)list;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t propid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t propsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPropertyItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, propid, propsize, buffer) : -1;
#else
    (void)image;
    (void)propid;
    (void)propsize;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItemSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t propid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* size = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPropertyItemSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, propid, size) : -1;
#else
    (void)image;
    (void)propid;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetPropertySize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* totalbuffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* numproperties = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetPropertySize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, totalbuffersize, numproperties) : -1;
#else
    (void)image;
    (void)totalbuffersize;
    (void)numproperties;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBounds_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetRegionBounds")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, graphics, rect) : -1;
#else
    (void)region;
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBoundsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetRegionBoundsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, graphics, rect) : -1;
#else
    (void)region;
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetRegionData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t buffersize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* sizefilled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetRegionData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, buffer, buffersize, sizefilled) : -1;
#else
    (void)region;
    (void)buffer;
    (void)buffersize;
    (void)sizefilled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetRegionDataSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* buffersize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetRegionDataSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, buffersize) : -1;
#else
    (void)region;
    (void)buffersize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetRegionHRgn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hrgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetRegionHRgn")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, graphics, hrgn) : -1;
#else
    (void)region;
    (void)graphics;
    (void)hrgn;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScans_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetRegionScans")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, rects, count, matrix) : -1;
#else
    (void)region;
    (void)rects;
    (void)count;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetRegionScansCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, count, matrix) : -1;
#else
    (void)region;
    (void)count;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rects = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetRegionScansI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, rects, count, matrix) : -1;
#else
    (void)region;
    (void)rects;
    (void)count;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetRenderingOrigin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* x = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* y = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetRenderingOrigin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, x, y) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetSmoothingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* smoothingmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetSmoothingMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, smoothingmode) : -1;
#else
    (void)graphics;
    (void)smoothingmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetSolidFillColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* color = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetSolidFillColor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, color) : -1;
#else
    (void)brush;
    (void)color;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatAlign_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* align = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetStringFormatAlign")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, align) : -1;
#else
    (void)format;
    (void)align;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatDigitSubstitution_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* language = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* substitute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetStringFormatDigitSubstitution")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, language, substitute) : -1;
#else
    (void)format;
    (void)language;
    (void)substitute;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* flags = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetStringFormatFlags")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, flags) : -1;
#else
    (void)format;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatHotkeyPrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hotkeyprefix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetStringFormatHotkeyPrefix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, hotkeyprefix) : -1;
#else
    (void)format;
    (void)hotkeyprefix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatLineAlign_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* align = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetStringFormatLineAlign")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, align) : -1;
#else
    (void)format;
    (void)align;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatMeasurableCharacterRangeCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetStringFormatMeasurableCharacterRangeCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, count) : -1;
#else
    (void)format;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStopCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetStringFormatTabStopCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, count) : -1;
#else
    (void)format;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStops_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* firsttaboffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* tabstops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetStringFormatTabStops")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, count, firsttaboffset, tabstops) : -1;
#else
    (void)format;
    (void)count;
    (void)firsttaboffset;
    (void)tabstops;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTrimming_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* trimming = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetStringFormatTrimming")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, trimming) : -1;
#else
    (void)format;
    (void)trimming;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetTextContrast_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* contrast = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetTextContrast")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, contrast) : -1;
#else
    (void)graphics;
    (void)contrast;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetTextRenderingHint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* mode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetTextRenderingHint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, mode) : -1;
#else
    (void)graphics;
    (void)mode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetTextureImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetTextureImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, image) : -1;
#else
    (void)brush;
    (void)image;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetTextureTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetTextureTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetTextureWrapMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* wrapmode = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetTextureWrapMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBounds_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetVisibleClipBounds")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, rect) : -1;
#else
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBoundsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* rect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetVisibleClipBoundsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, rect) : -1;
#else
    (void)graphics;
    (void)rect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGetWorldTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGetWorldTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, matrix) : -1;
#else
    (void)graphics;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGraphicsClear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t color = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGraphicsClear")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, color) : -1;
#else
    (void)graphics;
    (void)color;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipGraphicsSetAbort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pgraphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* piabort = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipGraphicsSetAbort")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pgraphics, piabort) : -1;
#else
    (void)pgraphics;
    (void)piabort;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipImageForceValidation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipImageForceValidation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image) : -1;
#else
    (void)image;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dimensionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipImageGetFrameCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, dimensionid, count) : -1;
#else
    (void)image;
    (void)dimensionid;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipImageGetFrameDimensionsCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, count) : -1;
#else
    (void)image;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dimensionids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t count = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipImageGetFrameDimensionsList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, dimensionids, count) : -1;
#else
    (void)image;
    (void)dimensionids;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipImageRotateFlip_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t rftype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipImageRotateFlip")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, rftype) : -1;
#else
    (void)image;
    (void)rftype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipImageSelectActiveFrame_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dimensionid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t frameindex = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipImageSelectActiveFrame")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, dimensionid, frameindex) : -1;
#else
    (void)image;
    (void)dimensionid;
    (void)frameindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipImageSetAbort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* piabort = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipImageSetAbort")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pimage, piabort) : -1;
#else
    (void)pimage;
    (void)piabort;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipInitializePalette_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* palette = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t palettetype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t optimalcolors = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t usetransparentcolor = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipInitializePalette")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(palette, palettetype, optimalcolors, usetransparentcolor, bitmap) : -1;
#else
    (void)palette;
    (void)palettetype;
    (void)optimalcolors;
    (void)usetransparentcolor;
    (void)bitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipInvertMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipInvertMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix) : -1;
#else
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsClipEmpty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsClipEmpty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, result) : -1;
#else
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsEmptyRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsEmptyRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, graphics, result) : -1;
#else
    (void)region;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsEqualRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* region2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsEqualRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, region2, graphics, result) : -1;
#else
    (void)region;
    (void)region2;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsInfiniteRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsInfiniteRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, graphics, result) : -1;
#else
    (void)region;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixEqual_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsMatrixEqual")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, matrix2, result) : -1;
#else
    (void)matrix;
    (void)matrix2;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsMatrixIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, result) : -1;
#else
    (void)matrix;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixInvertible_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsMatrixInvertible")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, result) : -1;
#else
    (void)matrix;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsOutlineVisiblePathPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, pen, graphics, result) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)pen;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPointI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsOutlineVisiblePathPointI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, pen, graphics, result) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)pen;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsStyleAvailable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* family = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t style = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* isstyleavailable = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsStyleAvailable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(family, style, isstyleavailable) : -1;
#else
    (void)family;
    (void)style;
    (void)isstyleavailable;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleClipEmpty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisibleClipEmpty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, result) : -1;
#else
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisiblePathPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, graphics, result) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPointI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisiblePathPointI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, x, y, graphics, result) : -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisiblePoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, x, y, result) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePointI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisiblePointI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, x, y, result) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisibleRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, x, y, width, height, result) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisibleRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, x, y, width, height, result) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisibleRegionPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, x, y, graphics, result) : -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPointI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisibleRegionPointI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, x, y, graphics, result) : -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisibleRegionRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, x, y, width, height, graphics, result) : -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* result = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipIsVisibleRegionRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, x, y, width, height, graphics, result) : -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)graphics;
    (void)result;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipLoadImageFromFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, image) : -1;
#else
    (void)filename;
    (void)image;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFileICM_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipLoadImageFromFileICM")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, image) : -1;
#else
    (void)filename;
    (void)image;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipLoadImageFromStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stream, image) : -1;
#else
    (void)stream;
    (void)image;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStreamICM_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipLoadImageFromStreamICM")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stream, image) : -1;
#else
    (void)stream;
    (void)image;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipMeasureCharacterRanges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t length = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* layoutrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* stringformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t regioncount = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* regions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipMeasureCharacterRanges")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, string, length, font, layoutrect, stringformat, regioncount, regions) : -1;
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)regioncount;
    (void)regions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipMeasureDriverString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* text = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t length = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* boundingbox = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipMeasureDriverString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, text, length, font, positions, flags, matrix, boundingbox) : -1;
#else
    (void)graphics;
    (void)text;
    (void)length;
    (void)font;
    (void)positions;
    (void)flags;
    (void)matrix;
    (void)boundingbox;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipMeasureString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* string = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t length = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* font = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* layoutrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* stringformat = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* boundingbox = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* codepointsfitted = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* linesfilled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipMeasureString")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, string, length, font, layoutrect, stringformat, boundingbox, codepointsfitted, linesfilled) : -1;
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)boundingbox;
    (void)codepointsfitted;
    (void)linesfilled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipMultiplyLineTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipMultiplyLineTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, matrix, order) : -1;
#else
    (void)brush;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipMultiplyMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipMultiplyMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, matrix2, order) : -1;
#else
    (void)matrix;
    (void)matrix2;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPathGradientTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipMultiplyPathGradientTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, matrix, order) : -1;
#else
    (void)brush;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPenTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipMultiplyPenTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, matrix, order) : -1;
#else
    (void)pen;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipMultiplyTextureTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipMultiplyTextureTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, matrix, order) : -1;
#else
    (void)brush;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipMultiplyWorldTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipMultiplyWorldTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, matrix, order) : -1;
#else
    (void)graphics;
    (void)matrix;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipNewInstalledFontCollection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipNewInstalledFontCollection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontcollection) : -1;
#else
    (void)fontcollection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipNewPrivateFontCollection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipNewPrivateFontCollection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontcollection) : -1;
#else
    (void)fontcollection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterCopyData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resultcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* types = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t startindex = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t endindex = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterCopyData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, resultcount, points, types, startindex, endindex) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)points;
    (void)types;
    (void)startindex;
    (void)endindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterEnumerate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resultcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* types = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterEnumerate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, resultcount, points, types, count) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)points;
    (void)types;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterGetCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, count) : -1;
#else
    (void)iterator;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetSubpathCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterGetSubpathCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, count) : -1;
#else
    (void)iterator;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterHasCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hascurve = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterHasCurve")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, hascurve) : -1;
#else
    (void)iterator;
    (void)hascurve;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterIsValid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* valid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterIsValid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, valid) : -1;
#else
    (void)iterator;
    (void)valid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarker_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resultcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* startindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* endindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterNextMarker")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, resultcount, startindex, endindex) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)startindex;
    (void)endindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarkerPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resultcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterNextMarkerPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, resultcount, path) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextPathType_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resultcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pathtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* startindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* endindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterNextPathType")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, resultcount, pathtype, startindex, endindex) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)pathtype;
    (void)startindex;
    (void)endindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resultcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* startindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* endindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* isclosed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterNextSubpath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, resultcount, startindex, endindex, isclosed) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)startindex;
    (void)endindex;
    (void)isclosed;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpathPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* resultcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* isclosed = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterNextSubpathPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator, resultcount, path, isclosed) : -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)path;
    (void)isclosed;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPathIterRewind_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* iterator = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPathIterRewind")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(iterator) : -1;
#else
    (void)iterator;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPlayMetafileRecord_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t recordtype = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t datasize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPlayMetafileRecord")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(metafile, recordtype, flags, datasize, data) : -1;
#else
    (void)metafile;
    (void)recordtype;
    (void)flags;
    (void)datasize;
    (void)data;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddFontFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPrivateAddFontFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontcollection, filename) : -1;
#else
    (void)fontcollection;
    (void)filename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddMemoryFont_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* fontcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* memory = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t length = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipPrivateAddMemoryFont")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fontcollection, memory, length) : -1;
#else
    (void)fontcollection;
    (void)memory;
    (void)length;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* referencehdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* framerect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t frameunit = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRecordMetafile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(referencehdc, type, framerect, frameunit, description, metafile) : -1;
#else
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* referencehdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* framerect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t frameunit = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRecordMetafileFileName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, referencehdc, type, framerect, frameunit, description, metafile) : -1;
#else
    (void)filename;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileNameI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* referencehdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* framerect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t frameunit = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRecordMetafileFileNameI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(filename, referencehdc, type, framerect, frameunit, description, metafile) : -1;
#else
    (void)filename;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* referencehdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* framerect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t frameunit = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRecordMetafileI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(referencehdc, type, framerect, frameunit, description, metafile) : -1;
#else
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* referencehdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* framerect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t frameunit = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRecordMetafileStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stream, referencehdc, type, framerect, frameunit, description, metafile) : -1;
#else
    (void)stream;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStreamI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* referencehdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* framerect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t frameunit = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* description = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRecordMetafileStreamI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(stream, referencehdc, type, framerect, frameunit, description, metafile) : -1;
#else
    (void)stream;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipReleaseDC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipReleaseDC")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, hdc) : -1;
#else
    (void)graphics;
    (void)hdc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRemovePropertyItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t propid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRemovePropertyItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, propid) : -1;
#else
    (void)image;
    (void)propid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipResetClip_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipResetClip")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics) : -1;
#else
    (void)graphics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipResetImageAttributes_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipResetImageAttributes")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type) : -1;
#else
    (void)imageattr;
    (void)type;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipResetLineTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipResetLineTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush) : -1;
#else
    (void)brush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipResetPageTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipResetPageTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics) : -1;
#else
    (void)graphics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipResetPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipResetPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipResetPathGradientTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipResetPathGradientTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush) : -1;
#else
    (void)brush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipResetPenTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipResetPenTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen) : -1;
#else
    (void)pen;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipResetTextureTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipResetTextureTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush) : -1;
#else
    (void)brush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipResetWorldTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipResetWorldTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics) : -1;
#else
    (void)graphics;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRestoreGraphics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t state = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRestoreGraphics")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, state) : -1;
#else
    (void)graphics;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipReversePath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipReversePath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRotateLineTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float angle = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRotateLineTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, angle, order) : -1;
#else
    (void)brush;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRotateMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float angle = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRotateMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, angle, order) : -1;
#else
    (void)matrix;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRotatePathGradientTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float angle = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRotatePathGradientTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, angle, order) : -1;
#else
    (void)brush;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRotatePenTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float angle = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRotatePenTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, angle, order) : -1;
#else
    (void)pen;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRotateTextureTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float angle = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRotateTextureTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, angle, order) : -1;
#else
    (void)brush;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipRotateWorldTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float angle = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipRotateWorldTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, angle, order) : -1;
#else
    (void)graphics;
    (void)angle;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSaveAdd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* encoderparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSaveAdd")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, encoderparams) : -1;
#else
    (void)image;
    (void)encoderparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSaveAddImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* newimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* encoderparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSaveAddImage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, newimage, encoderparams) : -1;
#else
    (void)image;
    (void)newimage;
    (void)encoderparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSaveGraphics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSaveGraphics")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, state) : -1;
#else
    (void)graphics;
    (void)state;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToFile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* filename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clsidencoder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* encoderparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSaveImageToFile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, filename, clsidencoder, encoderparams) : -1;
#else
    (void)image;
    (void)filename;
    (void)clsidencoder;
    (void)encoderparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* clsidencoder = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* encoderparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSaveImageToStream")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, stream, clsidencoder, encoderparams) : -1;
#else
    (void)image;
    (void)stream;
    (void)clsidencoder;
    (void)encoderparams;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipScaleLineTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float sx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float sy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipScaleLineTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, sx, sy, order) : -1;
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipScaleMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float scalex = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float scaley = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipScaleMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, scalex, scaley, order) : -1;
#else
    (void)matrix;
    (void)scalex;
    (void)scaley;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipScalePathGradientTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float sx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float sy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipScalePathGradientTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, sx, sy, order) : -1;
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipScalePenTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float sx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float sy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipScalePenTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, sx, sy, order) : -1;
#else
    (void)pen;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipScaleTextureTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float sx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float sy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipScaleTextureTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, sx, sy, order) : -1;
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipScaleWorldTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float sx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float sy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipScaleWorldTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, sx, sy, order) : -1;
#else
    (void)graphics;
    (void)sx;
    (void)sy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapFillState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fillstate = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapFillState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cap, fillstate) : -1;
#else
    (void)cap;
    (void)fillstate;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapHeight_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float height = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapHeight")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cap, height) : -1;
#else
    (void)cap;
    (void)height;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapMiddleInset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float middleinset = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapMiddleInset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cap, middleinset) : -1;
#else
    (void)cap;
    (void)middleinset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapWidth_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* cap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float width = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapWidth")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cap, width) : -1;
#else
    (void)cap;
    (void)width;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetClipGraphics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* srcgraphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetClipGraphics")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, srcgraphics, combinemode) : -1;
#else
    (void)graphics;
    (void)srcgraphics;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetClipHrgn_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hrgn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetClipHrgn")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, hrgn, combinemode) : -1;
#else
    (void)graphics;
    (void)hrgn;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetClipPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetClipPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, path, combinemode) : -1;
#else
    (void)graphics;
    (void)path;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetClipRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float width = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float height = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetClipRect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, x, y, width, height, combinemode) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetClipRectI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetClipRectI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, x, y, width, height, combinemode) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetClipRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t combinemode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetClipRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, region, combinemode) : -1;
#else
    (void)graphics;
    (void)region;
    (void)combinemode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t compositingmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetCompositingMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, compositingmode) : -1;
#else
    (void)graphics;
    (void)compositingmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingQuality_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t compositingquality = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetCompositingQuality")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, compositingquality) : -1;
#else
    (void)graphics;
    (void)compositingquality;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t basecap = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetCustomLineCapBaseCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, basecap) : -1;
#else
    (void)customcap;
    (void)basecap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseInset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float inset = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetCustomLineCapBaseInset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, inset) : -1;
#else
    (void)customcap;
    (void)inset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeCaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t startcap = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t endcap = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetCustomLineCapStrokeCaps")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, startcap, endcap) : -1;
#else
    (void)customcap;
    (void)startcap;
    (void)endcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeJoin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t linejoin = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetCustomLineCapStrokeJoin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, linejoin) : -1;
#else
    (void)customcap;
    (void)linejoin;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapWidthScale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float widthscale = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetCustomLineCapWidthScale")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(customcap, widthscale) : -1;
#else
    (void)customcap;
    (void)widthscale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetEffectParameters_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* effect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetEffectParameters")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(effect, params, size) : -1;
#else
    (void)effect;
    (void)params;
    (void)size;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetEmpty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetEmpty")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region) : -1;
#else
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesCachedBackground_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t enableflag = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesCachedBackground")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, enableflag) : -1;
#else
    (void)imageattr;
    (void)enableflag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorKeys_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enableflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t colorlow = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t colorhigh = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesColorKeys")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type, enableflag, colorlow, colorhigh) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colorlow;
    (void)colorhigh;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enableflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* colormatrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* graymatrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesColorMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type, enableflag, colormatrix, graymatrix, flags) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colormatrix;
    (void)graymatrix;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesGamma_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enableflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    float gamma = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesGamma")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type, enableflag, gamma) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)gamma;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesNoOp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enableflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesNoOp")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type, enableflag) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enableflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t channelflags = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesOutputChannel")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type, enableflag, channelflags) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)channelflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannelColorProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enableflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* colorprofilefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesOutputChannelColorProfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type, enableflag, colorprofilefilename) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colorprofilefilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesRemapTable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enableflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t mapsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* map = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesRemapTable")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type, enableflag, mapsize, map) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)mapsize;
    (void)map;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesThreshold_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t enableflag = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    float threshold = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesThreshold")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type, enableflag, threshold) : -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)threshold;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesToIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t type = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesToIdentity")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, type) : -1;
#else
    (void)imageattr;
    (void)type;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesWrapMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* imageattr = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t wrap = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t argb = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t clamp = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImageAttributesWrapMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(imageattr, wrap, argb, clamp) : -1;
#else
    (void)imageattr;
    (void)wrap;
    (void)argb;
    (void)clamp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetImagePalette_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* palette = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetImagePalette")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, palette) : -1;
#else
    (void)image;
    (void)palette;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetInfinite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetInfinite")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region) : -1;
#else
    (void)region;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetInterpolationMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t interpolationmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetInterpolationMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, interpolationmode) : -1;
#else
    (void)graphics;
    (void)interpolationmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetLineBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* blend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetLineBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, blend, positions, count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetLineColors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t color1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t color2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetLineColors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, color1, color2) : -1;
#else
    (void)brush;
    (void)color1;
    (void)color2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetLineGammaCorrection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t usegammacorrection = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetLineGammaCorrection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, usegammacorrection) : -1;
#else
    (void)brush;
    (void)usegammacorrection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetLineLinearBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float focus = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float scale = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetLineLinearBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, focus, scale) : -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetLinePresetBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* blend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetLinePresetBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, blend, positions, count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetLineSigmaBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float focus = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float scale = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetLineSigmaBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, focus, scale) : -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetLineTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetLineTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetLineWrapMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetLineWrapMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetMatrixElements_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float m11 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float m12 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float m21 = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float m22 = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float dx = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float dy = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetMatrixElements")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, m11, m12, m21, m22, dx, dy) : -1;
#else
    (void)matrix;
    (void)m11;
    (void)m12;
    (void)m21;
    (void)m22;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetMetafileDownLevelRasterizationLimit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* metafile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t metafilerasterizationlimitdpi = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetMetafileDownLevelRasterizationLimit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(metafile, metafilerasterizationlimitdpi) : -1;
#else
    (void)metafile;
    (void)metafilerasterizationlimitdpi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPageScale_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float scale = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPageScale")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, scale) : -1;
#else
    (void)graphics;
    (void)scale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPageUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t unit = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPageUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, unit) : -1;
#else
    (void)graphics;
    (void)unit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathFillMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fillmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathFillMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, fillmode) : -1;
#else
    (void)path;
    (void)fillmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* blend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, blend, positions, count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t colors = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientCenterColor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, colors) : -1;
#else
    (void)brush;
    (void)colors;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPoint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientCenterPoint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, points) : -1;
#else
    (void)brush;
    (void)points;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPointI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientCenterPointI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, points) : -1;
#else
    (void)brush;
    (void)points;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientFocusScales_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float xscale = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float yscale = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientFocusScales")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, xscale, yscale) : -1;
#else
    (void)brush;
    (void)xscale;
    (void)yscale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientGammaCorrection_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t usegammacorrection = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientGammaCorrection")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, usegammacorrection) : -1;
#else
    (void)brush;
    (void)usegammacorrection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientLinearBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float focus = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float scale = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientLinearBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, focus, scale) : -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, path) : -1;
#else
    (void)brush;
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPresetBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* blend = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* positions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientPresetBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, blend, positions, count) : -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSigmaBlend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float focus = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float scale = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientSigmaBlend")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, focus, scale) : -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSurroundColorsWithCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* color = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* count = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientSurroundColorsWithCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, color, count) : -1;
#else
    (void)brush;
    (void)color;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientWrapMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathGradientWrapMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPathMarker_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPathMarker")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenBrushFill_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenBrushFill")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, brush) : -1;
#else
    (void)pen;
    (void)brush;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t argb = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenColor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, argb) : -1;
#else
    (void)pen;
    (void)argb;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenCompoundArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenCompoundArray")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, dash, count) : -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomEndCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenCustomEndCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, customcap) : -1;
#else
    (void)pen;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomStartCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* customcap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenCustomStartCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, customcap) : -1;
#else
    (void)pen;
    (void)customcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* dash = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenDashArray")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, dash, count) : -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashCap197819_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t dashcap = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenDashCap197819")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, dashcap) : -1;
#else
    (void)pen;
    (void)dashcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashOffset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float offset = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenDashOffset")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, offset) : -1;
#else
    (void)pen;
    (void)offset;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashStyle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t dashstyle = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenDashStyle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, dashstyle) : -1;
#else
    (void)pen;
    (void)dashstyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenEndCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t endcap = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenEndCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, endcap) : -1;
#else
    (void)pen;
    (void)endcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineCap197819_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t startcap = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t endcap = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t dashcap = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenLineCap197819")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, startcap, endcap, dashcap) : -1;
#else
    (void)pen;
    (void)startcap;
    (void)endcap;
    (void)dashcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineJoin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t linejoin = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenLineJoin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, linejoin) : -1;
#else
    (void)pen;
    (void)linejoin;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenMiterLimit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float miterlimit = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenMiterLimit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, miterlimit) : -1;
#else
    (void)pen;
    (void)miterlimit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t penmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, penmode) : -1;
#else
    (void)pen;
    (void)penmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenStartCap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t startcap = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenStartCap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, startcap) : -1;
#else
    (void)pen;
    (void)startcap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, matrix) : -1;
#else
    (void)pen;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenUnit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t unit = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenUnit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, unit) : -1;
#else
    (void)pen;
    (void)unit;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPenWidth_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float width = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPenWidth")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, width) : -1;
#else
    (void)pen;
    (void)width;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPixelOffsetMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t pixeloffsetmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPixelOffsetMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, pixeloffsetmode) : -1;
#else
    (void)graphics;
    (void)pixeloffsetmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetPropertyItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* image = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* item = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetPropertyItem")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(image, item) : -1;
#else
    (void)image;
    (void)item;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetRenderingOrigin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetRenderingOrigin")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, x, y) : -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetSmoothingMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t smoothingmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetSmoothingMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, smoothingmode) : -1;
#else
    (void)graphics;
    (void)smoothingmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetSolidFillColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t color = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetSolidFillColor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, color) : -1;
#else
    (void)brush;
    (void)color;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatAlign_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t align = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetStringFormatAlign")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, align) : -1;
#else
    (void)format;
    (void)align;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatDigitSubstitution_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint16_t language = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t substitute = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetStringFormatDigitSubstitution")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, language, substitute) : -1;
#else
    (void)format;
    (void)language;
    (void)substitute;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatFlags_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t flags = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetStringFormatFlags")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, flags) : -1;
#else
    (void)format;
    (void)flags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatHotkeyPrefix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t hotkeyprefix = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetStringFormatHotkeyPrefix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, hotkeyprefix) : -1;
#else
    (void)format;
    (void)hotkeyprefix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatLineAlign_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t align = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetStringFormatLineAlign")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, align) : -1;
#else
    (void)format;
    (void)align;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatMeasurableCharacterRanges_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t rangecount = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ranges = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetStringFormatMeasurableCharacterRanges")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, rangecount, ranges) : -1;
#else
    (void)format;
    (void)rangecount;
    (void)ranges;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTabStops_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float firsttaboffset = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* tabstops = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetStringFormatTabStops")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, firsttaboffset, count, tabstops) : -1;
#else
    (void)format;
    (void)firsttaboffset;
    (void)count;
    (void)tabstops;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTrimming_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t trimming = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetStringFormatTrimming")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format, trimming) : -1;
#else
    (void)format;
    (void)trimming;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetTextContrast_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t contrast = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetTextContrast")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, contrast) : -1;
#else
    (void)graphics;
    (void)contrast;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetTextRenderingHint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t mode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetTextRenderingHint")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, mode) : -1;
#else
    (void)graphics;
    (void)mode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetTextureTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetTextureTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, matrix) : -1;
#else
    (void)brush;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetTextureWrapMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t wrapmode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetTextureWrapMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, wrapmode) : -1;
#else
    (void)brush;
    (void)wrapmode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipSetWorldTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipSetWorldTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, matrix) : -1;
#else
    (void)graphics;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipShearMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float shearx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float sheary = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipShearMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, shearx, sheary, order) : -1;
#else
    (void)matrix;
    (void)shearx;
    (void)sheary;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipStartPathFigure_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipStartPathFigure")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path) : -1;
#else
    (void)path;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericDefault_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipStringFormatGetGenericDefault")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format) : -1;
#else
    (void)format;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericTypographic_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* format = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipStringFormatGetGenericTypographic")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(format) : -1;
#else
    (void)format;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTestControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t control = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTestControl")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(control, param1) : -1;
#else
    (void)control;
    (void)param1;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTransformMatrixPoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, pts, count) : -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPointsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTransformMatrixPointsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, pts, count) : -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTransformPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTransformPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, matrix) : -1;
#else
    (void)path;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTransformPoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t destspace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t srcspace = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTransformPoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, destspace, srcspace, points, count) : -1;
#else
    (void)graphics;
    (void)destspace;
    (void)srcspace;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTransformPointsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t destspace = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t srcspace = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTransformPointsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, destspace, srcspace, points, count) : -1;
#else
    (void)graphics;
    (void)destspace;
    (void)srcspace;
    (void)points;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTransformRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTransformRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, matrix) : -1;
#else
    (void)region;
    (void)matrix;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslateClip_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float dx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float dy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslateClip")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, dx, dy) : -1;
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslateClipI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t dx = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t dy = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslateClipI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, dx, dy) : -1;
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslateLineTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float dx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float dy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslateLineTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, dx, dy, order) : -1;
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslateMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float offsetx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float offsety = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslateMatrix")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, offsetx, offsety, order) : -1;
#else
    (void)matrix;
    (void)offsetx;
    (void)offsety;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslatePathGradientTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float dx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float dy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslatePathGradientTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, dx, dy, order) : -1;
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslatePenTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float dx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float dy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslatePenTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pen, dx, dy, order) : -1;
#else
    (void)pen;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float dx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float dy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslateRegion")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, dx, dy) : -1;
#else
    (void)region;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegionI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* region = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t dx = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t dy = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslateRegionI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(region, dx, dy) : -1;
#else
    (void)region;
    (void)dx;
    (void)dy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslateTextureTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* brush = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float dx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float dy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslateTextureTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(brush, dx, dy, order) : -1;
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipTranslateWorldTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* graphics = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    float dx = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float dy = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t order = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipTranslateWorldTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(graphics, dx, dy, order) : -1;
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    (void)order;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPoints_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipVectorTransformMatrixPoints")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, pts, count) : -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPointsI_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pts = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipVectorTransformMatrixPointsI")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(matrix, pts, count) : -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipWarpPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float srcx = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float srcy = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float srcwidth = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    float srcheight = km_info.Length() > 7 ? km_info[7].ToNumber().FloatValue() : 0.0f;
    int32_t warpmode = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    float flatness = km_info.Length() > 9 ? km_info[9].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, float, float, float, int32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipWarpPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, matrix, points, count, srcx, srcy, srcwidth, srcheight, warpmode, flatness) : -1;
#else
    (void)path;
    (void)matrix;
    (void)points;
    (void)count;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)warpmode;
    (void)flatness;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipWidenPath_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nativepath = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pen = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    float flatness = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipWidenPath")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(nativepath, pen, matrix, flatness) : -1;
#else
    (void)nativepath;
    (void)pen;
    (void)matrix;
    (void)flatness;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdipWindingModeOutline_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* path = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* matrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    float flatness = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdipWindingModeOutline")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(path, matrix, flatness) : -1;
#else
    (void)path;
    (void)matrix;
    (void)flatness;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationHook_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdiplusNotificationHook")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token) : -1;
#else
    (void)token;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationUnhook_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t token = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdiplusNotificationUnhook")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(token);
#else
    (void)token;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdiplusShutdown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint64_t token = km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdiplusShutdown")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(token);
#else
    (void)token;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_gdiplus_GdiplusStartup_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* token = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* input = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* output = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GdiplusStartup")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(token, input, output) : -1;
#else
    (void)token;
    (void)input;
    (void)output;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_graphics_gdiplus_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathArc", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathArc_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathArcI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathArcI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezier", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezier_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezierI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezierI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziers", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziers_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziersI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziersI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurveI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurveI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurveI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurveI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipse", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipse_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipseI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipseI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathLineI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathLineI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathPie", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathPie_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathPieI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathPieI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygon", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygon_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygonI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygonI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangle", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangle_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangleI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangleI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangles", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangles_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectanglesI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectanglesI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathString", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathString_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAddPathStringI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAddPathStringI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipAlloc", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipAlloc_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBeginContainerI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBeginContainerI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapApplyEffect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapApplyEffect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapConvertFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapConvertFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapCreateApplyEffect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapCreateApplyEffect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogram", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogram_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogramSize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogramSize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetPixel", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetPixel_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapLockBits", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapLockBits_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetPixel", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetPixel_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetResolution", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetResolution_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipBitmapUnlockBits", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipBitmapUnlockBits_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipClearPathMarkers", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipClearPathMarkers_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapArea", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapArea_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapAreaI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapAreaI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneBrush", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneBrush_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneCustomLineCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneCustomLineCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneFont", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneFont_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneFontFamily", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneFontFamily_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneImage", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneImage_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneImageAttributes", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneImageAttributes_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipClonePath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipClonePath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipClonePen", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipClonePen_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCloneStringFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCloneStringFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigure", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigure_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigures", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigures_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipComment", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipComment_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlus", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlus_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToFile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToFile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToStream", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToStream_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateAdjustableArrowCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateAdjustableArrowCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFileICM", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFileICM_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGdiDib", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGdiDib_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGraphics", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGraphics_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHBITMAP", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHBITMAP_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHICON", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHICON_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromResource", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromResource_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromScan0", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromScan0_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStream", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStream_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStreamICM", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStreamICM_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateCachedBitmap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateCachedBitmap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateCustomLineCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateCustomLineCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateFont", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateFont_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFamilyFromName", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFamilyFromName_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromDC", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromDC_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontA", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontA_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontW", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontW_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWND", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWND_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWNDICM", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWNDICM_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateHBITMAPFromBitmap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateHBITMAPFromBitmap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateHICONFromBitmap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateHICONFromBitmap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateHalftonePalette", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateHalftonePalette_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateHatchBrush", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateHatchBrush_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateImageAttributes", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateImageAttributes_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrush", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrush_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngle", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngle_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngleI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngleI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromEmf", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromEmf_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromFile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromFile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromStream", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromStream_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmf", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmf_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmfFile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmfFile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreatePath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreatePath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradient", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradient_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientFromPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientFromPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreatePathIter", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreatePathIter_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreatePen1", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreatePen1_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreatePen2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreatePen2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionHrgn", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionHrgn_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRgnData", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRgnData_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateSolidFill", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateSolidFill_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateStreamOnFile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateStreamOnFile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateStringFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateStringFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIA", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIA_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIAI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIAI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteBrush", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteBrush_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteCachedBitmap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteCachedBitmap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteCustomLineCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteCustomLineCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteEffect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteEffect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteFont", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteFont_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteFontFamily", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteFontFamily_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteGraphics", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteGraphics_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeletePath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeletePath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeletePathIter", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeletePathIter_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeletePen", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeletePen_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeletePrivateFontCollection", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeletePrivateFontCollection_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDeleteStringFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDeleteStringFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDisposeImage", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDisposeImage_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDisposeImageAttributes", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDisposeImageAttributes_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawArc", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawArc_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawArcI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawArcI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawBezier", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawBezier_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawBezierI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawBezierI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziers", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziers_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziersI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziersI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawCachedBitmap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawCachedBitmap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurveI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurveI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawCurveI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawCurveI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawDriverString", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawDriverString_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipse", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipse_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipseI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipseI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImage", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImage_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImageFX", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImageFX_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImageI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImageI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePoints", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePoints_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawLine", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawLine_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawLineI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawLineI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawLines", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawLines_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawLinesI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawLinesI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawPie", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawPie_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawPieI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawPieI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygon", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygon_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygonI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygonI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangle", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangle_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangleI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangleI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangles", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangles_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawRectanglesI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawRectanglesI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipDrawString", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipDrawString_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEmfToWmfBits", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEmfToWmfBits_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEndContainer", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEndContainer_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoints", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoints_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoints", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoints_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurveI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurveI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillEllipse", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillEllipse_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillEllipseI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillEllipseI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillPie", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillPie_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillPieI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillPieI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2I", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2I_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillPolygonI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillPolygonI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillRectangle", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillRectangle_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillRectangleI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillRectangleI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillRectangles", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillRectangles_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillRectanglesI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillRectanglesI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFillRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFillRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFindFirstImageItem", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFindFirstImageItem_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFindNextImageItem", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFindNextImageItem_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFlattenPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFlattenPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFlush", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFlush_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipFree", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipFree_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapFillState", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapFillState_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapHeight", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapHeight_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapMiddleInset", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapMiddleInset_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapWidth", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapWidth_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetAllPropertyItems", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetAllPropertyItems_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetBrushType", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetBrushType_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCellAscent", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCellAscent_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCellDescent", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCellDescent_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetClip", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetClip_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetClipBounds", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetClipBounds_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetClipBoundsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetClipBoundsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingQuality", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingQuality_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseInset", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseInset_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeCaps", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeCaps_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeJoin", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeJoin_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapType", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapType_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapWidthScale", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapWidthScale_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetDC", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetDC_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetDpiX", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetDpiX_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetDpiY", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetDpiY_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameterSize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameterSize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameters", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameters_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetEmHeight", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetEmHeight_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterList", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterList_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterListSize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterListSize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetFamily", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetFamily_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetFamilyName", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetFamilyName_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyList", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyList_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeight", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeight_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeightGivenDPI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeightGivenDPI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetFontSize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetFontSize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetFontStyle", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetFontStyle_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetFontUnit", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetFontUnit_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilyMonospace", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilyMonospace_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySansSerif", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySansSerif_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySerif", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySerif_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetHatchBackgroundColor", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetHatchBackgroundColor_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetHatchForegroundColor", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetHatchForegroundColor_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetHatchStyle", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetHatchStyle_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetHemfFromMetafile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetHemfFromMetafile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageAttributesAdjustedPalette", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageAttributesAdjustedPalette_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageBounds", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageBounds_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecoders", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecoders_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecodersSize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecodersSize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageDimension", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageDimension_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncoders", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncoders_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncodersSize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncodersSize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageFlags", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageFlags_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageGraphicsContext", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageGraphicsContext_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageHeight", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageHeight_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageHorizontalResolution", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageHorizontalResolution_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageItemData", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageItemData_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImagePalette", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImagePalette_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImagePaletteSize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImagePaletteSize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImagePixelFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImagePixelFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageRawFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageRawFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageThumbnail", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageThumbnail_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageType", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageType_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageVerticalResolution", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageVerticalResolution_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetImageWidth", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetImageWidth_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetInterpolationMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetInterpolationMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlendCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlendCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLineColors", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLineColors_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLineGammaCorrection", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLineGammaCorrection_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlendCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlendCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLineRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLineRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLineRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLineRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLineSpacing", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLineSpacing_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLineTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLineTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLineWrapMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLineWrapMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontA", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontA_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontW", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontW_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetMatrixElements", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetMatrixElements_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileDownLevelRasterizationLimit", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileDownLevelRasterizationLimit_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromEmf", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromEmf_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromFile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromFile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromMetafile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromMetafile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromStream", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromStream_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromWmf", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromWmf_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetNearestColor", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetNearestColor_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPageScale", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPageScale_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPageUnit", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPageUnit_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathData", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathData_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathFillMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathFillMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlendCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlendCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterColor", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterColor_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPoint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPoint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPointI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPointI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientFocusScales", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientFocusScales_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientGammaCorrection", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientGammaCorrection_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPointCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPointCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlendCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlendCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorsWithCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorsWithCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientWrapMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientWrapMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathLastPoint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathLastPoint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathPoints", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathPoints_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathPointsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathPointsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathTypes", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathTypes_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBounds", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBounds_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBoundsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBoundsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenBrushFill", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenBrushFill_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenColor", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenColor_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundArray", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundArray_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomEndCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomEndCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomStartCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomStartCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashArray", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashArray_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCap197819", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCap197819_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashOffset", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashOffset_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashStyle", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashStyle_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenEndCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenEndCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenFillType", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenFillType_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenLineJoin", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenLineJoin_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenMiterLimit", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenMiterLimit_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenStartCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenStartCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenUnit", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenUnit_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPenWidth", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPenWidth_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPixelOffsetMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPixelOffsetMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPointCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPointCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyIdList", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyIdList_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItem", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItem_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItemSize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItemSize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetPropertySize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetPropertySize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBounds", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBounds_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBoundsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBoundsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetRegionData", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetRegionData_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetRegionDataSize", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetRegionDataSize_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetRegionHRgn", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetRegionHRgn_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScans", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScans_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetRenderingOrigin", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetRenderingOrigin_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetSmoothingMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetSmoothingMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetSolidFillColor", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetSolidFillColor_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatAlign", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatAlign_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatDigitSubstitution", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatDigitSubstitution_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatFlags", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatFlags_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatHotkeyPrefix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatHotkeyPrefix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatLineAlign", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatLineAlign_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatMeasurableCharacterRangeCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatMeasurableCharacterRangeCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStopCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStopCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStops", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStops_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTrimming", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTrimming_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetTextContrast", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetTextContrast_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetTextRenderingHint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetTextRenderingHint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetTextureImage", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetTextureImage_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetTextureTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetTextureTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetTextureWrapMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetTextureWrapMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBounds", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBounds_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBoundsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBoundsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGetWorldTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGetWorldTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGraphicsClear", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGraphicsClear_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipGraphicsSetAbort", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipGraphicsSetAbort_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipImageForceValidation", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipImageForceValidation_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsList", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsList_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipImageRotateFlip", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipImageRotateFlip_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipImageSelectActiveFrame", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipImageSelectActiveFrame_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipImageSetAbort", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipImageSetAbort_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipInitializePalette", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipInitializePalette_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipInvertMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipInvertMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsClipEmpty", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsClipEmpty_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsEmptyRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsEmptyRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsEqualRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsEqualRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsInfiniteRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsInfiniteRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixEqual", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixEqual_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixIdentity", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixIdentity_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixInvertible", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixInvertible_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPoint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPoint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPointI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPointI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsStyleAvailable", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsStyleAvailable_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleClipEmpty", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleClipEmpty_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPoint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPoint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPointI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPointI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePoint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePoint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePointI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePointI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPoint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPoint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPointI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPointI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFileICM", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFileICM_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStream", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStream_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStreamICM", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStreamICM_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipMeasureCharacterRanges", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipMeasureCharacterRanges_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipMeasureDriverString", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipMeasureDriverString_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipMeasureString", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipMeasureString_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipMultiplyLineTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipMultiplyLineTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipMultiplyMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipMultiplyMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPathGradientTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPathGradientTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPenTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPenTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipMultiplyTextureTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipMultiplyTextureTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipMultiplyWorldTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipMultiplyWorldTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipNewInstalledFontCollection", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipNewInstalledFontCollection_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipNewPrivateFontCollection", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipNewPrivateFontCollection_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterCopyData", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterCopyData_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterEnumerate", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterEnumerate_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetSubpathCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetSubpathCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterHasCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterHasCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterIsValid", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterIsValid_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarker", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarker_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarkerPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarkerPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextPathType", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextPathType_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpathPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpathPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPathIterRewind", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPathIterRewind_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPlayMetafileRecord", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPlayMetafileRecord_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddFontFile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddFontFile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddMemoryFont", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddMemoryFont_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileName", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileName_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileNameI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileNameI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStream", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStream_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStreamI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStreamI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipReleaseDC", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipReleaseDC_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRemovePropertyItem", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRemovePropertyItem_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipResetClip", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipResetClip_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipResetImageAttributes", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipResetImageAttributes_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipResetLineTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipResetLineTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipResetPageTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipResetPageTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipResetPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipResetPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipResetPathGradientTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipResetPathGradientTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipResetPenTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipResetPenTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipResetTextureTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipResetTextureTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipResetWorldTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipResetWorldTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRestoreGraphics", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRestoreGraphics_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipReversePath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipReversePath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRotateLineTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRotateLineTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRotateMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRotateMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRotatePathGradientTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRotatePathGradientTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRotatePenTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRotatePenTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRotateTextureTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRotateTextureTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipRotateWorldTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipRotateWorldTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSaveAdd", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSaveAdd_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSaveAddImage", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSaveAddImage_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSaveGraphics", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSaveGraphics_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToFile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToFile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToStream", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToStream_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipScaleLineTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipScaleLineTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipScaleMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipScaleMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipScalePathGradientTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipScalePathGradientTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipScalePenTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipScalePenTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipScaleTextureTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipScaleTextureTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipScaleWorldTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipScaleWorldTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapFillState", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapFillState_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapHeight", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapHeight_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapMiddleInset", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapMiddleInset_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapWidth", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapWidth_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetClipGraphics", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetClipGraphics_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetClipHrgn", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetClipHrgn_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetClipPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetClipPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetClipRect", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetClipRect_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetClipRectI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetClipRectI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetClipRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetClipRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingQuality", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingQuality_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseInset", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseInset_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeCaps", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeCaps_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeJoin", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeJoin_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapWidthScale", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapWidthScale_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetEffectParameters", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetEffectParameters_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetEmpty", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetEmpty_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesCachedBackground", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesCachedBackground_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorKeys", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorKeys_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesGamma", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesGamma_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesNoOp", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesNoOp_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannel", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannel_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannelColorProfile", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannelColorProfile_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesRemapTable", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesRemapTable_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesThreshold", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesThreshold_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesToIdentity", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesToIdentity_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesWrapMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesWrapMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetImagePalette", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetImagePalette_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetInfinite", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetInfinite_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetInterpolationMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetInterpolationMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetLineBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetLineBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetLineColors", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetLineColors_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetLineGammaCorrection", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetLineGammaCorrection_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetLineLinearBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetLineLinearBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetLinePresetBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetLinePresetBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetLineSigmaBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetLineSigmaBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetLineTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetLineTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetLineWrapMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetLineWrapMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetMatrixElements", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetMatrixElements_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetMetafileDownLevelRasterizationLimit", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetMetafileDownLevelRasterizationLimit_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPageScale", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPageScale_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPageUnit", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPageUnit_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathFillMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathFillMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterColor", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterColor_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPoint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPoint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPointI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPointI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientFocusScales", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientFocusScales_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientGammaCorrection", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientGammaCorrection_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientLinearBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientLinearBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPresetBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPresetBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSigmaBlend", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSigmaBlend_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSurroundColorsWithCount", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSurroundColorsWithCount_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientWrapMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientWrapMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPathMarker", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPathMarker_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenBrushFill", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenBrushFill_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenColor", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenColor_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenCompoundArray", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenCompoundArray_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomEndCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomEndCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomStartCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomStartCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashArray", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashArray_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashCap197819", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashCap197819_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashOffset", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashOffset_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashStyle", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashStyle_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenEndCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenEndCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineCap197819", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineCap197819_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineJoin", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineJoin_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenMiterLimit", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenMiterLimit_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenStartCap", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenStartCap_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenUnit", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenUnit_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPenWidth", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPenWidth_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPixelOffsetMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPixelOffsetMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetPropertyItem", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetPropertyItem_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetRenderingOrigin", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetRenderingOrigin_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetSmoothingMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetSmoothingMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetSolidFillColor", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetSolidFillColor_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatAlign", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatAlign_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatDigitSubstitution", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatDigitSubstitution_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatFlags", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatFlags_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatHotkeyPrefix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatHotkeyPrefix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatLineAlign", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatLineAlign_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatMeasurableCharacterRanges", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatMeasurableCharacterRanges_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTabStops", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTabStops_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTrimming", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTrimming_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetTextContrast", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetTextContrast_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetTextRenderingHint", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetTextRenderingHint_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetTextureTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetTextureTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetTextureWrapMode", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetTextureWrapMode_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipSetWorldTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipSetWorldTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipShearMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipShearMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipStartPathFigure", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipStartPathFigure_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericDefault", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericDefault_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericTypographic", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericTypographic_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTestControl", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTestControl_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPoints", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPoints_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPointsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPointsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTransformPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTransformPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTransformPoints", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTransformPoints_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTransformPointsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTransformPointsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTransformRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTransformRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslateClip", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslateClip_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslateClipI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslateClipI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslateLineTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslateLineTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslateMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslateMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslatePathGradientTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslatePathGradientTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslatePenTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslatePenTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegion", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegion_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegionI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegionI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslateTextureTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslateTextureTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipTranslateWorldTransform", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipTranslateWorldTransform_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPoints", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPoints_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPointsI", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPointsI_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipWarpPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipWarpPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipWidenPath", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipWidenPath_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdipWindingModeOutline", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdipWindingModeOutline_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationHook", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationHook_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationUnhook", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationUnhook_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdiplusShutdown", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdiplusShutdown_napi));
    exports.Set("windowssys_windows_win32_graphics_gdiplus_GdiplusStartup", Napi::Function::New(env, windowssys_windows_win32_graphics_gdiplus_GdiplusStartup_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_graphics_gdiplus_napi, nullptr };
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
