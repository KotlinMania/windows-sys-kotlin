#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_compression_wrapper.h"
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

int32_t windowssysWindowsWin32StorageCompressionCloseCompressor(void* compressorhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseCompressor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressorhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressorhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionCloseDecompressor(void* decompressorhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseDecompressor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(decompressorhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)decompressorhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionCompress(void* compressorhandle, void* uncompresseddata, uint64_t uncompresseddatasize, void* compressedbuffer, uint64_t compressedbuffersize, void* compresseddatasize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Compress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressorhandle, uncompresseddata, uncompresseddatasize, compressedbuffer, compressedbuffersize, compresseddatasize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressorhandle;
    (void)uncompresseddata;
    (void)uncompresseddatasize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compresseddatasize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionCreateCompressor(uint32_t algorithm, void* allocationroutines, void* compressorhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCompressor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(algorithm, allocationroutines, compressorhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)algorithm;
    (void)allocationroutines;
    (void)compressorhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionCreateDecompressor(uint32_t algorithm, void* allocationroutines, void* decompressorhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDecompressor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(algorithm, allocationroutines, decompressorhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)algorithm;
    (void)allocationroutines;
    (void)decompressorhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionDecompress(void* decompressorhandle, void* compresseddata, uint64_t compresseddatasize, void* uncompressedbuffer, uint64_t uncompressedbuffersize, void* uncompresseddatasize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Decompress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(decompressorhandle, compresseddata, compresseddatasize, uncompressedbuffer, uncompressedbuffersize, uncompresseddatasize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)decompressorhandle;
    (void)compresseddata;
    (void)compresseddatasize;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)uncompresseddatasize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionQueryCompressorInformation(void* compressorhandle, int32_t compressinformationclass, void* compressinformation, uint64_t compressinformationsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCompressorInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressorhandle, compressinformationclass, compressinformation, compressinformationsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressorhandle;
    (void)compressinformationclass;
    (void)compressinformation;
    (void)compressinformationsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionQueryDecompressorInformation(void* decompressorhandle, int32_t compressinformationclass, void* compressinformation, uint64_t compressinformationsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDecompressorInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(decompressorhandle, compressinformationclass, compressinformation, compressinformationsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)decompressorhandle;
    (void)compressinformationclass;
    (void)compressinformation;
    (void)compressinformationsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionResetCompressor(void* compressorhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetCompressor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressorhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressorhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionResetDecompressor(void* decompressorhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetDecompressor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(decompressorhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)decompressorhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionSetCompressorInformation(void* compressorhandle, int32_t compressinformationclass, void* compressinformation, uint64_t compressinformationsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCompressorInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(compressorhandle, compressinformationclass, compressinformation, compressinformationsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)compressorhandle;
    (void)compressinformationclass;
    (void)compressinformation;
    (void)compressinformationsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32StorageCompressionSetDecompressorInformation(void* decompressorhandle, int32_t compressinformationclass, void* compressinformation, uint64_t compressinformationsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDecompressorInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(decompressorhandle, compressinformationclass, compressinformation, compressinformationsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)decompressorhandle;
    (void)compressinformationclass;
    (void)compressinformation;
    (void)compressinformationsize;
    errno = ENOSYS;
    return -1;
#endif
}

