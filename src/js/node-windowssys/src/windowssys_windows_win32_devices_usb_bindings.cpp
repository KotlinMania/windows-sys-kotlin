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

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_AbortPipe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t pipeid = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_AbortPipe")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, pipeid) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_FlushPipe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t pipeid = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_FlushPipe")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, pipeid) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_Free_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_Free")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle) : -1;
#else
    (void)interfacehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_GetAdjustedFrameNumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* currentframenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    int64_t timestamp = km_info.Length() > 1 ? km_napi_arg_i64(km_info[1]) : 0;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_GetAdjustedFrameNumber")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(currentframenumber, timestamp) : -1;
#else
    (void)currentframenumber;
    (void)timestamp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_GetAssociatedInterface_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t associatedinterfaceindex = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* associatedinterfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_GetAssociatedInterface")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, associatedinterfaceindex, associatedinterfacehandle) : -1;
#else
    (void)interfacehandle;
    (void)associatedinterfaceindex;
    (void)associatedinterfacehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_GetCurrentAlternateSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* settingnumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_GetCurrentAlternateSetting")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, settingnumber) : -1;
#else
    (void)interfacehandle;
    (void)settingnumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumber_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* currentframenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* timestamp = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_GetCurrentFrameNumber")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, currentframenumber, timestamp) : -1;
#else
    (void)interfacehandle;
    (void)currentframenumber;
    (void)timestamp;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumberAndQpc_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* frameqpcinfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_GetCurrentFrameNumberAndQpc")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, frameqpcinfo) : -1;
#else
    (void)interfacehandle;
    (void)frameqpcinfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_GetDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t descriptortype = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t arg_2_index = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint16_t languageid = static_cast<uint16_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    void* lengthtransferred = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, uint16_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_GetDescriptor")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, descriptortype, arg_2_index, languageid, buffer, bufferlength, lengthtransferred) : -1;
#else
    (void)interfacehandle;
    (void)descriptortype;
    (void)arg_2_index;
    (void)languageid;
    (void)buffer;
    (void)bufferlength;
    (void)lengthtransferred;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_GetOverlappedResult_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* lpoverlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    void* lpnumberofbytestransferred = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t bwait = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_GetOverlappedResult")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, lpoverlapped, lpnumberofbytestransferred, bwait) : -1;
#else
    (void)interfacehandle;
    (void)lpoverlapped;
    (void)lpnumberofbytestransferred;
    (void)bwait;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_GetPipePolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t pipeid = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t policytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* valuelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_GetPipePolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, pipeid, policytype, valuelength, value) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)policytype;
    (void)valuelength;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_GetPowerPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t policytype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* valuelength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_GetPowerPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, policytype, valuelength, value) : -1;
#else
    (void)interfacehandle;
    (void)policytype;
    (void)valuelength;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_Initialize_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* devicehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_Initialize")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(devicehandle, interfacehandle) : -1;
#else
    (void)devicehandle;
    (void)interfacehandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_ParseConfigurationDescriptor_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* configurationdescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* startposition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
    int32_t interfacenumber = static_cast<int32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t alternatesetting = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    int32_t interfaceclass = static_cast<int32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    int32_t interfacesubclass = static_cast<int32_t>(km_info.Length() > 5 ? km_info[5].ToNumber().Int32Value() : 0);
    int32_t interfaceprotocol = static_cast<int32_t>(km_info.Length() > 6 ? km_info[6].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_ParseConfigurationDescriptor")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(configurationdescriptor, startposition, interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol) : NULL;
#else
    (void)configurationdescriptor;
    (void)startposition;
    (void)interfacenumber;
    (void)alternatesetting;
    (void)interfaceclass;
    (void)interfacesubclass;
    (void)interfaceprotocol;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_ParseDescriptors_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* descriptorbuffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t totallength = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* startposition = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    int32_t descriptortype = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_ParseDescriptors")));
    }
    void* km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(descriptorbuffer, totallength, startposition, descriptortype) : NULL;
#else
    (void)descriptorbuffer;
    (void)totallength;
    (void)startposition;
    (void)descriptortype;
    void* km_res = NULL;
#endif
    return Napi::String::New(km_env, std::to_string(static_cast<int64_t>(reinterpret_cast<uintptr_t>(km_res))));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_QueryDeviceInformation_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t informationtype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* bufferlength = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_QueryDeviceInformation")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, informationtype, bufferlength, buffer) : -1;
#else
    (void)interfacehandle;
    (void)informationtype;
    (void)bufferlength;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_QueryInterfaceSettings_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t alternateinterfacenumber = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* usbaltinterfacedescriptor = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_QueryInterfaceSettings")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, alternateinterfacenumber, usbaltinterfacedescriptor) : -1;
#else
    (void)interfacehandle;
    (void)alternateinterfacenumber;
    (void)usbaltinterfacedescriptor;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_QueryPipe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t alternateinterfacenumber = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t pipeindex = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pipeinformation = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_QueryPipe")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, alternateinterfacenumber, pipeindex, pipeinformation) : -1;
#else
    (void)interfacehandle;
    (void)alternateinterfacenumber;
    (void)pipeindex;
    (void)pipeinformation;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_QueryPipeEx_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t alternatesettingnumber = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint8_t pipeindex = static_cast<uint8_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* pipeinformationex = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_QueryPipeEx")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, alternatesettingnumber, pipeindex, pipeinformationex) : -1;
#else
    (void)interfacehandle;
    (void)alternatesettingnumber;
    (void)pipeindex;
    (void)pipeinformationex;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bufferhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* framenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    uint32_t numberofpackets = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* isopacketdescriptors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_ReadIsochPipe")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bufferhandle, offset, length, framenumber, numberofpackets, isopacketdescriptors, overlapped) : -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)framenumber;
    (void)numberofpackets;
    (void)isopacketdescriptors;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipeAsap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bufferhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t continuestream = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    uint32_t numberofpackets = static_cast<uint32_t>(km_info.Length() > 4 ? km_info[4].ToNumber().Int32Value() : 0);
    void* isopacketdescriptors = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 6 ? km_napi_arg_u64(km_info[6]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_ReadIsochPipeAsap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bufferhandle, offset, length, continuestream, numberofpackets, isopacketdescriptors, overlapped) : -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)continuestream;
    (void)numberofpackets;
    (void)isopacketdescriptors;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_ReadPipe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t pipeid = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lengthtransferred = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_ReadPipe")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, pipeid, buffer, bufferlength, lengthtransferred, overlapped) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)buffer;
    (void)bufferlength;
    (void)lengthtransferred;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_RegisterIsochBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t pipeid = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* isochbufferhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_RegisterIsochBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, pipeid, buffer, bufferlength, isochbufferhandle) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)buffer;
    (void)bufferlength;
    (void)isochbufferhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_ResetPipe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t pipeid = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_ResetPipe")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, pipeid) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_SetCurrentAlternateSetting_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t settingnumber = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_SetCurrentAlternateSetting")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, settingnumber) : -1;
#else
    (void)interfacehandle;
    (void)settingnumber;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_SetPipePolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t pipeid = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t policytype = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    uint32_t valuelength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_SetPipePolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, pipeid, policytype, valuelength, value) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)policytype;
    (void)valuelength;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_SetPowerPolicy_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t policytype = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t valuelength = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* value = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_SetPowerPolicy")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, policytype, valuelength, value) : -1;
#else
    (void)interfacehandle;
    (void)policytype;
    (void)valuelength;
    (void)value;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_StartTrackingForTimeSync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* starttrackinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_StartTrackingForTimeSync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, starttrackinginfo) : -1;
#else
    (void)interfacehandle;
    (void)starttrackinginfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_StopTrackingForTimeSync_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    void* stoptrackinginfo = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 1 ? km_napi_arg_u64(km_info[1]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_StopTrackingForTimeSync")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, stoptrackinginfo) : -1;
#else
    (void)interfacehandle;
    (void)stoptrackinginfo;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_UnregisterIsochBuffer_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* isochbufferhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_UnregisterIsochBuffer")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(isochbufferhandle) : -1;
#else
    (void)isochbufferhandle;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bufferhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    void* framenumber = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 3 ? km_napi_arg_u64(km_info[3]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_WriteIsochPipe")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bufferhandle, offset, length, framenumber, overlapped) : -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)framenumber;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipeAsap_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* bufferhandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint32_t offset = static_cast<uint32_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    uint32_t length = static_cast<uint32_t>(km_info.Length() > 2 ? km_info[2].ToNumber().Int32Value() : 0);
    int32_t continuestream = static_cast<int32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_WriteIsochPipeAsap")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(bufferhandle, offset, length, continuestream, overlapped) : -1;
#else
    (void)bufferhandle;
    (void)offset;
    (void)length;
    (void)continuestream;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static Napi::Value windowssys_windows_win32_devices_usb_WinUsb_WritePipe_napi(const Napi::CallbackInfo& km_info) {
    Napi::Env km_env = km_info.Env();
    void* interfacehandle = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 0 ? km_napi_arg_u64(km_info[0]) : 0));
    uint8_t pipeid = static_cast<uint8_t>(km_info.Length() > 1 ? km_info[1].ToNumber().Int32Value() : 0);
    void* buffer = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 2 ? km_napi_arg_u64(km_info[2]) : 0));
    uint32_t bufferlength = static_cast<uint32_t>(km_info.Length() > 3 ? km_info[3].ToNumber().Int32Value() : 0);
    void* lengthtransferred = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 4 ? km_napi_arg_u64(km_info[4]) : 0));
    void* overlapped = reinterpret_cast<void*>(static_cast<uintptr_t>(km_info.Length() > 5 ? km_napi_arg_u64(km_info[5]) : 0));
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = nullptr;
    if (km_fn_ptr == nullptr) {
        HMODULE km_h_mod = LoadLibraryA("winusb.dll");
        if (km_h_mod != nullptr) km_fn_ptr = reinterpret_cast<km_fn_t>(reinterpret_cast<void*>(GetProcAddress(km_h_mod, "WinUsb_WritePipe")));
    }
    int32_t km_res = (km_fn_ptr != nullptr) ? km_fn_ptr(interfacehandle, pipeid, buffer, bufferlength, lengthtransferred, overlapped) : -1;
#else
    (void)interfacehandle;
    (void)pipeid;
    (void)buffer;
    (void)bufferlength;
    (void)lengthtransferred;
    (void)overlapped;
    int32_t km_res = -1;
#endif
    return Napi::Number::New(km_env, static_cast<int32_t>(km_res));
}

static void register_windows_win32_devices_usb_napi(Napi::Env env, Napi::Object exports) {
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_AbortPipe", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_AbortPipe_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_FlushPipe", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_FlushPipe_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_Free", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_Free_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_GetAdjustedFrameNumber", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_GetAdjustedFrameNumber_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_GetAssociatedInterface", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_GetAssociatedInterface_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_GetCurrentAlternateSetting", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_GetCurrentAlternateSetting_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumber", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumber_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumberAndQpc", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumberAndQpc_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_GetDescriptor", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_GetDescriptor_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_GetOverlappedResult", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_GetOverlappedResult_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_GetPipePolicy", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_GetPipePolicy_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_GetPowerPolicy", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_GetPowerPolicy_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_Initialize", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_Initialize_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_ParseConfigurationDescriptor", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_ParseConfigurationDescriptor_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_ParseDescriptors", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_ParseDescriptors_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_QueryDeviceInformation", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_QueryDeviceInformation_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_QueryInterfaceSettings", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_QueryInterfaceSettings_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_QueryPipe", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_QueryPipe_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_QueryPipeEx", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_QueryPipeEx_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipe", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipe_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipeAsap", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipeAsap_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_ReadPipe", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_ReadPipe_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_RegisterIsochBuffer", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_RegisterIsochBuffer_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_ResetPipe", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_ResetPipe_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_SetCurrentAlternateSetting", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_SetCurrentAlternateSetting_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_SetPipePolicy", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_SetPipePolicy_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_SetPowerPolicy", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_SetPowerPolicy_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_StartTrackingForTimeSync", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_StartTrackingForTimeSync_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_StopTrackingForTimeSync", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_StopTrackingForTimeSync_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_UnregisterIsochBuffer", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_UnregisterIsochBuffer_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipe", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipe_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipeAsap", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipeAsap_napi));
    exports.Set("windowssys_windows_win32_devices_usb_WinUsb_WritePipe", Napi::Function::New(env, windowssys_windows_win32_devices_usb_WinUsb_WritePipe_napi));
}

static KmNapiRegistrarNode registrar_node = { &register_windows_win32_devices_usb_napi, nullptr };
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
