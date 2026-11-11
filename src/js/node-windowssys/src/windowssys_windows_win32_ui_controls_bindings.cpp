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

static Napi::Value windowssys_windows_win32_ui_controls_beginBufferedAnimation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdctarget = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prctarget = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t dwformat = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppaintparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* panimationparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* phdcfrom = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* phdcto = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BeginBufferedAnimation")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, hdctarget, prctarget, dwformat, ppaintparams, panimationparams, phdcfrom, phdcto);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hdctarget;
    (void)prctarget;
    (void)dwformat;
    (void)ppaintparams;
    (void)panimationparams;
    (void)phdcfrom;
    (void)phdcto;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_beginBufferedPaint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdctarget = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* prctarget = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t dwformat = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* ppaintparams = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* phdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BeginBufferedPaint")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdctarget, prctarget, dwformat, ppaintparams, phdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdctarget;
    (void)prctarget;
    (void)dwformat;
    (void)ppaintparams;
    (void)phdc;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_beginPanningFeedback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BeginPanningFeedback")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_bufferedPaintClear_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbufferedpaint = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* prc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferedPaintClear")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbufferedpaint, prc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbufferedpaint;
    (void)prc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_bufferedPaintInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferedPaintInit")));
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

static Napi::Value windowssys_windows_win32_ui_controls_bufferedPaintRenderAnimation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdctarget = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferedPaintRenderAnimation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, hdctarget);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hdctarget;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_bufferedPaintSetAlpha_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbufferedpaint = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* prc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint8_t alpha = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferedPaintSetAlpha")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbufferedpaint, prc, alpha);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbufferedpaint;
    (void)prc;
    (void)alpha;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_bufferedPaintStopAllAnimations_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferedPaintStopAllAnimations")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_bufferedPaintUnInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferedPaintUnInit")));
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

static Napi::Value windowssys_windows_win32_ui_controls_checkDlgButton_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nidbutton = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ucheck = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckDlgButton")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdlg, nidbutton, ucheck);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdlg;
    (void)nidbutton;
    (void)ucheck;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_checkRadioButton_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nidfirstbutton = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t nidlastbutton = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t nidcheckbutton = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckRadioButton")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdlg, nidfirstbutton, nidlastbutton, nidcheckbutton);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdlg;
    (void)nidfirstbutton;
    (void)nidlastbutton;
    (void)nidcheckbutton;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_closeThemeData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThemeData")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_createMappedBitmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t idbitmap = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t wflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* lpcolormap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int32_t inummaps = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateMappedBitmap")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hinstance, idbitmap, wflags, lpcolormap, inummaps);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hinstance;
    (void)idbitmap;
    (void)wflags;
    (void)lpcolormap;
    (void)inummaps;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_createPropertySheetPageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* constpropsheetpagepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePropertySheetPageA")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(constpropsheetpagepointer);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)constpropsheetpagepointer;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_createPropertySheetPageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* constpropsheetpagepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePropertySheetPageW")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(constpropsheetpagepointer);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)constpropsheetpagepointer;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_createStatusWindowA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t style = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpsztext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t wid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateStatusWindowA")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(style, lpsztext, hwndparent, wid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)style;
    (void)lpsztext;
    (void)hwndparent;
    (void)wid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_createStatusWindowW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t style = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpsztext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hwndparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t wid = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateStatusWindowW")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(style, lpsztext, hwndparent, wid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)style;
    (void)lpsztext;
    (void)hwndparent;
    (void)wid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_createSyntheticPointerDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t pointertype = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t maxcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t mode = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateSyntheticPointerDevice")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pointertype, maxcount, mode);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)pointertype;
    (void)maxcount;
    (void)mode;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_createToolbarEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t ws = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t wid = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t nbitmaps = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* hbminst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint64_t wbmid = km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0;
    void* lpbuttons = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t inumbuttons = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t dxbutton = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    int32_t dybutton = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    int32_t dxbitmap = static_cast<int32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    int32_t dybitmap = static_cast<int32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
    uint32_t ustructsize = static_cast<uint32_t>(km_info.Length() > 12 ? km_info[12].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*, uint64_t, void*, int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateToolbarEx")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, ws, wid, nbitmaps, hbminst, wbmid, lpbuttons, inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hwnd;
    (void)ws;
    (void)wid;
    (void)nbitmaps;
    (void)hbminst;
    (void)wbmid;
    (void)lpbuttons;
    (void)inumbuttons;
    (void)dxbutton;
    (void)dybutton;
    (void)dxbitmap;
    (void)dybitmap;
    (void)ustructsize;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_createUpDownControl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwstyle = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cx = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t cy = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* hparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    int32_t nid = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* hinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* hbuddy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
    int32_t nupper = static_cast<int32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
    int32_t nlower = static_cast<int32_t>(km_info.Length() > 10 ? km_info[10].ToNumber().Int32Value() : 0);
    int32_t npos = static_cast<int32_t>(km_info.Length() > 11 ? km_info[11].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, void*, int32_t, void*, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateUpDownControl")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwstyle, x, y, cx, cy, hparent, nid, hinst, hbuddy, nupper, nlower, npos);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)hparent;
    (void)nid;
    (void)hinst;
    (void)hbuddy;
    (void)nupper;
    (void)nlower;
    (void)npos;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaClone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdpanew = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_Clone")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa, hdpanew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpa;
    (void)hdpanew;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t citemgrow = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_Create")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(citemgrow);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)citemgrow;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaCreateEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t cpgrow = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* hheap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_CreateEx")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cpgrow, hheap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cpgrow;
    (void)hheap;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaDeleteAllPtrs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_DeleteAllPtrs")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaDeletePtr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_DeletePtr")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa, i);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hdpa;
    (void)i;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_Destroy")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaDestroyCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pfncb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_DestroyCallback")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hdpa, pfncb, pdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hdpa;
    (void)pfncb;
    (void)pdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaEnumCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pfncb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_EnumCallback")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hdpa, pfncb, pdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hdpa;
    (void)pfncb;
    (void)pdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaGetPtr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t i = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_GetPtr")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa, i);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hdpa;
    (void)i;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaGetPtrIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* p = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_GetPtrIndex")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa, p);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpa;
    (void)p;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaGetSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_GetSize")));
    }
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdpa;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaGrow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t cp = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_Grow")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pdpa, cp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdpa;
    (void)cp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaInsertPtr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* p = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_InsertPtr")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa, i, p);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpa;
    (void)i;
    (void)p;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaLoadStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phdpa = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvinstdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_LoadStream")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(phdpa, pfn, pstream, pvinstdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phdpa;
    (void)pfn;
    (void)pstream;
    (void)pvinstdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaMerge_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpadest = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int64_t hdpasrc = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfncompare = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pfnmerge = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t lparam = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_Merge")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpadest, hdpasrc, dwflags, pfncompare, pfnmerge, lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpadest;
    (void)hdpasrc;
    (void)dwflags;
    (void)pfncompare;
    (void)pfnmerge;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaSaveStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pfn = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvinstdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_SaveStream")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa, pfn, pstream, pvinstdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpa;
    (void)pfn;
    (void)pstream;
    (void)pvinstdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaSearch_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pfind = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t istart = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pfncompare = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    int64_t lparam = km_info.Length() > 4 ? km_napi_arg_i64(km_info[4]) : 0;
    uint32_t options = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_Search")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa, pfind, istart, pfncompare, lparam, options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpa;
    (void)pfind;
    (void)istart;
    (void)pfncompare;
    (void)lparam;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaSetPtr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* p = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_SetPtr")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa, i, p);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpa;
    (void)i;
    (void)p;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dpaSort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pfncompare = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t lparam = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_Sort")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdpa, pfncompare, lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdpa;
    (void)pfncompare;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaClone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_Clone")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdsa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdsa;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t cbitem = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t citemgrow = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_Create")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cbitem, citemgrow);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cbitem;
    (void)citemgrow;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaDeleteAllItems_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_DeleteAllItems")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdsa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdsa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaDeleteItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_DeleteItem")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdsa, i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdsa;
    (void)i;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_Destroy")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdsa);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdsa;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaDestroyCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pfncb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_DestroyCallback")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hdsa, pfncb, pdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hdsa;
    (void)pfncb;
    (void)pdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaEnumCallback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pfncb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_EnumCallback")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hdsa, pfncb, pdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hdsa;
    (void)pfncb;
    (void)pdata;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaGetItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_GetItem")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdsa, i, pitem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaGetItemPtr_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_GetItemPtr")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdsa, i);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hdsa;
    (void)i;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaGetSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_GetSize")));
    }
    uint64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdsa);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdsa;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaInsertItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_InsertItem")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdsa, i, pitem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaSetItem_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pitem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_SetItem")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdsa, i, pitem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dsaSort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t pdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pfncompare = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t lparam = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_Sort")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pdsa, pfncompare, lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdsa;
    (void)pfncompare;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_destroyPropertySheetPage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroyPropertySheetPage")));
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

static Napi::Value windowssys_windows_win32_ui_controls_destroySyntheticPointerDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* device = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroySyntheticPointerDevice")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(device);
    } else {
        errno = ENOSYS;
    }
#else
    (void)device;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_dlgDirListA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppathspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nidlistbox = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t nidstaticpath = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ufiletype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DlgDirListA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdlg, lppathspec, nidlistbox, nidstaticpath, ufiletype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidlistbox;
    (void)nidstaticpath;
    (void)ufiletype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dlgDirListComboBoxA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppathspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nidcombobox = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t nidstaticpath = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ufiletype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DlgDirListComboBoxA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdlg, lppathspec, nidcombobox, nidstaticpath, ufiletype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidcombobox;
    (void)nidstaticpath;
    (void)ufiletype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dlgDirListComboBoxW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppathspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nidcombobox = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t nidstaticpath = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ufiletype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DlgDirListComboBoxW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdlg, lppathspec, nidcombobox, nidstaticpath, ufiletype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidcombobox;
    (void)nidstaticpath;
    (void)ufiletype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dlgDirListW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lppathspec = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nidlistbox = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t nidstaticpath = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t ufiletype = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DlgDirListW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdlg, lppathspec, nidlistbox, nidstaticpath, ufiletype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidlistbox;
    (void)nidstaticpath;
    (void)ufiletype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnddlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cchout = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t idcombobox = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DlgDirSelectComboBoxExA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnddlg, lpstring, cchout, idcombobox);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)cchout;
    (void)idcombobox;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnddlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cchout = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t idcombobox = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DlgDirSelectComboBoxExW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnddlg, lpstring, cchout, idcombobox);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)cchout;
    (void)idcombobox;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dlgDirSelectExA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnddlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t chcount = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t idlistbox = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DlgDirSelectExA")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnddlg, lpstring, chcount, idlistbox);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)chcount;
    (void)idlistbox;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_dlgDirSelectExW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnddlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpstring = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t chcount = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t idlistbox = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DlgDirSelectExW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnddlg, lpstring, chcount, idlistbox);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)chcount;
    (void)idlistbox;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_drawInsert_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* handparent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hlb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t nitem = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawInsert")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(handparent, hlb, nitem);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handparent;
    (void)hlb;
    (void)nitem;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_drawShadowText_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psztext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t cch = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* prc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t crtext = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t crshadow = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t ixoffset = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    int32_t iyoffset = static_cast<int32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawShadowText")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdc, psztext, cch, prc, dwflags, crtext, crshadow, ixoffset, iyoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)psztext;
    (void)cch;
    (void)prc;
    (void)dwflags;
    (void)crtext;
    (void)crshadow;
    (void)ixoffset;
    (void)iyoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_drawStatusTextA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lprc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psztext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t uflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawStatusTextA")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hdc, lprc, psztext, uflags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hdc;
    (void)lprc;
    (void)psztext;
    (void)uflags;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_drawStatusTextW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lprc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* psztext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t uflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawStatusTextW")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hdc, lprc, psztext, uflags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hdc;
    (void)lprc;
    (void)psztext;
    (void)uflags;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_drawThemeBackground_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* prect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcliprect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawThemeBackground")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, prect, pcliprect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)pcliprect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_drawThemeBackgroundEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* prect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* poptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawThemeBackgroundEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, prect, poptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)poptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_drawThemeEdge_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pdestrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t uedge = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t uflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pcontentrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawThemeEdge")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, pdestrect, uedge, uflags, pcontentrect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pdestrect;
    (void)uedge;
    (void)uflags;
    (void)pcontentrect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_drawThemeIcon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* prect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int64_t himl = km_info.Length() > 5 ? km_napi_arg_i64(km_info[5]) : 0;
    int32_t iimageindex = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawThemeIcon")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, prect, himl, iimageindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)himl;
    (void)iimageindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_drawThemeParentBackground_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* prc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawThemeParentBackground")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, hdc, prc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hdc;
    (void)prc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_drawThemeParentBackgroundEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* prc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawThemeParentBackgroundEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, hdc, dwflags, prc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)hdc;
    (void)dwflags;
    (void)prc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_drawThemeText_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psztext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t cchtext = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwtextflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t dwtextflags2 = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    void* prect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawThemeText")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, psztext, cchtext, dwtextflags, dwtextflags2, prect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)psztext;
    (void)cchtext;
    (void)dwtextflags;
    (void)dwtextflags2;
    (void)prect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_drawThemeTextEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psztext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t cchtext = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwtextflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* prect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* poptions = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DrawThemeTextEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, psztext, cchtext, dwtextflags, prect, poptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)psztext;
    (void)cchtext;
    (void)dwtextflags;
    (void)prect;
    (void)poptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_enableScrollBar_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t wsbflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t warrows = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnableScrollBar")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, wsbflags, warrows);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)wsbflags;
    (void)warrows;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_enableThemeDialogTexture_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnableThemeDialogTexture")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_enableTheming_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fenable = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnableTheming")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fenable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fenable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_endBufferedAnimation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbpanimation = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t fupdatetarget = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EndBufferedAnimation")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbpanimation, fupdatetarget);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbpanimation;
    (void)fupdatetarget;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_endBufferedPaint_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbufferedpaint = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t fupdatetarget = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EndBufferedPaint")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbufferedpaint, fupdatetarget);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbufferedpaint;
    (void)fupdatetarget;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_endPanningFeedback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t fanimateback = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EndPanningFeedback")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, fanimateback);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)fanimateback;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_evaluateProximityToPolygon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t numvertices = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* controlpolygon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* phittestinginput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pproximityeval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvaluateProximityToPolygon")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(numvertices, controlpolygon, phittestinginput, pproximityeval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)numvertices;
    (void)controlpolygon;
    (void)phittestinginput;
    (void)pproximityeval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_evaluateProximityToRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* controlboundingbox = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* phittestinginput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pproximityeval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvaluateProximityToRect")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(controlboundingbox, phittestinginput, pproximityeval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)controlboundingbox;
    (void)phittestinginput;
    (void)pproximityeval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_flatSbEnableScrollBar_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t param1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t param2 = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_EnableScrollBar")));
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

static Napi::Value windowssys_windows_win32_ui_controls_flatSbGetScrollInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t code = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_GetScrollInfo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, code, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)code;
    (void)param2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_flatSbGetScrollPos_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t code = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_GetScrollPos")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, code);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)code;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_flatSbGetScrollProp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t propindex = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_GetScrollProp")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, propindex, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)propindex;
    (void)param2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_flatSbGetScrollRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t code = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* param2 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* param3 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_GetScrollRange")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, code, param2, param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)code;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_flatSbSetScrollInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t code = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* psi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t fredraw = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_SetScrollInfo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, code, psi, fredraw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)code;
    (void)psi;
    (void)fredraw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_flatSbSetScrollPos_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t code = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t pos = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t fredraw = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_SetScrollPos")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, code, pos, fredraw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)code;
    (void)pos;
    (void)fredraw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_flatSbSetScrollProp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arg_1_index = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t newvalue = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int32_t param3 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_SetScrollProp")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, arg_1_index, newvalue, param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)arg_1_index;
    (void)newvalue;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_flatSbSetScrollRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t code = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t min = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t max = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t fredraw = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_SetScrollRange")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, code, min, max, fredraw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)code;
    (void)min;
    (void)max;
    (void)fredraw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_flatSbShowScrollBar_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t code = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t param2 = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "FlatSB_ShowScrollBar")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0, code, param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)code;
    (void)param2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getBufferedPaintBits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbufferedpaint = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* ppbbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcxrow = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBufferedPaintBits")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbufferedpaint, ppbbuffer, pcxrow);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbufferedpaint;
    (void)ppbbuffer;
    (void)pcxrow;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getBufferedPaintDC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbufferedpaint = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBufferedPaintDC")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbufferedpaint);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hbufferedpaint;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_getBufferedPaintTargetDC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbufferedpaint = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBufferedPaintTargetDC")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbufferedpaint);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)hbufferedpaint;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_getBufferedPaintTargetRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbufferedpaint = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* prc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBufferedPaintTargetRect")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hbufferedpaint, prc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbufferedpaint;
    (void)prc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getComboBoxInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndcombo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcbi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetComboBoxInfo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwndcombo, pcbi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndcombo;
    (void)pcbi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getCurrentThemeName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszthemefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t cchmaxnamechars = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszcolorbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cchmaxcolorchars = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pszsizebuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t cchmaxsizechars = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCurrentThemeName")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszthemefilename, cchmaxnamechars, pszcolorbuff, cchmaxcolorchars, pszsizebuff, cchmaxsizechars);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszthemefilename;
    (void)cchmaxnamechars;
    (void)pszcolorbuff;
    (void)cchmaxcolorchars;
    (void)pszsizebuff;
    (void)cchmaxsizechars;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getEffectiveClientRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lprc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetEffectiveClientRect")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(hwnd, lprc, lpinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hwnd;
    (void)lprc;
    (void)lpinfo;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_getListBoxInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetListBoxInfo")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getMUILanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMUILanguage")));
    }
    uint16_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeAnimationProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t istoryboardid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t itargetid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t eproperty = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pvproperty = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbsizeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeAnimationProperty")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, istoryboardid, itargetid, eproperty, pvproperty, cbsize, pcbsizeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)istoryboardid;
    (void)itargetid;
    (void)eproperty;
    (void)pvproperty;
    (void)cbsize;
    (void)pcbsizeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeAnimationTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t istoryboardid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t itargetid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwtransformindex = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ptransform = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t cbsize = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pcbsizeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeAnimationTransform")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, istoryboardid, itargetid, dwtransformindex, ptransform, cbsize, pcbsizeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)istoryboardid;
    (void)itargetid;
    (void)dwtransformindex;
    (void)ptransform;
    (void)cbsize;
    (void)pcbsizeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeAppProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeAppProperties")));
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

static Napi::Value windowssys_windows_win32_ui_controls_getThemeBackgroundContentRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pboundingrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcontentrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeBackgroundContentRect")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, pboundingrect, pcontentrect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pboundingrect;
    (void)pcontentrect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeBackgroundExtent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcontentrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pextentrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeBackgroundExtent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, pcontentrect, pextentrect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pcontentrect;
    (void)pextentrect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeBackgroundRegion_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* prect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pregion = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeBackgroundRegion")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, prect, pregion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)pregion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeBitmap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* phbitmap = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeBitmap")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, dwflags, phbitmap);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)dwflags;
    (void)phbitmap;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeBool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pfval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeBool")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, pfval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pfval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcolor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeColor")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, pcolor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pcolor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeDocumentationProperty_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pszthemename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszpropertyname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszvaluebuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cchmaxvalchars = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeDocumentationProperty")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pszthemename, pszpropertyname, pszvaluebuff, cchmaxvalchars);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszthemename;
    (void)pszpropertyname;
    (void)pszvaluebuff;
    (void)cchmaxvalchars;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeEnumValue_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pival = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeEnumValue")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, pival);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeFilename_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pszthemefilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t cchmaxbuffchars = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeFilename")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, pszthemefilename, cchmaxbuffchars);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pszthemefilename;
    (void)cchmaxbuffchars;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeFont_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pfont = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeFont")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, ipropid, pfont);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pfont;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeInt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pival = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeInt")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, pival);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeIntList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pintlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeIntList")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, pintlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pintlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeMargins_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* prc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* pmargins = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeMargins")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, ipropid, prc, pmargins);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)prc;
    (void)pmargins;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeMetric_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pival = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeMetric")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, ipropid, pival);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemePartSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* prc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t esize = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* psz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemePartSize")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, prc, esize, psz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prc;
    (void)esize;
    (void)psz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemePosition_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppoint = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemePosition")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, ppoint);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)ppoint;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemePropertyOrigin_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* porigin = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemePropertyOrigin")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, porigin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)porigin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeRect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* prect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeRect")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, prect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)prect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeStream_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ppvstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pcbstream = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* hinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeStream")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, ppvstream, pcbstream, hinst);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)ppvstream;
    (void)pcbstream;
    (void)hinst;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pszbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t cchmaxbuffchars = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeString")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid, ipropid, pszbuff, cchmaxbuffchars);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pszbuff;
    (void)cchmaxbuffchars;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeSysBool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t iboolid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeSysBool")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, iboolid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)iboolid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeSysColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t icolorid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeSysColor")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, icolorid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)htheme;
    (void)icolorid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeSysColorBrush_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t icolorid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeSysColorBrush")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, icolorid);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)htheme;
    (void)icolorid;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeSysFont_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ifontid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* plf = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeSysFont")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ifontid, plf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ifontid;
    (void)plf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeSysInt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t iintid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pivalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeSysInt")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, iintid, pivalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)iintid;
    (void)pivalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeSysSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t isizeid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeSysSize")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, isizeid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)isizeid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeSysString_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t istringid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pszstringbuff = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t cchmaxstringchars = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeSysString")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, istringid, pszstringbuff, cchmaxstringchars);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)istringid;
    (void)pszstringbuff;
    (void)cchmaxstringchars;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeTextExtent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* psztext = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t cchcharcount = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwtextflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    void* pboundingrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    void* pextentrect = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 8 ? km_napi_arg_u64(km_info[8]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeTextExtent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, psztext, cchcharcount, dwtextflags, pboundingrect, pextentrect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)psztext;
    (void)cchcharcount;
    (void)dwtextflags;
    (void)pboundingrect;
    (void)pextentrect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeTextMetrics_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* ptm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeTextMetrics")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, hdc, ipartid, istateid, ptm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ptm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeTimingFunction_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t itimingfunctionid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptimingfunction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pcbsizeout = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeTimingFunction")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, itimingfunctionid, ptimingfunction, cbsize, pcbsizeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)itimingfunctionid;
    (void)ptimingfunction;
    (void)cbsize;
    (void)pcbsizeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getThemeTransitionDuration_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateidfrom = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t istateidto = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t ipropid = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pdwduration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeTransitionDuration")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateidfrom, istateidto, ipropid, pdwduration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateidfrom;
    (void)istateidto;
    (void)ipropid;
    (void)pdwduration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getWindowFeedbackSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t feedback = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* psize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* config = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetWindowFeedbackSetting")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, feedback, dwflags, psize, config);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)feedback;
    (void)dwflags;
    (void)psize;
    (void)config;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_getWindowTheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetWindowTheme")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_himagelistQueryInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ppv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "HIMAGELIST_QueryInterface")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, riid, ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListAdd_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hbmimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* hbmmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Add")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, hbmimage, hbmmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)hbmimage;
    (void)hbmmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListAddMasked_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* hbmimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t crmask = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_AddMasked")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, hbmimage, crmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)hbmimage;
    (void)crmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListBeginDrag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himltrack = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t itrack = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t dxhotspot = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t dyhotspot = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_BeginDrag")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himltrack, itrack, dxhotspot, dyhotspot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himltrack;
    (void)itrack;
    (void)dxhotspot;
    (void)dyhotspot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListCoCreateInstance_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* rclsid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* punkouter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_CoCreateInstance")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(rclsid, punkouter, riid, ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rclsid;
    (void)punkouter;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListCopy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himldst = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t idst = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t himlsrc = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int32_t isrc = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t uflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Copy")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himldst, idst, himlsrc, isrc, uflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himldst;
    (void)idst;
    (void)himlsrc;
    (void)isrc;
    (void)uflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListCreate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t cx = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t cy = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cinitial = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t cgrow = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Create")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(cx, cy, flags, cinitial, cgrow);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cx;
    (void)cy;
    (void)flags;
    (void)cinitial;
    (void)cgrow;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListDestroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Destroy")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListDragEnter_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_DragEnter")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwndlock, x, y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndlock;
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListDragLeave_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_DragLeave")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwndlock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndlock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListDragMove_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t x = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_DragMove")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(x, y);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListDragShowNolock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fshow = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_DragShowNolock")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(fshow);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fshow;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListDraw_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hdcdst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t fstyle = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Draw")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, i, hdcdst, x, y, fstyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)i;
    (void)hdcdst;
    (void)x;
    (void)y;
    (void)fstyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListDrawEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hdcdst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t x = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t y = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t dx = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t dy = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    uint32_t rgbbk = static_cast<uint32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t rgbfg = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    uint32_t fstyle = static_cast<uint32_t>(km_info.Length() > 9 ? km_info[9].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_DrawEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, i, hdcdst, x, y, dx, dy, rgbbk, rgbfg, fstyle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)i;
    (void)hdcdst;
    (void)x;
    (void)y;
    (void)dx;
    (void)dy;
    (void)rgbbk;
    (void)rgbfg;
    (void)fstyle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListDrawIndirect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pimldp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_DrawIndirect")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pimldp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pimldp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListDuplicate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Duplicate")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListEndDrag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_EndDrag")));
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

static Napi::Value windowssys_windows_win32_ui_controls_imageListGetBkColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_GetBkColor")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)himl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListGetDragImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppt = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ppthotspot = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_GetDragImage")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppt, ppthotspot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppt;
    (void)ppthotspot;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListGetIcon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t flags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_GetIcon")));
    }
    void* km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, i, flags);
    } else {
        errno = ENOSYS;
        km_res = nullptr;
    }
#else
    (void)himl;
    (void)i;
    (void)flags;
    errno = ENOSYS;
    void* km_res = nullptr;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListGetIconSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* cx = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* cy = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_GetIconSize")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, cx, cy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)cx;
    (void)cy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListGetImageCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_GetImageCount")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListGetImageInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pimageinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_GetImageInfo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, i, pimageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)i;
    (void)pimageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListLoadImageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbmp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cx = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cgrow = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t crmask = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t utype = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t uflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_LoadImageA")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hi, lpbmp, cx, cgrow, crmask, utype, uflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hi;
    (void)lpbmp;
    (void)cx;
    (void)cgrow;
    (void)crmask;
    (void)utype;
    (void)uflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListLoadImageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbmp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cx = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cgrow = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t crmask = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t utype = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t uflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_LoadImageW")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hi, lpbmp, cx, cgrow, crmask, utype, uflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hi;
    (void)lpbmp;
    (void)cx;
    (void)cgrow;
    (void)crmask;
    (void)utype;
    (void)uflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListMerge_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl1 = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i1 = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int64_t himl2 = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    int32_t i2 = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t dx = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t dy = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int32_t, int64_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Merge")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl1, i1, himl2, i2, dx, dy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl1;
    (void)i1;
    (void)himl2;
    (void)i2;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListRead_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Read")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(pstm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstm;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListReadEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* riid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* ppv = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_ReadEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(dwflags, pstm, riid, ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pstm;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListRemove_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Remove")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, i);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)i;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListReplace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hbmimage = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* hbmmask = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Replace")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, i, hbmimage, hbmmask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)i;
    (void)hbmimage;
    (void)hbmmask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListReplaceIcon_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t i = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* hicon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_ReplaceIcon")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, i, hicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)i;
    (void)hicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListSetBkColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t clrbk = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_SetBkColor")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, clrbk);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)himl;
    (void)clrbk;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListSetDragCursorImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himldrag = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t idrag = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t dxhotspot = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t dyhotspot = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_SetDragCursorImage")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himldrag, idrag, dxhotspot, dyhotspot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himldrag;
    (void)idrag;
    (void)dxhotspot;
    (void)dyhotspot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListSetIconSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t cx = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t cy = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_SetIconSize")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, cx, cy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)cx;
    (void)cy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListSetImageCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t unewcount = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_SetImageCount")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, unewcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)unewcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListSetOverlayImage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t iimage = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t ioverlay = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_SetOverlayImage")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, iimage, ioverlay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)iimage;
    (void)ioverlay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListWrite_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Write")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, pstm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)pstm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_imageListWriteEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_WriteEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(himl, dwflags, pstm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)himl;
    (void)dwflags;
    (void)pstm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_initCommonControls_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitCommonControls")));
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

static Napi::Value windowssys_windows_win32_ui_controls_initCommonControlsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* picce = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitCommonControlsEx")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(picce);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)picce;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_initMUILanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t uilang = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitMUILanguage")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(uilang);
    } else {
        errno = ENOSYS;
    }
#else
    (void)uilang;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_initializeFlatSB_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeFlatSB")));
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

static Napi::Value windowssys_windows_win32_ui_controls_isAppThemed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsAppThemed")));
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

static Napi::Value windowssys_windows_win32_ui_controls_isCharLowerW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t ch = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsCharLowerW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ch);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ch;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_isCompositionActive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsCompositionActive")));
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

static Napi::Value windowssys_windows_win32_ui_controls_isDlgButtonChecked_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdlg = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nidbutton = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsDlgButtonChecked")));
    }
    uint32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hdlg, nidbutton);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hdlg;
    (void)nidbutton;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_isThemeActive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThemeActive")));
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

static Napi::Value windowssys_windows_win32_ui_controls_isThemeBackgroundPartiallyTransparent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThemeBackgroundPartiallyTransparent")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_isThemeDialogTextureEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThemeDialogTextureEnabled")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_isThemePartDefined_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    int32_t ipartid = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t istateid = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThemePartDefined")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(htheme, ipartid, istateid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_loadIconMetric_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t lims = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* phico = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LoadIconMetric")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hinst, pszname, lims, phico);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinst;
    (void)pszname;
    (void)lims;
    (void)phico;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_loadIconWithScaleDown_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cx = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cy = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* phico = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "LoadIconWithScaleDown")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hinst, pszname, cx, cy, phico);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinst;
    (void)pszname;
    (void)cx;
    (void)cy;
    (void)phico;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_makeDragList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hlb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MakeDragList")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hlb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_menuHelp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t umsg = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint64_t wparam = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    int64_t lparam = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    void* hmainmenu = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* hinst = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* hwndstatus = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* lpwids = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint64_t, int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MenuHelp")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(umsg, wparam, lparam, hmainmenu, hinst, hwndstatus, lpwids);
    } else {
        errno = ENOSYS;
    }
#else
    (void)umsg;
    (void)wparam;
    (void)lparam;
    (void)hmainmenu;
    (void)hinst;
    (void)hwndstatus;
    (void)lpwids;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_openThemeData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszclasslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenThemeData")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, pszclasslist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pszclasslist;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_openThemeDataEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszclasslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenThemeDataEx")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, pszclasslist, dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pszclasslist;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_packTouchHitTestingProximityEvaluation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* phittestinginput = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pproximityeval = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PackTouchHitTestingProximityEvaluation")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(phittestinginput, pproximityeval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phittestinginput;
    (void)pproximityeval;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_propertySheetA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropertySheetA")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_propertySheetW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropertySheetW")));
    }
    int64_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_registerPointerDeviceNotifications_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* window = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t notifyrange = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterPointerDeviceNotifications")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(window, notifyrange);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)window;
    (void)notifyrange;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_registerTouchHitTestingWindow_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t value = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterTouchHitTestingWindow")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_setScrollInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nbar = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpsi = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t redraw = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetScrollInfo")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, nbar, lpsi, redraw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)nbar;
    (void)lpsi;
    (void)redraw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_setScrollPos_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nbar = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t npos = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t bredraw = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetScrollPos")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, nbar, npos, bredraw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)nbar;
    (void)npos;
    (void)bredraw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_setScrollRange_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t nbar = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t nminpos = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t nmaxpos = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t bredraw = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetScrollRange")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, nbar, nminpos, nmaxpos, bredraw);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)nbar;
    (void)nminpos;
    (void)nmaxpos;
    (void)bredraw;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_setThemeAppProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThemeAppProperties")));
    }
    if (km_fn_ptr != nullptr) {
        km_fn_ptr(dwflags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwflags;
    errno = ENOSYS;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_setWindowFeedbackSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t feedback = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* configuration = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetWindowFeedbackSetting")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, feedback, dwflags, size, configuration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)feedback;
    (void)dwflags;
    (void)size;
    (void)configuration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_setWindowTheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pszsubappname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszsubidlist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetWindowTheme")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, pszsubappname, pszsubidlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pszsubappname;
    (void)pszsubidlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_setWindowThemeAttribute_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t eattribute = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pvattribute = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t cbattribute = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetWindowThemeAttribute")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, eattribute, pvattribute, cbattribute);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)eattribute;
    (void)pvattribute;
    (void)cbattribute;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_showHideMenuCtl_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint64_t uflags = km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0;
    void* lpinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ShowHideMenuCtl")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, uflags, lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)uflags;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_showScrollBar_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t wbar = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t bshow = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ShowScrollBar")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, wbar, bshow);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)wbar;
    (void)bshow;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_strSetPtrW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ppsz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* psz = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "Str_SetPtrW")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ppsz, psz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppsz;
    (void)psz;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_taskDialog_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndowner = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hinstance = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszwindowtitle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pszmaininstruction = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pszcontent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t dwcommonbuttons = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pszicon = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pnbutton = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TaskDialog")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwndowner, hinstance, pszwindowtitle, pszmaininstruction, pszcontent, dwcommonbuttons, pszicon, pnbutton);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndowner;
    (void)hinstance;
    (void)pszwindowtitle;
    (void)pszmaininstruction;
    (void)pszcontent;
    (void)dwcommonbuttons;
    (void)pszicon;
    (void)pnbutton;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_taskDialogIndirect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* ptaskconfig = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pnbutton = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pnradiobutton = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pfverificationflagchecked = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TaskDialogIndirect")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(ptaskconfig, pnbutton, pnradiobutton, pfverificationflagchecked);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptaskconfig;
    (void)pnbutton;
    (void)pnradiobutton;
    (void)pfverificationflagchecked;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_uninitializeFlatSB_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UninitializeFlatSB")));
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

static Napi::Value windowssys_windows_win32_ui_controls_updatePanningFeedback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t ltotaloverpanoffsetx = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t ltotaloverpanoffsety = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t fininertia = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UpdatePanningFeedback")));
    }
    int32_t km_res;
    if (km_fn_ptr != nullptr) {
        km_res = km_fn_ptr(hwnd, ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)ltotaloverpanoffsetx;
    (void)ltotaloverpanoffsety;
    (void)fininertia;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_ui_controls_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_ui_controls_beginBufferedAnimation", Napi::Function::New(env, windowssys_windows_win32_ui_controls_beginBufferedAnimation_napi));
    exports.Set("windowssys_windows_win32_ui_controls_beginBufferedPaint", Napi::Function::New(env, windowssys_windows_win32_ui_controls_beginBufferedPaint_napi));
    exports.Set("windowssys_windows_win32_ui_controls_beginPanningFeedback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_beginPanningFeedback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_bufferedPaintClear", Napi::Function::New(env, windowssys_windows_win32_ui_controls_bufferedPaintClear_napi));
    exports.Set("windowssys_windows_win32_ui_controls_bufferedPaintInit", Napi::Function::New(env, windowssys_windows_win32_ui_controls_bufferedPaintInit_napi));
    exports.Set("windowssys_windows_win32_ui_controls_bufferedPaintRenderAnimation", Napi::Function::New(env, windowssys_windows_win32_ui_controls_bufferedPaintRenderAnimation_napi));
    exports.Set("windowssys_windows_win32_ui_controls_bufferedPaintSetAlpha", Napi::Function::New(env, windowssys_windows_win32_ui_controls_bufferedPaintSetAlpha_napi));
    exports.Set("windowssys_windows_win32_ui_controls_bufferedPaintStopAllAnimations", Napi::Function::New(env, windowssys_windows_win32_ui_controls_bufferedPaintStopAllAnimations_napi));
    exports.Set("windowssys_windows_win32_ui_controls_bufferedPaintUnInit", Napi::Function::New(env, windowssys_windows_win32_ui_controls_bufferedPaintUnInit_napi));
    exports.Set("windowssys_windows_win32_ui_controls_checkDlgButton", Napi::Function::New(env, windowssys_windows_win32_ui_controls_checkDlgButton_napi));
    exports.Set("windowssys_windows_win32_ui_controls_checkRadioButton", Napi::Function::New(env, windowssys_windows_win32_ui_controls_checkRadioButton_napi));
    exports.Set("windowssys_windows_win32_ui_controls_closeThemeData", Napi::Function::New(env, windowssys_windows_win32_ui_controls_closeThemeData_napi));
    exports.Set("windowssys_windows_win32_ui_controls_createMappedBitmap", Napi::Function::New(env, windowssys_windows_win32_ui_controls_createMappedBitmap_napi));
    exports.Set("windowssys_windows_win32_ui_controls_createPropertySheetPageA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_createPropertySheetPageA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_createPropertySheetPageW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_createPropertySheetPageW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_createStatusWindowA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_createStatusWindowA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_createStatusWindowW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_createStatusWindowW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_createSyntheticPointerDevice", Napi::Function::New(env, windowssys_windows_win32_ui_controls_createSyntheticPointerDevice_napi));
    exports.Set("windowssys_windows_win32_ui_controls_createToolbarEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_createToolbarEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_createUpDownControl", Napi::Function::New(env, windowssys_windows_win32_ui_controls_createUpDownControl_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaClone", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaClone_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaCreate", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaCreate_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaCreateEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaCreateEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaDeleteAllPtrs", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaDeleteAllPtrs_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaDeletePtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaDeletePtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaDestroy", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaDestroy_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaDestroyCallback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaDestroyCallback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaEnumCallback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaEnumCallback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaGetPtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaGetPtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaGetPtrIndex", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaGetPtrIndex_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaGetSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaGetSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaGrow", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaGrow_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaInsertPtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaInsertPtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaLoadStream", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaLoadStream_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaMerge", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaMerge_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaSaveStream", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaSaveStream_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaSearch", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaSearch_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaSetPtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaSetPtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dpaSort", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dpaSort_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaClone", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaClone_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaCreate", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaCreate_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaDeleteAllItems", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaDeleteAllItems_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaDeleteItem", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaDeleteItem_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaDestroy", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaDestroy_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaDestroyCallback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaDestroyCallback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaEnumCallback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaEnumCallback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaGetItem", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaGetItem_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaGetItemPtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaGetItemPtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaGetSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaGetSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaInsertItem", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaInsertItem_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaSetItem", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaSetItem_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dsaSort", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dsaSort_napi));
    exports.Set("windowssys_windows_win32_ui_controls_destroyPropertySheetPage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_destroyPropertySheetPage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_destroySyntheticPointerDevice", Napi::Function::New(env, windowssys_windows_win32_ui_controls_destroySyntheticPointerDevice_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dlgDirListA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dlgDirListA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dlgDirListComboBoxA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dlgDirListComboBoxA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dlgDirListComboBoxW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dlgDirListComboBoxW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dlgDirListW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dlgDirListW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dlgDirSelectExA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dlgDirSelectExA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_dlgDirSelectExW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_dlgDirSelectExW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawInsert", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawInsert_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawShadowText", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawShadowText_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawStatusTextA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawStatusTextA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawStatusTextW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawStatusTextW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawThemeBackground", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawThemeBackground_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawThemeBackgroundEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawThemeBackgroundEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawThemeEdge", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawThemeEdge_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawThemeIcon", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawThemeIcon_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawThemeParentBackground", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawThemeParentBackground_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawThemeParentBackgroundEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawThemeParentBackgroundEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawThemeText", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawThemeText_napi));
    exports.Set("windowssys_windows_win32_ui_controls_drawThemeTextEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_drawThemeTextEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_enableScrollBar", Napi::Function::New(env, windowssys_windows_win32_ui_controls_enableScrollBar_napi));
    exports.Set("windowssys_windows_win32_ui_controls_enableThemeDialogTexture", Napi::Function::New(env, windowssys_windows_win32_ui_controls_enableThemeDialogTexture_napi));
    exports.Set("windowssys_windows_win32_ui_controls_enableTheming", Napi::Function::New(env, windowssys_windows_win32_ui_controls_enableTheming_napi));
    exports.Set("windowssys_windows_win32_ui_controls_endBufferedAnimation", Napi::Function::New(env, windowssys_windows_win32_ui_controls_endBufferedAnimation_napi));
    exports.Set("windowssys_windows_win32_ui_controls_endBufferedPaint", Napi::Function::New(env, windowssys_windows_win32_ui_controls_endBufferedPaint_napi));
    exports.Set("windowssys_windows_win32_ui_controls_endPanningFeedback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_endPanningFeedback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_evaluateProximityToPolygon", Napi::Function::New(env, windowssys_windows_win32_ui_controls_evaluateProximityToPolygon_napi));
    exports.Set("windowssys_windows_win32_ui_controls_evaluateProximityToRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_evaluateProximityToRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbEnableScrollBar", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbEnableScrollBar_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbGetScrollInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbGetScrollInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbGetScrollPos", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbGetScrollPos_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbGetScrollProp", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbGetScrollProp_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbGetScrollRange", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbGetScrollRange_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbSetScrollInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbSetScrollInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbSetScrollPos", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbSetScrollPos_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbSetScrollProp", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbSetScrollProp_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbSetScrollRange", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbSetScrollRange_napi));
    exports.Set("windowssys_windows_win32_ui_controls_flatSbShowScrollBar", Napi::Function::New(env, windowssys_windows_win32_ui_controls_flatSbShowScrollBar_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getBufferedPaintBits", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getBufferedPaintBits_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getBufferedPaintDC", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getBufferedPaintDC_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getBufferedPaintTargetDC", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getBufferedPaintTargetDC_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getBufferedPaintTargetRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getBufferedPaintTargetRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getComboBoxInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getComboBoxInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getCurrentThemeName", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getCurrentThemeName_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getEffectiveClientRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getEffectiveClientRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getListBoxInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getListBoxInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getMUILanguage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getMUILanguage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeAnimationProperty", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeAnimationProperty_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeAnimationTransform", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeAnimationTransform_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeAppProperties", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeAppProperties_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeBackgroundContentRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeBackgroundContentRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeBackgroundExtent", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeBackgroundExtent_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeBackgroundRegion", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeBackgroundRegion_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeBitmap", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeBitmap_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeBool", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeBool_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeColor", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeColor_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeDocumentationProperty", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeDocumentationProperty_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeEnumValue", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeEnumValue_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeFilename", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeFilename_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeFont", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeFont_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeInt", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeInt_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeIntList", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeIntList_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeMargins", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeMargins_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeMetric", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeMetric_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemePartSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemePartSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemePosition", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemePosition_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemePropertyOrigin", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemePropertyOrigin_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeStream", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeStream_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeString", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeString_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeSysBool", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeSysBool_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeSysColor", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeSysColor_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeSysColorBrush", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeSysColorBrush_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeSysFont", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeSysFont_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeSysInt", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeSysInt_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeSysSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeSysSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeSysString", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeSysString_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeTextExtent", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeTextExtent_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeTextMetrics", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeTextMetrics_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeTimingFunction", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeTimingFunction_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getThemeTransitionDuration", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getThemeTransitionDuration_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getWindowFeedbackSetting", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getWindowFeedbackSetting_napi));
    exports.Set("windowssys_windows_win32_ui_controls_getWindowTheme", Napi::Function::New(env, windowssys_windows_win32_ui_controls_getWindowTheme_napi));
    exports.Set("windowssys_windows_win32_ui_controls_himagelistQueryInterface", Napi::Function::New(env, windowssys_windows_win32_ui_controls_himagelistQueryInterface_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListAdd", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListAdd_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListAddMasked", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListAddMasked_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListBeginDrag", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListBeginDrag_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListCoCreateInstance", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListCoCreateInstance_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListCopy", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListCopy_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListCreate", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListCreate_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListDestroy", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListDestroy_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListDragEnter", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListDragEnter_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListDragLeave", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListDragLeave_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListDragMove", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListDragMove_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListDragShowNolock", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListDragShowNolock_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListDraw", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListDraw_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListDrawEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListDrawEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListDrawIndirect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListDrawIndirect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListDuplicate", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListDuplicate_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListEndDrag", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListEndDrag_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListGetBkColor", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListGetBkColor_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListGetDragImage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListGetDragImage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListGetIcon", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListGetIcon_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListGetIconSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListGetIconSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListGetImageCount", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListGetImageCount_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListGetImageInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListGetImageInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListLoadImageA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListLoadImageA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListLoadImageW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListLoadImageW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListMerge", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListMerge_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListRead", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListRead_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListReadEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListReadEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListRemove", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListRemove_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListReplace", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListReplace_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListReplaceIcon", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListReplaceIcon_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListSetBkColor", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListSetBkColor_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListSetDragCursorImage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListSetDragCursorImage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListSetIconSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListSetIconSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListSetImageCount", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListSetImageCount_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListSetOverlayImage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListSetOverlayImage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListWrite", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListWrite_napi));
    exports.Set("windowssys_windows_win32_ui_controls_imageListWriteEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_imageListWriteEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_initCommonControls", Napi::Function::New(env, windowssys_windows_win32_ui_controls_initCommonControls_napi));
    exports.Set("windowssys_windows_win32_ui_controls_initCommonControlsEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_initCommonControlsEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_initMUILanguage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_initMUILanguage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_initializeFlatSB", Napi::Function::New(env, windowssys_windows_win32_ui_controls_initializeFlatSB_napi));
    exports.Set("windowssys_windows_win32_ui_controls_isAppThemed", Napi::Function::New(env, windowssys_windows_win32_ui_controls_isAppThemed_napi));
    exports.Set("windowssys_windows_win32_ui_controls_isCharLowerW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_isCharLowerW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_isCompositionActive", Napi::Function::New(env, windowssys_windows_win32_ui_controls_isCompositionActive_napi));
    exports.Set("windowssys_windows_win32_ui_controls_isDlgButtonChecked", Napi::Function::New(env, windowssys_windows_win32_ui_controls_isDlgButtonChecked_napi));
    exports.Set("windowssys_windows_win32_ui_controls_isThemeActive", Napi::Function::New(env, windowssys_windows_win32_ui_controls_isThemeActive_napi));
    exports.Set("windowssys_windows_win32_ui_controls_isThemeBackgroundPartiallyTransparent", Napi::Function::New(env, windowssys_windows_win32_ui_controls_isThemeBackgroundPartiallyTransparent_napi));
    exports.Set("windowssys_windows_win32_ui_controls_isThemeDialogTextureEnabled", Napi::Function::New(env, windowssys_windows_win32_ui_controls_isThemeDialogTextureEnabled_napi));
    exports.Set("windowssys_windows_win32_ui_controls_isThemePartDefined", Napi::Function::New(env, windowssys_windows_win32_ui_controls_isThemePartDefined_napi));
    exports.Set("windowssys_windows_win32_ui_controls_loadIconMetric", Napi::Function::New(env, windowssys_windows_win32_ui_controls_loadIconMetric_napi));
    exports.Set("windowssys_windows_win32_ui_controls_loadIconWithScaleDown", Napi::Function::New(env, windowssys_windows_win32_ui_controls_loadIconWithScaleDown_napi));
    exports.Set("windowssys_windows_win32_ui_controls_makeDragList", Napi::Function::New(env, windowssys_windows_win32_ui_controls_makeDragList_napi));
    exports.Set("windowssys_windows_win32_ui_controls_menuHelp", Napi::Function::New(env, windowssys_windows_win32_ui_controls_menuHelp_napi));
    exports.Set("windowssys_windows_win32_ui_controls_openThemeData", Napi::Function::New(env, windowssys_windows_win32_ui_controls_openThemeData_napi));
    exports.Set("windowssys_windows_win32_ui_controls_openThemeDataEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_openThemeDataEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_packTouchHitTestingProximityEvaluation", Napi::Function::New(env, windowssys_windows_win32_ui_controls_packTouchHitTestingProximityEvaluation_napi));
    exports.Set("windowssys_windows_win32_ui_controls_propertySheetA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_propertySheetA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_propertySheetW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_propertySheetW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_registerPointerDeviceNotifications", Napi::Function::New(env, windowssys_windows_win32_ui_controls_registerPointerDeviceNotifications_napi));
    exports.Set("windowssys_windows_win32_ui_controls_registerTouchHitTestingWindow", Napi::Function::New(env, windowssys_windows_win32_ui_controls_registerTouchHitTestingWindow_napi));
    exports.Set("windowssys_windows_win32_ui_controls_setScrollInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_setScrollInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_setScrollPos", Napi::Function::New(env, windowssys_windows_win32_ui_controls_setScrollPos_napi));
    exports.Set("windowssys_windows_win32_ui_controls_setScrollRange", Napi::Function::New(env, windowssys_windows_win32_ui_controls_setScrollRange_napi));
    exports.Set("windowssys_windows_win32_ui_controls_setThemeAppProperties", Napi::Function::New(env, windowssys_windows_win32_ui_controls_setThemeAppProperties_napi));
    exports.Set("windowssys_windows_win32_ui_controls_setWindowFeedbackSetting", Napi::Function::New(env, windowssys_windows_win32_ui_controls_setWindowFeedbackSetting_napi));
    exports.Set("windowssys_windows_win32_ui_controls_setWindowTheme", Napi::Function::New(env, windowssys_windows_win32_ui_controls_setWindowTheme_napi));
    exports.Set("windowssys_windows_win32_ui_controls_setWindowThemeAttribute", Napi::Function::New(env, windowssys_windows_win32_ui_controls_setWindowThemeAttribute_napi));
    exports.Set("windowssys_windows_win32_ui_controls_showHideMenuCtl", Napi::Function::New(env, windowssys_windows_win32_ui_controls_showHideMenuCtl_napi));
    exports.Set("windowssys_windows_win32_ui_controls_showScrollBar", Napi::Function::New(env, windowssys_windows_win32_ui_controls_showScrollBar_napi));
    exports.Set("windowssys_windows_win32_ui_controls_strSetPtrW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_strSetPtrW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_taskDialog", Napi::Function::New(env, windowssys_windows_win32_ui_controls_taskDialog_napi));
    exports.Set("windowssys_windows_win32_ui_controls_taskDialogIndirect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_taskDialogIndirect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_uninitializeFlatSB", Napi::Function::New(env, windowssys_windows_win32_ui_controls_uninitializeFlatSB_napi));
    exports.Set("windowssys_windows_win32_ui_controls_updatePanningFeedback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_updatePanningFeedback_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_ui_controls_napi, nullptr };
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
