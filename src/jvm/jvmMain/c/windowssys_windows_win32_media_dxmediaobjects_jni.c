#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1dMOEnum(JNIEnv* km_env, jclass km_clazz, jlong guidcategory, jint dwflags, jint cintypes, jlong pintypes, jint couttypes, jlong pouttypes, jlong ppenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMOEnum");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)guidcategory, (uint32_t)dwflags, (uint32_t)cintypes, (void*)(uintptr_t)pintypes, (uint32_t)couttypes, (void*)(uintptr_t)pouttypes, (void*)(uintptr_t)ppenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)guidcategory;
    (void)dwflags;
    (void)cintypes;
    (void)pintypes;
    (void)couttypes;
    (void)pouttypes;
    (void)ppenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1dMOGetName(JNIEnv* km_env, jclass km_clazz, jlong clsiddmo, jlong szname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMOGetName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsiddmo, (void*)(uintptr_t)szname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsiddmo;
    (void)szname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1dMOGetTypes(JNIEnv* km_env, jclass km_clazz, jlong clsiddmo, jint ulinputtypesrequested, jlong pulinputtypessupplied, jlong pinputtypes, jint uloutputtypesrequested, jlong puloutputtypessupplied, jlong poutputtypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMOGetTypes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsiddmo, (uint32_t)ulinputtypesrequested, (void*)(uintptr_t)pulinputtypessupplied, (void*)(uintptr_t)pinputtypes, (uint32_t)uloutputtypesrequested, (void*)(uintptr_t)puloutputtypessupplied, (void*)(uintptr_t)poutputtypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsiddmo;
    (void)ulinputtypesrequested;
    (void)pulinputtypessupplied;
    (void)pinputtypes;
    (void)uloutputtypesrequested;
    (void)puloutputtypessupplied;
    (void)poutputtypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1dMORegister(JNIEnv* km_env, jclass km_clazz, jlong szname, jlong clsiddmo, jlong guidcategory, jint dwflags, jint cintypes, jlong pintypes, jint couttypes, jlong pouttypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMORegister");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szname, (void*)(uintptr_t)clsiddmo, (void*)(uintptr_t)guidcategory, (uint32_t)dwflags, (uint32_t)cintypes, (void*)(uintptr_t)pintypes, (uint32_t)couttypes, (void*)(uintptr_t)pouttypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szname;
    (void)clsiddmo;
    (void)guidcategory;
    (void)dwflags;
    (void)cintypes;
    (void)pintypes;
    (void)couttypes;
    (void)pouttypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1dMOUnregister(JNIEnv* km_env, jclass km_clazz, jlong clsiddmo, jlong guidcategory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DMOUnregister");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clsiddmo, (void*)(uintptr_t)guidcategory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clsiddmo;
    (void)guidcategory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1moCopyMediaType(JNIEnv* km_env, jclass km_clazz, jlong pmtdest, jlong pmtsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoCopyMediaType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmtdest, (void*)(uintptr_t)pmtsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmtdest;
    (void)pmtsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1moCreateMediaType(JNIEnv* km_env, jclass km_clazz, jlong ppmt, jint cbformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoCreateMediaType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppmt, (uint32_t)cbformat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppmt;
    (void)cbformat;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1moDeleteMediaType(JNIEnv* km_env, jclass km_clazz, jlong pmt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoDeleteMediaType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1moDuplicateMediaType(JNIEnv* km_env, jclass km_clazz, jlong ppmtdest, jlong pmtsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoDuplicateMediaType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppmtdest, (void*)(uintptr_t)pmtsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppmtdest;
    (void)pmtsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1moFreeMediaType(JNIEnv* km_env, jclass km_clazz, jlong pmt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoFreeMediaType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_dxmediaobjects_WindowsWin32MediaDxmediaobjectsJniBridge_windowssys_1windows_1win32_1media_1dxmediaobjects_1moInitMediaType(JNIEnv* km_env, jclass km_clazz, jlong pmt, jint cbformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdmo.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoInitMediaType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmt, (uint32_t)cbformat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmt;
    (void)cbformat;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

