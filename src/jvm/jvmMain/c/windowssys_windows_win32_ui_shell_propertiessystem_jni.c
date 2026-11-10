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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSCoerceToCanonicalValue(JNIEnv* km_env, jclass km_clazz, jlong key, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCoerceToCanonicalValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)key, (void*)(uintptr_t)ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)key;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSCreateAdapterFromPropertyStore(JNIEnv* km_env, jclass km_clazz, jlong pps, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateAdapterFromPropertyStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pps, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pps;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSCreateDelayedMultiplexPropertyStore(JNIEnv* km_env, jclass km_clazz, jint flags, jlong pdpsf, jlong rgstoreids, jint cstores, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateDelayedMultiplexPropertyStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)flags, (void*)(uintptr_t)pdpsf, (void*)(uintptr_t)rgstoreids, (uint32_t)cstores, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)pdpsf;
    (void)rgstoreids;
    (void)cstores;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSCreateMemoryPropertyStore(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateMemoryPropertyStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSCreateMultiplexPropertyStore(JNIEnv* km_env, jclass km_clazz, jlong prgpunkstores, jint cstores, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateMultiplexPropertyStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prgpunkstores, (uint32_t)cstores, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prgpunkstores;
    (void)cstores;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSCreatePropertyChangeArray(JNIEnv* km_env, jclass km_clazz, jlong rgpropkey, jlong rgflags, jlong rgpropvar, jint cchanges, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreatePropertyChangeArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)rgpropkey, (void*)(uintptr_t)rgflags, (void*)(uintptr_t)rgpropvar, (uint32_t)cchanges, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)rgpropkey;
    (void)rgflags;
    (void)rgpropvar;
    (void)cchanges;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSCreatePropertyStoreFromObject(JNIEnv* km_env, jclass km_clazz, jlong punk, jint grfmode, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreatePropertyStoreFromObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punk, (uint32_t)grfmode, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punk;
    (void)grfmode;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSCreatePropertyStoreFromPropertySetStorage(JNIEnv* km_env, jclass km_clazz, jlong ppss, jint grfmode, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreatePropertyStoreFromPropertySetStorage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppss, (uint32_t)grfmode, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppss;
    (void)grfmode;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSCreateSimplePropertyChange(JNIEnv* km_env, jclass km_clazz, jint flags, jlong key, jlong propvar, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSCreateSimplePropertyChange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)flags, (void*)(uintptr_t)key, (void*)(uintptr_t)propvar, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)key;
    (void)propvar;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSEnumeratePropertyDescriptions(JNIEnv* km_env, jclass km_clazz, jint filteron, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSEnumeratePropertyDescriptions");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)filteron, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filteron;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSFormatForDisplay(JNIEnv* km_env, jclass km_clazz, jlong propkey, jlong propvar, jint pdfflags, jlong pwsztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSFormatForDisplay");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propkey, (void*)(uintptr_t)propvar, (int32_t)pdfflags, (void*)(uintptr_t)pwsztext, (uint32_t)cchtext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propkey;
    (void)propvar;
    (void)pdfflags;
    (void)pwsztext;
    (void)cchtext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSFormatForDisplayAlloc(JNIEnv* km_env, jclass km_clazz, jlong key, jlong propvar, jint pdff, jlong ppszdisplay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSFormatForDisplayAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)key, (void*)(uintptr_t)propvar, (int32_t)pdff, (void*)(uintptr_t)ppszdisplay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)key;
    (void)propvar;
    (void)pdff;
    (void)ppszdisplay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSFormatPropertyValue(JNIEnv* km_env, jclass km_clazz, jlong pps, jlong ppd, jint pdff, jlong ppszdisplay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSFormatPropertyValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pps, (void*)(uintptr_t)ppd, (int32_t)pdff, (void*)(uintptr_t)ppszdisplay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pps;
    (void)ppd;
    (void)pdff;
    (void)ppszdisplay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetImageReferenceForValue(JNIEnv* km_env, jclass km_clazz, jlong propkey, jlong propvar, jlong ppszimageres) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetImageReferenceForValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propkey, (void*)(uintptr_t)propvar, (void*)(uintptr_t)ppszimageres);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propkey;
    (void)propvar;
    (void)ppszimageres;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetItemPropertyHandler(JNIEnv* km_env, jclass km_clazz, jlong punkitem, jint freadwrite, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetItemPropertyHandler");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punkitem, (int32_t)freadwrite, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punkitem;
    (void)freadwrite;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetItemPropertyHandlerWithCreateObject(JNIEnv* km_env, jclass km_clazz, jlong punkitem, jint freadwrite, jlong punkcreateobject, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetItemPropertyHandlerWithCreateObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)punkitem, (int32_t)freadwrite, (void*)(uintptr_t)punkcreateobject, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)punkitem;
    (void)freadwrite;
    (void)punkcreateobject;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetNameFromPropertyKey(JNIEnv* km_env, jclass km_clazz, jlong propkey, jlong ppszcanonicalname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetNameFromPropertyKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propkey, (void*)(uintptr_t)ppszcanonicalname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propkey;
    (void)ppszcanonicalname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetNamedPropertyFromPropertyStorage(JNIEnv* km_env, jclass km_clazz, jlong psps, jint cb, jlong pszname, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetNamedPropertyFromPropertyStorage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)psps, (uint32_t)cb, (void*)(uintptr_t)pszname, (void*)(uintptr_t)ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psps;
    (void)cb;
    (void)pszname;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetPropertyDescription(JNIEnv* km_env, jclass km_clazz, jlong propkey, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyDescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propkey, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propkey;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetPropertyDescriptionByName(JNIEnv* km_env, jclass km_clazz, jlong pszcanonicalname, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyDescriptionByName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszcanonicalname, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszcanonicalname;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetPropertyDescriptionListFromString(JNIEnv* km_env, jclass km_clazz, jlong pszproplist, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyDescriptionListFromString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszproplist, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszproplist;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetPropertyFromPropertyStorage(JNIEnv* km_env, jclass km_clazz, jlong psps, jint cb, jlong rpkey, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyFromPropertyStorage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)psps, (uint32_t)cb, (void*)(uintptr_t)rpkey, (void*)(uintptr_t)ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psps;
    (void)cb;
    (void)rpkey;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetPropertyKeyFromName(JNIEnv* km_env, jclass km_clazz, jlong pszname, jlong ppropkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyKeyFromName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszname, (void*)(uintptr_t)ppropkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszname;
    (void)ppropkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetPropertySystem(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertySystem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSGetPropertyValue(JNIEnv* km_env, jclass km_clazz, jlong pps, jlong ppd, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSGetPropertyValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pps, (void*)(uintptr_t)ppd, (void*)(uintptr_t)ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pps;
    (void)ppd;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSLookupPropertyHandlerCLSID(JNIEnv* km_env, jclass km_clazz, jlong pszfilepath, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSLookupPropertyHandlerCLSID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszfilepath, (void*)(uintptr_t)pclsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszfilepath;
    (void)pclsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagDelete(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_Delete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadBool(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadBOOL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadBstr(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadBSTR");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadDword(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadDWORD");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadGuid(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadGUID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadInt(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadInt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadLong(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadLONG");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadPointl(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadPOINTL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadPoints(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadPOINTS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadPropertyKey(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadPropertyKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadRectl(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadRECTL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadShort(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadSHORT");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadStr(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value, jint charactercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value, (int32_t)charactercount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    (void)charactercount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadStrAlloc(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadStrAlloc");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadStream(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadType(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong var, jshort type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)var, (uint16_t)type);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)var;
    (void)type;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadUlonglong(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadULONGLONG");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagReadUnknown(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_ReadUnknown");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteBool(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteBOOL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (int32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteBstr(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteBSTR");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteDword(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteDWORD");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (uint32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteGuid(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteGUID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteInt(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteInt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (int32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteLong(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jint value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteLONG");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (int32_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWritePointl(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WritePOINTL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWritePoints(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WritePOINTS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWritePropertyKey(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WritePropertyKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteRectl(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteRECTL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteShort(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jshort value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteSHORT");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (int16_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteStr(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteStr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteStream(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteUlonglong(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteULONGLONG");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (uint64_t)value);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)value;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pspropertyBagWriteUnknown(JNIEnv* km_env, jclass km_clazz, jlong propbag, jlong propname, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyBag_WriteUnknown");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propbag, (void*)(uintptr_t)propname, (void*)(uintptr_t)punk);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propbag;
    (void)propname;
    (void)punk;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSPropertyKeyFromString(JNIEnv* km_env, jclass km_clazz, jlong pszstring, jlong pkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSPropertyKeyFromString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszstring, (void*)(uintptr_t)pkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszstring;
    (void)pkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSRefreshPropertySchema(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSRefreshPropertySchema");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSRegisterPropertySchema(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSRegisterPropertySchema");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSSetPropertyValue(JNIEnv* km_env, jclass km_clazz, jlong pps, jlong ppd, jlong propvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSSetPropertyValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pps, (void*)(uintptr_t)ppd, (void*)(uintptr_t)propvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pps;
    (void)ppd;
    (void)propvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSStringFromPropertyKey(JNIEnv* km_env, jclass km_clazz, jlong pkey, jlong psz, jint cch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSStringFromPropertyKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pkey, (void*)(uintptr_t)psz, (uint32_t)cch);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pkey;
    (void)psz;
    (void)cch;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pSUnregisterPropertySchema(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PSUnregisterPropertySchema");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pifMgrCloseProperties(JNIEnv* km_env, jclass km_clazz, jlong hprops, jint flopt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PifMgr_CloseProperties");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprops, (uint32_t)flopt);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprops;
    (void)flopt;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pifMgrGetProperties(JNIEnv* km_env, jclass km_clazz, jlong hprops, jlong pszgroup, jlong lpprops, jint cbprops, jint flopt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PifMgr_GetProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprops, (void*)(uintptr_t)pszgroup, (void*)(uintptr_t)lpprops, (int32_t)cbprops, (uint32_t)flopt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprops;
    (void)pszgroup;
    (void)lpprops;
    (void)cbprops;
    (void)flopt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pifMgrOpenProperties(JNIEnv* km_env, jclass km_clazz, jlong pszapp, jlong pszpif, jint hinf, jint flopt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PifMgr_OpenProperties");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszapp, (void*)(uintptr_t)pszpif, (uint32_t)hinf, (uint32_t)flopt);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pszapp;
    (void)pszpif;
    (void)hinf;
    (void)flopt;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1pifMgrSetProperties(JNIEnv* km_env, jclass km_clazz, jlong hprops, jlong pszgroup, jlong lpprops, jint cbprops, jint flopt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PifMgr_SetProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprops, (void*)(uintptr_t)pszgroup, (void*)(uintptr_t)lpprops, (int32_t)cbprops, (uint32_t)flopt);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprops;
    (void)pszgroup;
    (void)lpprops;
    (void)cbprops;
    (void)flopt;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1sHAddDefaultPropertiesByExt(JNIEnv* km_env, jclass km_clazz, jlong pszext, jlong ppropstore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAddDefaultPropertiesByExt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszext, (void*)(uintptr_t)ppropstore);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszext;
    (void)ppropstore;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1sHGetPropertyStoreForWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPropertyStoreForWindow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1sHGetPropertyStoreFromIDList(JNIEnv* km_env, jclass km_clazz, jlong pidl, jint flags, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPropertyStoreFromIDList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pidl, (int32_t)flags, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pidl;
    (void)flags;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1sHGetPropertyStoreFromParsingName(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pbc, jint flags, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPropertyStoreFromParsingName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pbc, (int32_t)flags, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpath;
    (void)pbc;
    (void)flags;
    (void)riid;
    (void)ppv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1sHPropStgCreate(JNIEnv* km_env, jclass km_clazz, jlong psstg, jlong fmtid, jlong pclsid, jint grfflags, jint grfmode, jint dwdisposition, jlong ppstg, jlong pucodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPropStgCreate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psstg, (void*)(uintptr_t)fmtid, (void*)(uintptr_t)pclsid, (uint32_t)grfflags, (uint32_t)grfmode, (uint32_t)dwdisposition, (void*)(uintptr_t)ppstg, (void*)(uintptr_t)pucodepage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psstg;
    (void)fmtid;
    (void)pclsid;
    (void)grfflags;
    (void)grfmode;
    (void)dwdisposition;
    (void)ppstg;
    (void)pucodepage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1sHPropStgReadMultiple(JNIEnv* km_env, jclass km_clazz, jlong pps, jint ucodepage, jint cpspec, jlong rgpspec, jlong rgvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPropStgReadMultiple");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pps, (uint32_t)ucodepage, (uint32_t)cpspec, (void*)(uintptr_t)rgpspec, (void*)(uintptr_t)rgvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pps;
    (void)ucodepage;
    (void)cpspec;
    (void)rgpspec;
    (void)rgvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_propertiessystem_WindowsWin32UiShellPropertiessystemJniBridge_windowssys_1windows_1win32_1ui_1shell_1propertiessystem_1sHPropStgWriteMultiple(JNIEnv* km_env, jclass km_clazz, jlong pps, jlong pucodepage, jint cpspec, jlong rgpspec, jlong rgvar, jint propidnamefirst) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPropStgWriteMultiple");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pps, (void*)(uintptr_t)pucodepage, (uint32_t)cpspec, (void*)(uintptr_t)rgpspec, (void*)(uintptr_t)rgvar, (uint32_t)propidnamefirst);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pps;
    (void)pucodepage;
    (void)cpspec;
    (void)rgpspec;
    (void)rgvar;
    (void)propidnamefirst;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

