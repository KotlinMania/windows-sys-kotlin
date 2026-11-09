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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIBuildFilterA(JNIEnv* km_env, jclass km_clazz, jlong lpszfilter, jint cbfilter, jint fsaving) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIBuildFilterA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilter, (int32_t)cbfilter, (int32_t)fsaving) : -1;
#else
    (void)lpszfilter;
    (void)cbfilter;
    (void)fsaving;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIBuildFilterW(JNIEnv* km_env, jclass km_clazz, jlong lpszfilter, jint cbfilter, jint fsaving) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIBuildFilterW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilter, (int32_t)cbfilter, (int32_t)fsaving) : -1;
#else
    (void)lpszfilter;
    (void)cbfilter;
    (void)fsaving;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIClearClipboard(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIClearClipboard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileAddRef(JNIEnv* km_env, jclass km_clazz, jlong pfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileAddRef");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile) : 0;
#else
    (void)pfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileCreateStreamA(JNIEnv* km_env, jclass km_clazz, jlong pfile, jlong ppavi, jlong psi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileCreateStreamA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile, (void*)(uintptr_t)ppavi, (void*)(uintptr_t)psi) : -1;
#else
    (void)pfile;
    (void)ppavi;
    (void)psi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileCreateStreamW(JNIEnv* km_env, jclass km_clazz, jlong pfile, jlong ppavi, jlong psi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileCreateStreamW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile, (void*)(uintptr_t)ppavi, (void*)(uintptr_t)psi) : -1;
#else
    (void)pfile;
    (void)ppavi;
    (void)psi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileEndRecord(JNIEnv* km_env, jclass km_clazz, jlong pfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileEndRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile) : -1;
#else
    (void)pfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileExit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileExit");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileGetStream(JNIEnv* km_env, jclass km_clazz, jlong pfile, jlong ppavi, jint fcctype, jint lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileGetStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile, (void*)(uintptr_t)ppavi, (uint32_t)fcctype, (int32_t)lparam) : -1;
#else
    (void)pfile;
    (void)ppavi;
    (void)fcctype;
    (void)lparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileInfoA(JNIEnv* km_env, jclass km_clazz, jlong pfile, jlong pfi, jint lsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile, (void*)(uintptr_t)pfi, (int32_t)lsize) : -1;
#else
    (void)pfile;
    (void)pfi;
    (void)lsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileInfoW(JNIEnv* km_env, jclass km_clazz, jlong pfile, jlong pfi, jint lsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile, (void*)(uintptr_t)pfi, (int32_t)lsize) : -1;
#else
    (void)pfile;
    (void)pfi;
    (void)lsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileInit");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileOpenA(JNIEnv* km_env, jclass km_clazz, jlong ppfile, jlong szfile, jint umode, jlong lphandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileOpenA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppfile, (void*)(uintptr_t)szfile, (uint32_t)umode, (void*)(uintptr_t)lphandler) : -1;
#else
    (void)ppfile;
    (void)szfile;
    (void)umode;
    (void)lphandler;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileOpenW(JNIEnv* km_env, jclass km_clazz, jlong ppfile, jlong szfile, jint umode, jlong lphandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileOpenW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppfile, (void*)(uintptr_t)szfile, (uint32_t)umode, (void*)(uintptr_t)lphandler) : -1;
#else
    (void)ppfile;
    (void)szfile;
    (void)umode;
    (void)lphandler;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileReadData(JNIEnv* km_env, jclass km_clazz, jlong pfile, jint ckid, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileReadData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile, (uint32_t)ckid, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : -1;
#else
    (void)pfile;
    (void)ckid;
    (void)lpdata;
    (void)lpcbdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileRelease(JNIEnv* km_env, jclass km_clazz, jlong pfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileRelease");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile) : 0;
#else
    (void)pfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIFileWriteData(JNIEnv* km_env, jclass km_clazz, jlong pfile, jint ckid, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIFileWriteData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfile, (uint32_t)ckid, (void*)(uintptr_t)lpdata, (int32_t)cbdata) : -1;
#else
    (void)pfile;
    (void)ckid;
    (void)lpdata;
    (void)cbdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIGetFromClipboard(JNIEnv* km_env, jclass km_clazz, jlong lppf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIGetFromClipboard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppf) : -1;
#else
    (void)lppf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIMakeCompressedStream(JNIEnv* km_env, jclass km_clazz, jlong ppscompressed, jlong ppssource, jlong lpoptions, jlong pclsidhandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIMakeCompressedStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppscompressed, (void*)(uintptr_t)ppssource, (void*)(uintptr_t)lpoptions, (void*)(uintptr_t)pclsidhandler) : -1;
#else
    (void)ppscompressed;
    (void)ppssource;
    (void)lpoptions;
    (void)pclsidhandler;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIMakeFileFromStreams(JNIEnv* km_env, jclass km_clazz, jlong ppfile, jint nstreams, jlong papstreams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIMakeFileFromStreams");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppfile, (int32_t)nstreams, (void*)(uintptr_t)papstreams) : -1;
#else
    (void)ppfile;
    (void)nstreams;
    (void)papstreams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIMakeStreamFromClipboard(JNIEnv* km_env, jclass km_clazz, jint cfformat, jlong hglobal, jlong ppstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIMakeStreamFromClipboard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cfformat, (void*)(uintptr_t)hglobal, (void*)(uintptr_t)ppstream) : -1;
#else
    (void)cfformat;
    (void)hglobal;
    (void)ppstream;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIPutFileOnClipboard(JNIEnv* km_env, jclass km_clazz, jlong pf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIPutFileOnClipboard");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pf) : -1;
#else
    (void)pf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVISaveOptions(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint uiflags, jint nstreams, jlong ppavi, jlong plpoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVISaveOptions");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)uiflags, (int32_t)nstreams, (void*)(uintptr_t)ppavi, (void*)(uintptr_t)plpoptions) : -1;
#else
    (void)hwnd;
    (void)uiflags;
    (void)nstreams;
    (void)ppavi;
    (void)plpoptions;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVISaveOptionsFree(JNIEnv* km_env, jclass km_clazz, jint nstreams, jlong plpoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVISaveOptionsFree");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nstreams, (void*)(uintptr_t)plpoptions) : -1;
#else
    (void)nstreams;
    (void)plpoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVISaveVA(JNIEnv* km_env, jclass km_clazz, jlong szfile, jlong pclsidhandler, jlong lpfncallback, jint nstreams, jlong ppavi, jlong plpoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVISaveVA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfile, (void*)(uintptr_t)pclsidhandler, (void*)(uintptr_t)lpfncallback, (int32_t)nstreams, (void*)(uintptr_t)ppavi, (void*)(uintptr_t)plpoptions) : -1;
#else
    (void)szfile;
    (void)pclsidhandler;
    (void)lpfncallback;
    (void)nstreams;
    (void)ppavi;
    (void)plpoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVISaveVW(JNIEnv* km_env, jclass km_clazz, jlong szfile, jlong pclsidhandler, jlong lpfncallback, jint nstreams, jlong ppavi, jlong plpoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVISaveVW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfile, (void*)(uintptr_t)pclsidhandler, (void*)(uintptr_t)lpfncallback, (int32_t)nstreams, (void*)(uintptr_t)ppavi, (void*)(uintptr_t)plpoptions) : -1;
#else
    (void)szfile;
    (void)pclsidhandler;
    (void)lpfncallback;
    (void)nstreams;
    (void)ppavi;
    (void)plpoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamAddRef(JNIEnv* km_env, jclass km_clazz, jlong pavi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamAddRef");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi) : 0;
#else
    (void)pavi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamBeginStreaming(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint lstart, jint lend, jint lrate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamBeginStreaming");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (int32_t)lstart, (int32_t)lend, (int32_t)lrate) : -1;
#else
    (void)pavi;
    (void)lstart;
    (void)lend;
    (void)lrate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamCreate(JNIEnv* km_env, jclass km_clazz, jlong ppavi, jint lparam1, jint lparam2, jlong pclsidhandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppavi, (int32_t)lparam1, (int32_t)lparam2, (void*)(uintptr_t)pclsidhandler) : -1;
#else
    (void)ppavi;
    (void)lparam1;
    (void)lparam2;
    (void)pclsidhandler;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamEndStreaming(JNIEnv* km_env, jclass km_clazz, jlong pavi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamEndStreaming");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi) : -1;
#else
    (void)pavi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamFindSample(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint lpos, jint lflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamFindSample");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (int32_t)lpos, (int32_t)lflags) : -1;
#else
    (void)pavi;
    (void)lpos;
    (void)lflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamGetFrame(JNIEnv* km_env, jclass km_clazz, jlong pg, jint lpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamGetFrame");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pg, (int32_t)lpos) : NULL;
#else
    (void)pg;
    (void)lpos;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamGetFrameClose(JNIEnv* km_env, jclass km_clazz, jlong pg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamGetFrameClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pg) : -1;
#else
    (void)pg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamGetFrameOpen(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong lpbiwanted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamGetFrameOpen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)lpbiwanted) : NULL;
#else
    (void)pavi;
    (void)lpbiwanted;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamInfoA(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong psi, jint lsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)psi, (int32_t)lsize) : -1;
#else
    (void)pavi;
    (void)psi;
    (void)lsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamInfoW(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong psi, jint lsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)psi, (int32_t)lsize) : -1;
#else
    (void)pavi;
    (void)psi;
    (void)lsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamLength(JNIEnv* km_env, jclass km_clazz, jlong pavi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamLength");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi) : -1;
#else
    (void)pavi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamOpenFromFileA(JNIEnv* km_env, jclass km_clazz, jlong ppavi, jlong szfile, jint fcctype, jint lparam, jint mode, jlong pclsidhandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamOpenFromFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppavi, (void*)(uintptr_t)szfile, (uint32_t)fcctype, (int32_t)lparam, (uint32_t)mode, (void*)(uintptr_t)pclsidhandler) : -1;
#else
    (void)ppavi;
    (void)szfile;
    (void)fcctype;
    (void)lparam;
    (void)mode;
    (void)pclsidhandler;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamOpenFromFileW(JNIEnv* km_env, jclass km_clazz, jlong ppavi, jlong szfile, jint fcctype, jint lparam, jint mode, jlong pclsidhandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamOpenFromFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppavi, (void*)(uintptr_t)szfile, (uint32_t)fcctype, (int32_t)lparam, (uint32_t)mode, (void*)(uintptr_t)pclsidhandler) : -1;
#else
    (void)ppavi;
    (void)szfile;
    (void)fcctype;
    (void)lparam;
    (void)mode;
    (void)pclsidhandler;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamRead(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint lstart, jint lsamples, jlong lpbuffer, jint cbbuffer, jlong plbytes, jlong plsamples) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamRead");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (int32_t)lstart, (int32_t)lsamples, (void*)(uintptr_t)lpbuffer, (int32_t)cbbuffer, (void*)(uintptr_t)plbytes, (void*)(uintptr_t)plsamples) : -1;
#else
    (void)pavi;
    (void)lstart;
    (void)lsamples;
    (void)lpbuffer;
    (void)cbbuffer;
    (void)plbytes;
    (void)plsamples;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamReadData(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint fcc, jlong lp, jlong lpcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamReadData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (uint32_t)fcc, (void*)(uintptr_t)lp, (void*)(uintptr_t)lpcb) : -1;
#else
    (void)pavi;
    (void)fcc;
    (void)lp;
    (void)lpcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamReadFormat(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint lpos, jlong lpformat, jlong lpcbformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamReadFormat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (int32_t)lpos, (void*)(uintptr_t)lpformat, (void*)(uintptr_t)lpcbformat) : -1;
#else
    (void)pavi;
    (void)lpos;
    (void)lpformat;
    (void)lpcbformat;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamRelease(JNIEnv* km_env, jclass km_clazz, jlong pavi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamRelease");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi) : 0;
#else
    (void)pavi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamSampleToTime(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint lsample) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamSampleToTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (int32_t)lsample) : -1;
#else
    (void)pavi;
    (void)lsample;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamSetFormat(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint lpos, jlong lpformat, jint cbformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamSetFormat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (int32_t)lpos, (void*)(uintptr_t)lpformat, (int32_t)cbformat) : -1;
#else
    (void)pavi;
    (void)lpos;
    (void)lpformat;
    (void)cbformat;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamStart(JNIEnv* km_env, jclass km_clazz, jlong pavi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamStart");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi) : -1;
#else
    (void)pavi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamTimeToSample(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint ltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamTimeToSample");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (int32_t)ltime) : -1;
#else
    (void)pavi;
    (void)ltime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamWrite(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint lstart, jint lsamples, jlong lpbuffer, jint cbbuffer, jint dwflags, jlong plsampwritten, jlong plbyteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (int32_t)lstart, (int32_t)lsamples, (void*)(uintptr_t)lpbuffer, (int32_t)cbbuffer, (uint32_t)dwflags, (void*)(uintptr_t)plsampwritten, (void*)(uintptr_t)plbyteswritten) : -1;
#else
    (void)pavi;
    (void)lstart;
    (void)lsamples;
    (void)lpbuffer;
    (void)cbbuffer;
    (void)dwflags;
    (void)plsampwritten;
    (void)plbyteswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1AVIStreamWriteData(JNIEnv* km_env, jclass km_clazz, jlong pavi, jint fcc, jlong lp, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AVIStreamWriteData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (uint32_t)fcc, (void*)(uintptr_t)lp, (int32_t)cb) : -1;
#else
    (void)pavi;
    (void)fcc;
    (void)lp;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1CloseDriver(JNIEnv* km_env, jclass km_clazz, jlong hdriver, jlong lparam1, jlong lparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseDriver");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdriver, (int64_t)lparam1, (int64_t)lparam2) : -1;
#else
    (void)hdriver;
    (void)lparam1;
    (void)lparam2;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1CreateEditableStream(JNIEnv* km_env, jclass km_clazz, jlong ppseditable, jlong pssource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEditableStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppseditable, (void*)(uintptr_t)pssource) : -1;
#else
    (void)ppseditable;
    (void)pssource;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DefDriverProc(JNIEnv* km_env, jclass km_clazz, jlong dwdriveridentifier, jlong hdrvr, jint umsg, jlong lparam1, jlong lparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefDriverProc");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)dwdriveridentifier, (void*)(uintptr_t)hdrvr, (uint32_t)umsg, (int64_t)lparam1, (int64_t)lparam2) : -1;
#else
    (void)dwdriveridentifier;
    (void)hdrvr;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibBegin(JNIEnv* km_env, jclass km_clazz, jlong hdd, jlong hdc, jint dxdst, jint dydst, jlong lpbi, jint dxsrc, jint dysrc, jint wflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibBegin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd, (void*)(uintptr_t)hdc, (int32_t)dxdst, (int32_t)dydst, (void*)(uintptr_t)lpbi, (int32_t)dxsrc, (int32_t)dysrc, (uint32_t)wflags) : -1;
#else
    (void)hdd;
    (void)hdc;
    (void)dxdst;
    (void)dydst;
    (void)lpbi;
    (void)dxsrc;
    (void)dysrc;
    (void)wflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibChangePalette(JNIEnv* km_env, jclass km_clazz, jlong hdd, jint istart, jint ilen, jlong lppe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibChangePalette");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd, (int32_t)istart, (int32_t)ilen, (void*)(uintptr_t)lppe) : -1;
#else
    (void)hdd;
    (void)istart;
    (void)ilen;
    (void)lppe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibClose(JNIEnv* km_env, jclass km_clazz, jlong hdd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd) : -1;
#else
    (void)hdd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibDraw(JNIEnv* km_env, jclass km_clazz, jlong hdd, jlong hdc, jint xdst, jint ydst, jint dxdst, jint dydst, jlong lpbi, jlong lpbits, jint xsrc, jint ysrc, jint dxsrc, jint dysrc, jint wflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, int32_t, int32_t, int32_t, void*, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibDraw");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd, (void*)(uintptr_t)hdc, (int32_t)xdst, (int32_t)ydst, (int32_t)dxdst, (int32_t)dydst, (void*)(uintptr_t)lpbi, (void*)(uintptr_t)lpbits, (int32_t)xsrc, (int32_t)ysrc, (int32_t)dxsrc, (int32_t)dysrc, (uint32_t)wflags) : -1;
#else
    (void)hdd;
    (void)hdc;
    (void)xdst;
    (void)ydst;
    (void)dxdst;
    (void)dydst;
    (void)lpbi;
    (void)lpbits;
    (void)xsrc;
    (void)ysrc;
    (void)dxsrc;
    (void)dysrc;
    (void)wflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibEnd(JNIEnv* km_env, jclass km_clazz, jlong hdd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibEnd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd) : -1;
#else
    (void)hdd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibGetBuffer(JNIEnv* km_env, jclass km_clazz, jlong hdd, jlong lpbi, jint dwsize, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibGetBuffer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd, (void*)(uintptr_t)lpbi, (uint32_t)dwsize, (uint32_t)dwflags) : NULL;
#else
    (void)hdd;
    (void)lpbi;
    (void)dwsize;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibGetPalette(JNIEnv* km_env, jclass km_clazz, jlong hdd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibGetPalette");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd) : NULL;
#else
    (void)hdd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibOpen(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibOpen");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibProfileDisplay(JNIEnv* km_env, jclass km_clazz, jlong lpbi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibProfileDisplay");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbi) : -1;
#else
    (void)lpbi;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibRealize(JNIEnv* km_env, jclass km_clazz, jlong hdd, jlong hdc, jint fbackground) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibRealize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd, (void*)(uintptr_t)hdc, (int32_t)fbackground) : 0;
#else
    (void)hdd;
    (void)hdc;
    (void)fbackground;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibSetPalette(JNIEnv* km_env, jclass km_clazz, jlong hdd, jlong hpal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibSetPalette");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd, (void*)(uintptr_t)hpal) : -1;
#else
    (void)hdd;
    (void)hpal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibStart(JNIEnv* km_env, jclass km_clazz, jlong hdd, jint rate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibStart");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd, (uint32_t)rate) : -1;
#else
    (void)hdd;
    (void)rate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibStop(JNIEnv* km_env, jclass km_clazz, jlong hdd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibStop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd) : -1;
#else
    (void)hdd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrawDibTime(JNIEnv* km_env, jclass km_clazz, jlong hdd, jlong lpddtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawDibTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdd, (void*)(uintptr_t)lpddtime) : -1;
#else
    (void)hdd;
    (void)lpddtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DriverCallback(JNIEnv* km_env, jclass km_clazz, jlong dwcallback, jint dwflags, jlong hdevice, jint dwmsg, jlong dwuser, jlong dwparam1, jlong dwparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DriverCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)dwcallback, (uint32_t)dwflags, (void*)(uintptr_t)hdevice, (uint32_t)dwmsg, (uint64_t)dwuser, (uint64_t)dwparam1, (uint64_t)dwparam2) : -1;
#else
    (void)dwcallback;
    (void)dwflags;
    (void)hdevice;
    (void)dwmsg;
    (void)dwuser;
    (void)dwparam1;
    (void)dwparam2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1DrvGetModuleHandle(JNIEnv* km_env, jclass km_clazz, jlong hdriver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrvGetModuleHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdriver) : NULL;
#else
    (void)hdriver;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1EditStreamClone(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong ppresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamClone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)ppresult) : -1;
#else
    (void)pavi;
    (void)ppresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1EditStreamCopy(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong plstart, jlong pllength, jlong ppresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamCopy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)plstart, (void*)(uintptr_t)pllength, (void*)(uintptr_t)ppresult) : -1;
#else
    (void)pavi;
    (void)plstart;
    (void)pllength;
    (void)ppresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1EditStreamCut(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong plstart, jlong pllength, jlong ppresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamCut");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)plstart, (void*)(uintptr_t)pllength, (void*)(uintptr_t)ppresult) : -1;
#else
    (void)pavi;
    (void)plstart;
    (void)pllength;
    (void)ppresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1EditStreamPaste(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong plpos, jlong pllength, jlong pstream, jint lstart, jint lend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamPaste");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)plpos, (void*)(uintptr_t)pllength, (void*)(uintptr_t)pstream, (int32_t)lstart, (int32_t)lend) : -1;
#else
    (void)pavi;
    (void)plpos;
    (void)pllength;
    (void)pstream;
    (void)lstart;
    (void)lend;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1EditStreamSetInfoA(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong lpinfo, jint cbinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamSetInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)lpinfo, (int32_t)cbinfo) : -1;
#else
    (void)pavi;
    (void)lpinfo;
    (void)cbinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1EditStreamSetInfoW(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong lpinfo, jint cbinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamSetInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)lpinfo, (int32_t)cbinfo) : -1;
#else
    (void)pavi;
    (void)lpinfo;
    (void)cbinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1EditStreamSetNameA(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong lpszname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamSetNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)lpszname) : -1;
#else
    (void)pavi;
    (void)lpszname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1EditStreamSetNameW(JNIEnv* km_env, jclass km_clazz, jlong pavi, jlong lpszname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avifil32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EditStreamSetNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pavi, (void*)(uintptr_t)lpszname) : -1;
#else
    (void)pavi;
    (void)lpszname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1GetDriverModuleHandle(JNIEnv* km_env, jclass km_clazz, jlong hdriver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDriverModuleHandle");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdriver) : NULL;
#else
    (void)hdriver;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1GetOpenFileNamePreviewA(JNIEnv* km_env, jclass km_clazz, jlong lpofn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenFileNamePreviewA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpofn) : -1;
#else
    (void)lpofn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1GetOpenFileNamePreviewW(JNIEnv* km_env, jclass km_clazz, jlong lpofn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenFileNamePreviewW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpofn) : -1;
#else
    (void)lpofn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1GetSaveFileNamePreviewA(JNIEnv* km_env, jclass km_clazz, jlong lpofn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSaveFileNamePreviewA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpofn) : -1;
#else
    (void)lpofn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1GetSaveFileNamePreviewW(JNIEnv* km_env, jclass km_clazz, jlong lpofn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSaveFileNamePreviewW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpofn) : -1;
#else
    (void)lpofn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICClose(JNIEnv* km_env, jclass km_clazz, jlong hic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICClose");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic) : -1;
#else
    (void)hic;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICCompress(JNIEnv* km_env, jclass km_clazz, jlong hic, jint dwflags, jlong lpbioutput, jlong lpdata, jlong lpbiinput, jlong lpbits, jlong lpckid, jlong lpdwflags, jint lframenum, jint dwframesize, jint dwquality, jlong lpbiprev, jlong lpprev) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICCompress");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic, (uint32_t)dwflags, (void*)(uintptr_t)lpbioutput, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpbiinput, (void*)(uintptr_t)lpbits, (void*)(uintptr_t)lpckid, (void*)(uintptr_t)lpdwflags, (int32_t)lframenum, (uint32_t)dwframesize, (uint32_t)dwquality, (void*)(uintptr_t)lpbiprev, (void*)(uintptr_t)lpprev) : 0;
#else
    (void)hic;
    (void)dwflags;
    (void)lpbioutput;
    (void)lpdata;
    (void)lpbiinput;
    (void)lpbits;
    (void)lpckid;
    (void)lpdwflags;
    (void)lframenum;
    (void)dwframesize;
    (void)dwquality;
    (void)lpbiprev;
    (void)lpprev;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICCompressorChoose(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint uiflags, jlong pvin, jlong lpdata, jlong pc, jlong lpsztitle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICCompressorChoose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)uiflags, (void*)(uintptr_t)pvin, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)pc, (void*)(uintptr_t)lpsztitle) : -1;
#else
    (void)hwnd;
    (void)uiflags;
    (void)pvin;
    (void)lpdata;
    (void)pc;
    (void)lpsztitle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICCompressorFree(JNIEnv* km_env, jclass km_clazz, jlong pc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICCompressorFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pc);
#else
    (void)pc;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICDecompress(JNIEnv* km_env, jclass km_clazz, jlong hic, jint dwflags, jlong lpbiformat, jlong lpdata, jlong lpbi, jlong lpbits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICDecompress");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic, (uint32_t)dwflags, (void*)(uintptr_t)lpbiformat, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpbi, (void*)(uintptr_t)lpbits) : 0;
#else
    (void)hic;
    (void)dwflags;
    (void)lpbiformat;
    (void)lpdata;
    (void)lpbi;
    (void)lpbits;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICDraw(JNIEnv* km_env, jclass km_clazz, jlong hic, jint dwflags, jlong lpformat, jlong lpdata, jint cbdata, jint ltime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICDraw");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic, (uint32_t)dwflags, (void*)(uintptr_t)lpformat, (void*)(uintptr_t)lpdata, (uint32_t)cbdata, (int32_t)ltime) : 0;
#else
    (void)hic;
    (void)dwflags;
    (void)lpformat;
    (void)lpdata;
    (void)cbdata;
    (void)ltime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICDrawBegin(JNIEnv* km_env, jclass km_clazz, jlong hic, jint dwflags, jlong hpal, jlong hwnd, jlong hdc, jint xdst, jint ydst, jint dxdst, jint dydst, jlong lpbi, jint xsrc, jint ysrc, jint dxsrc, jint dysrc, jint dwrate, jint dwscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t, int32_t, int32_t, int32_t, void*, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICDrawBegin");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic, (uint32_t)dwflags, (void*)(uintptr_t)hpal, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)hdc, (int32_t)xdst, (int32_t)ydst, (int32_t)dxdst, (int32_t)dydst, (void*)(uintptr_t)lpbi, (int32_t)xsrc, (int32_t)ysrc, (int32_t)dxsrc, (int32_t)dysrc, (uint32_t)dwrate, (uint32_t)dwscale) : 0;
#else
    (void)hic;
    (void)dwflags;
    (void)hpal;
    (void)hwnd;
    (void)hdc;
    (void)xdst;
    (void)ydst;
    (void)dxdst;
    (void)dydst;
    (void)lpbi;
    (void)xsrc;
    (void)ysrc;
    (void)dxsrc;
    (void)dysrc;
    (void)dwrate;
    (void)dwscale;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICGetDisplayFormat(JNIEnv* km_env, jclass km_clazz, jlong hic, jlong lpbiin, jlong lpbiout, jint bitdepth, jint dx, jint dy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICGetDisplayFormat");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic, (void*)(uintptr_t)lpbiin, (void*)(uintptr_t)lpbiout, (int32_t)bitdepth, (int32_t)dx, (int32_t)dy) : NULL;
#else
    (void)hic;
    (void)lpbiin;
    (void)lpbiout;
    (void)bitdepth;
    (void)dx;
    (void)dy;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hic, jlong picinfo, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICGetInfo");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic, (void*)(uintptr_t)picinfo, (uint32_t)cb) : -1;
#else
    (void)hic;
    (void)picinfo;
    (void)cb;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICImageCompress(JNIEnv* km_env, jclass km_clazz, jlong hic, jint uiflags, jlong lpbiin, jlong lpbits, jlong lpbiout, jint lquality, jlong plsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICImageCompress");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic, (uint32_t)uiflags, (void*)(uintptr_t)lpbiin, (void*)(uintptr_t)lpbits, (void*)(uintptr_t)lpbiout, (int32_t)lquality, (void*)(uintptr_t)plsize) : NULL;
#else
    (void)hic;
    (void)uiflags;
    (void)lpbiin;
    (void)lpbits;
    (void)lpbiout;
    (void)lquality;
    (void)plsize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICImageDecompress(JNIEnv* km_env, jclass km_clazz, jlong hic, jint uiflags, jlong lpbiin, jlong lpbits, jlong lpbiout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICImageDecompress");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic, (uint32_t)uiflags, (void*)(uintptr_t)lpbiin, (void*)(uintptr_t)lpbits, (void*)(uintptr_t)lpbiout) : NULL;
#else
    (void)hic;
    (void)uiflags;
    (void)lpbiin;
    (void)lpbits;
    (void)lpbiout;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICInfo(JNIEnv* km_env, jclass km_clazz, jint fcctype, jint fcchandler, jlong lpicinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fcctype, (uint32_t)fcchandler, (void*)(uintptr_t)lpicinfo) : -1;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)lpicinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICInstall(JNIEnv* km_env, jclass km_clazz, jint fcctype, jint fcchandler, jlong lparam, jlong szdesc, jint wflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICInstall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fcctype, (uint32_t)fcchandler, (int64_t)lparam, (void*)(uintptr_t)szdesc, (uint32_t)wflags) : -1;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)lparam;
    (void)szdesc;
    (void)wflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICLocate(JNIEnv* km_env, jclass km_clazz, jint fcctype, jint fcchandler, jlong lpbiin, jlong lpbiout, jshort wflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICLocate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fcctype, (uint32_t)fcchandler, (void*)(uintptr_t)lpbiin, (void*)(uintptr_t)lpbiout, (uint16_t)wflags) : NULL;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)lpbiin;
    (void)lpbiout;
    (void)wflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICOpen(JNIEnv* km_env, jclass km_clazz, jint fcctype, jint fcchandler, jint wmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICOpen");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fcctype, (uint32_t)fcchandler, (uint32_t)wmode) : NULL;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)wmode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICRemove(JNIEnv* km_env, jclass km_clazz, jint fcctype, jint fcchandler, jint wflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICRemove");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fcctype, (uint32_t)fcchandler, (uint32_t)wflags) : -1;
#else
    (void)fcctype;
    (void)fcchandler;
    (void)wflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICSendMessage(JNIEnv* km_env, jclass km_clazz, jlong hic, jint msg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICSendMessage");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hic, (uint32_t)msg, (uint64_t)dw1, (uint64_t)dw2) : -1;
#else
    (void)hic;
    (void)msg;
    (void)dw1;
    (void)dw2;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICSeqCompressFrame(JNIEnv* km_env, jclass km_clazz, jlong pc, jint uiflags, jlong lpbits, jlong pfkey, jlong plsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICSeqCompressFrame");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pc, (uint32_t)uiflags, (void*)(uintptr_t)lpbits, (void*)(uintptr_t)pfkey, (void*)(uintptr_t)plsize) : NULL;
#else
    (void)pc;
    (void)uiflags;
    (void)lpbits;
    (void)pfkey;
    (void)plsize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICSeqCompressFrameEnd(JNIEnv* km_env, jclass km_clazz, jlong pc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICSeqCompressFrameEnd");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pc);
#else
    (void)pc;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1ICSeqCompressFrameStart(JNIEnv* km_env, jclass km_clazz, jlong pc, jlong lpbiin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ICSeqCompressFrameStart");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pc, (void*)(uintptr_t)lpbiin) : -1;
#else
    (void)pc;
    (void)lpbiin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1MCIWndCreateA(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hinstance, jint dwstyle, jlong szfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MCIWndCreateA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hinstance, (uint32_t)dwstyle, (void*)(uintptr_t)szfile) : NULL;
#else
    (void)hwndparent;
    (void)hinstance;
    (void)dwstyle;
    (void)szfile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1MCIWndCreateW(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong hinstance, jint dwstyle, jlong szfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MCIWndCreateW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)hinstance, (uint32_t)dwstyle, (void*)(uintptr_t)szfile) : NULL;
#else
    (void)hwndparent;
    (void)hinstance;
    (void)dwstyle;
    (void)szfile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1MCIWndRegisterClass(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MCIWndRegisterClass");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1OpenDriver(JNIEnv* km_env, jclass km_clazz, jlong szdrivername, jlong szsectionname, jlong lparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenDriver");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdrivername, (void*)(uintptr_t)szsectionname, (int64_t)lparam2) : NULL;
#else
    (void)szdrivername;
    (void)szsectionname;
    (void)lparam2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1SendDriverMessage(JNIEnv* km_env, jclass km_clazz, jlong hdriver, jint message, jlong lparam1, jlong lparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendDriverMessage");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdriver, (uint32_t)message, (int64_t)lparam1, (int64_t)lparam2) : -1;
#else
    (void)hdriver;
    (void)message;
    (void)lparam1;
    (void)lparam2;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1VideoForWindowsVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msvfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VideoForWindowsVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1capCreateCaptureWindowA(JNIEnv* km_env, jclass km_clazz, jlong lpszwindowname, jint dwstyle, jint x, jint y, jint nwidth, jint nheight, jlong hwndparent, jint nid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avicap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "capCreateCaptureWindowA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszwindowname, (uint32_t)dwstyle, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight, (void*)(uintptr_t)hwndparent, (int32_t)nid) : NULL;
#else
    (void)lpszwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)nid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1capCreateCaptureWindowW(JNIEnv* km_env, jclass km_clazz, jlong lpszwindowname, jint dwstyle, jint x, jint y, jint nwidth, jint nheight, jlong hwndparent, jint nid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avicap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "capCreateCaptureWindowW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszwindowname, (uint32_t)dwstyle, (int32_t)x, (int32_t)y, (int32_t)nwidth, (int32_t)nheight, (void*)(uintptr_t)hwndparent, (int32_t)nid) : NULL;
#else
    (void)lpszwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)nid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1capGetDriverDescriptionA(JNIEnv* km_env, jclass km_clazz, jint wdriverindex, jlong lpszname, jint cbname, jlong lpszver, jint cbver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avicap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "capGetDriverDescriptionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wdriverindex, (void*)(uintptr_t)lpszname, (int32_t)cbname, (void*)(uintptr_t)lpszver, (int32_t)cbver) : -1;
#else
    (void)wdriverindex;
    (void)lpszname;
    (void)cbname;
    (void)lpszver;
    (void)cbver;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1capGetDriverDescriptionW(JNIEnv* km_env, jclass km_clazz, jint wdriverindex, jlong lpszname, jint cbname, jlong lpszver, jint cbver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avicap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "capGetDriverDescriptionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wdriverindex, (void*)(uintptr_t)lpszname, (int32_t)cbname, (void*)(uintptr_t)lpszver, (int32_t)cbver) : -1;
#else
    (void)wdriverindex;
    (void)lpszname;
    (void)cbname;
    (void)lpszver;
    (void)cbver;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1joyGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong ujoyid, jlong pjc, jint cbjc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetDevCapsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)ujoyid, (void*)(uintptr_t)pjc, (uint32_t)cbjc) : 0;
#else
    (void)ujoyid;
    (void)pjc;
    (void)cbjc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1joyGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong ujoyid, jlong pjc, jint cbjc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetDevCapsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)ujoyid, (void*)(uintptr_t)pjc, (uint32_t)cbjc) : 0;
#else
    (void)ujoyid;
    (void)pjc;
    (void)cbjc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1joyGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetNumDevs");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1joyGetPos(JNIEnv* km_env, jclass km_clazz, jint ujoyid, jlong pji) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetPos");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ujoyid, (void*)(uintptr_t)pji) : 0;
#else
    (void)ujoyid;
    (void)pji;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1joyGetPosEx(JNIEnv* km_env, jclass km_clazz, jint ujoyid, jlong pji) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetPosEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ujoyid, (void*)(uintptr_t)pji) : 0;
#else
    (void)ujoyid;
    (void)pji;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1joyGetThreshold(JNIEnv* km_env, jclass km_clazz, jint ujoyid, jlong puthreshold) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyGetThreshold");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ujoyid, (void*)(uintptr_t)puthreshold) : 0;
#else
    (void)ujoyid;
    (void)puthreshold;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1joyReleaseCapture(JNIEnv* km_env, jclass km_clazz, jint ujoyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joyReleaseCapture");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ujoyid) : 0;
#else
    (void)ujoyid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1joySetCapture(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint ujoyid, jint uperiod, jint fchanged) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joySetCapture");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)ujoyid, (uint32_t)uperiod, (int32_t)fchanged) : 0;
#else
    (void)hwnd;
    (void)ujoyid;
    (void)uperiod;
    (void)fchanged;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1joySetThreshold(JNIEnv* km_env, jclass km_clazz, jint ujoyid, jint uthreshold) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "joySetThreshold");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ujoyid, (uint32_t)uthreshold) : 0;
#else
    (void)ujoyid;
    (void)uthreshold;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciDriverNotify(JNIEnv* km_env, jclass km_clazz, jlong hwndcallback, jint wdeviceid, jint ustatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciDriverNotify");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndcallback, (uint32_t)wdeviceid, (uint32_t)ustatus) : -1;
#else
    (void)hwndcallback;
    (void)wdeviceid;
    (void)ustatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciDriverYield(JNIEnv* km_env, jclass km_clazz, jint wdeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciDriverYield");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wdeviceid) : 0;
#else
    (void)wdeviceid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciFreeCommandResource(JNIEnv* km_env, jclass km_clazz, jint wtable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciFreeCommandResource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wtable) : -1;
#else
    (void)wtable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciGetCreatorTask(JNIEnv* km_env, jclass km_clazz, jint mciid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetCreatorTask");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mciid) : NULL;
#else
    (void)mciid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciGetDeviceIDA(JNIEnv* km_env, jclass km_clazz, jlong pszdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDeviceIDA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdevice) : 0;
#else
    (void)pszdevice;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciGetDeviceIDFromElementIDA(JNIEnv* km_env, jclass km_clazz, jint dwelementid, jlong lpstrtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDeviceIDFromElementIDA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwelementid, (void*)(uintptr_t)lpstrtype) : 0;
#else
    (void)dwelementid;
    (void)lpstrtype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciGetDeviceIDFromElementIDW(JNIEnv* km_env, jclass km_clazz, jint dwelementid, jlong lpstrtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDeviceIDFromElementIDW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwelementid, (void*)(uintptr_t)lpstrtype) : 0;
#else
    (void)dwelementid;
    (void)lpstrtype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciGetDeviceIDW(JNIEnv* km_env, jclass km_clazz, jlong pszdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDeviceIDW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdevice) : 0;
#else
    (void)pszdevice;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciGetDriverData(JNIEnv* km_env, jclass km_clazz, jint wdeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetDriverData");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wdeviceid) : 0;
#else
    (void)wdeviceid;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciGetErrorStringA(JNIEnv* km_env, jclass km_clazz, jint mcierr, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetErrorStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mcierr, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : -1;
#else
    (void)mcierr;
    (void)psztext;
    (void)cchtext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciGetErrorStringW(JNIEnv* km_env, jclass km_clazz, jint mcierr, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetErrorStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mcierr, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : -1;
#else
    (void)mcierr;
    (void)psztext;
    (void)cchtext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciGetYieldProc(JNIEnv* km_env, jclass km_clazz, jint mciid, jlong pdwyielddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciGetYieldProc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mciid, (void*)(uintptr_t)pdwyielddata) : NULL;
#else
    (void)mciid;
    (void)pdwyielddata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciLoadCommandResource(JNIEnv* km_env, jclass km_clazz, jlong hinstance, jlong lpresname, jint wtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciLoadCommandResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpresname, (uint32_t)wtype) : 0;
#else
    (void)hinstance;
    (void)lpresname;
    (void)wtype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciSendCommandA(JNIEnv* km_env, jclass km_clazz, jint mciid, jint umsg, jlong dwparam1, jlong dwparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSendCommandA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mciid, (uint32_t)umsg, (uint64_t)dwparam1, (uint64_t)dwparam2) : 0;
#else
    (void)mciid;
    (void)umsg;
    (void)dwparam1;
    (void)dwparam2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciSendCommandW(JNIEnv* km_env, jclass km_clazz, jint mciid, jint umsg, jlong dwparam1, jlong dwparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSendCommandW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mciid, (uint32_t)umsg, (uint64_t)dwparam1, (uint64_t)dwparam2) : 0;
#else
    (void)mciid;
    (void)umsg;
    (void)dwparam1;
    (void)dwparam2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciSendStringA(JNIEnv* km_env, jclass km_clazz, jlong lpstrcommand, jlong lpstrreturnstring, jint ureturnlength, jlong hwndcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSendStringA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstrcommand, (void*)(uintptr_t)lpstrreturnstring, (uint32_t)ureturnlength, (void*)(uintptr_t)hwndcallback) : 0;
#else
    (void)lpstrcommand;
    (void)lpstrreturnstring;
    (void)ureturnlength;
    (void)hwndcallback;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciSendStringW(JNIEnv* km_env, jclass km_clazz, jlong lpstrcommand, jlong lpstrreturnstring, jint ureturnlength, jlong hwndcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSendStringW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstrcommand, (void*)(uintptr_t)lpstrreturnstring, (uint32_t)ureturnlength, (void*)(uintptr_t)hwndcallback) : 0;
#else
    (void)lpstrcommand;
    (void)lpstrreturnstring;
    (void)ureturnlength;
    (void)hwndcallback;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciSetDriverData(JNIEnv* km_env, jclass km_clazz, jint wdeviceid, jlong dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSetDriverData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wdeviceid, (uint64_t)dwdata) : -1;
#else
    (void)wdeviceid;
    (void)dwdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mciSetYieldProc(JNIEnv* km_env, jclass km_clazz, jint mciid, jlong fpyieldproc, jint dwyielddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mciSetYieldProc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mciid, (void*)(uintptr_t)fpyieldproc, (uint32_t)dwyielddata) : -1;
#else
    (void)mciid;
    (void)fpyieldproc;
    (void)dwyielddata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmDrvInstall(JNIEnv* km_env, jclass km_clazz, jlong hdriver, jlong wszdrventry, jlong drvmessage, jint wflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmDrvInstall");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdriver, (void*)(uintptr_t)wszdrventry, (void*)(uintptr_t)drvmessage, (uint32_t)wflags) : 0;
#else
    (void)hdriver;
    (void)wszdrventry;
    (void)drvmessage;
    (void)wflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmGetCurrentTask(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmGetCurrentTask");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmTaskBlock(JNIEnv* km_env, jclass km_clazz, jint h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmTaskBlock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)h);
#else
    (void)h;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmTaskCreate(JNIEnv* km_env, jclass km_clazz, jlong lpfn, jlong lph, jlong dwinst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmTaskCreate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfn, (void*)(uintptr_t)lph, (uint64_t)dwinst) : 0;
#else
    (void)lpfn;
    (void)lph;
    (void)dwinst;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmTaskSignal(JNIEnv* km_env, jclass km_clazz, jint h) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmTaskSignal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)h) : -1;
#else
    (void)h;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmTaskYield(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmTaskYield");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioAdvance(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jlong pmmioinfo, jint fuadvance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioAdvance");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (void*)(uintptr_t)pmmioinfo, (uint32_t)fuadvance) : 0;
#else
    (void)hmmio;
    (void)pmmioinfo;
    (void)fuadvance;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioAscend(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jlong pmmcki, jint fuascend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioAscend");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (void*)(uintptr_t)pmmcki, (uint32_t)fuascend) : 0;
#else
    (void)hmmio;
    (void)pmmcki;
    (void)fuascend;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioClose(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jint fuclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (uint32_t)fuclose) : 0;
#else
    (void)hmmio;
    (void)fuclose;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioCreateChunk(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jlong pmmcki, jint fucreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioCreateChunk");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (void*)(uintptr_t)pmmcki, (uint32_t)fucreate) : 0;
#else
    (void)hmmio;
    (void)pmmcki;
    (void)fucreate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioDescend(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jlong pmmcki, jlong pmmckiparent, jint fudescend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioDescend");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (void*)(uintptr_t)pmmcki, (void*)(uintptr_t)pmmckiparent, (uint32_t)fudescend) : 0;
#else
    (void)hmmio;
    (void)pmmcki;
    (void)pmmckiparent;
    (void)fudescend;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioFlush(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jint fuflush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioFlush");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (uint32_t)fuflush) : 0;
#else
    (void)hmmio;
    (void)fuflush;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioGetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jlong pmmioinfo, jint fuinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (void*)(uintptr_t)pmmioinfo, (uint32_t)fuinfo) : 0;
#else
    (void)hmmio;
    (void)pmmioinfo;
    (void)fuinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioInstallIOProcA(JNIEnv* km_env, jclass km_clazz, jint fccioproc, jlong pioproc, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioInstallIOProcA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fccioproc, (void*)(uintptr_t)pioproc, (uint32_t)dwflags) : NULL;
#else
    (void)fccioproc;
    (void)pioproc;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioInstallIOProcW(JNIEnv* km_env, jclass km_clazz, jint fccioproc, jlong pioproc, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioInstallIOProcW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fccioproc, (void*)(uintptr_t)pioproc, (uint32_t)dwflags) : NULL;
#else
    (void)fccioproc;
    (void)pioproc;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioOpenA(JNIEnv* km_env, jclass km_clazz, jlong pszfilename, jlong pmmioinfo, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioOpenA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfilename, (void*)(uintptr_t)pmmioinfo, (uint32_t)fdwopen) : NULL;
#else
    (void)pszfilename;
    (void)pmmioinfo;
    (void)fdwopen;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioOpenW(JNIEnv* km_env, jclass km_clazz, jlong pszfilename, jlong pmmioinfo, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioOpenW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfilename, (void*)(uintptr_t)pmmioinfo, (uint32_t)fdwopen) : NULL;
#else
    (void)pszfilename;
    (void)pmmioinfo;
    (void)fdwopen;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioRead(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jlong pch, jint cch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioRead");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (void*)(uintptr_t)pch, (int32_t)cch) : -1;
#else
    (void)hmmio;
    (void)pch;
    (void)cch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioRenameA(JNIEnv* km_env, jclass km_clazz, jlong pszfilename, jlong psznewfilename, jlong pmmioinfo, jint fdwrename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioRenameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfilename, (void*)(uintptr_t)psznewfilename, (void*)(uintptr_t)pmmioinfo, (uint32_t)fdwrename) : 0;
#else
    (void)pszfilename;
    (void)psznewfilename;
    (void)pmmioinfo;
    (void)fdwrename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioRenameW(JNIEnv* km_env, jclass km_clazz, jlong pszfilename, jlong psznewfilename, jlong pmmioinfo, jint fdwrename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioRenameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfilename, (void*)(uintptr_t)psznewfilename, (void*)(uintptr_t)pmmioinfo, (uint32_t)fdwrename) : 0;
#else
    (void)pszfilename;
    (void)psznewfilename;
    (void)pmmioinfo;
    (void)fdwrename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioSeek(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jint loffset, jint iorigin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioSeek");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (int32_t)loffset, (int32_t)iorigin) : -1;
#else
    (void)hmmio;
    (void)loffset;
    (void)iorigin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioSendMessage(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jint umsg, jlong lparam1, jlong lparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioSendMessage");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (uint32_t)umsg, (int64_t)lparam1, (int64_t)lparam2) : -1;
#else
    (void)hmmio;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioSetBuffer(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jlong pchbuffer, jint cchbuffer, jint fubuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioSetBuffer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (void*)(uintptr_t)pchbuffer, (int32_t)cchbuffer, (uint32_t)fubuffer) : 0;
#else
    (void)hmmio;
    (void)pchbuffer;
    (void)cchbuffer;
    (void)fubuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioSetInfo(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jlong pmmioinfo, jint fuinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (void*)(uintptr_t)pmmioinfo, (uint32_t)fuinfo) : 0;
#else
    (void)hmmio;
    (void)pmmioinfo;
    (void)fuinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioStringToFOURCCA(JNIEnv* km_env, jclass km_clazz, jlong sz, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioStringToFOURCCA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sz, (uint32_t)uflags) : 0;
#else
    (void)sz;
    (void)uflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioStringToFOURCCW(JNIEnv* km_env, jclass km_clazz, jlong sz, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioStringToFOURCCW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sz, (uint32_t)uflags) : 0;
#else
    (void)sz;
    (void)uflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1mmioWrite(JNIEnv* km_env, jclass km_clazz, jlong hmmio, jlong pch, jint cch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mmioWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmmio, (void*)(uintptr_t)pch, (int32_t)cch) : -1;
#else
    (void)hmmio;
    (void)pch;
    (void)cch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_multimedia_WindowsWin32MediaMultimediaJniBridge_windowssys_1windows_1win32_1media_1multimedia_1sndOpenSound(JNIEnv* km_env, jclass km_clazz, jlong eventname, jlong appname, jint flags, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-mm-misc-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sndOpenSound");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eventname, (void*)(uintptr_t)appname, (int32_t)flags, (void*)(uintptr_t)filehandle) : -1;
#else
    (void)eventname;
    (void)appname;
    (void)flags;
    (void)filehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

