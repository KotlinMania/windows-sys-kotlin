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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1addDllDirectory(JNIEnv* km_env, jclass km_clazz, jlong newdirectory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddDllDirectory");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)newdirectory);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)newdirectory;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1beginUpdateResourceA(JNIEnv* km_env, jclass km_clazz, jlong pfilename, jint bdeleteexistingresources) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginUpdateResourceA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfilename, (int32_t)bdeleteexistingresources);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pfilename;
    (void)bdeleteexistingresources;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1beginUpdateResourceW(JNIEnv* km_env, jclass km_clazz, jlong pfilename, jint bdeleteexistingresources) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginUpdateResourceW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfilename, (int32_t)bdeleteexistingresources);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pfilename;
    (void)bdeleteexistingresources;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1disableThreadLibraryCalls(JNIEnv* km_env, jclass km_clazz, jlong hlibmodule) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisableThreadLibraryCalls");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hlibmodule);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlibmodule;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1endUpdateResourceA(JNIEnv* km_env, jclass km_clazz, jlong hupdate, jint fdiscard) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndUpdateResourceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hupdate, (int32_t)fdiscard);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hupdate;
    (void)fdiscard;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1endUpdateResourceW(JNIEnv* km_env, jclass km_clazz, jlong hupdate, jint fdiscard) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndUpdateResourceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hupdate, (int32_t)fdiscard);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hupdate;
    (void)fdiscard;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceLanguagesA(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpname, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceLanguagesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceLanguagesExA(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpname, jlong lpenumfunc, jlong lparam, jint dwflags, jshort langid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceLanguagesExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam, (uint32_t)dwflags, (uint16_t)langid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceLanguagesExW(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpname, jlong lpenumfunc, jlong lparam, jint dwflags, jshort langid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceLanguagesExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam, (uint32_t)dwflags, (uint16_t)langid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceLanguagesW(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpname, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceLanguagesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceNamesA(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceNamesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceNamesExA(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpenumfunc, jlong lparam, jint dwflags, jshort langid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceNamesExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam, (uint32_t)dwflags, (uint16_t)langid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceNamesExW(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpenumfunc, jlong lparam, jint dwflags, jshort langid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceNamesExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam, (uint32_t)dwflags, (uint16_t)langid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceNamesW(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceNamesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceTypesA(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceTypesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceTypesExA(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lpenumfunc, jlong lparam, jint dwflags, jshort langid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceTypesExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam, (uint32_t)dwflags, (uint16_t)langid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceTypesExW(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lpenumfunc, jlong lparam, jint dwflags, jshort langid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceTypesExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam, (uint32_t)dwflags, (uint16_t)langid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1enumResourceTypesW(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lpenumfunc, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceTypesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpenumfunc, (int64_t)lparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1findResourceA(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lpname, jlong lptype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindResourceA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lptype);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hmodule;
    (void)lpname;
    (void)lptype;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1findResourceExA(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpname, jshort wlanguage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindResourceExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpname, (uint16_t)wlanguage);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)wlanguage;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1findResourceExW(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lptype, jlong lpname, jshort wlanguage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindResourceExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpname, (uint16_t)wlanguage);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)wlanguage;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1findResourceW(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lpname, jlong lptype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindResourceW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lptype);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hmodule;
    (void)lpname;
    (void)lptype;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1freeLibraryAndExitThread(JNIEnv* km_env, jclass km_clazz, jlong hlibmodule, jint dwexitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeLibraryAndExitThread");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hlibmodule, (uint32_t)dwexitcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hlibmodule;
    (void)dwexitcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1freeResource(JNIEnv* km_env, jclass km_clazz, jlong hresdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeResource");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hresdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hresdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1getDllDirectoryA(JNIEnv* km_env, jclass km_clazz, jint nbufferlength, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDllDirectoryA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1getDllDirectoryW(JNIEnv* km_env, jclass km_clazz, jint nbufferlength, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDllDirectoryW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1getModuleFileNameA(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleFileNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpfilename, (uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1getModuleFileNameW(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong lpfilename, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleFileNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)lpfilename, (uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1getModuleHandleA(JNIEnv* km_env, jclass km_clazz, jlong lpmodulename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleHandleA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmodulename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpmodulename;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1getModuleHandleExA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpmodulename, jlong phmodule) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleHandleExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpmodulename, (void*)(uintptr_t)phmodule);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)lpmodulename;
    (void)phmodule;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1getModuleHandleExW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpmodulename, jlong phmodule) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleHandleExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpmodulename, (void*)(uintptr_t)phmodule);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)lpmodulename;
    (void)phmodule;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1getModuleHandleW(JNIEnv* km_env, jclass km_clazz, jlong lpmodulename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleHandleW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmodulename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpmodulename;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1loadLibraryA(JNIEnv* km_env, jclass km_clazz, jlong lplibfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lplibfilename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lplibfilename;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1loadLibraryExA(JNIEnv* km_env, jclass km_clazz, jlong lplibfilename, jlong hfile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lplibfilename, (void*)(uintptr_t)hfile, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lplibfilename;
    (void)hfile;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1loadLibraryExW(JNIEnv* km_env, jclass km_clazz, jlong lplibfilename, jlong hfile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lplibfilename, (void*)(uintptr_t)hfile, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lplibfilename;
    (void)hfile;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1loadLibraryW(JNIEnv* km_env, jclass km_clazz, jlong lplibfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lplibfilename);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lplibfilename;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1loadModule(JNIEnv* km_env, jclass km_clazz, jlong lpmodulename, jlong lpparameterblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadModule");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmodulename, (void*)(uintptr_t)lpparameterblock);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpmodulename;
    (void)lpparameterblock;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1loadPackagedLibrary(JNIEnv* km_env, jclass km_clazz, jlong lpwlibfilename, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadPackagedLibrary");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwlibfilename, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpwlibfilename;
    (void)reserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1loadResource(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong hresinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadResource");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)hresinfo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hmodule;
    (void)hresinfo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1lockResource(JNIEnv* km_env, jclass km_clazz, jlong hresdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockResource");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hresdata);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hresdata;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1queryOptionalDelayLoadedAPI(JNIEnv* km_env, jclass km_clazz, jlong hparentmodule, jlong lpdllname, jlong lpprocname, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-libraryloader-l2-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryOptionalDelayLoadedAPI");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hparentmodule, (void*)(uintptr_t)lpdllname, (void*)(uintptr_t)lpprocname, (uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hparentmodule;
    (void)lpdllname;
    (void)lpprocname;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1removeDllDirectory(JNIEnv* km_env, jclass km_clazz, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDllDirectory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cookie);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cookie;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1setDefaultDllDirectories(JNIEnv* km_env, jclass km_clazz, jint directoryflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultDllDirectories");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)directoryflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)directoryflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1setDllDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lppathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDllDirectoryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lppathname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lppathname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1setDllDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lppathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDllDirectoryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lppathname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lppathname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1sizeofResource(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jlong hresinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SizeofResource");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (void*)(uintptr_t)hresinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmodule;
    (void)hresinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1updateResourceA(JNIEnv* km_env, jclass km_clazz, jlong hupdate, jlong lptype, jlong lpname, jshort wlanguage, jlong lpdata, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateResourceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hupdate, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpname, (uint16_t)wlanguage, (void*)(uintptr_t)lpdata, (uint32_t)cb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hupdate;
    (void)lptype;
    (void)lpname;
    (void)wlanguage;
    (void)lpdata;
    (void)cb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_libraryloader_WindowsWin32SystemLibraryloaderJniBridge_windowssys_1windows_1win32_1system_1libraryloader_1updateResourceW(JNIEnv* km_env, jclass km_clazz, jlong hupdate, jlong lptype, jlong lpname, jshort wlanguage, jlong lpdata, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateResourceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hupdate, (void*)(uintptr_t)lptype, (void*)(uintptr_t)lpname, (uint16_t)wlanguage, (void*)(uintptr_t)lpdata, (uint32_t)cb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hupdate;
    (void)lptype;
    (void)lpname;
    (void)wlanguage;
    (void)lpdata;
    (void)cb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

