#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <errno.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1CloseCompressor(JNIEnv* km_env, jclass km_clazz, jlong compressorhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseCompressor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)compressorhandle) : -1;
#else
    (void)compressorhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1CloseDecompressor(JNIEnv* km_env, jclass km_clazz, jlong decompressorhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseDecompressor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)decompressorhandle) : -1;
#else
    (void)decompressorhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1Compress(JNIEnv* km_env, jclass km_clazz, jlong compressorhandle, jlong uncompresseddata, jlong uncompresseddatasize, jlong compressedbuffer, jlong compressedbuffersize, jlong compresseddatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Compress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)compressorhandle, (void*)(uintptr_t)uncompresseddata, (uint64_t)uncompresseddatasize, (void*)(uintptr_t)compressedbuffer, (uint64_t)compressedbuffersize, (void*)(uintptr_t)compresseddatasize) : -1;
#else
    (void)compressorhandle;
    (void)uncompresseddata;
    (void)uncompresseddatasize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compresseddatasize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1CreateCompressor(JNIEnv* km_env, jclass km_clazz, jint algorithm, jlong allocationroutines, jlong compressorhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCompressor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)algorithm, (void*)(uintptr_t)allocationroutines, (void*)(uintptr_t)compressorhandle) : -1;
#else
    (void)algorithm;
    (void)allocationroutines;
    (void)compressorhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1CreateDecompressor(JNIEnv* km_env, jclass km_clazz, jint algorithm, jlong allocationroutines, jlong decompressorhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDecompressor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)algorithm, (void*)(uintptr_t)allocationroutines, (void*)(uintptr_t)decompressorhandle) : -1;
#else
    (void)algorithm;
    (void)allocationroutines;
    (void)decompressorhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1Decompress(JNIEnv* km_env, jclass km_clazz, jlong decompressorhandle, jlong compresseddata, jlong compresseddatasize, jlong uncompressedbuffer, jlong uncompressedbuffersize, jlong uncompresseddatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Decompress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)decompressorhandle, (void*)(uintptr_t)compresseddata, (uint64_t)compresseddatasize, (void*)(uintptr_t)uncompressedbuffer, (uint64_t)uncompressedbuffersize, (void*)(uintptr_t)uncompresseddatasize) : -1;
#else
    (void)decompressorhandle;
    (void)compresseddata;
    (void)compresseddatasize;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)uncompresseddatasize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1QueryCompressorInformation(JNIEnv* km_env, jclass km_clazz, jlong compressorhandle, jint compressinformationclass, jlong compressinformation, jlong compressinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCompressorInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)compressorhandle, (int32_t)compressinformationclass, (void*)(uintptr_t)compressinformation, (uint64_t)compressinformationsize) : -1;
#else
    (void)compressorhandle;
    (void)compressinformationclass;
    (void)compressinformation;
    (void)compressinformationsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1QueryDecompressorInformation(JNIEnv* km_env, jclass km_clazz, jlong decompressorhandle, jint compressinformationclass, jlong compressinformation, jlong compressinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDecompressorInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)decompressorhandle, (int32_t)compressinformationclass, (void*)(uintptr_t)compressinformation, (uint64_t)compressinformationsize) : -1;
#else
    (void)decompressorhandle;
    (void)compressinformationclass;
    (void)compressinformation;
    (void)compressinformationsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1ResetCompressor(JNIEnv* km_env, jclass km_clazz, jlong compressorhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetCompressor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)compressorhandle) : -1;
#else
    (void)compressorhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1ResetDecompressor(JNIEnv* km_env, jclass km_clazz, jlong decompressorhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetDecompressor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)decompressorhandle) : -1;
#else
    (void)decompressorhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1SetCompressorInformation(JNIEnv* km_env, jclass km_clazz, jlong compressorhandle, jint compressinformationclass, jlong compressinformation, jlong compressinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCompressorInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)compressorhandle, (int32_t)compressinformationclass, (void*)(uintptr_t)compressinformation, (uint64_t)compressinformationsize) : -1;
#else
    (void)compressorhandle;
    (void)compressinformationclass;
    (void)compressinformation;
    (void)compressinformationsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_compression_WindowsWin32StorageCompressionJniBridge_windowssys_1windows_1win32_1storage_1compression_1SetDecompressorInformation(JNIEnv* km_env, jclass km_clazz, jlong decompressorhandle, jint compressinformationclass, jlong compressinformation, jlong compressinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDecompressorInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)decompressorhandle, (int32_t)compressinformationclass, (void*)(uintptr_t)compressinformation, (uint64_t)compressinformationsize) : -1;
#else
    (void)decompressorhandle;
    (void)compressinformationclass;
    (void)compressinformation;
    (void)compressinformationsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

