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

static Napi::Value windowssysWindowsWin32GraphicsOpenglChoosePixelFormat_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglDescribePixelFormat_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGetPixelFormat_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglSetPixelFormat_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglSwapBuffers_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlAccum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlAlphaFunc_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlAreTexturesResident_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlArrayElement_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlBegin_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlBindTexture_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlBitmap_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlBlendFunc_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlCallList_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlCallLists_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlClear_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlClearAccum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlClearColor_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlClearDepth_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlClearIndex_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlClearStencil_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlClipPlane_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3b_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3bv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3ub_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3ubv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3ui_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3uiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3us_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor3usv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4b_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4bv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4ub_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4ubv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4ui_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4uiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4us_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColor4usv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColorMask_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColorMaterial_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlColorPointer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlCopyPixels_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlCullFace_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDeleteLists_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDeleteTextures_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDepthFunc_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDepthMask_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDepthRange_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDisable_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDisableClientState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDrawArrays_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDrawBuffer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDrawElements_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlDrawPixels_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEdgeFlag_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEdgeFlagv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEnable_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEnableClientState_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEnd_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEndList_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalCoord1d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalCoord1f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalCoord2d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalCoord2f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalMesh1_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalMesh2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalPoint1_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlEvalPoint2_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlFinish_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlFlush_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlFogf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlFogfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlFogi_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlFogiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlFrontFace_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlFrustum_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGenLists_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGenTextures_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetBooleanv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetClipPlane_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetDoublev_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetError_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetFloatv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetIntegerv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetLightfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetLightiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetMapdv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetMapfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetMapiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetMaterialfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetMaterialiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetPointerv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetString_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexEnviv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexGendv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexGenfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexGeniv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexImage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlHint_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexMask_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexPointer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexd_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexdv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexi_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexs_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexsv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexub_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIndexubv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlInitNames_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlInterleavedArrays_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIsEnabled_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIsList_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlIsTexture_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLightModelf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLightModelfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLightModeli_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLightModeliv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLightf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLightfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLighti_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLightiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLineStipple_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLineWidth_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlListBase_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLoadIdentity_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLoadMatrixd_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLoadMatrixf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLoadName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlLogicOp_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMap1d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMap1f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMap2d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMap2f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMapGrid1d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMapGrid1f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMapGrid2d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMapGrid2f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMaterialf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMaterialfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMateriali_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMaterialiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMatrixMode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMultMatrixd_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlMultMatrixf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNewList_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3b_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3bv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormal3sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlNormalPointer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlOrtho_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPassThrough_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPixelMapfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPixelMapuiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPixelMapusv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPixelStoref_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPixelStorei_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPixelTransferf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPixelTransferi_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPixelZoom_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPointSize_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPolygonMode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPolygonOffset_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPolygonStipple_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPopAttrib_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPopClientAttrib_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPopMatrix_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPopName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPushAttrib_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPushClientAttrib_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPushMatrix_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlPushName_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos2d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos2dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos2f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos2fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos2i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos2iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos2s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos2sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos3d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos3dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos3f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos3fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos3i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos3iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos3s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos3sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos4d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos4dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos4f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos4fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos4i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos4iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos4s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRasterPos4sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlReadBuffer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlReadPixels_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRectd_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRectdv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRectf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRectfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRecti_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRectiv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRects_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRectsv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRenderMode_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRotated_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlRotatef_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlScaled_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlScalef_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlScissor_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlSelectBuffer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlShadeModel_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlStencilFunc_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlStencilMask_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlStencilOp_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord1d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord1dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord1f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord1fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord1i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord1iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord1s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord1sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord2d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord2dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord2f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord2fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord2i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord2iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord2s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord2sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord3d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord3dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord3f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord3fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord3i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord3iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord3s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord3sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord4d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord4dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord4f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord4fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord4i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord4iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord4s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoord4sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexCoordPointer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexEnvf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexEnvfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexEnvi_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexEnviv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexGend_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexGendv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexGenf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexGenfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexGeni_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexGeniv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexImage1D_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexImage2D_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexParameterf_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexParameterfv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexParameteri_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexParameteriv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexSubImage1D_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTexSubImage2D_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTranslated_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlTranslatef_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex2d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex2dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex2f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex2fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex2i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex2iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex2s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex2sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex3d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex3dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex3f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex3fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex3i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex3iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex3s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex3sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex4d_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex4dv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex4f_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex4fv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex4i_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex4iv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex4s_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertex4sv_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlVertexPointer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGlViewport_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluBeginCurve_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluBeginPolygon_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluBeginSurface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluBeginTrim_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluCylinder_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluDeleteQuadric_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluDeleteTess_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluDisk_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluEndCurve_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluEndPolygon_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluEndSurface_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluEndTrim_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluErrorString_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluGetString_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluGetTessProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluLookAt_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluNewQuadric_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluNewTess_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluNextContour_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluNurbsCallback_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluNurbsCurve_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluNurbsProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluNurbsSurface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* nobj = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t sknotCount = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* sknot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t tknotCount = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* tknot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t sStride = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t tStride = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
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
        km_fn_ptr(nobj, sknotCount, sknot, tknotCount, tknot, sStride, tStride, ctlarray, sorder, torder, type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)sknotCount;
    (void)sknot;
    (void)tknotCount;
    (void)tknot;
    (void)sStride;
    (void)tStride;
    (void)ctlarray;
    (void)sorder;
    (void)torder;
    (void)type;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluOrtho2D_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluPartialDisk_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluPerspective_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluPickMatrix_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluProject_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluPwlCurve_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluQuadricCallback_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluQuadricNormals_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluQuadricOrientation_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluQuadricTexture_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluScaleImage_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluSphere_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluTessBeginContour_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* tess = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* polygonData = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "gluTessBeginPolygon")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(tess, polygonData);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)polygonData;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluTessCallback_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluTessEndContour_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluTessEndPolygon_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluTessNormal_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluTessProperty_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluTessVertex_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglGluUnProject_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglCopyContext_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglCreateContext_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglCreateLayerContext_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglDeleteContext_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglGetCurrentContext_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglGetCurrentDC_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglGetProcAddress_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglMakeCurrent_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglShareLists_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA_napi(const Napi::CallbackInfo& km_info) {
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

static Napi::Value windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW_napi(const Napi::CallbackInfo& km_info) {
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
    exports.Set("windowssysWindowsWin32GraphicsOpenglChoosePixelFormat", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglChoosePixelFormat_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglDescribePixelFormat", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglDescribePixelFormat_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGetPixelFormat", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGetPixelFormat_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglSetPixelFormat", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglSetPixelFormat_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglSwapBuffers", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglSwapBuffers_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlAccum", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlAccum_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlAlphaFunc", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlAlphaFunc_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlAreTexturesResident", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlAreTexturesResident_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlArrayElement", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlArrayElement_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlBegin", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlBegin_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlBindTexture", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlBindTexture_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlBitmap", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlBitmap_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlBlendFunc", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlBlendFunc_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlCallList", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlCallList_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlCallLists", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlCallLists_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlClear", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlClear_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlClearAccum", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlClearAccum_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlClearColor", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlClearColor_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlClearDepth", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlClearDepth_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlClearIndex", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlClearIndex_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlClearStencil", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlClearStencil_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlClipPlane", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlClipPlane_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3b", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3b_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3bv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3bv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3ub", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3ub_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3ubv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3ubv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3ui", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3ui_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3uiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3uiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3us", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3us_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor3usv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor3usv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4b", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4b_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4bv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4bv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4ub", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4ub_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4ubv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4ubv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4ui", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4ui_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4uiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4uiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4us", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4us_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColor4usv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColor4usv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColorMask", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColorMask_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColorMaterial", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColorMaterial_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlColorPointer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlColorPointer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlCopyPixels", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlCopyPixels_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlCullFace", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlCullFace_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDeleteLists", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDeleteLists_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDeleteTextures", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDeleteTextures_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDepthFunc", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDepthFunc_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDepthMask", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDepthMask_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDepthRange", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDepthRange_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDisable", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDisable_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDisableClientState", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDisableClientState_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDrawArrays", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDrawArrays_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDrawBuffer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDrawBuffer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDrawElements", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDrawElements_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlDrawPixels", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlDrawPixels_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEdgeFlag", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEdgeFlag_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEdgeFlagv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEdgeFlagv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEnable", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEnable_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEnableClientState", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEnableClientState_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEnd", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEnd_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEndList", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEndList_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalCoord1d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalCoord1d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalCoord1f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalCoord1f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalCoord2d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalCoord2d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalCoord2f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalCoord2f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalMesh1", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalMesh1_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalMesh2", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalMesh2_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalPoint1", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalPoint1_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlEvalPoint2", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlEvalPoint2_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlFinish", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlFinish_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlFlush", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlFlush_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlFogf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlFogf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlFogfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlFogfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlFogi", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlFogi_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlFogiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlFogiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlFrontFace", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlFrontFace_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlFrustum", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlFrustum_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGenLists", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGenLists_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGenTextures", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGenTextures_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetBooleanv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetBooleanv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetClipPlane", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetClipPlane_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetDoublev", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetDoublev_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetError", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetError_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetFloatv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetFloatv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetIntegerv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetIntegerv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetLightfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetLightfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetLightiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetLightiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetMapdv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetMapdv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetMapfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetMapfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetMapiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetMapiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetMaterialfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetMaterialfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetMaterialiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetMaterialiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetPointerv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetPointerv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetString", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetString_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexEnviv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexEnviv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexGendv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexGendv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexGenfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexGenfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexGeniv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexGeniv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexImage", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexImage_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlHint", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlHint_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexMask", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexMask_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexPointer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexPointer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexd", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexd_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexdv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexdv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexi", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexi_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexs", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexs_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexsv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexsv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexub", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexub_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIndexubv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIndexubv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlInitNames", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlInitNames_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlInterleavedArrays", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlInterleavedArrays_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIsEnabled", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIsEnabled_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIsList", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIsList_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlIsTexture", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlIsTexture_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLightModelf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLightModelf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLightModelfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLightModelfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLightModeli", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLightModeli_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLightModeliv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLightModeliv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLightf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLightf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLightfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLightfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLighti", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLighti_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLightiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLightiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLineStipple", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLineStipple_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLineWidth", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLineWidth_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlListBase", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlListBase_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLoadIdentity", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLoadIdentity_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLoadMatrixd", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLoadMatrixd_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLoadMatrixf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLoadMatrixf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLoadName", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLoadName_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlLogicOp", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlLogicOp_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMap1d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMap1d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMap1f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMap1f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMap2d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMap2d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMap2f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMap2f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMapGrid1d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMapGrid1d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMapGrid1f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMapGrid1f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMapGrid2d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMapGrid2d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMapGrid2f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMapGrid2f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMaterialf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMaterialf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMaterialfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMaterialfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMateriali", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMateriali_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMaterialiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMaterialiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMatrixMode", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMatrixMode_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMultMatrixd", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMultMatrixd_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlMultMatrixf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlMultMatrixf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNewList", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNewList_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3b", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3b_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3bv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3bv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormal3sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormal3sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlNormalPointer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlNormalPointer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlOrtho", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlOrtho_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPassThrough", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPassThrough_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPixelMapfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPixelMapfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPixelMapuiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPixelMapuiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPixelMapusv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPixelMapusv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPixelStoref", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPixelStoref_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPixelStorei", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPixelStorei_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPixelTransferf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPixelTransferf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPixelTransferi", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPixelTransferi_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPixelZoom", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPixelZoom_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPointSize", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPointSize_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPolygonMode", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPolygonMode_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPolygonOffset", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPolygonOffset_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPolygonStipple", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPolygonStipple_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPopAttrib", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPopAttrib_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPopClientAttrib", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPopClientAttrib_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPopMatrix", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPopMatrix_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPopName", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPopName_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPushAttrib", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPushAttrib_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPushClientAttrib", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPushClientAttrib_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPushMatrix", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPushMatrix_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlPushName", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlPushName_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos2d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos2d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos2dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos2dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos2f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos2f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos2fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos2fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos2i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos2i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos2iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos2iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos2s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos2s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos2sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos2sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos3d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos3d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos3dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos3dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos3f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos3f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos3fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos3fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos3i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos3i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos3iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos3iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos3s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos3s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos3sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos3sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos4d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos4d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos4dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos4dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos4f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos4f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos4fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos4fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos4i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos4i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos4iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos4iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos4s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos4s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRasterPos4sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRasterPos4sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlReadBuffer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlReadBuffer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlReadPixels", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlReadPixels_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRectd", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRectd_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRectdv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRectdv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRectf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRectf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRectfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRectfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRecti", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRecti_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRectiv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRectiv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRects", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRects_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRectsv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRectsv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRenderMode", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRenderMode_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRotated", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRotated_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlRotatef", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlRotatef_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlScaled", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlScaled_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlScalef", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlScalef_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlScissor", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlScissor_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlSelectBuffer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlSelectBuffer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlShadeModel", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlShadeModel_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlStencilFunc", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlStencilFunc_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlStencilMask", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlStencilMask_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlStencilOp", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlStencilOp_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord1d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord1d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord1dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord1dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord1f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord1f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord1fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord1fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord1i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord1i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord1iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord1iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord1s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord1s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord1sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord1sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord2d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord2d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord2dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord2dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord2f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord2f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord2fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord2fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord2i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord2i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord2iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord2iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord2s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord2s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord2sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord2sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord3d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord3d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord3dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord3dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord3f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord3f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord3fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord3fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord3i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord3i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord3iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord3iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord3s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord3s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord3sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord3sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord4d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord4d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord4dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord4dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord4f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord4f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord4fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord4fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord4i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord4i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord4iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord4iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord4s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord4s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoord4sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoord4sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexCoordPointer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexCoordPointer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexEnvf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexEnvf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexEnvfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexEnvfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexEnvi", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexEnvi_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexEnviv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexEnviv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexGend", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexGend_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexGendv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexGendv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexGenf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexGenf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexGenfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexGenfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexGeni", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexGeni_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexGeniv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexGeniv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexImage1D", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexImage1D_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexImage2D", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexImage2D_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexParameterf", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexParameterf_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexParameterfv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexParameterfv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexParameteri", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexParameteri_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexParameteriv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexParameteriv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexSubImage1D", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexSubImage1D_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTexSubImage2D", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTexSubImage2D_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTranslated", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTranslated_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlTranslatef", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlTranslatef_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex2d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex2d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex2dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex2dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex2f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex2f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex2fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex2fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex2i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex2i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex2iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex2iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex2s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex2s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex2sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex2sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex3d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex3d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex3dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex3dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex3f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex3f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex3fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex3fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex3i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex3i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex3iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex3iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex3s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex3s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex3sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex3sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex4d", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex4d_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex4dv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex4dv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex4f", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex4f_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex4fv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex4fv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex4i", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex4i_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex4iv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex4iv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex4s", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex4s_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertex4sv", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertex4sv_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlVertexPointer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlVertexPointer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGlViewport", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGlViewport_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluBeginCurve", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluBeginCurve_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluBeginPolygon", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluBeginPolygon_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluBeginSurface", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluBeginSurface_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluBeginTrim", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluBeginTrim_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluCylinder", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluCylinder_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluDeleteQuadric", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluDeleteQuadric_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluDeleteTess", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluDeleteTess_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluDisk", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluDisk_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluEndCurve", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluEndCurve_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluEndPolygon", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluEndPolygon_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluEndSurface", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluEndSurface_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluEndTrim", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluEndTrim_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluErrorString", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluErrorString_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluGetString", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluGetString_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluGetTessProperty", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluGetTessProperty_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluLookAt", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluLookAt_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluNewQuadric", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluNewQuadric_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluNewTess", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluNewTess_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluNextContour", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluNextContour_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluNurbsCallback", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluNurbsCallback_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluNurbsCurve", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluNurbsCurve_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluNurbsProperty", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluNurbsProperty_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluNurbsSurface", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluNurbsSurface_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluOrtho2D", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluOrtho2D_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluPartialDisk", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluPartialDisk_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluPerspective", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluPerspective_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluPickMatrix", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluPickMatrix_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluProject", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluProject_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluPwlCurve", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluPwlCurve_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluQuadricCallback", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluQuadricCallback_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluQuadricNormals", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluQuadricNormals_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluQuadricOrientation", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluQuadricOrientation_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluQuadricTexture", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluQuadricTexture_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluScaleImage", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluScaleImage_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluSphere", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluSphere_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluTessBeginContour", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluTessBeginContour_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluTessCallback", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluTessCallback_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluTessEndContour", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluTessEndContour_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluTessEndPolygon", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluTessEndPolygon_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluTessNormal", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluTessNormal_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluTessProperty", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluTessProperty_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluTessVertex", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluTessVertex_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglGluUnProject", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglGluUnProject_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglCopyContext", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglCopyContext_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglCreateContext", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglCreateContext_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglCreateLayerContext", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglCreateLayerContext_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglDeleteContext", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglDeleteContext_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglGetCurrentContext", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglGetCurrentContext_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglGetCurrentDC", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglGetCurrentDC_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglGetProcAddress", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglGetProcAddress_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglMakeCurrent", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglMakeCurrent_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglShareLists", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglShareLists_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA_napi));
    exports.Set("windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW", Napi::Function::New(env, windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW_napi));
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
