#include <napi.h>
#include <cstdint>
#include <cstdlib>
#include <cstring>
#include <string>
#include <vector>

#include <stdlib.h>
#include <string.h>
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#include <windows.h>
#endif

typedef struct { uint32_t d1; uint16_t d2; uint16_t d3; uint8_t d4[8]; } km_win32_guid_t;
static km_win32_guid_t km_guid_ring[64];
static uint32_t km_guid_ring_idx = 0;

#ifdef _WIN32
static FARPROC km_resolve_win32_proc(const char* dll, const char* symbol) {
    if (!dll || !symbol) return NULL;
    HMODULE mod = GetModuleHandleA(dll);
    if (!mod) mod = LoadLibraryA(dll);
    if (!mod) return NULL;
    return GetProcAddress(mod, symbol);
}

static uintptr_t km_call_raw_proc(FARPROC proc, int32_t argc, const int64_t* a) {
    uintptr_t u[16];
    int32_t i;
    for (i = 0; i < 16; ++i) u[i] = (a && i < argc) ? (uintptr_t)a[i] : 0;
    switch (argc <= 0 ? 0 : (argc > 16 ? 16 : argc)) {
        case 0: { typedef uintptr_t (__stdcall *fn_t)(void); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(); }
        case 1: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0]); }
        case 2: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1]); }
        case 3: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2]); }
        case 4: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3]); }
        case 5: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4]); }
        case 6: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5]); }
        case 7: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6]); }
        case 8: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7]); }
        case 9: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8]); }
        case 10: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9]); }
        case 11: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10]); }
        case 12: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11]); }
        case 13: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12]); }
        case 14: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12], u[13]); }
        case 15: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12], u[13], u[14]); }
        case 16: { typedef uintptr_t (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12], u[13], u[14], u[15]); }
        default: return 0;
    }
}

static double km_bits_to_f64(int64_t bits) { double d = 0.0; memcpy(&d, &bits, sizeof(d)); return d; }
static float km_bits_to_f32(int64_t bits) { uint32_t b = (uint32_t)bits; float f = 0.0f; memcpy(&f, &b, sizeof(f)); return f; }

static double km_call_fp_proc(FARPROC proc, int32_t fp_mask, int32_t ret_f32, int32_t argc, const int64_t* a) {
    uintptr_t u[16];
    int32_t i;
    for (i = 0; i < 16; ++i) u[i] = (a && i < argc) ? (uintptr_t)a[i] : 0;
    int32_t m0 = fp_mask & 3;
    int32_t m1 = (fp_mask >> 2) & 3;
    if (ret_f32) {
        if (m0 == 1 && m1 == 1) { typedef float (__stdcall *fn_t)(float, float, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return (double)fn(km_bits_to_f32(a ? a[0] : 0), km_bits_to_f32(a && argc > 1 ? a[1] : 0), u[2], u[3], u[4], u[5], u[6], u[7]); }
        if (m0 == 1) { typedef float (__stdcall *fn_t)(float, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return (double)fn(km_bits_to_f32(a ? a[0] : 0), u[1], u[2], u[3], u[4], u[5], u[6], u[7]); }
        if (m0 == 2) { typedef float (__stdcall *fn_t)(double, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return (double)fn(km_bits_to_f64(a ? a[0] : 0), u[1], u[2], u[3], u[4], u[5], u[6], u[7]); }
        { typedef float (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return (double)fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12], u[13], u[14], u[15]); }
    } else {
        if (m0 == 2 && m1 == 2) { typedef double (__stdcall *fn_t)(double, double, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(km_bits_to_f64(a ? a[0] : 0), km_bits_to_f64(a && argc > 1 ? a[1] : 0), u[2], u[3], u[4], u[5], u[6], u[7]); }
        if (m0 == 2) { typedef double (__stdcall *fn_t)(double, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(km_bits_to_f64(a ? a[0] : 0), u[1], u[2], u[3], u[4], u[5], u[6], u[7]); }
        if (m0 == 1) { typedef double (__stdcall *fn_t)(float, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(km_bits_to_f32(a ? a[0] : 0), u[1], u[2], u[3], u[4], u[5], u[6], u[7]); }
        { typedef double (__stdcall *fn_t)(uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t); fn_t fn = NULL; memcpy(&fn, &proc, sizeof(fn)); return fn(u[0], u[1], u[2], u[3], u[4], u[5], u[6], u[7], u[8], u[9], u[10], u[11], u[12], u[13], u[14], u[15]); }
    }
}
#endif

int32_t napi_win32_is_windows_host(void) {
#ifdef _WIN32
    return 1;
#else
    return 0;
#endif
}

int64_t napi_win32_invoke(const char* dll, const char* symbol, int32_t argc, const int64_t* argv, int32_t* status_out) {
#ifdef _WIN32
    FARPROC proc = km_resolve_win32_proc(dll, symbol);
    if (!proc) { if (status_out) *status_out = -1; return 0; }
    if (status_out) *status_out = 0;
    return (int64_t)km_call_raw_proc(proc, argc, argv);
#else
    (void)dll; (void)symbol; (void)argc; (void)argv;
    if (status_out) *status_out = -2;
    return 0;
#endif
}

double napi_win32_invoke_fp(const char* dll, const char* symbol, int32_t fp_mask, int32_t ret_f32, int32_t argc, const int64_t* argv, int32_t* status_out) {
#ifdef _WIN32
    FARPROC proc = km_resolve_win32_proc(dll, symbol);
    if (!proc) { if (status_out) *status_out = -1; return 0.0; }
    if (status_out) *status_out = 0;
    return km_call_fp_proc(proc, fp_mask, ret_f32, argc, argv);
#else
    (void)dll; (void)symbol; (void)fp_mask; (void)ret_f32; (void)argc; (void)argv;
    if (status_out) *status_out = -2;
    return 0.0;
#endif
}

int64_t napi_win32_invoke_ptr(int64_t fn_ptr, int32_t argc, const int64_t* argv, int32_t* status_out) {
#ifdef _WIN32
    FARPROC proc = NULL;
    uintptr_t raw = (uintptr_t)fn_ptr;
    if (raw == 0) { if (status_out) *status_out = -1; return 0; }
    memcpy(&proc, &raw, sizeof(proc));
    if (status_out) *status_out = 0;
    return (int64_t)km_call_raw_proc(proc, argc, argv);
#else
    (void)fn_ptr; (void)argc; (void)argv;
    if (status_out) *status_out = -2;
    return 0;
#endif
}

int64_t napi_win32_guid_slot(uint32_t d1, uint16_t d2, uint16_t d3, const uint8_t* d4) {
    uint32_t slot = (km_guid_ring_idx++) & 63u;
    km_guid_ring[slot].d1 = d1;
    km_guid_ring[slot].d2 = d2;
    km_guid_ring[slot].d3 = d3;
    if (d4) memcpy(km_guid_ring[slot].d4, d4, 8);
    else memset(km_guid_ring[slot].d4, 0, 8);
    return (int64_t)(uintptr_t)&km_guid_ring[slot];
}

int64_t napi_win32_alloc_zeroed(int32_t size) {
    size_t n = size > 0 ? (size_t)size : 1u;
    void* p = calloc(1u, n);
    return (int64_t)(uintptr_t)p;
}

void napi_win32_free_mem(int64_t addr) {
    if (addr != 0) free((void*)(uintptr_t)addr);
}

void napi_win32_read_bytes(int64_t addr, int32_t len, uint8_t* dst) {
    if (addr != 0 && len > 0 && dst) memcpy(dst, (const void*)(uintptr_t)addr, (size_t)len);
}

void napi_win32_write_bytes(int64_t addr, int32_t len, const uint8_t* src) {
    if (addr != 0 && len > 0 && src) memcpy((void*)(uintptr_t)addr, src, (size_t)len);
}

namespace {

int64_t unpackLoHi(int32_t lo, int32_t hi) {
    return (static_cast<int64_t>(hi) << 32) | (static_cast<int64_t>(static_cast<uint32_t>(lo)));
}

std::vector<int64_t> extractArgsFromFlatArray(const Napi::Array& flat) {
    uint32_t len = flat.Length();
    uint32_t count = len / 2;
    std::vector<int64_t> out(count);
    for (uint32_t i = 0; i < count; ++i) {
        int32_t lo = flat.Get(i * 2).As<Napi::Number>().Int32Value();
        int32_t hi = flat.Get(i * 2 + 1).As<Napi::Number>().Int32Value();
        out[i] = unpackLoHi(lo, hi);
    }
    return out;
}

Napi::Value IsWindowsHostWrapped(const Napi::CallbackInfo& info) {
    return Napi::Boolean::New(info.Env(), napi_win32_is_windows_host() != 0);
}

Napi::Value InvokeLoHiWrapped(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    std::string dll = info[0].As<Napi::String>().Utf8Value();
    std::string sym = info[1].As<Napi::String>().Utf8Value();
    std::vector<int64_t> argv = extractArgsFromFlatArray(info[2].As<Napi::Array>());
    int32_t status = 0;
    int64_t ret = napi_win32_invoke(dll.c_str(), sym.c_str(), static_cast<int32_t>(argv.size()), argv.empty() ? nullptr : argv.data(), &status);
    Napi::Array out = Napi::Array::New(env, 3);
    out.Set(uint32_t{0}, Napi::Number::New(env, static_cast<int32_t>(ret & 0xFFFFFFFFLL)));
    out.Set(uint32_t{1}, Napi::Number::New(env, static_cast<int32_t>(static_cast<uint64_t>(ret) >> 32)));
    out.Set(uint32_t{2}, Napi::Number::New(env, status));
    return out;
}

Napi::Value InvokeFpPairWrapped(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    std::string dll = info[0].As<Napi::String>().Utf8Value();
    std::string sym = info[1].As<Napi::String>().Utf8Value();
    int32_t fpMask = info[2].As<Napi::Number>().Int32Value();
    int32_t retF32 = info[3].As<Napi::Number>().Int32Value();
    std::vector<int64_t> argv = extractArgsFromFlatArray(info[4].As<Napi::Array>());
    int32_t status = 0;
    double ret = napi_win32_invoke_fp(dll.c_str(), sym.c_str(), fpMask, retF32, static_cast<int32_t>(argv.size()), argv.empty() ? nullptr : argv.data(), &status);
    Napi::Array out = Napi::Array::New(env, 2);
    out.Set(uint32_t{0}, Napi::Number::New(env, ret));
    out.Set(uint32_t{1}, Napi::Number::New(env, status));
    return out;
}

Napi::Value InvokePtrLoHiWrapped(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    int32_t lo = info[0].As<Napi::Number>().Int32Value();
    int32_t hi = info[1].As<Napi::Number>().Int32Value();
    std::vector<int64_t> argv = extractArgsFromFlatArray(info[2].As<Napi::Array>());
    int32_t status = 0;
    int64_t ret = napi_win32_invoke_ptr(unpackLoHi(lo, hi), static_cast<int32_t>(argv.size()), argv.empty() ? nullptr : argv.data(), &status);
    Napi::Array out = Napi::Array::New(env, 3);
    out.Set(uint32_t{0}, Napi::Number::New(env, static_cast<int32_t>(ret & 0xFFFFFFFFLL)));
    out.Set(uint32_t{1}, Napi::Number::New(env, static_cast<int32_t>(static_cast<uint64_t>(ret) >> 32)));
    out.Set(uint32_t{2}, Napi::Number::New(env, status));
    return out;
}

Napi::Value AllocZeroedLoHiWrapped(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    int32_t size = info[0].As<Napi::Number>().Int32Value();
    int64_t ptr = napi_win32_alloc_zeroed(size);
    Napi::Array out = Napi::Array::New(env, 2);
    out.Set(uint32_t{0}, Napi::Number::New(env, static_cast<int32_t>(ptr & 0xFFFFFFFFLL)));
    out.Set(uint32_t{1}, Napi::Number::New(env, static_cast<int32_t>(static_cast<uint64_t>(ptr) >> 32)));
    return out;
}

Napi::Value FreeMemLoHiWrapped(const Napi::CallbackInfo& info) {
    int32_t lo = info[0].As<Napi::Number>().Int32Value();
    int32_t hi = info[1].As<Napi::Number>().Int32Value();
    napi_win32_free_mem(unpackLoHi(lo, hi));
    return info.Env().Undefined();
}

Napi::Value ReadBytesLoHiWrapped(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    int32_t lo = info[0].As<Napi::Number>().Int32Value();
    int32_t hi = info[1].As<Napi::Number>().Int32Value();
    int32_t len = info[2].As<Napi::Number>().Int32Value();
    int64_t addr = unpackLoHi(lo, hi);
    uint32_t count = (len > 0 && addr != 0) ? static_cast<uint32_t>(len) : 0;
    Napi::Array out = Napi::Array::New(env, count);
    if (count > 0) {
        std::vector<uint8_t> buf(count);
        napi_win32_read_bytes(addr, len, buf.data());
        for (uint32_t i = 0; i < count; ++i) {
            out.Set(i, Napi::Number::New(env, static_cast<int32_t>(buf[i])));
        }
    }
    return out;
}

Napi::Value WriteBytesLoHiWrapped(const Napi::CallbackInfo& info) {
    int32_t lo = info[0].As<Napi::Number>().Int32Value();
    int32_t hi = info[1].As<Napi::Number>().Int32Value();
    Napi::Array src = info[2].As<Napi::Array>();
    int64_t addr = unpackLoHi(lo, hi);
    uint32_t count = src.Length();
    if (count > 0 && addr != 0) {
        std::vector<uint8_t> buf(count);
        for (uint32_t i = 0; i < count; ++i) {
            buf[i] = static_cast<uint8_t>(src.Get(i).As<Napi::Number>().Int32Value() & 0xFF);
        }
        napi_win32_write_bytes(addr, static_cast<int32_t>(count), buf.data());
    }
    return info.Env().Undefined();
}

Napi::Object Init(Napi::Env env, Napi::Object exports) {
    exports.Set("isWindowsHost", Napi::Function::New(env, IsWindowsHostWrapped));
    exports.Set("invokeLoHi", Napi::Function::New(env, InvokeLoHiWrapped));
    exports.Set("invokeFpPair", Napi::Function::New(env, InvokeFpPairWrapped));
    exports.Set("invokePtrLoHi", Napi::Function::New(env, InvokePtrLoHiWrapped));
    exports.Set("allocZeroedLoHi", Napi::Function::New(env, AllocZeroedLoHiWrapped));
    exports.Set("freeMemLoHi", Napi::Function::New(env, FreeMemLoHiWrapped));
    exports.Set("readBytesLoHi", Napi::Function::New(env, ReadBytesLoHiWrapped));
    exports.Set("writeBytesLoHi", Napi::Function::New(env, WriteBytesLoHiWrapped));
    return exports;
}

}  // namespace

NODE_API_MODULE(addon, Init)
