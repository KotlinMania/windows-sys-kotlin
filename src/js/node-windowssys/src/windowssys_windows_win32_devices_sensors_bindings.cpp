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

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListAllocateBufferAndSerialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcecollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* ptargetbuffersizeinbytes = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* ptargetbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListAllocateBufferAndSerialize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcecollection, ptargetbuffersizeinbytes, ptargetbuffer) : -1;
#else
    (void)sourcecollection;
    (void)ptargetbuffersizeinbytes;
    (void)ptargetbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListCopyAndMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* target = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListCopyAndMarshall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target, source) : -1;
#else
    (void)target;
    (void)source;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListDeserializeFromBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sourcebuffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* sourcebuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* targetcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListDeserializeFromBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcebuffersizeinbytes, sourcebuffer, targetcollection) : -1;
#else
    (void)sourcebuffersizeinbytes;
    (void)sourcebuffer;
    (void)targetcollection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListGetFillableCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t buffersizebytes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListGetFillableCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersizebytes) : 0;
#else
    (void)buffersizebytes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* collection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListGetMarshalledSize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(collection) : 0;
#else
    (void)collection;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSizeWithoutSerialization_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* collection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListGetMarshalledSizeWithoutSerialization")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(collection) : 0;
#else
    (void)collection;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListGetSerializedSize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* collection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListGetSerializedSize")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(collection) : 0;
#else
    (void)collection;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListMarshall_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* target = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListMarshall")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target) : -1;
#else
    (void)target;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListSerializeToBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* sourcecollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t targetbuffersizeinbytes = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* targetbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListSerializeToBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sourcecollection, targetbuffersizeinbytes, targetbuffer) : -1;
#else
    (void)sourcecollection;
    (void)targetbuffersizeinbytes;
    (void)targetbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListSortSubscribedActivitiesByConfidence_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* thresholds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pcollection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListSortSubscribedActivitiesByConfidence")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(thresholds, pcollection) : -1;
#else
    (void)thresholds;
    (void)pcollection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_CollectionsListUpdateMarshalledPointer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* collection = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "CollectionsListUpdateMarshalledPointer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(collection) : -1;
#else
    (void)collection;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_EvaluateActivityThresholds_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* newsample = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* oldsample = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* thresholds = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "EvaluateActivityThresholds")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(newsample, oldsample, thresholds) : false;
#else
    (void)newsample;
    (void)oldsample;
    (void)thresholds;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_sensors_GetPerformanceTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* timems = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "GetPerformanceTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(timems) : -1;
#else
    (void)timems;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_InitPropVariantFromCLSIDArray_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* members = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t size = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromCLSIDArray")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(members, size, ppropvar) : -1;
#else
    (void)members;
    (void)size;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_InitPropVariantFromFloat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    float fltval = km_info.Length() > 0 ? km_info[0].ToNumber().FloatValue() : 0.0f;
    void* ppropvar = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "InitPropVariantFromFloat")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(fltval, ppropvar) : -1;
#else
    (void)fltval;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_IsCollectionListSame_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* lista = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* listb = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsCollectionListSame")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(lista, listb) : false;
#else
    (void)lista;
    (void)listb;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_sensors_IsGUIDPresentInList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* guidarray = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t arraylength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* guidelem = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsGUIDPresentInList")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(guidarray, arraylength, guidelem) : false;
#else
    (void)guidarray;
    (void)arraylength;
    (void)guidelem;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_sensors_IsKeyPresentInCollectionList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsKeyPresentInCollectionList")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey) : false;
#else
    (void)plist;
    (void)pkey;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_sensors_IsKeyPresentInPropertyList_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "IsKeyPresentInPropertyList")));
    }
    bool km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey) : false;
#else
    (void)plist;
    (void)pkey;
    bool km_res = false;
#endif
    return Napi::Boolean::New(km_env, km_res);
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetBool_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetBool")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetDouble_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetDouble")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFileTime_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetFileTime")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFloat_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetFloat")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetGuid_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetGuid")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt32_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetInt32")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetInt64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthInt64_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t occurrence = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthInt64")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, occurrence, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUlong_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t occurrence = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthUlong")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, occurrence, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUshort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    uint32_t occurrence = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthUshort")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, occurrence, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetPropVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool typecheck = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* pvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetPropVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, typecheck, pvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)typecheck;
    (void)pvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUlong_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetUlong")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUshort_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pretvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeyGetUshort")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropKeyFindKeySetPropVariant_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* plist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    bool typecheck = km_info.Length() > 2 ? km_info[2].ToBoolean().Value() : false;
    void* pvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropKeyFindKeySetPropVariant")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(plist, pkey, typecheck, pvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)typecheck;
    (void)pvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropVariantGetInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* propvariantvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* propvariantoffset = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* propvariantsize = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* propvariantpointer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* remappedtype = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropVariantGetInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(propvariantvalue, propvariantoffset, propvariantsize, propvariantpointer, remappedtype) : -1;
#else
    (void)propvariantvalue;
    (void)propvariantoffset;
    (void)propvariantsize;
    (void)propvariantpointer;
    (void)remappedtype;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropertiesListCopy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* target = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* source = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropertiesListCopy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(target, source) : -1;
#else
    (void)target;
    (void)source;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_PropertiesListGetFillableCount_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t buffersizebytes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "PropertiesListGetFillableCount")));
    }
    uint32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(buffersizebytes) : 0;
#else
    (void)buffersizebytes;
    uint32_t km_res = 0;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_SensorCollectionGetAt_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t arg_0_index = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* psensorslist = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* pkey = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* pvalue = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SensorCollectionGetAt")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(arg_0_index, psensorslist, pkey, pvalue) : -1;
#else
    (void)arg_0_index;
    (void)psensorslist;
    (void)pkey;
    (void)pvalue;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_SerializationBufferAllocate_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    uint32_t sizeinbytes = static_cast<uint32_t>(km_info.Length() > 0 ? km_info[0].ToNumber().Int32Value() : 0);
    void* pbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SerializationBufferAllocate")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(sizeinbytes, pbuffer) : -1;
#else
    (void)sizeinbytes;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_sensors_SerializationBufferFree_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "SerializationBufferFree")));
    }
    if (km_fn_ptr != nullptr) km_fn_ptr(buffer);
#else
    (void)buffer;
#endif
    return km_env.Undefined();
}

static void register_windows_win32_devices_sensors_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListAllocateBufferAndSerialize", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListAllocateBufferAndSerialize_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListCopyAndMarshall", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListCopyAndMarshall_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListDeserializeFromBuffer", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListDeserializeFromBuffer_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListGetFillableCount", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListGetFillableCount_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSize", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSize_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSizeWithoutSerialization", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSizeWithoutSerialization_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListGetSerializedSize", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListGetSerializedSize_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListMarshall", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListMarshall_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListSerializeToBuffer", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListSerializeToBuffer_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListSortSubscribedActivitiesByConfidence", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListSortSubscribedActivitiesByConfidence_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_CollectionsListUpdateMarshalledPointer", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_CollectionsListUpdateMarshalledPointer_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_EvaluateActivityThresholds", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_EvaluateActivityThresholds_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_GetPerformanceTime", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_GetPerformanceTime_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_InitPropVariantFromCLSIDArray", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_InitPropVariantFromCLSIDArray_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_InitPropVariantFromFloat", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_InitPropVariantFromFloat_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_IsCollectionListSame", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_IsCollectionListSame_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_IsGUIDPresentInList", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_IsGUIDPresentInList_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_IsKeyPresentInCollectionList", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_IsKeyPresentInCollectionList_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_IsKeyPresentInPropertyList", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_IsKeyPresentInPropertyList_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetBool", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetBool_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetDouble", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetDouble_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFileTime", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFileTime_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFloat", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFloat_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetGuid", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetGuid_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt32", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt32_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt64", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt64_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthInt64", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthInt64_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUlong", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUlong_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUshort", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUshort_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetPropVariant", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetPropVariant_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUlong", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUlong_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUshort", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUshort_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropKeyFindKeySetPropVariant", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropKeyFindKeySetPropVariant_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropVariantGetInformation", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropVariantGetInformation_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropertiesListCopy", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropertiesListCopy_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_PropertiesListGetFillableCount", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_PropertiesListGetFillableCount_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_SensorCollectionGetAt", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_SensorCollectionGetAt_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_SerializationBufferAllocate", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_SerializationBufferAllocate_napi));
    exports.Set("windowssys_windows_win32_devices_sensors_SerializationBufferFree", Napi::Function::New(env, windowssys_windows_win32_devices_sensors_SerializationBufferFree_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_devices_sensors_napi, nullptr };
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
