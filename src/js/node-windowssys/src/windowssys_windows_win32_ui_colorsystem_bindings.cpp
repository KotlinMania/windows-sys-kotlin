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

static Napi::Value windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AssociateColorProfileWithDeviceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pprofilename, pdevicename) : -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "AssociateColorProfileWithDeviceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pprofilename, pdevicename) : -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCheckColors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcmtransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpainputcolors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ncolors = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ctinput = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lparesult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCheckColors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcmtransform, lpainputcolors, ncolors, ctinput, lparesult) : -1;
#else
    (void)hcmtransform;
    (void)lpainputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)lparesult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCheckColorsInGamut_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcmtransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpargbtriple = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lparesult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ncount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCheckColorsInGamut")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcmtransform, lpargbtriple, lparesult, ncount) : -1;
#else
    (void)hcmtransform;
    (void)lpargbtriple;
    (void)lparesult;
    (void)ncount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCheckRGBs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcmtransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsrcbits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bminput = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwwidth = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwheight = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwstride = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lparesult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pfncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int64_t ulcallbackdata = km_info.Length() > 8 ? km_napi_arg_i64(km_info[8]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCheckRGBs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcmtransform, lpsrcbits, bminput, dwwidth, dwheight, dwstride, lparesult, pfncallback, ulcallbackdata) : -1;
#else
    (void)hcmtransform;
    (void)lpsrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwstride;
    (void)lparesult;
    (void)pfncallback;
    (void)ulcallbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMConvertColorNameToIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pacolorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMConvertColorNameToIndex")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, pacolorname, paindex, dwcount) : -1;
#else
    (void)hprofile;
    (void)pacolorname;
    (void)paindex;
    (void)dwcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMConvertIndexToColorName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* paindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pacolorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMConvertIndexToColorName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, paindex, pacolorname, dwcount) : -1;
#else
    (void)hprofile;
    (void)paindex;
    (void)pacolorname;
    (void)dwcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCreateDeviceLinkProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pahprofiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t nprofiles = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* padwintents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nintents = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* lpprofiledata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCreateDeviceLinkProfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pahprofiles, nprofiles, padwintents, nintents, dwflags, lpprofiledata) : -1;
#else
    (void)pahprofiles;
    (void)nprofiles;
    (void)padwintents;
    (void)nintents;
    (void)dwflags;
    (void)lpprofiledata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCreateMultiProfileTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pahprofiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t nprofiles = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* padwintents = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nintents = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCreateMultiProfileTransform")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pahprofiles, nprofiles, padwintents, nintents, dwflags) : -1;
#else
    (void)pahprofiles;
    (void)nprofiles;
    (void)padwintents;
    (void)nintents;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCreateProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpprofiledata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCreateProfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcolorspace, lpprofiledata) : -1;
#else
    (void)lpcolorspace;
    (void)lpprofiledata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCreateProfileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpprofiledata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCreateProfileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcolorspace, lpprofiledata) : -1;
#else
    (void)lpcolorspace;
    (void)lpprofiledata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCreateTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdevcharacter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lptargetdevcharacter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCreateTransform")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcolorspace, lpdevcharacter, lptargetdevcharacter) : -1;
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCreateTransformExt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdevcharacter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lptargetdevcharacter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCreateTransformExt")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcolorspace, lpdevcharacter, lptargetdevcharacter, dwflags) : -1;
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCreateTransformExtW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdevcharacter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lptargetdevcharacter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCreateTransformExtW")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcolorspace, lpdevcharacter, lptargetdevcharacter, dwflags) : -1;
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMCreateTransformW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lpcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpdevcharacter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lptargetdevcharacter = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMCreateTransformW")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lpcolorspace, lpdevcharacter, lptargetdevcharacter) : -1;
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMDeleteTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcmtransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMDeleteTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcmtransform) : -1;
#else
    (void)hcmtransform;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMGetInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwinfo = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMGetInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwinfo) : 0;
#else
    (void)dwinfo;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMGetNamedProfileInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pnamedprofileinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMGetNamedProfileInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, pnamedprofileinfo) : -1;
#else
    (void)hprofile;
    (void)pnamedprofileinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMIsProfileValid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpbvalid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMIsProfileValid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, lpbvalid) : -1;
#else
    (void)hprofile;
    (void)lpbvalid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMTranslateColors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcmtransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpainputcolors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ncolors = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ctinput = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lpaoutputcolors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t ctoutput = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMTranslateColors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcmtransform, lpainputcolors, ncolors, ctinput, lpaoutputcolors, ctoutput) : -1;
#else
    (void)hcmtransform;
    (void)lpainputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)lpaoutputcolors;
    (void)ctoutput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMTranslateRGB_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcmtransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t colorref = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* lpcolorref = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMTranslateRGB")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcmtransform, colorref, lpcolorref, dwflags) : -1;
#else
    (void)hcmtransform;
    (void)colorref;
    (void)lpcolorref;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMTranslateRGBs_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcmtransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsrcbits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bminput = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwwidth = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwheight = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwstride = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpdestbits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t bmoutput = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t dwtranslatedirection = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMTranslateRGBs")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcmtransform, lpsrcbits, bminput, dwwidth, dwheight, dwstride, lpdestbits, bmoutput, dwtranslatedirection) : -1;
#else
    (void)hcmtransform;
    (void)lpsrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwstride;
    (void)lpdestbits;
    (void)bmoutput;
    (void)dwtranslatedirection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CMTranslateRGBsExt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcmtransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* lpsrcbits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bminput = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwwidth = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwheight = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwinputstride = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lpdestbits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t bmoutput = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t dwoutputstride = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* lpfncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    int64_t ulcallbackdata = km_info.Length() > 10 ? km_napi_arg_i64(km_info[10]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, int32_t, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CMTranslateRGBsExt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcmtransform, lpsrcbits, bminput, dwwidth, dwheight, dwinputstride, lpdestbits, bmoutput, dwoutputstride, lpfncallback, ulcallbackdata) : -1;
#else
    (void)hcmtransform;
    (void)lpsrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwinputstride;
    (void)lpdestbits;
    (void)bmoutput;
    (void)dwoutputstride;
    (void)lpfncallback;
    (void)ulcallbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CheckBitmapBits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcolortransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* psrcbits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bminput = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwwidth = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwheight = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwstride = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* paresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    void* pfncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 7 ? km_napi_arg_u64(km_info[7]) : 0));
    int64_t lpcallbackdata = km_info.Length() > 8 ? km_napi_arg_i64(km_info[8]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckBitmapBits")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcolortransform, psrcbits, bminput, dwwidth, dwheight, dwstride, paresult, pfncallback, lpcallbackdata) : -1;
#else
    (void)hcolortransform;
    (void)psrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwstride;
    (void)paresult;
    (void)pfncallback;
    (void)lpcallbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CheckColors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcolortransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* painputcolors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ncolors = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ctinput = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* paresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckColors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcolortransform, painputcolors, ncolors, ctinput, paresult) : -1;
#else
    (void)hcolortransform;
    (void)painputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)paresult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CheckColorsInGamut_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lprgbtriple = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* dlpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t ncount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CheckColorsInGamut")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, lprgbtriple, dlpbuffer, ncount) : -1;
#else
    (void)hdc;
    (void)lprgbtriple;
    (void)dlpbuffer;
    (void)ncount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CloseColorProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CloseColorProfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile) : -1;
#else
    (void)hprofile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_ColorCorrectPalette_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hpal = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t defirst = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t num = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ColorCorrectPalette")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, hpal, defirst, num) : -1;
#else
    (void)hdc;
    (void)hpal;
    (void)defirst;
    (void)num;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_ColorMatchToTarget_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hdctarget = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t action = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ColorMatchToTarget")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, hdctarget, action) : -1;
#else
    (void)hdc;
    (void)hdctarget;
    (void)action;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_ConvertColorNameToIndex_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pacolorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* paindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertColorNameToIndex")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, pacolorname, paindex, dwcount) : -1;
#else
    (void)hprofile;
    (void)pacolorname;
    (void)paindex;
    (void)dwcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_ConvertIndexToColorName_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* paindex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pacolorname = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwcount = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "ConvertIndexToColorName")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, paindex, pacolorname, dwcount) : -1;
#else
    (void)hprofile;
    (void)paindex;
    (void)pacolorname;
    (void)dwcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CreateColorSpaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lplcs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateColorSpaceA")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lplcs) : NULL;
#else
    (void)lplcs;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CreateColorSpaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lplcs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateColorSpaceW")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lplcs) : NULL;
#else
    (void)lplcs;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CreateColorTransformA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plogcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t hdestprofile = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t htargetprofile = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateColorTransformA")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plogcolorspace, hdestprofile, htargetprofile, dwflags) : -1;
#else
    (void)plogcolorspace;
    (void)hdestprofile;
    (void)htargetprofile;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CreateColorTransformW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plogcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t hdestprofile = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
    int64_t htargetprofile = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateColorTransformW")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plogcolorspace, hdestprofile, htargetprofile, dwflags) : -1;
#else
    (void)plogcolorspace;
    (void)hdestprofile;
    (void)htargetprofile;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CreateDeviceLinkProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t nprofiles = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* padwintent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nintents = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pprofiledata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t indexpreferredcmm = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateDeviceLinkProfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, nprofiles, padwintent, nintents, dwflags, pprofiledata, indexpreferredcmm) : -1;
#else
    (void)hprofile;
    (void)nprofiles;
    (void)padwintent;
    (void)nintents;
    (void)dwflags;
    (void)pprofiledata;
    (void)indexpreferredcmm;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CreateMultiProfileTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pahprofiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t nprofiles = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* padwintent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t nintents = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t indexpreferredcmm = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateMultiProfileTransform")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pahprofiles, nprofiles, padwintent, nintents, dwflags, indexpreferredcmm) : -1;
#else
    (void)pahprofiles;
    (void)nprofiles;
    (void)padwintent;
    (void)nintents;
    (void)dwflags;
    (void)indexpreferredcmm;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plogcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateProfileFromLogColorSpaceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plogcolorspace, pprofile) : -1;
#else
    (void)plogcolorspace;
    (void)pprofile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plogcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CreateProfileFromLogColorSpaceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plogcolorspace, pprofile) : -1;
#else
    (void)plogcolorspace;
    (void)pprofile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_DeleteColorSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteColorSpace")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcs) : -1;
#else
    (void)hcs;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_DeleteColorTransform_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hxform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DeleteColorTransform")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hxform) : -1;
#else
    (void)hxform;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DisassociateColorProfileFromDeviceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pprofilename, pdevicename) : -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "DisassociateColorProfileFromDeviceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pprofilename, pdevicename) : -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_EnumColorProfilesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* penumrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* penumerationbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwsizeofenumerationbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pnprofiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumColorProfilesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, penumrecord, penumerationbuffer, pdwsizeofenumerationbuffer, pnprofiles) : -1;
#else
    (void)pmachinename;
    (void)penumrecord;
    (void)penumerationbuffer;
    (void)pdwsizeofenumerationbuffer;
    (void)pnprofiles;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_EnumColorProfilesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* penumrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* penumerationbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pdwsizeofenumerationbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pnprofiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumColorProfilesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, penumrecord, penumerationbuffer, pdwsizeofenumerationbuffer, pnprofiles) : -1;
#else
    (void)pmachinename;
    (void)penumrecord;
    (void)penumerationbuffer;
    (void)pdwsizeofenumerationbuffer;
    (void)pnprofiles;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_EnumICMProfilesA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* proc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t param2 = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumICMProfilesA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, proc, param2) : -1;
#else
    (void)hdc;
    (void)proc;
    (void)param2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_EnumICMProfilesW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* proc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int64_t param2 = km_info.Length() > 2 ? km_napi_arg_i64(km_info[2]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EnumICMProfilesW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, proc, param2) : -1;
#else
    (void)hdc;
    (void)proc;
    (void)param2;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetCMMInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcolortransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t param1 = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCMMInfo")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcolortransform, param1) : 0;
#else
    (void)hcolortransform;
    (void)param1;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetColorDirectoryA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetColorDirectoryA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pbuffer, pdwsize) : -1;
#else
    (void)pmachinename;
    (void)pbuffer;
    (void)pdwsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetColorDirectoryW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetColorDirectoryW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pbuffer, pdwsize) : -1;
#else
    (void)pmachinename;
    (void)pbuffer;
    (void)pdwsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetColorProfileElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwoffset = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbreference = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetColorProfileElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, tag, dwoffset, pcbelement, pelement, pbreference) : -1;
#else
    (void)hprofile;
    (void)tag;
    (void)dwoffset;
    (void)pcbelement;
    (void)pelement;
    (void)pbreference;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetColorProfileElementTag_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwindex = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ptag = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetColorProfileElementTag")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, dwindex, ptag) : -1;
#else
    (void)hprofile;
    (void)dwindex;
    (void)ptag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetColorProfileFromHandle_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pcbprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetColorProfileFromHandle")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, pprofile, pcbprofile) : -1;
#else
    (void)hprofile;
    (void)pprofile;
    (void)pcbprofile;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetColorProfileHeader_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetColorProfileHeader")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, pheader) : -1;
#else
    (void)hprofile;
    (void)pheader;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetColorSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetColorSpace")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc) : NULL;
#else
    (void)hdc;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetCountColorProfileElements_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pnelementcount = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetCountColorProfileElements")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, pnelementcount) : -1;
#else
    (void)hprofile;
    (void)pnelementcount;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetDeviceGammaRamp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpramp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetDeviceGammaRamp")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, lpramp) : -1;
#else
    (void)hdc;
    (void)lpramp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetICMProfileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbufsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetICMProfileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, pbufsize, pszfilename) : -1;
#else
    (void)hdc;
    (void)pbufsize;
    (void)pszfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetICMProfileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pbufsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetICMProfileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, pbufsize, pszfilename) : -1;
#else
    (void)hdc;
    (void)pbufsize;
    (void)pszfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t nsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetLogColorSpaceA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcolorspace, lpbuffer, nsize) : -1;
#else
    (void)hcolorspace;
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hcolorspace = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t nsize = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetLogColorSpaceW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcolorspace, lpbuffer, nsize) : -1;
#else
    (void)hcolorspace;
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetNamedProfileInfo_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pnamedprofileinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetNamedProfileInfo")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, pnamedprofileinfo) : -1;
#else
    (void)hprofile;
    (void)pnamedprofileinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingDictionary_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwintent = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pps2colorrenderingdictionary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbps2colorrenderingdictionary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pbbinary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPS2ColorRenderingDictionary")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, dwintent, pps2colorrenderingdictionary, pcbps2colorrenderingdictionary, pbbinary) : -1;
#else
    (void)hprofile;
    (void)dwintent;
    (void)pps2colorrenderingdictionary;
    (void)pcbps2colorrenderingdictionary;
    (void)pbbinary;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingIntent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwintent = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbps2colorrenderingintent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPS2ColorRenderingIntent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, dwintent, pbuffer, pcbps2colorrenderingintent) : -1;
#else
    (void)hprofile;
    (void)dwintent;
    (void)pbuffer;
    (void)pcbps2colorrenderingintent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetPS2ColorSpaceArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwintent = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwcsatype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pps2colorspacearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pcbps2colorspacearray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* pbbinary = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPS2ColorSpaceArray")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, dwintent, dwcsatype, pps2colorspacearray, pcbps2colorspacearray, pbbinary) : -1;
#else
    (void)hprofile;
    (void)dwintent;
    (void)dwcsatype;
    (void)pps2colorspacearray;
    (void)pcbps2colorspacearray;
    (void)pbbinary;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwscs = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStandardColorSpaceProfileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, dwscs, pbuffer, pcbsize) : -1;
#else
    (void)pmachinename;
    (void)dwscs;
    (void)pbuffer;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwscs = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pcbsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetStandardColorSpaceProfileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, dwscs, pbuffer, pcbsize) : -1;
#else
    (void)pmachinename;
    (void)dwscs;
    (void)pbuffer;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_InstallColorProfileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InstallColorProfileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pprofilename) : -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_InstallColorProfileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InstallColorProfileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pprofilename) : -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_IsColorProfileTagPresent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pbpresent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsColorProfileTagPresent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, tag, pbpresent) : -1;
#else
    (void)hprofile;
    (void)tag;
    (void)pbpresent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_IsColorProfileValid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pbvalid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsColorProfileValid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, pbvalid) : -1;
#else
    (void)hprofile;
    (void)pbvalid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_OpenColorProfileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwsharemode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwcreationmode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenColorProfileA")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprofile, dwdesiredaccess, dwsharemode, dwcreationmode) : -1;
#else
    (void)pprofile;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_OpenColorProfileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwdesiredaccess = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwsharemode = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwcreationmode = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "OpenColorProfileW")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pprofile, dwdesiredaccess, dwsharemode, dwcreationmode) : -1;
#else
    (void)pprofile;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_RegisterCMMA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cmmid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcmmdll = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterCMMA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, cmmid, pcmmdll) : -1;
#else
    (void)pmachinename;
    (void)cmmid;
    (void)pcmmdll;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_RegisterCMMW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cmmid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pcmmdll = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "RegisterCMMW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, cmmid, pcmmdll) : -1;
#else
    (void)pmachinename;
    (void)cmmid;
    (void)pcmmdll;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SelectCMM_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t dwcmmtype = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SelectCMM")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(dwcmmtype) : -1;
#else
    (void)dwcmmtype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetColorProfileElement_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t tag = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t dwoffset = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pcbelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* pelement = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetColorProfileElement")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, tag, dwoffset, pcbelement, pelement) : -1;
#else
    (void)hprofile;
    (void)tag;
    (void)dwoffset;
    (void)pcbelement;
    (void)pelement;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetColorProfileElementReference_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t newtag = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t reftag = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetColorProfileElementReference")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, newtag, reftag) : -1;
#else
    (void)hprofile;
    (void)newtag;
    (void)reftag;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetColorProfileElementSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t tagtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t pcbelement = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetColorProfileElementSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, tagtype, pcbelement) : -1;
#else
    (void)hprofile;
    (void)tagtype;
    (void)pcbelement;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetColorProfileHeader_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* pheader = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetColorProfileHeader")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hprofile, pheader) : -1;
#else
    (void)hprofile;
    (void)pheader;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetColorSpace_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* hcs = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetColorSpace")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, hcs) : NULL;
#else
    (void)hdc;
    (void)hcs;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetDeviceGammaRamp_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpramp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetDeviceGammaRamp")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, lpramp) : -1;
#else
    (void)hdc;
    (void)lpramp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetICMMode_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int32_t mode = static_cast<int32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetICMMode")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, mode) : -1;
#else
    (void)hdc;
    (void)mode;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetICMProfileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetICMProfileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, lpfilename) : -1;
#else
    (void)hdc;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetICMProfileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* hdc = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetICMProfileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hdc, lpfilename) : -1;
#else
    (void)hdc;
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwprofileid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetStandardColorSpaceProfileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, dwprofileid, pprofilename) : -1;
#else
    (void)pmachinename;
    (void)dwprofileid;
    (void)pprofilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwprofileid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetStandardColorSpaceProfileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, dwprofileid, pprofilename) : -1;
#else
    (void)pmachinename;
    (void)dwprofileid;
    (void)pprofilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetupColorMatchingA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icmui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupColorMatchingA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcms) : -1;
#else
    (void)pcms;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_SetupColorMatchingW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcms = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("icmui.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SetupColorMatchingW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcms) : -1;
#else
    (void)pcms;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_TranslateBitmapBits_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcolortransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* psrcbits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bminput = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t dwwidth = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwheight = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwinputstride = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pdestbits = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
    int32_t bmoutput = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t dwoutputstride = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* pfncallback = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
    int64_t ulcallbackdata = km_info.Length() > 10 ? km_napi_arg_i64(km_info[10]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, int32_t, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TranslateBitmapBits")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcolortransform, psrcbits, bminput, dwwidth, dwheight, dwinputstride, pdestbits, bmoutput, dwoutputstride, pfncallback, ulcallbackdata) : -1;
#else
    (void)hcolortransform;
    (void)psrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwinputstride;
    (void)pdestbits;
    (void)bmoutput;
    (void)dwoutputstride;
    (void)pfncallback;
    (void)ulcallbackdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_TranslateColors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcolortransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    void* painputcolors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t ncolors = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t ctinput = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* paoutputcolors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    int32_t ctoutput = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "TranslateColors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcolortransform, painputcolors, ncolors, ctinput, paoutputcolors, ctoutput) : -1;
#else
    (void)hcolortransform;
    (void)painputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)paoutputcolors;
    (void)ctoutput;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_UninstallColorProfileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bdelete = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UninstallColorProfileA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pprofilename, bdelete) : -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)bdelete;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_UninstallColorProfileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t bdelete = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UninstallColorProfileW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, pprofilename, bdelete) : -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)bdelete;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_UnregisterCMMA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cmmid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterCMMA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, cmmid) : -1;
#else
    (void)pmachinename;
    (void)cmmid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_UnregisterCMMW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pmachinename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t cmmid = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UnregisterCMMW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pmachinename, cmmid) : -1;
#else
    (void)pmachinename;
    (void)cmmid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszcmid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t command = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UpdateICMRegKeyA")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reserved, lpszcmid, lpszfilename, command) : -1;
#else
    (void)reserved;
    (void)lpszcmid;
    (void)lpszfilename;
    (void)command;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t reserved = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* lpszcmid = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpszfilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t command = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "UpdateICMRegKeyW")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(reserved, lpszcmid, lpszfilename, command) : -1;
#else
    (void)reserved;
    (void)lpszcmid;
    (void)lpszfilename;
    (void)command;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsAssociateColorProfileWithDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsAssociateColorProfileWithDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, pprofilename, pdevicename) : -1;
#else
    (void)scope;
    (void)pprofilename;
    (void)pdevicename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsCheckColors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcolortransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t ncolors = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ninputchannels = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cdtinput = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pinputdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* paresult = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsCheckColors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata, paresult) : -1;
#else
    (void)hcolortransform;
    (void)ncolors;
    (void)ninputchannels;
    (void)cdtinput;
    (void)cbinput;
    (void)pinputdata;
    (void)paresult;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsCreateIccProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hwcsprofile = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t dwoptions = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsCreateIccProfile")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hwcsprofile, dwoptions) : -1;
#else
    (void)hwcsprofile;
    (void)dwoptions;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsDisassociateColorProfileFromDevice_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsDisassociateColorProfileFromDevice")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, pprofilename, pdevicename) : -1;
#else
    (void)scope;
    (void)pprofilename;
    (void)pdevicename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* penumrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwsize = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* pnprofiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsEnumColorProfiles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, penumrecord, pbuffer, dwsize, pnprofiles) : -1;
#else
    (void)scope;
    (void)penumrecord;
    (void)pbuffer;
    (void)dwsize;
    (void)pnprofiles;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfilesSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* penumrecord = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pdwsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsEnumColorProfilesSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, penumrecord, pdwsize) : -1;
#else
    (void)scope;
    (void)penumrecord;
    (void)pdwsize;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsGetCalibrationManagementState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pbisenabled = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsGetCalibrationManagementState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pbisenabled) : -1;
#else
    (void)pbisenabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cptcolorprofiletype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cpstcolorprofilesubtype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwprofileid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t cbprofilename = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsGetDefaultColorProfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, pdevicename, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, cbprofilename, pprofilename) : -1;
#else
    (void)scope;
    (void)pdevicename;
    (void)cptcolorprofiletype;
    (void)cpstcolorprofilesubtype;
    (void)dwprofileid;
    (void)cbprofilename;
    (void)pprofilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfileSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cptcolorprofiletype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cpstcolorprofilesubtype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwprofileid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pcbprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsGetDefaultColorProfileSize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, pdevicename, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pcbprofilename) : -1;
#else
    (void)scope;
    (void)pdevicename;
    (void)cptcolorprofiletype;
    (void)cpstcolorprofilesubtype;
    (void)dwprofileid;
    (void)pcbprofilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsGetDefaultRenderingIntent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdwrenderingintent = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsGetDefaultRenderingIntent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, pdwrenderingintent) : -1;
#else
    (void)scope;
    (void)pdwrenderingintent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsGetUsePerUserProfiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwdeviceclass = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* puseperuserprofiles = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsGetUsePerUserProfiles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdevicename, dwdeviceclass, puseperuserprofiles) : -1;
#else
    (void)pdevicename;
    (void)dwdeviceclass;
    (void)puseperuserprofiles;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileA_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcdmpprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcampprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pgmmpprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwdesireaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwsharemode = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwcreationmode = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsOpenColorProfileA")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcdmpprofile, pcampprofile, pgmmpprofile, dwdesireaccess, dwsharemode, dwcreationmode, dwflags) : -1;
#else
    (void)pcdmpprofile;
    (void)pcampprofile;
    (void)pgmmpprofile;
    (void)dwdesireaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileW_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pcdmpprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcampprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pgmmpprofile = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t dwdesireaccess = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwsharemode = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    uint32_t dwcreationmode = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    uint32_t dwflags = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsOpenColorProfileW")));
    }
    int64_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pcdmpprofile, pcampprofile, pgmmpprofile, dwdesireaccess, dwsharemode, dwcreationmode, dwflags) : -1;
#else
    (void)pcdmpprofile;
    (void)pcampprofile;
    (void)pgmmpprofile;
    (void)dwdesireaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(km_res)));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsSetCalibrationManagementState_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t bisenabled = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsSetCalibrationManagementState")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bisenabled) : -1;
#else
    (void)bisenabled;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsSetDefaultColorProfile_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t cptcolorprofiletype = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cpstcolorprofilesubtype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t dwprofileid = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pprofilename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsSetDefaultColorProfile")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, pdevicename, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pprofilename) : -1;
#else
    (void)scope;
    (void)pdevicename;
    (void)cptcolorprofiletype;
    (void)cpstcolorprofilesubtype;
    (void)dwprofileid;
    (void)pprofilename;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsSetDefaultRenderingIntent_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int32_t scope = static_cast<int32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    uint32_t dwrenderingintent = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsSetDefaultRenderingIntent")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(scope, dwrenderingintent) : -1;
#else
    (void)scope;
    (void)dwrenderingintent;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsSetUsePerUserProfiles_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* pdevicename = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t dwdeviceclass = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    int32_t useperuserprofiles = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsSetUsePerUserProfiles")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(pdevicename, dwdeviceclass, useperuserprofiles) : -1;
#else
    (void)pdevicename;
    (void)dwdeviceclass;
    (void)useperuserprofiles;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_ui_colorsystem_WcsTranslateColors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    int64_t hcolortransform = km_info.Length() > 0 ? km_napi_arg_i64(km_info[0]) : 0;
    uint32_t ncolors = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t ninputchannels = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t cdtinput = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t cbinput = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* pinputdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    uint32_t noutputchannels = static_cast<uint32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
    int32_t cdtoutput = static_cast<int32_t>(km_info.Length() > 7 ? km_info[7].ToNumber().Int32Value() : 0);
    uint32_t cboutput = static_cast<uint32_t>(km_info.Length() > 8 ? km_info[8].ToNumber().Int32Value() : 0);
    void* poutputdata = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 9 ? km_napi_arg_u64(km_info[9]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, int32_t, uint32_t, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WcsTranslateColors")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata, noutputchannels, cdtoutput, cboutput, poutputdata) : -1;
#else
    (void)hcolortransform;
    (void)ncolors;
    (void)ninputchannels;
    (void)cdtinput;
    (void)cbinput;
    (void)pinputdata;
    (void)noutputchannels;
    (void)cdtoutput;
    (void)cboutput;
    (void)poutputdata;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_ui_colorsystem_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCheckColors", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCheckColors_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCheckColorsInGamut", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCheckColorsInGamut_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCheckRGBs", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCheckRGBs_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMConvertColorNameToIndex", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMConvertColorNameToIndex_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMConvertIndexToColorName", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMConvertIndexToColorName_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCreateDeviceLinkProfile", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCreateDeviceLinkProfile_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCreateMultiProfileTransform", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCreateMultiProfileTransform_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCreateProfile", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCreateProfile_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCreateProfileW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCreateProfileW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCreateTransform", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCreateTransform_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCreateTransformExt", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCreateTransformExt_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCreateTransformExtW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCreateTransformExtW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMCreateTransformW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMCreateTransformW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMDeleteTransform", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMDeleteTransform_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMGetInfo", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMGetInfo_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMGetNamedProfileInfo", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMGetNamedProfileInfo_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMIsProfileValid", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMIsProfileValid_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMTranslateColors", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMTranslateColors_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMTranslateRGB", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMTranslateRGB_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMTranslateRGBs", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMTranslateRGBs_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CMTranslateRGBsExt", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CMTranslateRGBsExt_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CheckBitmapBits", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CheckBitmapBits_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CheckColors", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CheckColors_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CheckColorsInGamut", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CheckColorsInGamut_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CloseColorProfile", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CloseColorProfile_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_ColorCorrectPalette", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_ColorCorrectPalette_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_ColorMatchToTarget", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_ColorMatchToTarget_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_ConvertColorNameToIndex", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_ConvertColorNameToIndex_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_ConvertIndexToColorName", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_ConvertIndexToColorName_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CreateColorSpaceA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CreateColorSpaceA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CreateColorSpaceW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CreateColorSpaceW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CreateColorTransformA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CreateColorTransformA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CreateColorTransformW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CreateColorTransformW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CreateDeviceLinkProfile", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CreateDeviceLinkProfile_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CreateMultiProfileTransform", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CreateMultiProfileTransform_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_DeleteColorSpace", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_DeleteColorSpace_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_DeleteColorTransform", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_DeleteColorTransform_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_EnumColorProfilesA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_EnumColorProfilesA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_EnumColorProfilesW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_EnumColorProfilesW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_EnumICMProfilesA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_EnumICMProfilesA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_EnumICMProfilesW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_EnumICMProfilesW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetCMMInfo", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetCMMInfo_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetColorDirectoryA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetColorDirectoryA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetColorDirectoryW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetColorDirectoryW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetColorProfileElement", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetColorProfileElement_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetColorProfileElementTag", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetColorProfileElementTag_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetColorProfileFromHandle", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetColorProfileFromHandle_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetColorProfileHeader", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetColorProfileHeader_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetColorSpace", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetColorSpace_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetCountColorProfileElements", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetCountColorProfileElements_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetDeviceGammaRamp", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetDeviceGammaRamp_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetICMProfileA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetICMProfileA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetICMProfileW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetICMProfileW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetNamedProfileInfo", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetNamedProfileInfo_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingDictionary", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingDictionary_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingIntent", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingIntent_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetPS2ColorSpaceArray", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetPS2ColorSpaceArray_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_InstallColorProfileA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_InstallColorProfileA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_InstallColorProfileW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_InstallColorProfileW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_IsColorProfileTagPresent", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_IsColorProfileTagPresent_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_IsColorProfileValid", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_IsColorProfileValid_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_OpenColorProfileA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_OpenColorProfileA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_OpenColorProfileW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_OpenColorProfileW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_RegisterCMMA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_RegisterCMMA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_RegisterCMMW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_RegisterCMMW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SelectCMM", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SelectCMM_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetColorProfileElement", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetColorProfileElement_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetColorProfileElementReference", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetColorProfileElementReference_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetColorProfileElementSize", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetColorProfileElementSize_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetColorProfileHeader", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetColorProfileHeader_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetColorSpace", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetColorSpace_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetDeviceGammaRamp", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetDeviceGammaRamp_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetICMMode", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetICMMode_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetICMProfileA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetICMProfileA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetICMProfileW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetICMProfileW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetupColorMatchingA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetupColorMatchingA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_SetupColorMatchingW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_SetupColorMatchingW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_TranslateBitmapBits", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_TranslateBitmapBits_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_TranslateColors", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_TranslateColors_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_UninstallColorProfileA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_UninstallColorProfileA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_UninstallColorProfileW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_UninstallColorProfileW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_UnregisterCMMA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_UnregisterCMMA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_UnregisterCMMW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_UnregisterCMMW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsAssociateColorProfileWithDevice", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsAssociateColorProfileWithDevice_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsCheckColors", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsCheckColors_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsCreateIccProfile", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsCreateIccProfile_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsDisassociateColorProfileFromDevice", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsDisassociateColorProfileFromDevice_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfiles", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfiles_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfilesSize", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfilesSize_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsGetCalibrationManagementState", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsGetCalibrationManagementState_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfile", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfile_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfileSize", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfileSize_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsGetDefaultRenderingIntent", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsGetDefaultRenderingIntent_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsGetUsePerUserProfiles", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsGetUsePerUserProfiles_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileA", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileA_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileW", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileW_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsSetCalibrationManagementState", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsSetCalibrationManagementState_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsSetDefaultColorProfile", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsSetDefaultColorProfile_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsSetDefaultRenderingIntent", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsSetDefaultRenderingIntent_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsSetUsePerUserProfiles", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsSetUsePerUserProfiles_napi));
    exports.Set("windowssys_windows_win32_ui_colorsystem_WcsTranslateColors", Napi::Function::New(env, windowssys_windows_win32_ui_colorsystem_WcsTranslateColors_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_ui_colorsystem_napi, nullptr };
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
