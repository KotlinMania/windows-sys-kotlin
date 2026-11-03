#include <jni.h>
#include <stdint.h>
#include <stdio.h>
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

static int32_t windowssys_jni_impl_is_windows_host(void) {
#ifdef _WIN32
    return 1;
#else
    return 0;
#endif
}

static int64_t windowssys_jni_impl_invoke(const char* dll, const char* symbol, int32_t argc, const int64_t* argv, int32_t* status_out) {
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

static double windowssys_jni_impl_invoke_fp(const char* dll, const char* symbol, int32_t fp_mask, int32_t ret_f32, int32_t argc, const int64_t* argv, int32_t* status_out) {
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

static int64_t windowssys_jni_impl_invoke_ptr(int64_t fn_ptr, int32_t argc, const int64_t* argv, int32_t* status_out) {
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

static int64_t windowssys_jni_impl_guid_slot(uint32_t d1, uint16_t d2, uint16_t d3, const uint8_t* d4) {
    uint32_t slot = (km_guid_ring_idx++) & 63u;
    km_guid_ring[slot].d1 = d1;
    km_guid_ring[slot].d2 = d2;
    km_guid_ring[slot].d3 = d3;
    if (d4) memcpy(km_guid_ring[slot].d4, d4, 8);
    else memset(km_guid_ring[slot].d4, 0, 8);
    return (int64_t)(uintptr_t)&km_guid_ring[slot];
}

static int64_t windowssys_jni_impl_alloc_zeroed(int32_t size) {
    size_t n = size > 0 ? (size_t)size : 1u;
    void* p = calloc(1u, n);
    return (int64_t)(uintptr_t)p;
}

static void windowssys_jni_impl_free_mem(int64_t addr) {
    if (addr != 0) free((void*)(uintptr_t)addr);
}

static void windowssys_jni_impl_read_bytes(int64_t addr, int32_t len, uint8_t* dst) {
    if (addr != 0 && len > 0 && dst) memcpy(dst, (const void*)(uintptr_t)addr, (size_t)len);
}

static void windowssys_jni_impl_write_bytes(int64_t addr, int32_t len, const uint8_t* src) {
    if (addr != 0 && len > 0 && src) memcpy((void*)(uintptr_t)addr, src, (size_t)len);
}

static void km_throw_jni_status(JNIEnv* env, int32_t status, const char* dll, const char* sym) {
    char msg[256];
    const char* cls = (status == -2) ? "java/lang/UnsupportedOperationException" : "java/lang/IllegalStateException";
    jclass ex = (*env)->FindClass(env, cls);
    if (!ex) return;
    if (status == -2) {
        snprintf(msg, sizeof(msg), "Win32 dynamic FFI (%s!%s) requires a Windows host", dll ? dll : "", sym ? sym : "");
    } else {
        snprintf(msg, sizeof(msg), "Win32 symbol resolution failed (%d): %s!%s", (int)status, dll ? dll : "", sym ? sym : "");
    }
    (*env)->ThrowNew(env, ex, msg);
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_internal_WindowssysJni_isWindowsHost(JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
    return windowssys_jni_impl_is_windows_host() ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_WindowssysJni_invoke(JNIEnv* env, jclass clazz, jstring dll, jstring symbol, jlongArray args) {
    (void)clazz;
    const char* c_dll = dll ? (*env)->GetStringUTFChars(env, dll, NULL) : NULL;
    const char* c_sym = symbol ? (*env)->GetStringUTFChars(env, symbol, NULL) : NULL;
    jsize argc = args ? (*env)->GetArrayLength(env, args) : 0;
    jlong* elems = (args && argc > 0) ? (*env)->GetLongArrayElements(env, args, NULL) : NULL;
    int32_t status = 0;
    int64_t ret = windowssys_jni_impl_invoke(c_dll, c_sym, (int32_t)argc, (const int64_t*)elems, &status);
    if (elems) (*env)->ReleaseLongArrayElements(env, args, elems, JNI_ABORT);
    if (status != 0) km_throw_jni_status(env, status, c_dll, c_sym);
    if (c_sym) (*env)->ReleaseStringUTFChars(env, symbol, c_sym);
    if (c_dll) (*env)->ReleaseStringUTFChars(env, dll, c_dll);
    return (jlong)ret;
}

JNIEXPORT jdouble JNICALL Java_io_github_kotlinmania_windowssys_internal_WindowssysJni_invokeFp(JNIEnv* env, jclass clazz, jstring dll, jstring symbol, jint fpMask, jboolean retF32, jlongArray args) {
    (void)clazz;
    const char* c_dll = dll ? (*env)->GetStringUTFChars(env, dll, NULL) : NULL;
    const char* c_sym = symbol ? (*env)->GetStringUTFChars(env, symbol, NULL) : NULL;
    jsize argc = args ? (*env)->GetArrayLength(env, args) : 0;
    jlong* elems = (args && argc > 0) ? (*env)->GetLongArrayElements(env, args, NULL) : NULL;
    int32_t status = 0;
    double ret = windowssys_jni_impl_invoke_fp(c_dll, c_sym, (int32_t)fpMask, retF32 ? 1 : 0, (int32_t)argc, (const int64_t*)elems, &status);
    if (elems) (*env)->ReleaseLongArrayElements(env, args, elems, JNI_ABORT);
    if (status != 0) km_throw_jni_status(env, status, c_dll, c_sym);
    if (c_sym) (*env)->ReleaseStringUTFChars(env, symbol, c_sym);
    if (c_dll) (*env)->ReleaseStringUTFChars(env, dll, c_dll);
    return (jdouble)ret;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_WindowssysJni_invokePtr(JNIEnv* env, jclass clazz, jlong fnPtr, jlongArray args) {
    (void)clazz;
    jsize argc = args ? (*env)->GetArrayLength(env, args) : 0;
    jlong* elems = (args && argc > 0) ? (*env)->GetLongArrayElements(env, args, NULL) : NULL;
    int32_t status = 0;
    int64_t ret = windowssys_jni_impl_invoke_ptr((int64_t)fnPtr, (int32_t)argc, (const int64_t*)elems, &status);
    if (elems) (*env)->ReleaseLongArrayElements(env, args, elems, JNI_ABORT);
    if (status != 0) km_throw_jni_status(env, status, "<fnptr>", "");
    return (jlong)ret;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_WindowssysJni_guidSlot(JNIEnv* env, jclass clazz, jint d1, jshort d2, jshort d3, jbyteArray d4) {
    (void)clazz;
    uint8_t buf[8] = {0};
    if (d4) {
        jsize n = (*env)->GetArrayLength(env, d4);
        if (n > 8) n = 8;
        if (n > 0) (*env)->GetByteArrayRegion(env, d4, 0, n, (jbyte*)buf);
    }
    return (jlong)windowssys_jni_impl_guid_slot((uint32_t)d1, (uint16_t)d2, (uint16_t)d3, buf);
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_WindowssysJni_allocZeroed(JNIEnv* env, jclass clazz, jint size) {
    (void)env; (void)clazz;
    return (jlong)windowssys_jni_impl_alloc_zeroed((int32_t)size);
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_internal_WindowssysJni_freeMem(JNIEnv* env, jclass clazz, jlong address) {
    (void)env; (void)clazz;
    windowssys_jni_impl_free_mem((int64_t)address);
}

JNIEXPORT jbyteArray JNICALL Java_io_github_kotlinmania_windowssys_internal_WindowssysJni_readBytes(JNIEnv* env, jclass clazz, jlong address, jint length) {
    (void)clazz;
    jsize n = (length > 0 && address != 0) ? (jsize)length : 0;
    jbyteArray out = (*env)->NewByteArray(env, n);
    if (out && n > 0) {
        (*env)->SetByteArrayRegion(env, out, 0, n, (const jbyte*)(uintptr_t)address);
    }
    return out;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_internal_WindowssysJni_writeBytes(JNIEnv* env, jclass clazz, jlong address, jbyteArray source) {
    (void)clazz;
    if (!source || address == 0) return;
    jsize n = (*env)->GetArrayLength(env, source);
    if (n > 0) {
        (*env)->GetByteArrayRegion(env, source, 0, n, (jbyte*)(uintptr_t)address);
    }
}
