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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantClearVariantArray(JNIEnv* km_env, jclass km_clazz, jlong pvars, jint cvars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearVariantArray");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pvars, (uint32_t)cvars);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pvars;
    (void)cvars;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime(JNIEnv* km_env, jclass km_clazz, jshort wdosdate, jshort wdostime, jlong pvtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DosDateTimeToVariantTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)wdosdate, (uint16_t)wdostime, (void*)(uintptr_t)pvtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wdosdate;
    (void)wdostime;
    (void)pvtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray(JNIEnv* km_env, jclass km_clazz, jlong prgf, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromBooleanArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgf, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgf;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromBuffer(JNIEnv* km_env, jclass km_clazz, jlong pv, jint cb, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pv, (uint32_t)cb, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pv;
    (void)cb;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromDoubleArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromFileTime(JNIEnv* km_env, jclass km_clazz, jlong pft, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromFileTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pft, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pft;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray(JNIEnv* km_env, jclass km_clazz, jlong prgft, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromFileTimeArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgft, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgft;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString(JNIEnv* km_env, jclass km_clazz, jlong guid, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromGUIDAsString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)guid, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)guid;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromInt16Array(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromInt16Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromInt32Array(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromInt32Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromInt64Array(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromInt64Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromResource(JNIEnv* km_env, jclass km_clazz, jlong hinst, jint id, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromResource");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinst, (uint32_t)id, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hinst;
    (void)id;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromStringArray(JNIEnv* km_env, jclass km_clazz, jlong prgsz, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromStringArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgsz, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgsz;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromUInt16Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromUInt32Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromUInt64Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgn;
    (void)celems;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem(JNIEnv* km_env, jclass km_clazz, jlong varin, jint ielem, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromVariantArrayElem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (uint32_t)ielem, (void*)(uintptr_t)pvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)ielem;
    (void)pvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantSystemTimeToVariantTime(JNIEnv* km_env, jclass km_clazz, jlong lpsystemtime, jlong pvtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemTimeToVariantTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemtime, (void*)(uintptr_t)pvtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemtime;
    (void)pvtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserFree64");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserMarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserMarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserSize64");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserUnmarshal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VARIANT_UserUnmarshal64");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantChangeType(JNIEnv* km_env, jclass km_clazz, jlong pvargdest, jlong pvarsrc, jshort wflags, jshort vt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantChangeType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvargdest, (void*)(uintptr_t)pvarsrc, (uint16_t)wflags, (uint16_t)vt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvargdest;
    (void)pvarsrc;
    (void)wflags;
    (void)vt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantChangeTypeEx(JNIEnv* km_env, jclass km_clazz, jlong pvargdest, jlong pvarsrc, jint lcid, jshort wflags, jshort vt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantChangeTypeEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvargdest, (void*)(uintptr_t)pvarsrc, (uint32_t)lcid, (uint16_t)wflags, (uint16_t)vt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvargdest;
    (void)pvarsrc;
    (void)lcid;
    (void)wflags;
    (void)vt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantClear(JNIEnv* km_env, jclass km_clazz, jlong pvarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantClear");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvarg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvarg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantCompare(JNIEnv* km_env, jclass km_clazz, jlong var1, jlong var2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantCompare");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var1, (void*)(uintptr_t)var2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var1;
    (void)var2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantCopy(JNIEnv* km_env, jclass km_clazz, jlong pvargdest, jlong pvargsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantCopy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvargdest, (void*)(uintptr_t)pvargsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvargdest;
    (void)pvargsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantCopyInd(JNIEnv* km_env, jclass km_clazz, jlong pvardest, jlong pvargsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantCopyInd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvardest, (void*)(uintptr_t)pvargsrc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvardest;
    (void)pvargsrc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetBooleanElem(JNIEnv* km_env, jclass km_clazz, jlong var, jint ielem, jlong pfval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetBooleanElem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (uint32_t)ielem, (void*)(uintptr_t)pfval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)ielem;
    (void)pfval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetDoubleElem(JNIEnv* km_env, jclass km_clazz, jlong var, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetDoubleElem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (uint32_t)ielem, (void*)(uintptr_t)pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetElementCount(JNIEnv* km_env, jclass km_clazz, jlong varin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetElementCount");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)varin;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetInt16Elem(JNIEnv* km_env, jclass km_clazz, jlong var, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetInt16Elem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (uint32_t)ielem, (void*)(uintptr_t)pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetInt32Elem(JNIEnv* km_env, jclass km_clazz, jlong var, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetInt32Elem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (uint32_t)ielem, (void*)(uintptr_t)pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetInt64Elem(JNIEnv* km_env, jclass km_clazz, jlong var, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetInt64Elem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (uint32_t)ielem, (void*)(uintptr_t)pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetStringElem(JNIEnv* km_env, jclass km_clazz, jlong var, jint ielem, jlong ppszval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetStringElem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (uint32_t)ielem, (void*)(uintptr_t)ppszval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)ielem;
    (void)ppszval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetUInt16Elem(JNIEnv* km_env, jclass km_clazz, jlong var, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetUInt16Elem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (uint32_t)ielem, (void*)(uintptr_t)pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetUInt32Elem(JNIEnv* km_env, jclass km_clazz, jlong var, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetUInt32Elem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (uint32_t)ielem, (void*)(uintptr_t)pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantGetUInt64Elem(JNIEnv* km_env, jclass km_clazz, jlong var, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantGetUInt64Elem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (uint32_t)ielem, (void*)(uintptr_t)pnval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)ielem;
    (void)pnval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantInit(JNIEnv* km_env, jclass km_clazz, jlong pvarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantInit");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pvarg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pvarg;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime(JNIEnv* km_env, jclass km_clazz, jdouble vtime, jlong pwdosdate, jlong pwdostime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantTimeToDosDateTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)vtime, (void*)(uintptr_t)pwdosdate, (void*)(uintptr_t)pwdostime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vtime;
    (void)pwdosdate;
    (void)pwdostime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantTimeToSystemTime(JNIEnv* km_env, jclass km_clazz, jdouble vtime, jlong lpsystemtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleaut32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantTimeToSystemTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)vtime, (void*)(uintptr_t)lpsystemtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)vtime;
    (void)lpsystemtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToBoolean(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pfret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBoolean");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pfret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)pfret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToBooleanArray(JNIEnv* km_env, jclass km_clazz, jlong var, jlong prgf, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBooleanArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)prgf, (uint32_t)crgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)prgf;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc(JNIEnv* km_env, jclass km_clazz, jlong var, jlong pprgf, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBooleanArrayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)pprgf, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)pprgf;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault(JNIEnv* km_env, jclass km_clazz, jlong varin, jint fdefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBooleanWithDefault");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (int32_t)fdefault);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)fdefault;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToBuffer(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pv, (uint32_t)cb);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)pv;
    (void)cb;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToDosDateTime(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pwdate, jlong pwtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDosDateTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pwdate, (void*)(uintptr_t)pwtime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)pwdate;
    (void)pwtime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToDouble(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pdblret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDouble");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pdblret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)pdblret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToDoubleArray(JNIEnv* km_env, jclass km_clazz, jlong var, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDoubleArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc(JNIEnv* km_env, jclass km_clazz, jlong var, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDoubleArrayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jdouble JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault(JNIEnv* km_env, jclass km_clazz, jlong varin, jdouble dbldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToDoubleWithDefault");
    }
    double km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (double)dbldefault);
    } else {
        errno = ENOSYS;
        km_res = 0.0;
    }
#else
    (void)varin;
    (void)dbldefault;
    errno = ENOSYS;
    double km_res = 0.0;
#endif
    return (jdouble)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToFileTime(JNIEnv* km_env, jclass km_clazz, jlong varin, jint stfout, jlong pftout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToFileTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (int32_t)stfout, (void*)(uintptr_t)pftout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)stfout;
    (void)pftout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToGUID(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToGUID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pguid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)pguid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt16(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong piret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt16");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)piret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)piret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt16Array(JNIEnv* km_env, jclass km_clazz, jlong var, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt16Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc(JNIEnv* km_env, jclass km_clazz, jlong var, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt16ArrayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt16WithDefault(JNIEnv* km_env, jclass km_clazz, jlong varin, jshort idefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt16WithDefault");
    }
    int16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (int16_t)idefault);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)idefault;
    errno = ENOSYS;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt32(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong plret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)plret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)plret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt32Array(JNIEnv* km_env, jclass km_clazz, jlong var, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt32Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc(JNIEnv* km_env, jclass km_clazz, jlong var, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt32ArrayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt32WithDefault(JNIEnv* km_env, jclass km_clazz, jlong varin, jint ldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt32WithDefault");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (int32_t)ldefault);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)ldefault;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt64(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pllret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pllret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)pllret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt64Array(JNIEnv* km_env, jclass km_clazz, jlong var, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt64Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc(JNIEnv* km_env, jclass km_clazz, jlong var, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt64ArrayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToInt64WithDefault(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong lldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToInt64WithDefault");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (int64_t)lldefault);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)lldefault;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToString(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)pszbuf;
    (void)cchbuf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToStringAlloc(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong ppszbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStringAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)ppszbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)ppszbuf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToStringArray(JNIEnv* km_env, jclass km_clazz, jlong var, jlong prgsz, jint crgsz, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStringArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)prgsz, (uint32_t)crgsz, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)prgsz;
    (void)crgsz;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc(JNIEnv* km_env, jclass km_clazz, jlong var, jlong pprgsz, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStringArrayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)pprgsz, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)pprgsz;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToStringWithDefault(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pszdefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStringWithDefault");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pszdefault);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)varin;
    (void)pszdefault;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt16(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong puiret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt16");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)puiret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)puiret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt16Array(JNIEnv* km_env, jclass km_clazz, jlong var, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt16Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc(JNIEnv* km_env, jclass km_clazz, jlong var, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt16ArrayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault(JNIEnv* km_env, jclass km_clazz, jlong varin, jshort uidefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt16WithDefault");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (uint16_t)uidefault);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)varin;
    (void)uidefault;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt32(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pulret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pulret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)pulret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt32Array(JNIEnv* km_env, jclass km_clazz, jlong var, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt32Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc(JNIEnv* km_env, jclass km_clazz, jlong var, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt32ArrayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault(JNIEnv* km_env, jclass km_clazz, jlong varin, jint uldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt32WithDefault");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (uint32_t)uldefault);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)varin;
    (void)uldefault;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt64(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pullret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pullret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)varin;
    (void)pullret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt64Array(JNIEnv* km_env, jclass km_clazz, jlong var, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt64Array");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc(JNIEnv* km_env, jclass km_clazz, jlong var, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt64ArrayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)var, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)var;
    (void)pprgn;
    (void)pcelem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_variant_WindowsWin32SystemVariantJniBridge_windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong ulldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToUInt64WithDefault");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)varin, (uint64_t)ulldefault);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)varin;
    (void)ulldefault;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

