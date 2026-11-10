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

static Napi::Value windowssys_windows_win32_graphics_opengl_choosePixelFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppfd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ChoosePixelFormat")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdc, ppfd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ppfd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_describePixelFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t ipixelformat = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t nbytes = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppfd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DescribePixelFormat")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdc, ipixelformat, nbytes, ppfd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ipixelformat;
    (void)nbytes;
    (void)ppfd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_getEnhMetaFilePixelFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hemf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cbbuffer = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppfd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetEnhMetaFilePixelFormat")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hemf, cbbuffer, ppfd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hemf;
    (void)cbbuffer;
    (void)ppfd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_getPixelFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPixelFormat")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_setPixelFormat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t format = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppfd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetPixelFormat")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdc, format, ppfd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)format;
    (void)ppfd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_swapBuffers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SwapBuffers")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glAccum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t op = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float value = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glAccum")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(op, value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)op;
    (void)value;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glAlphaFunc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t func = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float ref = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glAlphaFunc")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(func, ref);
    } else {
        errno = ENOSYS;
    }
#else
    (void)func;
    (void)ref;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glAreTexturesResident_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t n = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* textures = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* residences = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glAreTexturesResident")));
    }
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(n, textures, residences);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)n;
    (void)textures;
    (void)residences;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glArrayElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t i = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glArrayElement")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(i);
    } else {
        errno = ENOSYS;
    }
#else
    (void)i;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glBegin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glBegin")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glBindTexture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t texture = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glBindTexture")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, texture);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)texture;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glBitmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t width = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float xorig = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float yorig = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
    float xmove = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float ymove = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    void* bitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glBitmap")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(width, height, xorig, yorig, xmove, ymove, bitmap);
    } else {
        errno = ENOSYS;
    }
#else
    (void)width;
    (void)height;
    (void)xorig;
    (void)yorig;
    (void)xmove;
    (void)ymove;
    (void)bitmap;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glBlendFunc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sfactor = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dfactor = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glBlendFunc")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(sfactor, dfactor);
    } else {
        errno = ENOSYS;
    }
#else
    (void)sfactor;
    (void)dfactor;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glCallList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t list = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glCallList")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(list);
    } else {
        errno = ENOSYS;
    }
#else
    (void)list;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glCallLists_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t n = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lists = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glCallLists")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(n, type, lists);
    } else {
        errno = ENOSYS;
    }
#else
    (void)n;
    (void)type;
    (void)lists;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glClear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mask = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glClear")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glClearAccum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float red = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float green = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float blue = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float alpha = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glClearAccum")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glClearColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float red = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float green = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float blue = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float alpha = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glClearColor")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glClearDepth_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double depth = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glClearDepth")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(depth);
    } else {
        errno = ENOSYS;
    }
#else
    (void)depth;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glClearIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float c = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glClearIndex")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glClearStencil_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t s = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glClearStencil")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glClipPlane_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t plane = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* equation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glClipPlane")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(plane, equation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)plane;
    (void)equation;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3b_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int8_t red = static_cast<int8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int8_t green = static_cast<int8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int8_t blue = static_cast<int8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t, int8_t, int8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3b")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3bv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3bv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double red = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double green = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double blue = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float red = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float green = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float blue = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t red = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t green = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t blue = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t red = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t green = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t blue = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3ub_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t red = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t green = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t blue = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3ub")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3ubv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3ubv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3ui_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t red = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t green = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t blue = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3ui")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3uiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3uiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3us_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t red = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t green = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t blue = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3us")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor3usv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor3usv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4b_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int8_t red = static_cast<int8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int8_t green = static_cast<int8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int8_t blue = static_cast<int8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int8_t alpha = static_cast<int8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t, int8_t, int8_t, int8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4b")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4bv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4bv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double red = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double green = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double blue = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double alpha = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float red = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float green = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float blue = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float alpha = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t red = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t green = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t blue = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t alpha = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t red = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t green = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t blue = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t alpha = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4ub_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t red = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t green = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t blue = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint8_t alpha = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4ub")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4ubv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4ubv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4ui_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t red = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t green = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t blue = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t alpha = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4ui")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4uiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4uiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4us_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t red = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t green = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint16_t blue = static_cast<uint16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t alpha = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t, uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4us")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColor4usv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColor4usv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColorMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t red = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint8_t green = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t blue = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint8_t alpha = static_cast<uint8_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColorMask")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(red, green, blue, alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColorMaterial_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t face = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColorMaterial")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(face, mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glColorPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t size = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t stride = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glColorPointer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(size, type, stride, pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glCopyPixels_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glCopyPixels")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, width, height, type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)type;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glCopyTexImage1D_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t internalformat = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t x = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t border = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glCopyTexImage1D")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, internalformat, x, y, width, border);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)internalformat;
    (void)x;
    (void)y;
    (void)width;
    (void)border;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glCopyTexImage2D_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t internalformat = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t x = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t border = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glCopyTexImage2D")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, internalformat, x, y, width, height, border);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)internalformat;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)border;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t xoffset = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t x = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glCopyTexSubImage1D")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, xoffset, x, y, width);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)xoffset;
    (void)x;
    (void)y;
    (void)width;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t xoffset = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t yoffset = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t x = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glCopyTexSubImage2D")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, xoffset, yoffset, x, y, width, height);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)xoffset;
    (void)yoffset;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glCullFace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glCullFace")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDeleteLists_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t list = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t range = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDeleteLists")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(list, range);
    } else {
        errno = ENOSYS;
    }
#else
    (void)list;
    (void)range;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDeleteTextures_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t n = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* textures = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDeleteTextures")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(n, textures);
    } else {
        errno = ENOSYS;
    }
#else
    (void)n;
    (void)textures;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDepthFunc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t func = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDepthFunc")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(func);
    } else {
        errno = ENOSYS;
    }
#else
    (void)func;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDepthMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t flag = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDepthMask")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(flag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)flag;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDepthRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double znear = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double zfar = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDepthRange")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(znear, zfar);
    } else {
        errno = ENOSYS;
    }
#else
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDisable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cap = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDisable")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cap);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cap;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDisableClientState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t array = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDisableClientState")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(array);
    } else {
        errno = ENOSYS;
    }
#else
    (void)array;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDrawArrays_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t first = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t count = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDrawArrays")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode, first, count);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    (void)first;
    (void)count;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDrawBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDrawBuffer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDrawElements_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t count = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* indices = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDrawElements")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode, count, type, indices);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    (void)count;
    (void)type;
    (void)indices;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glDrawPixels_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t width = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pixels = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glDrawPixels")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(width, height, format, type, pixels);
    } else {
        errno = ENOSYS;
    }
#else
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEdgeFlag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t flag = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEdgeFlag")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(flag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)flag;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t stride = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEdgeFlagPointer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(stride, pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEdgeFlagv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* flag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEdgeFlagv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(flag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)flag;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEnable_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cap = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEnable")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(cap);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cap;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEnableClientState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t array = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEnableClientState")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(array);
    } else {
        errno = ENOSYS;
    }
#else
    (void)array;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEnd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEnd")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEndList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEndList")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalCoord1d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double u = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalCoord1d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalCoord1dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* u = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalCoord1dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalCoord1f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float u = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalCoord1f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalCoord1fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* u = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalCoord1fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalCoord2d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double u = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double v = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalCoord2d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(u, v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalCoord2dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* u = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalCoord2dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalCoord2f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float u = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float v = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalCoord2f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(u, v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalCoord2fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* u = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalCoord2fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalMesh1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t i1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t i2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalMesh1")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode, i1, i2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    (void)i1;
    (void)i2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalMesh2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t i1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t i2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t j1 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t j2 = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalMesh2")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode, i1, i2, j1, j2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    (void)i1;
    (void)i2;
    (void)j1;
    (void)j2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalPoint1_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t i = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalPoint1")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(i);
    } else {
        errno = ENOSYS;
    }
#else
    (void)i;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glEvalPoint2_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t i = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t j = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glEvalPoint2")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(i, j);
    } else {
        errno = ENOSYS;
    }
#else
    (void)i;
    (void)j;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glFeedbackBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t size = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glFeedbackBuffer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(size, type, buffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)type;
    (void)buffer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glFinish_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glFinish")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glFlush_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glFlush")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glFogf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float param1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glFogf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glFogfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glFogfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glFogi_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glFogi")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glFogiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glFogiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glFrontFace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glFrontFace")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glFrustum_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double left = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double right = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double bottom = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double top = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
    double znear = km_info.Length() > 4 ? km_info[4].ToNumber().DoubleValue() : 0.0;
    double zfar = km_info.Length() > 5 ? km_info[5].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glFrustum")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(left, right, bottom, top, znear, zfar);
    } else {
        errno = ENOSYS;
    }
#else
    (void)left;
    (void)right;
    (void)bottom;
    (void)top;
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGenLists_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t range = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGenLists")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(range);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)range;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGenTextures_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t n = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* textures = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGenTextures")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(n, textures);
    } else {
        errno = ENOSYS;
    }
#else
    (void)n;
    (void)textures;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetBooleanv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetBooleanv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetClipPlane_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t plane = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* equation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetClipPlane")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(plane, equation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)plane;
    (void)equation;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetDoublev_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetDoublev")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetError_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetError")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetFloatv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetFloatv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetIntegerv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetIntegerv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetLightfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t light = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetLightfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(light, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetLightiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t light = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetLightiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(light, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetMapdv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t query = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetMapdv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, query, v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)query;
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetMapfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t query = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetMapfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, query, v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)query;
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetMapiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t query = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetMapiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, query, v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)query;
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetMaterialfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t face = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetMaterialfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(face, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetMaterialiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t face = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetMaterialiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(face, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetPixelMapfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t map = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetPixelMapfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(map, values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)values;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t map = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetPixelMapuiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(map, values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)values;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetPixelMapusv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t map = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetPixelMapusv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(map, values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)values;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetPointerv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetPointerv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetPolygonStipple_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetPolygonStipple")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t name = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetString")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)name;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexEnvfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexEnvfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexEnviv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexEnviv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexGendv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t coord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexGendv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(coord, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexGenfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t coord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexGenfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(coord, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexGeniv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t coord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexGeniv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(coord, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pixels = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexImage")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, format, type, pixels);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexLevelParameterfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexLevelParameteriv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexParameterfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexParameterfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glGetTexParameteriv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glGetTexParameteriv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glHint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glHint")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mask = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexMask")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t stride = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexPointer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(type, stride, pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double c = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexd")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexdv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* c = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexdv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float c = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* c = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexi_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t c = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexi")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* c = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t c = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexs")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexsv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* c = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexsv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexub_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint8_t c = static_cast<uint8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexub")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIndexubv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* c = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIndexubv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glInitNames_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glInitNames")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glInterleavedArrays_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t stride = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glInterleavedArrays")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(format, stride, pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)format;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIsEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t cap = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIsEnabled")));
    }
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cap);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cap;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIsList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t list = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIsList")));
    }
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(list);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)list;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glIsTexture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t texture = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glIsTexture")));
    }
    uint8_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(texture);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)texture;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLightModelf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float param1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLightModelf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLightModelfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLightModelfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLightModeli_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLightModeli")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLightModeliv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLightModeliv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLightf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t light = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float param2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLightf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(light, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLightfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t light = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLightfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(light, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLighti_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t light = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLighti")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(light, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLightiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t light = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLightiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(light, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLineStipple_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t factor = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint16_t pattern = static_cast<uint16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLineStipple")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(factor, pattern);
    } else {
        errno = ENOSYS;
    }
#else
    (void)factor;
    (void)pattern;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLineWidth_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float width = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLineWidth")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(width);
    } else {
        errno = ENOSYS;
    }
#else
    (void)width;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glListBase_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t base = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glListBase")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(base);
    } else {
        errno = ENOSYS;
    }
#else
    (void)base;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLoadIdentity_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLoadIdentity")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLoadMatrixd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* m = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLoadMatrixd")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(m);
    } else {
        errno = ENOSYS;
    }
#else
    (void)m;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLoadMatrixf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* m = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLoadMatrixf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(m);
    } else {
        errno = ENOSYS;
    }
#else
    (void)m;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLoadName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t name = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLoadName")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(name);
    } else {
        errno = ENOSYS;
    }
#else
    (void)name;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glLogicOp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t opcode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glLogicOp")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(opcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opcode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMap1d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    double u1 = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double u2 = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    int32_t stride = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t order = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, double, double, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMap1d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, u1, u2, stride, order, points);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)u1;
    (void)u2;
    (void)stride;
    (void)order;
    (void)points;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMap1f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float u1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float u2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t stride = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t order = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMap1f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, u1, u2, stride, order, points);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)u1;
    (void)u2;
    (void)stride;
    (void)order;
    (void)points;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMap2d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    double u1 = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double u2 = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    int32_t ustride = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t uorder = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    double v1 = km_info.Length() > 5 ? km_info[5].ToNumber().DoubleValue() : 0.0;
    double v2 = km_info.Length() > 6 ? km_info[6].ToNumber().DoubleValue() : 0.0;
    int32_t vstride = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t vorder = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, double, double, int32_t, int32_t, double, double, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMap2d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)u1;
    (void)u2;
    (void)ustride;
    (void)uorder;
    (void)v1;
    (void)v2;
    (void)vstride;
    (void)vorder;
    (void)points;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMap2f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float u1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float u2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t ustride = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t uorder = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    float v1 = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    float v2 = km_info.Length() > 6 ? km_info[6].ToNumber().FloatValue() : 0.0f;
    int32_t vstride = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t vorder = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* points = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float, float, int32_t, int32_t, float, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMap2f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)u1;
    (void)u2;
    (void)ustride;
    (void)uorder;
    (void)v1;
    (void)v2;
    (void)vstride;
    (void)vorder;
    (void)points;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMapGrid1d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t un = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    double u1 = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double u2 = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMapGrid1d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(un, u1, u2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)un;
    (void)u1;
    (void)u2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMapGrid1f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t un = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float u1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float u2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMapGrid1f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(un, u1, u2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)un;
    (void)u1;
    (void)u2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMapGrid2d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t un = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    double u1 = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double u2 = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    int32_t vn = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    double v1 = km_info.Length() > 4 ? km_info[4].ToNumber().DoubleValue() : 0.0;
    double v2 = km_info.Length() > 5 ? km_info[5].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, double, double, int32_t, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMapGrid2d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(un, u1, u2, vn, v1, v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)un;
    (void)u1;
    (void)u2;
    (void)vn;
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMapGrid2f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t un = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float u1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float u2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    int32_t vn = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float v1 = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float v2 = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, float, float, int32_t, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMapGrid2f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(un, u1, u2, vn, v1, v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)un;
    (void)u1;
    (void)u2;
    (void)vn;
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMaterialf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t face = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float param2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMaterialf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(face, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMaterialfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t face = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMaterialfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(face, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMateriali_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t face = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMateriali")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(face, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMaterialiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t face = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMaterialiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(face, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMatrixMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMatrixMode")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMultMatrixd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* m = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMultMatrixd")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(m);
    } else {
        errno = ENOSYS;
    }
#else
    (void)m;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glMultMatrixf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* m = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glMultMatrixf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(m);
    } else {
        errno = ENOSYS;
    }
#else
    (void)m;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNewList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t list = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNewList")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(list, mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)list;
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3b_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int8_t nx = static_cast<int8_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int8_t ny = static_cast<int8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int8_t nz = static_cast<int8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t, int8_t, int8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3b")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nx, ny, nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3bv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3bv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double nx = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double ny = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double nz = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nx, ny, nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float nx = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float ny = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float nz = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nx, ny, nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t nx = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t ny = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t nz = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nx, ny, nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t nx = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t ny = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t nz = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nx, ny, nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormal3sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormal3sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glNormalPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t stride = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glNormalPointer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(type, stride, pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glOrtho_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double left = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double right = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double bottom = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double top = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
    double znear = km_info.Length() > 4 ? km_info[4].ToNumber().DoubleValue() : 0.0;
    double zfar = km_info.Length() > 5 ? km_info[5].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glOrtho")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(left, right, bottom, top, znear, zfar);
    } else {
        errno = ENOSYS;
    }
#else
    (void)left;
    (void)right;
    (void)bottom;
    (void)top;
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPassThrough_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float token = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPassThrough")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(token);
    } else {
        errno = ENOSYS;
    }
#else
    (void)token;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPixelMapfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t map = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t mapsize = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPixelMapfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(map, mapsize, values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)mapsize;
    (void)values;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPixelMapuiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t map = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t mapsize = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPixelMapuiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(map, mapsize, values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)mapsize;
    (void)values;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPixelMapusv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t map = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t mapsize = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* values = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPixelMapusv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(map, mapsize, values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)mapsize;
    (void)values;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPixelStoref_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float param1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPixelStoref")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPixelStorei_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPixelStorei")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPixelTransferf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    float param1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPixelTransferf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPixelTransferi_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPixelTransferi")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(pname, param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPixelZoom_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float xfactor = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float yfactor = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPixelZoom")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(xfactor, yfactor);
    } else {
        errno = ENOSYS;
    }
#else
    (void)xfactor;
    (void)yfactor;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPointSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float size = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPointSize")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPolygonMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t face = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPolygonMode")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(face, mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPolygonOffset_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float factor = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float units = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPolygonOffset")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(factor, units);
    } else {
        errno = ENOSYS;
    }
#else
    (void)factor;
    (void)units;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPolygonStipple_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* mask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPolygonStipple")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPopAttrib_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPopAttrib")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPopClientAttrib_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPopClientAttrib")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPopMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPopMatrix")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPopName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPopName")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPrioritizeTextures_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t n = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* textures = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* priorities = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPrioritizeTextures")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(n, textures, priorities);
    } else {
        errno = ENOSYS;
    }
#else
    (void)n;
    (void)textures;
    (void)priorities;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPushAttrib_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mask = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPushAttrib")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPushClientAttrib_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mask = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPushClientAttrib")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPushMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPushMatrix")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glPushName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t name = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glPushName")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(name);
    } else {
        errno = ENOSYS;
    }
#else
    (void)name;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos2d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos2d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos2dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos2dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos2f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos2f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos2fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos2fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos2i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos2i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos2iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos2iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos2s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t x = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t y = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos2s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos2sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos2sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos3d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double z = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos3d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos3dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos3dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos3f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float z = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos3f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos3fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos3fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos3i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t z = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos3i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos3iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos3iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos3s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t x = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t y = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t z = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos3s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos3sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos3sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos4d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double z = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double w = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos4d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z, w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos4dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos4dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos4f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float z = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float w = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos4f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z, w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos4fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos4fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos4i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t z = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t w = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos4i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z, w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos4iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos4iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos4s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t x = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t y = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t z = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t w = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos4s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z, w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRasterPos4sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRasterPos4sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glReadBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glReadBuffer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glReadPixels_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pixels = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glReadPixels")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, width, height, format, type, pixels);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRectd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x1 = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y1 = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double x2 = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double y2 = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRectd")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x1, y1, x2, y2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRectdv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* v2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRectdv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v1, v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRectf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x1 = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y1 = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float x2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float y2 = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRectf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x1, y1, x2, y2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRectfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* v2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRectfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v1, v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRecti_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x1 = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t x2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t y2 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRecti")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x1, y1, x2, y2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRectiv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* v2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRectiv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v1, v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRects_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t x1 = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t y1 = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t x2 = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t y2 = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRects")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x1, y1, x2, y2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRectsv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* v2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRectsv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v1, v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRenderMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRenderMode")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRotated_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double angle = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double x = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double z = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRotated")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(angle, x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)angle;
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glRotatef_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float angle = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float x = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float z = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glRotatef")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(angle, x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)angle;
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glScaled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double z = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glScaled")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glScalef_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float z = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glScalef")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glScissor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glScissor")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, width, height);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glSelectBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t size = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glSelectBuffer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(size, buffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)buffer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glShadeModel_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glShadeModel")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glStencilFunc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t func = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t ref = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t mask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glStencilFunc")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(func, ref, mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)func;
    (void)ref;
    (void)mask;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glStencilMask_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t mask = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glStencilMask")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glStencilOp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t fail = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t zfail = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t zpass = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glStencilOp")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(fail, zfail, zpass);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fail;
    (void)zfail;
    (void)zpass;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord1d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double s = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord1d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord1dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord1dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord1f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float s = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord1f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord1fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord1fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord1i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t s = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord1i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord1iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord1iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord1s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t s = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord1s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord1sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord1sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord2d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double s = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double t = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord2d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord2dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord2dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord2f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float s = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float t = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord2f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord2fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord2fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord2i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t s = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t t = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord2i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord2iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord2iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord2s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t s = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t t = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord2s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord2sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord2sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord3d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double s = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double t = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double r = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord3d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t, r);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord3dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord3dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord3f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float s = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float t = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float r = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord3f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t, r);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord3fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord3fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord3i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t s = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t t = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t r = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord3i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t, r);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord3iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord3iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord3s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t s = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t t = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t r = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord3s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t, r);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord3sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord3sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord4d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double s = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double t = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double r = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double q = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord4d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t, r, q);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord4dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord4dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord4f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float s = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float t = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float r = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float q = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord4f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t, r, q);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord4fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord4fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord4i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t s = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t t = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t r = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t q = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord4i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t, r, q);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord4iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord4iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord4s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t s = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t t = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t r = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t q = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord4s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(s, t, r, q);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoord4sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoord4sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexCoordPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t size = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t stride = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexCoordPointer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(size, type, stride, pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexEnvf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float param2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexEnvf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexEnvfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexEnvfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexEnvi_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexEnvi")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexEnviv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexEnviv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexGend_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t coord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    double param2 = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexGend")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(coord, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexGendv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t coord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexGendv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(coord, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexGenf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t coord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float param2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexGenf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(coord, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexGenfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t coord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexGenfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(coord, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexGeni_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t coord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexGeni")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(coord, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexGeniv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t coord = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexGeniv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(coord, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexImage1D_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t internalformat = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t border = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pixels = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexImage1D")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, internalformat, width, border, format, type, pixels);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)internalformat;
    (void)width;
    (void)border;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexImage2D_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t internalformat = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t border = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* pixels = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexImage2D")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, internalformat, width, height, border, format, type, pixels);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)internalformat;
    (void)width;
    (void)height;
    (void)border;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexParameterf_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float param2 = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexParameterf")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexParameterfv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexParameterfv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexParameteri_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexParameteri")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexParameteriv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t pname = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* params = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexParameteriv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, pname, params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexSubImage1D_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t xoffset = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pixels = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexSubImage1D")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, xoffset, width, format, type, pixels);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)xoffset;
    (void)width;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTexSubImage2D_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t level = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t xoffset = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t yoffset = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* pixels = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTexSubImage2D")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(target, level, xoffset, yoffset, width, height, format, type, pixels);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)xoffset;
    (void)yoffset;
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTranslated_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double z = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTranslated")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glTranslatef_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float z = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glTranslatef")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex2d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex2d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex2dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex2dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex2f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex2f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex2fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex2fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex2i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex2i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex2iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex2iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex2s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t x = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t y = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex2s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex2sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex2sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex3d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double z = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex3d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex3dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex3dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex3f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float z = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex3f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex3fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex3fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex3i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t z = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex3i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex3iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex3iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex3s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t x = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t y = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t z = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex3s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex3sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex3sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex4d_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double z = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double w = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex4d")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z, w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex4dv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex4dv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex4f_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float x = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    float y = km_info.Length() > 1 ? km_info[1].ToNumber().FloatValue() : 0.0f;
    float z = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
    float w = km_info.Length() > 3 ? km_info[3].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex4f")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z, w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex4fv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex4fv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex4i_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t z = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t w = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex4i")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z, w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex4iv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex4iv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex4s_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int16_t x = static_cast<int16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int16_t y = static_cast<int16_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int16_t z = static_cast<int16_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int16_t w = static_cast<int16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex4s")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, z, w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertex4sv_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* v = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertex4sv")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glVertexPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t size = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t stride = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glVertexPointer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(size, type, stride, pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_glViewport_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "glViewport")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, width, height);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluBeginCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluBeginCurve")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluBeginPolygon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluBeginPolygon")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluBeginSurface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluBeginSurface")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluBeginTrim_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluBeginTrim")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t components = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluBuild1DMipmaps")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(target, components, width, format, type, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)target;
    (void)components;
    (void)width;
    (void)format;
    (void)type;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t target = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t components = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t width = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t height = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluBuild2DMipmaps")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(target, components, width, height, format, type, data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)target;
    (void)components;
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluCylinder_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* qobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double baseradius = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double topradius = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double height = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
    int32_t slices = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t stacks = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, double, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluCylinder")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(qobj, baseradius, topradius, height, slices, stacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)qobj;
    (void)baseradius;
    (void)topradius;
    (void)height;
    (void)slices;
    (void)stacks;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluDeleteNurbsRenderer")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluDeleteQuadric_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* state = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluDeleteQuadric")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(state);
    } else {
        errno = ENOSYS;
    }
#else
    (void)state;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluDeleteTess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluDeleteTess")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* qobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double innerradius = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double outerradius = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    int32_t slices = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t loops = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluDisk")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(qobj, innerradius, outerradius, slices, loops);
    } else {
        errno = ENOSYS;
    }
#else
    (void)qobj;
    (void)innerradius;
    (void)outerradius;
    (void)slices;
    (void)loops;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluEndCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluEndCurve")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluEndPolygon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluEndPolygon")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluEndSurface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluEndSurface")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluEndTrim_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluEndTrim")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluErrorString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t errcode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluErrorString")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(errcode);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)errcode;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t errcode = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluErrorUnicodeStringEXT")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(errcode);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)errcode;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluGetNurbsProperty")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj, property, value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)property;
    (void)value;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluGetString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t name = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluGetString")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(name);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)name;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluGetTessProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t which = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluGetTessProperty")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess, which, value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)which;
    (void)value;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* modelmatrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* projmatrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* viewport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluLoadSamplingMatrices")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj, modelmatrix, projmatrix, viewport);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)modelmatrix;
    (void)projmatrix;
    (void)viewport;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluLookAt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double eyex = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double eyey = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double eyez = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double centerx = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
    double centery = km_info.Length() > 4 ? km_info[4].ToNumber().DoubleValue() : 0.0;
    double centerz = km_info.Length() > 5 ? km_info[5].ToNumber().DoubleValue() : 0.0;
    double upx = km_info.Length() > 6 ? km_info[6].ToNumber().DoubleValue() : 0.0;
    double upy = km_info.Length() > 7 ? km_info[7].ToNumber().DoubleValue() : 0.0;
    double upz = km_info.Length() > 8 ? km_info[8].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, double, double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluLookAt")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)eyex;
    (void)eyey;
    (void)eyez;
    (void)centerx;
    (void)centery;
    (void)centerz;
    (void)upx;
    (void)upy;
    (void)upz;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluNewNurbsRenderer")));
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

static Napi::Value windowssys_windows_win32_graphics_opengl_gluNewQuadric_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluNewQuadric")));
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

static Napi::Value windowssys_windows_win32_graphics_opengl_gluNewTess_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluNewTess")));
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

static Napi::Value windowssys_windows_win32_graphics_opengl_gluNextContour_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluNextContour")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess, type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)type;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluNurbsCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t which = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t fn = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluNurbsCallback")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj, which, fn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)which;
    (void)fn;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluNurbsCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nknots = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* knot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t stride = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ctlarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t order = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluNurbsCurve")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj, nknots, knot, stride, ctlarray, order, type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)nknots;
    (void)knot;
    (void)stride;
    (void)ctlarray;
    (void)order;
    (void)type;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluNurbsProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t property = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    float value = km_info.Length() > 2 ? km_info[2].ToNumber().FloatValue() : 0.0f;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, float);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluNurbsProperty")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj, property, value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)property;
    (void)value;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluNurbsSurface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t sknot_count = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sknot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t tknot_count = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* tknot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t s_stride = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t t_stride = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* ctlarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int32_t sorder = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    int32_t torder = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluNurbsSurface")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj, sknot_count, sknot, tknot_count, tknot, s_stride, t_stride, ctlarray, sorder, torder, type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)sknot_count;
    (void)sknot;
    (void)tknot_count;
    (void)tknot;
    (void)s_stride;
    (void)t_stride;
    (void)ctlarray;
    (void)sorder;
    (void)torder;
    (void)type;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluOrtho2D_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double left = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double right = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double bottom = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double top = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluOrtho2D")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(left, right, bottom, top);
    } else {
        errno = ENOSYS;
    }
#else
    (void)left;
    (void)right;
    (void)bottom;
    (void)top;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluPartialDisk_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* qobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double innerradius = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double outerradius = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    int32_t slices = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t loops = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    double startangle = km_info.Length() > 5 ? km_info[5].ToNumber().DoubleValue() : 0.0;
    double sweepangle = km_info.Length() > 6 ? km_info[6].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, int32_t, int32_t, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluPartialDisk")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(qobj, innerradius, outerradius, slices, loops, startangle, sweepangle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)qobj;
    (void)innerradius;
    (void)outerradius;
    (void)slices;
    (void)loops;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluPerspective_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double fovy = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double aspect = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double znear = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double zfar = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluPerspective")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(fovy, aspect, znear, zfar);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fovy;
    (void)aspect;
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluPickMatrix_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double x = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double width = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double height = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
    void* viewport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluPickMatrix")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(x, y, width, height, viewport);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)viewport;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluProject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double objx = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double objy = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double objz = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    void* modelmatrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* projmatrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* viewport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* winx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* winy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* winz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, double, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluProject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(objx, objy, objz, modelmatrix, projmatrix, viewport, winx, winy, winz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objx;
    (void)objy;
    (void)objz;
    (void)modelmatrix;
    (void)projmatrix;
    (void)viewport;
    (void)winx;
    (void)winy;
    (void)winz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluPwlCurve_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t count = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* array = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t stride = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t type = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluPwlCurve")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(nobj, count, array, stride, type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)count;
    (void)array;
    (void)stride;
    (void)type;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluQuadricCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* qobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t which = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t fn = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluQuadricCallback")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(qobj, which, fn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)qobj;
    (void)which;
    (void)fn;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* quadobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t drawstyle = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluQuadricDrawStyle")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(quadobject, drawstyle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)quadobject;
    (void)drawstyle;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluQuadricNormals_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* quadobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t normals = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluQuadricNormals")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(quadobject, normals);
    } else {
        errno = ENOSYS;
    }
#else
    (void)quadobject;
    (void)normals;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluQuadricOrientation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* quadobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t orientation = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluQuadricOrientation")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(quadobject, orientation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)quadobject;
    (void)orientation;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluQuadricTexture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* quadobject = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t texturecoords = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluQuadricTexture")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(quadobject, texturecoords);
    } else {
        errno = ENOSYS;
    }
#else
    (void)quadobject;
    (void)texturecoords;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluScaleImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t format = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t widthin = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t heightin = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t typein = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* datain = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t widthout = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t heightout = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t typeout = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* dataout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, uint32_t, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluScaleImage")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(format, widthin, heightin, typein, datain, widthout, heightout, typeout, dataout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)format;
    (void)widthin;
    (void)heightin;
    (void)typein;
    (void)datain;
    (void)widthout;
    (void)heightout;
    (void)typeout;
    (void)dataout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluSphere_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* qobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double radius = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    int32_t slices = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t stacks = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluSphere")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(qobj, radius, slices, stacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)qobj;
    (void)radius;
    (void)slices;
    (void)stacks;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluTessBeginContour_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluTessBeginContour")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* polygon_data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluTessBeginPolygon")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess, polygon_data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)polygon_data;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluTessCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t which = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t fn = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluTessCallback")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess, which, fn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)which;
    (void)fn;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluTessEndContour_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluTessEndContour")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluTessEndPolygon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluTessEndPolygon")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluTessNormal_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    double x = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double y = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    double z = km_info.Length() > 3 ? km_info[3].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluTessNormal")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess, x, y, z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluTessProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t which = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    double value = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, double);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluTessProperty")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess, which, value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)which;
    (void)value;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluTessVertex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* coords = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* data = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluTessVertex")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess, coords, data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)coords;
    (void)data;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_graphics_opengl_gluUnProject_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    double winx = km_info.Length() > 0 ? km_info[0].ToNumber().DoubleValue() : 0.0;
    double winy = km_info.Length() > 1 ? km_info[1].ToNumber().DoubleValue() : 0.0;
    double winz = km_info.Length() > 2 ? km_info[2].ToNumber().DoubleValue() : 0.0;
    void* modelmatrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* projmatrix = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* viewport = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* objx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* objy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* objz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, double, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluUnProject")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(winx, winy, winz, modelmatrix, projmatrix, viewport, objx, objy, objz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)winx;
    (void)winy;
    (void)winz;
    (void)modelmatrix;
    (void)projmatrix;
    (void)viewport;
    (void)objx;
    (void)objy;
    (void)objz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglCopyContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglCopyContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglCreateContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglCreateContext")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)param0;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglCreateLayerContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglCreateLayerContext")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglDeleteContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglDeleteContext")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglDescribeLayerPlane")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglGetCurrentContext_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglGetCurrentContext")));
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

static Napi::Value windowssys_windows_win32_graphics_opengl_wglGetCurrentDC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglGetCurrentDC")));
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

static Napi::Value windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t param3 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglGetLayerPaletteEntries")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglGetProcAddress_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglGetProcAddress")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)param0;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglMakeCurrent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglMakeCurrent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglRealizeLayerPalette")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t param3 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* param4 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglSetLayerPaletteEntries")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglShareLists_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* param1 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglShareLists")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglSwapLayerBuffers")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglUseFontBitmapsA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglUseFontBitmapsW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float param4 = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float param5 = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    int32_t param6 = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* param7 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglUseFontOutlinesA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t param3 = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    float param4 = km_info.Length() > 4 ? km_info[4].ToNumber().FloatValue() : 0.0f;
    float param5 = km_info.Length() > 5 ? km_info[5].ToNumber().FloatValue() : 0.0f;
    int32_t param6 = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* param7 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "wglUseFontOutlinesW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_graphics_opengl_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_graphics_opengl_choosePixelFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_choosePixelFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_describePixelFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_describePixelFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_getEnhMetaFilePixelFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_getEnhMetaFilePixelFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_getPixelFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_getPixelFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_setPixelFormat", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_setPixelFormat_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_swapBuffers", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_swapBuffers_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glAccum", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glAccum_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glAlphaFunc", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glAlphaFunc_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glAreTexturesResident", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glAreTexturesResident_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glArrayElement", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glArrayElement_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glBegin", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glBegin_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glBindTexture", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glBindTexture_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glBitmap", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glBitmap_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glBlendFunc", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glBlendFunc_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glCallList", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glCallList_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glCallLists", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glCallLists_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glClear", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glClear_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glClearAccum", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glClearAccum_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glClearColor", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glClearColor_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glClearDepth", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glClearDepth_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glClearIndex", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glClearIndex_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glClearStencil", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glClearStencil_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glClipPlane", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glClipPlane_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3b", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3b_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3bv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3bv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3ub", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3ub_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3ubv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3ubv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3ui", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3ui_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3uiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3uiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3us", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3us_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor3usv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor3usv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4b", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4b_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4bv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4bv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4ub", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4ub_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4ubv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4ubv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4ui", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4ui_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4uiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4uiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4us", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4us_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColor4usv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColor4usv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColorMask", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColorMask_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColorMaterial", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColorMaterial_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glColorPointer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glColorPointer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glCopyPixels", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glCopyPixels_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glCopyTexImage1D", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glCopyTexImage1D_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glCopyTexImage2D", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glCopyTexImage2D_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glCullFace", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glCullFace_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDeleteLists", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDeleteLists_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDeleteTextures", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDeleteTextures_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDepthFunc", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDepthFunc_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDepthMask", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDepthMask_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDepthRange", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDepthRange_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDisable", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDisable_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDisableClientState", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDisableClientState_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDrawArrays", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDrawArrays_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDrawBuffer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDrawBuffer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDrawElements", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDrawElements_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glDrawPixels", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glDrawPixels_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEdgeFlag", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEdgeFlag_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEdgeFlagv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEdgeFlagv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEnable", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEnable_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEnableClientState", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEnableClientState_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEnd", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEnd_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEndList", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEndList_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalCoord1d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalCoord1d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalCoord1dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalCoord1dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalCoord1f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalCoord1f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalCoord1fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalCoord1fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalCoord2d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalCoord2d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalCoord2dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalCoord2dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalCoord2f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalCoord2f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalCoord2fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalCoord2fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalMesh1", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalMesh1_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalMesh2", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalMesh2_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalPoint1", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalPoint1_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glEvalPoint2", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glEvalPoint2_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glFeedbackBuffer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glFeedbackBuffer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glFinish", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glFinish_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glFlush", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glFlush_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glFogf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glFogf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glFogfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glFogfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glFogi", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glFogi_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glFogiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glFogiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glFrontFace", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glFrontFace_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glFrustum", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glFrustum_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGenLists", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGenLists_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGenTextures", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGenTextures_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetBooleanv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetBooleanv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetClipPlane", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetClipPlane_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetDoublev", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetDoublev_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetError", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetError_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetFloatv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetFloatv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetIntegerv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetIntegerv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetLightfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetLightfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetLightiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetLightiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetMapdv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetMapdv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetMapfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetMapfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetMapiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetMapiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetMaterialfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetMaterialfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetMaterialiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetMaterialiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetPixelMapfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetPixelMapfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetPixelMapusv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetPixelMapusv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetPointerv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetPointerv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetPolygonStipple", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetPolygonStipple_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetString", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetString_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexEnvfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexEnvfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexEnviv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexEnviv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexGendv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexGendv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexGenfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexGenfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexGeniv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexGeniv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexImage", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexImage_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexParameterfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexParameterfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glGetTexParameteriv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glGetTexParameteriv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glHint", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glHint_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexMask", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexMask_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexPointer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexPointer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexd", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexd_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexdv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexdv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexi", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexi_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexs", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexs_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexsv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexsv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexub", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexub_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIndexubv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIndexubv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glInitNames", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glInitNames_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glInterleavedArrays", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glInterleavedArrays_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIsEnabled", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIsEnabled_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIsList", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIsList_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glIsTexture", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glIsTexture_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLightModelf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLightModelf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLightModelfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLightModelfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLightModeli", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLightModeli_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLightModeliv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLightModeliv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLightf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLightf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLightfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLightfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLighti", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLighti_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLightiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLightiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLineStipple", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLineStipple_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLineWidth", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLineWidth_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glListBase", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glListBase_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLoadIdentity", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLoadIdentity_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLoadMatrixd", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLoadMatrixd_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLoadMatrixf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLoadMatrixf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLoadName", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLoadName_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glLogicOp", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glLogicOp_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMap1d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMap1d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMap1f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMap1f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMap2d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMap2d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMap2f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMap2f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMapGrid1d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMapGrid1d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMapGrid1f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMapGrid1f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMapGrid2d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMapGrid2d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMapGrid2f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMapGrid2f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMaterialf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMaterialf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMaterialfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMaterialfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMateriali", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMateriali_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMaterialiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMaterialiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMatrixMode", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMatrixMode_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMultMatrixd", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMultMatrixd_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glMultMatrixf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glMultMatrixf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNewList", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNewList_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3b", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3b_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3bv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3bv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormal3sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormal3sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glNormalPointer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glNormalPointer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glOrtho", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glOrtho_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPassThrough", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPassThrough_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPixelMapfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPixelMapfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPixelMapuiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPixelMapuiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPixelMapusv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPixelMapusv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPixelStoref", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPixelStoref_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPixelStorei", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPixelStorei_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPixelTransferf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPixelTransferf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPixelTransferi", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPixelTransferi_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPixelZoom", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPixelZoom_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPointSize", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPointSize_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPolygonMode", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPolygonMode_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPolygonOffset", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPolygonOffset_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPolygonStipple", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPolygonStipple_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPopAttrib", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPopAttrib_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPopClientAttrib", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPopClientAttrib_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPopMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPopMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPopName", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPopName_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPrioritizeTextures", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPrioritizeTextures_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPushAttrib", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPushAttrib_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPushClientAttrib", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPushClientAttrib_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPushMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPushMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glPushName", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glPushName_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos2d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos2d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos2dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos2dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos2f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos2f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos2fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos2fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos2i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos2i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos2iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos2iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos2s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos2s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos2sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos2sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos3d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos3d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos3dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos3dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos3f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos3f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos3fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos3fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos3i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos3i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos3iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos3iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos3s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos3s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos3sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos3sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos4d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos4d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos4dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos4dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos4f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos4f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos4fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos4fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos4i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos4i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos4iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos4iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos4s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos4s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRasterPos4sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRasterPos4sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glReadBuffer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glReadBuffer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glReadPixels", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glReadPixels_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRectd", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRectd_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRectdv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRectdv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRectf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRectf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRectfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRectfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRecti", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRecti_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRectiv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRectiv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRects", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRects_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRectsv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRectsv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRenderMode", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRenderMode_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRotated", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRotated_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glRotatef", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glRotatef_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glScaled", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glScaled_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glScalef", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glScalef_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glScissor", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glScissor_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glSelectBuffer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glSelectBuffer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glShadeModel", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glShadeModel_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glStencilFunc", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glStencilFunc_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glStencilMask", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glStencilMask_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glStencilOp", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glStencilOp_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord1d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord1d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord1dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord1dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord1f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord1f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord1fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord1fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord1i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord1i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord1iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord1iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord1s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord1s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord1sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord1sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord2d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord2d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord2dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord2dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord2f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord2f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord2fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord2fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord2i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord2i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord2iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord2iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord2s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord2s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord2sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord2sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord3d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord3d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord3dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord3dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord3f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord3f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord3fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord3fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord3i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord3i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord3iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord3iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord3s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord3s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord3sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord3sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord4d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord4d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord4dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord4dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord4f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord4f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord4fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord4fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord4i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord4i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord4iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord4iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord4s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord4s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoord4sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoord4sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexCoordPointer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexCoordPointer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexEnvf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexEnvf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexEnvfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexEnvfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexEnvi", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexEnvi_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexEnviv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexEnviv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexGend", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexGend_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexGendv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexGendv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexGenf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexGenf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexGenfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexGenfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexGeni", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexGeni_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexGeniv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexGeniv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexImage1D", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexImage1D_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexImage2D", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexImage2D_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexParameterf", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexParameterf_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexParameterfv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexParameterfv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexParameteri", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexParameteri_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexParameteriv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexParameteriv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexSubImage1D", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexSubImage1D_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTexSubImage2D", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTexSubImage2D_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTranslated", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTranslated_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glTranslatef", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glTranslatef_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex2d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex2d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex2dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex2dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex2f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex2f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex2fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex2fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex2i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex2i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex2iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex2iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex2s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex2s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex2sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex2sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex3d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex3d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex3dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex3dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex3f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex3f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex3fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex3fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex3i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex3i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex3iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex3iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex3s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex3s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex3sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex3sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex4d", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex4d_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex4dv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex4dv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex4f", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex4f_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex4fv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex4fv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex4i", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex4i_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex4iv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex4iv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex4s", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex4s_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertex4sv", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertex4sv_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glVertexPointer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glVertexPointer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_glViewport", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_glViewport_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluBeginCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluBeginCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluBeginPolygon", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluBeginPolygon_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluBeginSurface", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluBeginSurface_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluBeginTrim", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluBeginTrim_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluCylinder", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluCylinder_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluDeleteQuadric", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluDeleteQuadric_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluDeleteTess", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluDeleteTess_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluDisk", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluDisk_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluEndCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluEndCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluEndPolygon", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluEndPolygon_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluEndSurface", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluEndSurface_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluEndTrim", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluEndTrim_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluErrorString", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluErrorString_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluGetString", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluGetString_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluGetTessProperty", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluGetTessProperty_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluLookAt", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluLookAt_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluNewQuadric", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluNewQuadric_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluNewTess", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluNewTess_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluNextContour", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluNextContour_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluNurbsCallback", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluNurbsCallback_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluNurbsCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluNurbsCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluNurbsProperty", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluNurbsProperty_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluNurbsSurface", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluNurbsSurface_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluOrtho2D", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluOrtho2D_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluPartialDisk", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluPartialDisk_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluPerspective", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluPerspective_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluPickMatrix", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluPickMatrix_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluProject", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluProject_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluPwlCurve", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluPwlCurve_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluQuadricCallback", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluQuadricCallback_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluQuadricNormals", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluQuadricNormals_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluQuadricOrientation", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluQuadricOrientation_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluQuadricTexture", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluQuadricTexture_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluScaleImage", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluScaleImage_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluSphere", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluSphere_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluTessBeginContour", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluTessBeginContour_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluTessCallback", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluTessCallback_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluTessEndContour", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluTessEndContour_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluTessEndPolygon", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluTessEndPolygon_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluTessNormal", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluTessNormal_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluTessProperty", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluTessProperty_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluTessVertex", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluTessVertex_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_gluUnProject", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_gluUnProject_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglCopyContext", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglCopyContext_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglCreateContext", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglCreateContext_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglCreateLayerContext", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglCreateLayerContext_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglDeleteContext", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglDeleteContext_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglGetCurrentContext", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglGetCurrentContext_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglGetCurrentDC", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglGetCurrentDC_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglGetProcAddress", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglGetProcAddress_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglMakeCurrent", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglMakeCurrent_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglShareLists", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglShareLists_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA_napi));
    exports.Set("windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW", Napi::Function::New(env, windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_graphics_opengl_napi, nullptr };
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
