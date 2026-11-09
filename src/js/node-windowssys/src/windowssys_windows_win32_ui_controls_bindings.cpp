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

static Napi::Value windowssys_windows_win32_ui_controls_BeginBufferedAnimation_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, hdctarget, prctarget, dwformat, ppaintparams, panimationparams, phdcfrom, phdcto) : -1;
#else
    (void)hwnd;
    (void)hdctarget;
    (void)prctarget;
    (void)dwformat;
    (void)ppaintparams;
    (void)panimationparams;
    (void)phdcfrom;
    (void)phdcto;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_BeginBufferedPaint_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdctarget, prctarget, dwformat, ppaintparams, phdc) : -1;
#else
    (void)hdctarget;
    (void)prctarget;
    (void)dwformat;
    (void)ppaintparams;
    (void)phdc;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_BeginPanningFeedback_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BeginPanningFeedback")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_BufferedPaintClear_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbufferedpaint, prc) : -1;
#else
    (void)hbufferedpaint;
    (void)prc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_BufferedPaintInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferedPaintInit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_BufferedPaintRenderAnimation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, hdctarget) : -1;
#else
    (void)hwnd;
    (void)hdctarget;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_BufferedPaintSetAlpha_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbufferedpaint, prc, alpha) : -1;
#else
    (void)hbufferedpaint;
    (void)prc;
    (void)alpha;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_BufferedPaintStopAllAnimations_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferedPaintStopAllAnimations")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_BufferedPaintUnInit_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "BufferedPaintUnInit")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_CheckDlgButton_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdlg, nidbutton, ucheck) : -1;
#else
    (void)hdlg;
    (void)nidbutton;
    (void)ucheck;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_CheckRadioButton_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdlg, nidfirstbutton, nidlastbutton, nidcheckbutton) : -1;
#else
    (void)hdlg;
    (void)nidfirstbutton;
    (void)nidlastbutton;
    (void)nidcheckbutton;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_CloseThemeData_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t htheme = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseThemeData")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme) : -1;
#else
    (void)htheme;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_CreateMappedBitmap_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinstance, idbitmap, wflags, lpcolormap, inummaps) : NULL;
#else
    (void)hinstance;
    (void)idbitmap;
    (void)wflags;
    (void)lpcolormap;
    (void)inummaps;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_CreatePropertySheetPageA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* constpropsheetpagepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePropertySheetPageA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(constpropsheetpagepointer) : NULL;
#else
    (void)constpropsheetpagepointer;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_CreatePropertySheetPageW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* constpropsheetpagepointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreatePropertySheetPageW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(constpropsheetpagepointer) : NULL;
#else
    (void)constpropsheetpagepointer;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_CreateStatusWindowA_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(style, lpsztext, hwndparent, wid) : NULL;
#else
    (void)style;
    (void)lpsztext;
    (void)hwndparent;
    (void)wid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_CreateStatusWindowW_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(style, lpsztext, hwndparent, wid) : NULL;
#else
    (void)style;
    (void)lpsztext;
    (void)hwndparent;
    (void)wid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_CreateSyntheticPointerDevice_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pointertype, maxcount, mode) : NULL;
#else
    (void)pointertype;
    (void)maxcount;
    (void)mode;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_CreateToolbarEx_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, ws, wid, nbitmaps, hbminst, wbmid, lpbuttons, inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize) : NULL;
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
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_CreateUpDownControl_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwstyle, x, y, cx, cy, hparent, nid, hinst, hbuddy, nupper, nlower, npos) : NULL;
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
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_Clone_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa, hdpanew) : -1;
#else
    (void)hdpa;
    (void)hdpanew;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_Create_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t citemgrow = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_Create")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(citemgrow) : -1;
#else
    (void)citemgrow;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_CreateEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cpgrow, hheap) : -1;
#else
    (void)cpgrow;
    (void)hheap;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_DeleteAllPtrs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_DeleteAllPtrs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa) : -1;
#else
    (void)hdpa;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_DeletePtr_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa, i) : NULL;
#else
    (void)hdpa;
    (void)i;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_Destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_Destroy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa) : -1;
#else
    (void)hdpa;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_DestroyCallback_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(hdpa, pfncb, pdata);
#else
    (void)hdpa;
    (void)pfncb;
    (void)pdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_EnumCallback_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(hdpa, pfncb, pdata);
#else
    (void)hdpa;
    (void)pfncb;
    (void)pdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_GetPtr_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa, i) : NULL;
#else
    (void)hdpa;
    (void)i;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_GetPtrIndex_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa, p) : -1;
#else
    (void)hdpa;
    (void)p;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_GetSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdpa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DPA_GetSize")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa) : 0;
#else
    (void)hdpa;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_Grow_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdpa, cp) : -1;
#else
    (void)pdpa;
    (void)cp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_InsertPtr_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa, i, p) : -1;
#else
    (void)hdpa;
    (void)i;
    (void)p;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_LoadStream_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phdpa, pfn, pstream, pvinstdata) : -1;
#else
    (void)phdpa;
    (void)pfn;
    (void)pstream;
    (void)pvinstdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_Merge_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpadest, hdpasrc, dwflags, pfncompare, pfnmerge, lparam) : -1;
#else
    (void)hdpadest;
    (void)hdpasrc;
    (void)dwflags;
    (void)pfncompare;
    (void)pfnmerge;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_SaveStream_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa, pfn, pstream, pvinstdata) : -1;
#else
    (void)hdpa;
    (void)pfn;
    (void)pstream;
    (void)pvinstdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_Search_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa, pfind, istart, pfncompare, lparam, options) : -1;
#else
    (void)hdpa;
    (void)pfind;
    (void)istart;
    (void)pfncompare;
    (void)lparam;
    (void)options;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_SetPtr_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa, i, p) : -1;
#else
    (void)hdpa;
    (void)i;
    (void)p;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DPA_Sort_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdpa, pfncompare, lparam) : -1;
#else
    (void)hdpa;
    (void)pfncompare;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_Clone_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_Clone")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdsa) : -1;
#else
    (void)hdsa;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_Create_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cbitem, citemgrow) : -1;
#else
    (void)cbitem;
    (void)citemgrow;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_DeleteAllItems_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_DeleteAllItems")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdsa) : -1;
#else
    (void)hdsa;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_DeleteItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdsa, i) : -1;
#else
    (void)hdsa;
    (void)i;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_Destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_Destroy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdsa) : -1;
#else
    (void)hdsa;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_DestroyCallback_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(hdsa, pfncb, pdata);
#else
    (void)hdsa;
    (void)pfncb;
    (void)pdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_EnumCallback_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(hdsa, pfncb, pdata);
#else
    (void)hdsa;
    (void)pfncb;
    (void)pdata;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_GetItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdsa, i, pitem) : -1;
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_GetItemPtr_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdsa, i) : NULL;
#else
    (void)hdsa;
    (void)i;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_GetSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hdsa = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DSA_GetSize")));
    }
    uint64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdsa) : 0;
#else
    (void)hdsa;
    uint64_t km_res = 0;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<uint64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_InsertItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdsa, i, pitem) : -1;
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_SetItem_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdsa, i, pitem) : -1;
#else
    (void)hdsa;
    (void)i;
    (void)pitem;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DSA_Sort_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdsa, pfncompare, lparam) : -1;
#else
    (void)pdsa;
    (void)pfncompare;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DestroyPropertySheetPage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroyPropertySheetPage")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DestroySyntheticPointerDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* device = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DestroySyntheticPointerDevice")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(device);
#else
    (void)device;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_DlgDirListA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdlg, lppathspec, nidlistbox, nidstaticpath, ufiletype) : -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidlistbox;
    (void)nidstaticpath;
    (void)ufiletype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DlgDirListComboBoxA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdlg, lppathspec, nidcombobox, nidstaticpath, ufiletype) : -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidcombobox;
    (void)nidstaticpath;
    (void)ufiletype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DlgDirListComboBoxW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdlg, lppathspec, nidcombobox, nidstaticpath, ufiletype) : -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidcombobox;
    (void)nidstaticpath;
    (void)ufiletype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DlgDirListW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdlg, lppathspec, nidlistbox, nidstaticpath, ufiletype) : -1;
#else
    (void)hdlg;
    (void)lppathspec;
    (void)nidlistbox;
    (void)nidstaticpath;
    (void)ufiletype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnddlg, lpstring, cchout, idcombobox) : -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)cchout;
    (void)idcombobox;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnddlg, lpstring, cchout, idcombobox) : -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)cchout;
    (void)idcombobox;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DlgDirSelectExA_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnddlg, lpstring, chcount, idlistbox) : -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)chcount;
    (void)idlistbox;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DlgDirSelectExW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnddlg, lpstring, chcount, idlistbox) : -1;
#else
    (void)hwnddlg;
    (void)lpstring;
    (void)chcount;
    (void)idlistbox;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawInsert_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(handparent, hlb, nitem);
#else
    (void)handparent;
    (void)hlb;
    (void)nitem;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawShadowText_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, psztext, cch, prc, dwflags, crtext, crshadow, ixoffset, iyoffset) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawStatusTextA_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(hdc, lprc, psztext, uflags);
#else
    (void)hdc;
    (void)lprc;
    (void)psztext;
    (void)uflags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawStatusTextW_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(hdc, lprc, psztext, uflags);
#else
    (void)hdc;
    (void)lprc;
    (void)psztext;
    (void)uflags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawThemeBackground_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, prect, pcliprect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)pcliprect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawThemeBackgroundEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, prect, poptions) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)poptions;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawThemeEdge_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, pdestrect, uedge, uflags, pcontentrect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pdestrect;
    (void)uedge;
    (void)uflags;
    (void)pcontentrect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawThemeIcon_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, prect, himl, iimageindex) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)himl;
    (void)iimageindex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawThemeParentBackground_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, hdc, prc) : -1;
#else
    (void)hwnd;
    (void)hdc;
    (void)prc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawThemeParentBackgroundEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, hdc, dwflags, prc) : -1;
#else
    (void)hwnd;
    (void)hdc;
    (void)dwflags;
    (void)prc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawThemeText_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, psztext, cchtext, dwtextflags, dwtextflags2, prect) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_DrawThemeTextEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, psztext, cchtext, dwtextflags, prect, poptions) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_EnableScrollBar_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, wsbflags, warrows) : -1;
#else
    (void)hwnd;
    (void)wsbflags;
    (void)warrows;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_EnableThemeDialogTexture_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, dwflags) : -1;
#else
    (void)hwnd;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_EnableTheming_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fenable = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnableTheming")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fenable) : -1;
#else
    (void)fenable;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_EndBufferedAnimation_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbpanimation, fupdatetarget) : -1;
#else
    (void)hbpanimation;
    (void)fupdatetarget;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_EndBufferedPaint_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbufferedpaint, fupdatetarget) : -1;
#else
    (void)hbufferedpaint;
    (void)fupdatetarget;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_EndPanningFeedback_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, fanimateback) : -1;
#else
    (void)hwnd;
    (void)fanimateback;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_EvaluateProximityToPolygon_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(numvertices, controlpolygon, phittestinginput, pproximityeval) : -1;
#else
    (void)numvertices;
    (void)controlpolygon;
    (void)phittestinginput;
    (void)pproximityeval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_EvaluateProximityToRect_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(controlboundingbox, phittestinginput, pproximityeval) : -1;
#else
    (void)controlboundingbox;
    (void)phittestinginput;
    (void)pproximityeval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_EnableScrollBar_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, param1, param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_GetScrollInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, code, param2) : -1;
#else
    (void)param0;
    (void)code;
    (void)param2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_GetScrollPos_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, code) : -1;
#else
    (void)param0;
    (void)code;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_GetScrollProp_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, propindex, param2) : -1;
#else
    (void)param0;
    (void)propindex;
    (void)param2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_GetScrollRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, code, param2, param3) : -1;
#else
    (void)param0;
    (void)code;
    (void)param2;
    (void)param3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_SetScrollInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, code, psi, fredraw) : -1;
#else
    (void)param0;
    (void)code;
    (void)psi;
    (void)fredraw;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_SetScrollPos_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, code, pos, fredraw) : -1;
#else
    (void)param0;
    (void)code;
    (void)pos;
    (void)fredraw;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_SetScrollProp_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, arg_1_index, newvalue, param3) : -1;
#else
    (void)param0;
    (void)arg_1_index;
    (void)newvalue;
    (void)param3;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_SetScrollRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, code, min, max, fredraw) : -1;
#else
    (void)param0;
    (void)code;
    (void)min;
    (void)max;
    (void)fredraw;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_FlatSB_ShowScrollBar_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0, code, param2) : -1;
#else
    (void)param0;
    (void)code;
    (void)param2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetBufferedPaintBits_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbufferedpaint, ppbbuffer, pcxrow) : -1;
#else
    (void)hbufferedpaint;
    (void)ppbbuffer;
    (void)pcxrow;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetBufferedPaintDC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbufferedpaint = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBufferedPaintDC")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbufferedpaint) : NULL;
#else
    (void)hbufferedpaint;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetBufferedPaintTargetDC_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hbufferedpaint = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetBufferedPaintTargetDC")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbufferedpaint) : NULL;
#else
    (void)hbufferedpaint;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetBufferedPaintTargetRect_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hbufferedpaint, prc) : -1;
#else
    (void)hbufferedpaint;
    (void)prc;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetComboBoxInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndcombo, pcbi) : -1;
#else
    (void)hwndcombo;
    (void)pcbi;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetCurrentThemeName_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszthemefilename, cchmaxnamechars, pszcolorbuff, cchmaxcolorchars, pszsizebuff, cchmaxsizechars) : -1;
#else
    (void)pszthemefilename;
    (void)cchmaxnamechars;
    (void)pszcolorbuff;
    (void)cchmaxcolorchars;
    (void)pszsizebuff;
    (void)cchmaxsizechars;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetEffectiveClientRect_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(hwnd, lprc, lpinfo);
#else
    (void)hwnd;
    (void)lprc;
    (void)lpinfo;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_GetListBoxInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetListBoxInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd) : 0;
#else
    (void)hwnd;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetMUILanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetMUILanguage")));
    }
    uint16_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint16_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeAnimationProperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, istoryboardid, itargetid, eproperty, pvproperty, cbsize, pcbsizeout) : -1;
#else
    (void)htheme;
    (void)istoryboardid;
    (void)itargetid;
    (void)eproperty;
    (void)pvproperty;
    (void)cbsize;
    (void)pcbsizeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeAnimationTransform_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, istoryboardid, itargetid, dwtransformindex, ptransform, cbsize, pcbsizeout) : -1;
#else
    (void)htheme;
    (void)istoryboardid;
    (void)itargetid;
    (void)dwtransformindex;
    (void)ptransform;
    (void)cbsize;
    (void)pcbsizeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeAppProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetThemeAppProperties")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeBackgroundContentRect_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, pboundingrect, pcontentrect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pboundingrect;
    (void)pcontentrect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeBackgroundExtent_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, pcontentrect, pextentrect) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)pcontentrect;
    (void)pextentrect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeBackgroundRegion_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, prect, pregion) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prect;
    (void)pregion;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeBitmap_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, dwflags, phbitmap) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)dwflags;
    (void)phbitmap;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeBool_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, pfval) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pfval;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeColor_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, pcolor) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pcolor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeDocumentationProperty_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pszthemename, pszpropertyname, pszvaluebuff, cchmaxvalchars) : -1;
#else
    (void)pszthemename;
    (void)pszpropertyname;
    (void)pszvaluebuff;
    (void)cchmaxvalchars;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeEnumValue_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, pival) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeFilename_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, pszthemefilename, cchmaxbuffchars) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pszthemefilename;
    (void)cchmaxbuffchars;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeFont_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, ipropid, pfont) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pfont;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeInt_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, pival) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeIntList_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, pintlist) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pintlist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeMargins_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, ipropid, prc, pmargins) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)prc;
    (void)pmargins;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeMetric_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, ipropid, pival) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pival;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemePartSize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, prc, esize, psz) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)prc;
    (void)esize;
    (void)psz;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemePosition_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, ppoint) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)ppoint;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemePropertyOrigin_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, porigin) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)porigin;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeRect_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, prect) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)prect;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeStream_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, ppvstream, pcbstream, hinst) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)ppvstream;
    (void)pcbstream;
    (void)hinst;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeString_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid, ipropid, pszbuff, cchmaxbuffchars) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    (void)ipropid;
    (void)pszbuff;
    (void)cchmaxbuffchars;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeSysBool_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, iboolid) : -1;
#else
    (void)htheme;
    (void)iboolid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeSysColor_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, icolorid) : 0;
#else
    (void)htheme;
    (void)icolorid;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeSysColorBrush_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, icolorid) : NULL;
#else
    (void)htheme;
    (void)icolorid;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeSysFont_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ifontid, plf) : -1;
#else
    (void)htheme;
    (void)ifontid;
    (void)plf;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeSysInt_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, iintid, pivalue) : -1;
#else
    (void)htheme;
    (void)iintid;
    (void)pivalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeSysSize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, isizeid) : -1;
#else
    (void)htheme;
    (void)isizeid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeSysString_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, istringid, pszstringbuff, cchmaxstringchars) : -1;
#else
    (void)htheme;
    (void)istringid;
    (void)pszstringbuff;
    (void)cchmaxstringchars;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeTextExtent_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, psztext, cchcharcount, dwtextflags, pboundingrect, pextentrect) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeTextMetrics_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, hdc, ipartid, istateid, ptm) : -1;
#else
    (void)htheme;
    (void)hdc;
    (void)ipartid;
    (void)istateid;
    (void)ptm;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeTimingFunction_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, itimingfunctionid, ptimingfunction, cbsize, pcbsizeout) : -1;
#else
    (void)htheme;
    (void)itimingfunctionid;
    (void)ptimingfunction;
    (void)cbsize;
    (void)pcbsizeout;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetThemeTransitionDuration_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateidfrom, istateidto, ipropid, pdwduration) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateidfrom;
    (void)istateidto;
    (void)ipropid;
    (void)pdwduration;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetWindowFeedbackSetting_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, feedback, dwflags, psize, config) : -1;
#else
    (void)hwnd;
    (void)feedback;
    (void)dwflags;
    (void)psize;
    (void)config;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_GetWindowTheme_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetWindowTheme")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd) : -1;
#else
    (void)hwnd;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_HIMAGELIST_QueryInterface_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, riid, ppv) : -1;
#else
    (void)himl;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Add_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, hbmimage, hbmmask) : -1;
#else
    (void)himl;
    (void)hbmimage;
    (void)hbmmask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_AddMasked_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, hbmimage, crmask) : -1;
#else
    (void)himl;
    (void)hbmimage;
    (void)crmask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_BeginDrag_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himltrack, itrack, dxhotspot, dyhotspot) : -1;
#else
    (void)himltrack;
    (void)itrack;
    (void)dxhotspot;
    (void)dyhotspot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_CoCreateInstance_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(rclsid, punkouter, riid, ppv) : -1;
#else
    (void)rclsid;
    (void)punkouter;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Copy_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himldst, idst, himlsrc, isrc, uflags) : -1;
#else
    (void)himldst;
    (void)idst;
    (void)himlsrc;
    (void)isrc;
    (void)uflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Create_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(cx, cy, flags, cinitial, cgrow) : -1;
#else
    (void)cx;
    (void)cy;
    (void)flags;
    (void)cinitial;
    (void)cgrow;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Destroy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Destroy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl) : -1;
#else
    (void)himl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_DragEnter_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndlock, x, y) : -1;
#else
    (void)hwndlock;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_DragLeave_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwndlock = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_DragLeave")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndlock) : -1;
#else
    (void)hwndlock;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_DragMove_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(x, y) : -1;
#else
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_DragShowNolock_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t fshow = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_DragShowNolock")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fshow) : -1;
#else
    (void)fshow;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Draw_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, i, hdcdst, x, y, fstyle) : -1;
#else
    (void)himl;
    (void)i;
    (void)hdcdst;
    (void)x;
    (void)y;
    (void)fstyle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_DrawEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, i, hdcdst, x, y, dx, dy, rgbbk, rgbfg, fstyle) : -1;
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
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_DrawIndirect_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pimldp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_DrawIndirect")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pimldp) : -1;
#else
    (void)pimldp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Duplicate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Duplicate")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl) : -1;
#else
    (void)himl;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_EndDrag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_EndDrag")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_GetBkColor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_GetBkColor")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl) : 0;
#else
    (void)himl;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_GetDragImage_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppt, ppthotspot) : -1;
#else
    (void)ppt;
    (void)ppthotspot;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_GetIcon_napi(const Napi::CallbackInfo& km_info) {
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
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, i, flags) : NULL;
#else
    (void)himl;
    (void)i;
    (void)flags;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_GetIconSize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, cx, cy) : -1;
#else
    (void)himl;
    (void)cx;
    (void)cy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_GetImageCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t himl = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_GetImageCount")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl) : -1;
#else
    (void)himl;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_GetImageInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, i, pimageinfo) : -1;
#else
    (void)himl;
    (void)i;
    (void)pimageinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_LoadImageA_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hi, lpbmp, cx, cgrow, crmask, utype, uflags) : -1;
#else
    (void)hi;
    (void)lpbmp;
    (void)cx;
    (void)cgrow;
    (void)crmask;
    (void)utype;
    (void)uflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_LoadImageW_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hi, lpbmp, cx, cgrow, crmask, utype, uflags) : -1;
#else
    (void)hi;
    (void)lpbmp;
    (void)cx;
    (void)cgrow;
    (void)crmask;
    (void)utype;
    (void)uflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Merge_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl1, i1, himl2, i2, dx, dy) : -1;
#else
    (void)himl1;
    (void)i1;
    (void)himl2;
    (void)i2;
    (void)dx;
    (void)dy;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Read_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pstm = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ImageList_Read")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pstm) : -1;
#else
    (void)pstm;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_ReadEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwflags, pstm, riid, ppv) : -1;
#else
    (void)dwflags;
    (void)pstm;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Remove_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, i) : -1;
#else
    (void)himl;
    (void)i;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Replace_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, i, hbmimage, hbmmask) : -1;
#else
    (void)himl;
    (void)i;
    (void)hbmimage;
    (void)hbmmask;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_ReplaceIcon_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, i, hicon) : -1;
#else
    (void)himl;
    (void)i;
    (void)hicon;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_SetBkColor_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, clrbk) : 0;
#else
    (void)himl;
    (void)clrbk;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_SetDragCursorImage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himldrag, idrag, dxhotspot, dyhotspot) : -1;
#else
    (void)himldrag;
    (void)idrag;
    (void)dxhotspot;
    (void)dyhotspot;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_SetIconSize_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, cx, cy) : -1;
#else
    (void)himl;
    (void)cx;
    (void)cy;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_SetImageCount_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, unewcount) : -1;
#else
    (void)himl;
    (void)unewcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_SetOverlayImage_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, iimage, ioverlay) : -1;
#else
    (void)himl;
    (void)iimage;
    (void)ioverlay;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_Write_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, pstm) : -1;
#else
    (void)himl;
    (void)pstm;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ImageList_WriteEx_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(himl, dwflags, pstm) : -1;
#else
    (void)himl;
    (void)dwflags;
    (void)pstm;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_InitCommonControls_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitCommonControls")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr();
#else
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_InitCommonControlsEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* picce = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitCommonControlsEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(picce) : -1;
#else
    (void)picce;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_InitMUILanguage_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t uilang = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitMUILanguage")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(uilang);
#else
    (void)uilang;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_InitializeFlatSB_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitializeFlatSB")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_IsAppThemed_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsAppThemed")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_IsCharLowerW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint16_t ch = static_cast<uint16_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsCharLowerW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ch) : -1;
#else
    (void)ch;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_IsCompositionActive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsCompositionActive")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_IsDlgButtonChecked_napi(const Napi::CallbackInfo& km_info) {
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
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdlg, nidbutton) : 0;
#else
    (void)hdlg;
    (void)nidbutton;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_IsThemeActive_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThemeActive")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_IsThemeBackgroundPartiallyTransparent_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_IsThemeDialogTextureEnabled_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hwnd = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsThemeDialogTextureEnabled")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_IsThemePartDefined_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(htheme, ipartid, istateid) : -1;
#else
    (void)htheme;
    (void)ipartid;
    (void)istateid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_LoadIconMetric_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinst, pszname, lims, phico) : -1;
#else
    (void)hinst;
    (void)pszname;
    (void)lims;
    (void)phico;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_LoadIconWithScaleDown_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hinst, pszname, cx, cy, phico) : -1;
#else
    (void)hinst;
    (void)pszname;
    (void)cx;
    (void)cy;
    (void)phico;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_MakeDragList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hlb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "MakeDragList")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hlb) : -1;
#else
    (void)hlb;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_MenuHelp_napi(const Napi::CallbackInfo& km_info) {
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
    if (km_fn_ptr != nullptr) km_fn_ptr(umsg, wparam, lparam, hmainmenu, hinst, hwndstatus, lpwids);
#else
    (void)umsg;
    (void)wparam;
    (void)lparam;
    (void)hmainmenu;
    (void)hinst;
    (void)hwndstatus;
    (void)lpwids;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_OpenThemeData_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, pszclasslist) : -1;
#else
    (void)hwnd;
    (void)pszclasslist;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_OpenThemeDataEx_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, pszclasslist, dwflags) : -1;
#else
    (void)hwnd;
    (void)pszclasslist;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_PackTouchHitTestingProximityEvaluation_napi(const Napi::CallbackInfo& km_info) {
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
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(phittestinginput, pproximityeval) : -1;
#else
    (void)phittestinginput;
    (void)pproximityeval;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_PropertySheetA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropertySheetA")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_PropertySheetW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropertySheetW")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_controls_RegisterPointerDeviceNotifications_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(window, notifyrange) : -1;
#else
    (void)window;
    (void)notifyrange;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_RegisterTouchHitTestingWindow_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, value) : -1;
#else
    (void)hwnd;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_SetScrollInfo_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, nbar, lpsi, redraw) : -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)lpsi;
    (void)redraw;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_SetScrollPos_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, nbar, npos, bredraw) : -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)npos;
    (void)bredraw;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_SetScrollRange_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, nbar, nminpos, nmaxpos, bredraw) : -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)nminpos;
    (void)nmaxpos;
    (void)bredraw;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_SetThemeAppProperties_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("uxtheme.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetThemeAppProperties")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(dwflags);
#else
    (void)dwflags;
#endif
    return km_env.Undefined();
}

static Napi::Value windowssys_windows_win32_ui_controls_SetWindowFeedbackSetting_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, feedback, dwflags, size, configuration) : -1;
#else
    (void)hwnd;
    (void)feedback;
    (void)dwflags;
    (void)size;
    (void)configuration;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_SetWindowTheme_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, pszsubappname, pszsubidlist) : -1;
#else
    (void)hwnd;
    (void)pszsubappname;
    (void)pszsubidlist;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_SetWindowThemeAttribute_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, eattribute, pvattribute, cbattribute) : -1;
#else
    (void)hwnd;
    (void)eattribute;
    (void)pvattribute;
    (void)cbattribute;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ShowHideMenuCtl_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, uflags, lpinfo) : -1;
#else
    (void)hwnd;
    (void)uflags;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_ShowScrollBar_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, wbar, bshow) : -1;
#else
    (void)hwnd;
    (void)wbar;
    (void)bshow;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_Str_SetPtrW_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ppsz, psz) : -1;
#else
    (void)ppsz;
    (void)psz;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_TaskDialog_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwndowner, hinstance, pszwindowtitle, pszmaininstruction, pszcontent, dwcommonbuttons, pszicon, pnbutton) : -1;
#else
    (void)hwndowner;
    (void)hinstance;
    (void)pszwindowtitle;
    (void)pszmaininstruction;
    (void)pszcontent;
    (void)dwcommonbuttons;
    (void)pszicon;
    (void)pnbutton;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_TaskDialogIndirect_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(ptaskconfig, pnbutton, pnradiobutton, pfverificationflagchecked) : -1;
#else
    (void)ptaskconfig;
    (void)pnbutton;
    (void)pnradiobutton;
    (void)pfverificationflagchecked;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_UninitializeFlatSB_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* param0 = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UninitializeFlatSB")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_controls_UpdatePanningFeedback_napi(const Napi::CallbackInfo& km_info) {
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
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwnd, ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia) : -1;
#else
    (void)hwnd;
    (void)ltotaloverpanoffsetx;
    (void)ltotaloverpanoffsety;
    (void)fininertia;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_ui_controls_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_ui_controls_BeginBufferedAnimation", Napi::Function::New(env, windowssys_windows_win32_ui_controls_BeginBufferedAnimation_napi));
    exports.Set("windowssys_windows_win32_ui_controls_BeginBufferedPaint", Napi::Function::New(env, windowssys_windows_win32_ui_controls_BeginBufferedPaint_napi));
    exports.Set("windowssys_windows_win32_ui_controls_BeginPanningFeedback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_BeginPanningFeedback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_BufferedPaintClear", Napi::Function::New(env, windowssys_windows_win32_ui_controls_BufferedPaintClear_napi));
    exports.Set("windowssys_windows_win32_ui_controls_BufferedPaintInit", Napi::Function::New(env, windowssys_windows_win32_ui_controls_BufferedPaintInit_napi));
    exports.Set("windowssys_windows_win32_ui_controls_BufferedPaintRenderAnimation", Napi::Function::New(env, windowssys_windows_win32_ui_controls_BufferedPaintRenderAnimation_napi));
    exports.Set("windowssys_windows_win32_ui_controls_BufferedPaintSetAlpha", Napi::Function::New(env, windowssys_windows_win32_ui_controls_BufferedPaintSetAlpha_napi));
    exports.Set("windowssys_windows_win32_ui_controls_BufferedPaintStopAllAnimations", Napi::Function::New(env, windowssys_windows_win32_ui_controls_BufferedPaintStopAllAnimations_napi));
    exports.Set("windowssys_windows_win32_ui_controls_BufferedPaintUnInit", Napi::Function::New(env, windowssys_windows_win32_ui_controls_BufferedPaintUnInit_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CheckDlgButton", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CheckDlgButton_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CheckRadioButton", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CheckRadioButton_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CloseThemeData", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CloseThemeData_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CreateMappedBitmap", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CreateMappedBitmap_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CreatePropertySheetPageA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CreatePropertySheetPageA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CreatePropertySheetPageW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CreatePropertySheetPageW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CreateStatusWindowA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CreateStatusWindowA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CreateStatusWindowW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CreateStatusWindowW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CreateSyntheticPointerDevice", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CreateSyntheticPointerDevice_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CreateToolbarEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CreateToolbarEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_CreateUpDownControl", Napi::Function::New(env, windowssys_windows_win32_ui_controls_CreateUpDownControl_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_Clone", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_Clone_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_Create", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_Create_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_CreateEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_CreateEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_DeleteAllPtrs", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_DeleteAllPtrs_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_DeletePtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_DeletePtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_Destroy", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_Destroy_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_DestroyCallback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_DestroyCallback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_EnumCallback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_EnumCallback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_GetPtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_GetPtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_GetPtrIndex", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_GetPtrIndex_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_GetSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_GetSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_Grow", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_Grow_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_InsertPtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_InsertPtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_LoadStream", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_LoadStream_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_Merge", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_Merge_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_SaveStream", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_SaveStream_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_Search", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_Search_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_SetPtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_SetPtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DPA_Sort", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DPA_Sort_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_Clone", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_Clone_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_Create", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_Create_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_DeleteAllItems", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_DeleteAllItems_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_DeleteItem", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_DeleteItem_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_Destroy", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_Destroy_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_DestroyCallback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_DestroyCallback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_EnumCallback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_EnumCallback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_GetItem", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_GetItem_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_GetItemPtr", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_GetItemPtr_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_GetSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_GetSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_InsertItem", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_InsertItem_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_SetItem", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_SetItem_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DSA_Sort", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DSA_Sort_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DestroyPropertySheetPage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DestroyPropertySheetPage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DestroySyntheticPointerDevice", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DestroySyntheticPointerDevice_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DlgDirListA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DlgDirListA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DlgDirListComboBoxA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DlgDirListComboBoxA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DlgDirListComboBoxW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DlgDirListComboBoxW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DlgDirListW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DlgDirListW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DlgDirSelectExA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DlgDirSelectExA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DlgDirSelectExW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DlgDirSelectExW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawInsert", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawInsert_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawShadowText", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawShadowText_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawStatusTextA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawStatusTextA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawStatusTextW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawStatusTextW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawThemeBackground", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawThemeBackground_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawThemeBackgroundEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawThemeBackgroundEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawThemeEdge", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawThemeEdge_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawThemeIcon", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawThemeIcon_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawThemeParentBackground", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawThemeParentBackground_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawThemeParentBackgroundEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawThemeParentBackgroundEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawThemeText", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawThemeText_napi));
    exports.Set("windowssys_windows_win32_ui_controls_DrawThemeTextEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_DrawThemeTextEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_EnableScrollBar", Napi::Function::New(env, windowssys_windows_win32_ui_controls_EnableScrollBar_napi));
    exports.Set("windowssys_windows_win32_ui_controls_EnableThemeDialogTexture", Napi::Function::New(env, windowssys_windows_win32_ui_controls_EnableThemeDialogTexture_napi));
    exports.Set("windowssys_windows_win32_ui_controls_EnableTheming", Napi::Function::New(env, windowssys_windows_win32_ui_controls_EnableTheming_napi));
    exports.Set("windowssys_windows_win32_ui_controls_EndBufferedAnimation", Napi::Function::New(env, windowssys_windows_win32_ui_controls_EndBufferedAnimation_napi));
    exports.Set("windowssys_windows_win32_ui_controls_EndBufferedPaint", Napi::Function::New(env, windowssys_windows_win32_ui_controls_EndBufferedPaint_napi));
    exports.Set("windowssys_windows_win32_ui_controls_EndPanningFeedback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_EndPanningFeedback_napi));
    exports.Set("windowssys_windows_win32_ui_controls_EvaluateProximityToPolygon", Napi::Function::New(env, windowssys_windows_win32_ui_controls_EvaluateProximityToPolygon_napi));
    exports.Set("windowssys_windows_win32_ui_controls_EvaluateProximityToRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_EvaluateProximityToRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_EnableScrollBar", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_EnableScrollBar_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_GetScrollInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_GetScrollInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_GetScrollPos", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_GetScrollPos_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_GetScrollProp", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_GetScrollProp_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_GetScrollRange", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_GetScrollRange_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_SetScrollInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_SetScrollInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_SetScrollPos", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_SetScrollPos_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_SetScrollProp", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_SetScrollProp_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_SetScrollRange", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_SetScrollRange_napi));
    exports.Set("windowssys_windows_win32_ui_controls_FlatSB_ShowScrollBar", Napi::Function::New(env, windowssys_windows_win32_ui_controls_FlatSB_ShowScrollBar_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetBufferedPaintBits", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetBufferedPaintBits_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetBufferedPaintDC", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetBufferedPaintDC_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetBufferedPaintTargetDC", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetBufferedPaintTargetDC_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetBufferedPaintTargetRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetBufferedPaintTargetRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetComboBoxInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetComboBoxInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetCurrentThemeName", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetCurrentThemeName_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetEffectiveClientRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetEffectiveClientRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetListBoxInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetListBoxInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetMUILanguage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetMUILanguage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeAnimationProperty", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeAnimationProperty_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeAnimationTransform", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeAnimationTransform_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeAppProperties", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeAppProperties_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeBackgroundContentRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeBackgroundContentRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeBackgroundExtent", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeBackgroundExtent_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeBackgroundRegion", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeBackgroundRegion_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeBitmap", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeBitmap_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeBool", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeBool_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeColor", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeColor_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeDocumentationProperty", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeDocumentationProperty_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeEnumValue", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeEnumValue_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeFilename", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeFilename_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeFont", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeFont_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeInt", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeInt_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeIntList", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeIntList_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeMargins", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeMargins_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeMetric", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeMetric_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemePartSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemePartSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemePosition", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemePosition_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemePropertyOrigin", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemePropertyOrigin_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeRect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeRect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeStream", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeStream_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeString", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeString_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeSysBool", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeSysBool_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeSysColor", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeSysColor_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeSysColorBrush", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeSysColorBrush_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeSysFont", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeSysFont_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeSysInt", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeSysInt_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeSysSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeSysSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeSysString", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeSysString_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeTextExtent", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeTextExtent_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeTextMetrics", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeTextMetrics_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeTimingFunction", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeTimingFunction_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetThemeTransitionDuration", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetThemeTransitionDuration_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetWindowFeedbackSetting", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetWindowFeedbackSetting_napi));
    exports.Set("windowssys_windows_win32_ui_controls_GetWindowTheme", Napi::Function::New(env, windowssys_windows_win32_ui_controls_GetWindowTheme_napi));
    exports.Set("windowssys_windows_win32_ui_controls_HIMAGELIST_QueryInterface", Napi::Function::New(env, windowssys_windows_win32_ui_controls_HIMAGELIST_QueryInterface_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Add", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Add_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_AddMasked", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_AddMasked_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_BeginDrag", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_BeginDrag_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_CoCreateInstance", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_CoCreateInstance_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Copy", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Copy_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Create", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Create_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Destroy", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Destroy_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_DragEnter", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_DragEnter_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_DragLeave", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_DragLeave_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_DragMove", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_DragMove_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_DragShowNolock", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_DragShowNolock_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Draw", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Draw_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_DrawEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_DrawEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_DrawIndirect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_DrawIndirect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Duplicate", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Duplicate_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_EndDrag", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_EndDrag_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_GetBkColor", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_GetBkColor_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_GetDragImage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_GetDragImage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_GetIcon", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_GetIcon_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_GetIconSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_GetIconSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_GetImageCount", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_GetImageCount_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_GetImageInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_GetImageInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_LoadImageA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_LoadImageA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_LoadImageW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_LoadImageW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Merge", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Merge_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Read", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Read_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_ReadEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_ReadEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Remove", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Remove_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Replace", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Replace_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_ReplaceIcon", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_ReplaceIcon_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_SetBkColor", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_SetBkColor_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_SetDragCursorImage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_SetDragCursorImage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_SetIconSize", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_SetIconSize_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_SetImageCount", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_SetImageCount_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_SetOverlayImage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_SetOverlayImage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_Write", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_Write_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ImageList_WriteEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ImageList_WriteEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_InitCommonControls", Napi::Function::New(env, windowssys_windows_win32_ui_controls_InitCommonControls_napi));
    exports.Set("windowssys_windows_win32_ui_controls_InitCommonControlsEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_InitCommonControlsEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_InitMUILanguage", Napi::Function::New(env, windowssys_windows_win32_ui_controls_InitMUILanguage_napi));
    exports.Set("windowssys_windows_win32_ui_controls_InitializeFlatSB", Napi::Function::New(env, windowssys_windows_win32_ui_controls_InitializeFlatSB_napi));
    exports.Set("windowssys_windows_win32_ui_controls_IsAppThemed", Napi::Function::New(env, windowssys_windows_win32_ui_controls_IsAppThemed_napi));
    exports.Set("windowssys_windows_win32_ui_controls_IsCharLowerW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_IsCharLowerW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_IsCompositionActive", Napi::Function::New(env, windowssys_windows_win32_ui_controls_IsCompositionActive_napi));
    exports.Set("windowssys_windows_win32_ui_controls_IsDlgButtonChecked", Napi::Function::New(env, windowssys_windows_win32_ui_controls_IsDlgButtonChecked_napi));
    exports.Set("windowssys_windows_win32_ui_controls_IsThemeActive", Napi::Function::New(env, windowssys_windows_win32_ui_controls_IsThemeActive_napi));
    exports.Set("windowssys_windows_win32_ui_controls_IsThemeBackgroundPartiallyTransparent", Napi::Function::New(env, windowssys_windows_win32_ui_controls_IsThemeBackgroundPartiallyTransparent_napi));
    exports.Set("windowssys_windows_win32_ui_controls_IsThemeDialogTextureEnabled", Napi::Function::New(env, windowssys_windows_win32_ui_controls_IsThemeDialogTextureEnabled_napi));
    exports.Set("windowssys_windows_win32_ui_controls_IsThemePartDefined", Napi::Function::New(env, windowssys_windows_win32_ui_controls_IsThemePartDefined_napi));
    exports.Set("windowssys_windows_win32_ui_controls_LoadIconMetric", Napi::Function::New(env, windowssys_windows_win32_ui_controls_LoadIconMetric_napi));
    exports.Set("windowssys_windows_win32_ui_controls_LoadIconWithScaleDown", Napi::Function::New(env, windowssys_windows_win32_ui_controls_LoadIconWithScaleDown_napi));
    exports.Set("windowssys_windows_win32_ui_controls_MakeDragList", Napi::Function::New(env, windowssys_windows_win32_ui_controls_MakeDragList_napi));
    exports.Set("windowssys_windows_win32_ui_controls_MenuHelp", Napi::Function::New(env, windowssys_windows_win32_ui_controls_MenuHelp_napi));
    exports.Set("windowssys_windows_win32_ui_controls_OpenThemeData", Napi::Function::New(env, windowssys_windows_win32_ui_controls_OpenThemeData_napi));
    exports.Set("windowssys_windows_win32_ui_controls_OpenThemeDataEx", Napi::Function::New(env, windowssys_windows_win32_ui_controls_OpenThemeDataEx_napi));
    exports.Set("windowssys_windows_win32_ui_controls_PackTouchHitTestingProximityEvaluation", Napi::Function::New(env, windowssys_windows_win32_ui_controls_PackTouchHitTestingProximityEvaluation_napi));
    exports.Set("windowssys_windows_win32_ui_controls_PropertySheetA", Napi::Function::New(env, windowssys_windows_win32_ui_controls_PropertySheetA_napi));
    exports.Set("windowssys_windows_win32_ui_controls_PropertySheetW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_PropertySheetW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_RegisterPointerDeviceNotifications", Napi::Function::New(env, windowssys_windows_win32_ui_controls_RegisterPointerDeviceNotifications_napi));
    exports.Set("windowssys_windows_win32_ui_controls_RegisterTouchHitTestingWindow", Napi::Function::New(env, windowssys_windows_win32_ui_controls_RegisterTouchHitTestingWindow_napi));
    exports.Set("windowssys_windows_win32_ui_controls_SetScrollInfo", Napi::Function::New(env, windowssys_windows_win32_ui_controls_SetScrollInfo_napi));
    exports.Set("windowssys_windows_win32_ui_controls_SetScrollPos", Napi::Function::New(env, windowssys_windows_win32_ui_controls_SetScrollPos_napi));
    exports.Set("windowssys_windows_win32_ui_controls_SetScrollRange", Napi::Function::New(env, windowssys_windows_win32_ui_controls_SetScrollRange_napi));
    exports.Set("windowssys_windows_win32_ui_controls_SetThemeAppProperties", Napi::Function::New(env, windowssys_windows_win32_ui_controls_SetThemeAppProperties_napi));
    exports.Set("windowssys_windows_win32_ui_controls_SetWindowFeedbackSetting", Napi::Function::New(env, windowssys_windows_win32_ui_controls_SetWindowFeedbackSetting_napi));
    exports.Set("windowssys_windows_win32_ui_controls_SetWindowTheme", Napi::Function::New(env, windowssys_windows_win32_ui_controls_SetWindowTheme_napi));
    exports.Set("windowssys_windows_win32_ui_controls_SetWindowThemeAttribute", Napi::Function::New(env, windowssys_windows_win32_ui_controls_SetWindowThemeAttribute_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ShowHideMenuCtl", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ShowHideMenuCtl_napi));
    exports.Set("windowssys_windows_win32_ui_controls_ShowScrollBar", Napi::Function::New(env, windowssys_windows_win32_ui_controls_ShowScrollBar_napi));
    exports.Set("windowssys_windows_win32_ui_controls_Str_SetPtrW", Napi::Function::New(env, windowssys_windows_win32_ui_controls_Str_SetPtrW_napi));
    exports.Set("windowssys_windows_win32_ui_controls_TaskDialog", Napi::Function::New(env, windowssys_windows_win32_ui_controls_TaskDialog_napi));
    exports.Set("windowssys_windows_win32_ui_controls_TaskDialogIndirect", Napi::Function::New(env, windowssys_windows_win32_ui_controls_TaskDialogIndirect_napi));
    exports.Set("windowssys_windows_win32_ui_controls_UninitializeFlatSB", Napi::Function::New(env, windowssys_windows_win32_ui_controls_UninitializeFlatSB_napi));
    exports.Set("windowssys_windows_win32_ui_controls_UpdatePanningFeedback", Napi::Function::New(env, windowssys_windows_win32_ui_controls_UpdatePanningFeedback_napi));
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
